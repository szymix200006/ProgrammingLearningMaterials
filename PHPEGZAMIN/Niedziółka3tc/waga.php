<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Twój wskażnik BMI</title>
    <link rel="stylesheet" href="styl4.css">
</head>
<body>
    <header>
        <section id="banner">
            <h2>Oblicz wskażnik BMI</h2>
        </section>
        <section id="logo">
            <img src="wzor.png" alt="liczymy BMI">
        </section>
    </header>
    <section>
        <article id="left">
            <img src="rys1.png" alt="zrzuć kalorie!">
        </article>
        <article id="right">
            <h1>Podaj dane</h1>
            <form action="waga.php" method="post">
                <label for="waga">
                    Waga <input type="number" name="waga" id="waga">
                </label><br>
                <label for="wzrost">
                    Wzrost[cm] <input type="number" name="wzrost" id="wzrost">
                </label><br>
                <input type="submit" value="Licz BMI i zapisz wynik">
            </form>
<?php 
    $connection = mysqli_connect("localhost", "root", "", "egzamin");

    if(!$connection) {
        echo "Błąd połączenia z bazą danych";
    } else {
        if(!empty($_POST["waga"]) && !empty($_POST["wzrost"])) {
            $waga = $_POST['waga'];
            $wzrost = $_POST['wzrost'];

            $bmi = ($waga / ($wzrost * $wzrost)) * 10000;
            $bmi_kategoria = 1;
            echo "<p>Twoja waga: $waga; Twój wzrost: $wzrost; <br>BMI wynosi: $bmi;</p>";

            $query1 = "SELECT * FROM bmi";
            $results = mysqli_query($connection, $query1);

            $i = mysqli_num_rows($results);
            while($i > 0) {
                $i = $i - 1;
                $row = mysqli_fetch_array($results);
                
                if($bmi >= $row["wart_min"] && $bmi <= $row["wart_max"]) {
                    $bmi_kategoria = $row["id"];
                    break;
                }
            }

            $data = Date('Y-m-d');
            $query2 = "INSERT INTO wynik (bmi_id, data_pomiaru, wynik) VALUES ('$bmi_kategoria', '$data', '$bmi')";
            $result2 = mysqli_query($connection, $query2);
        } else {
            echo "Brak wszystkich danych";
        }
    }

    mysqli_close($connection)
?>
        </article>
    </section>
    <main>
        <table>
            <tr>
                <th>lp.</th>
                <th>Interpretacja</th>
                <th>zaczyna się od...</th>
            </tr>
<?php 
    $connection = mysqli_connect("localhost", "root", "", "egzamin");

    if(!$connection) {
        echo "<p>Błąd połączenia z bazą danych</p>";
    } else {
        $query = "SELECT id, informacja, wart_min FROM bmi";
        $result = mysqli_query($connection, $query);

        $rows = mysqli_num_rows($result);
        if(!$rows) {
            echo "<p>Błąd zapytania</p>";
        } else {
            while($rows > 0) {
                $rows = $rows - 1;
                $row = mysqli_fetch_array($result);

                $lp = $row['id'];
                $interpretacja = $row['informacja'];
                $zaczynaSie = $row['wart_min'];

                echo "<tr><td>$lp</td><td>$interpretacja</td><td>$zaczynaSie</td></tr>";
            }
        }
    }

    mysqli_close($connection);
?>
        </table>
    </main>
    <footer>
        Autor: Szymon Niedziółka
        <a href="kw2.jpg">Wynik działania kwerendy 2</a>
    </footer>
</body>
</html>