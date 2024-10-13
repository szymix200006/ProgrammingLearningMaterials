<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hurtownia szkolna</title>
    <link rel="stylesheet" href="styl.css">
</head>
<body>
    <header>
        <h1>Hurtownia z najlepszymi cenami</h1>
    </header>
    <section id="lewy">
        <h2>Nasze ceny:</h2>
        <table>
<?php
    $user = "root";
    $password = "";
    $database = "sklep";
    $host = "localhost";

    $connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z bazą");
    $query = "SELECT cena, nazwa FROM towary LIMIT 4";

    $result = mysqli_query($connection, $query) or die("Błąd zapytania 1");

    while($row = mysqli_fetch_array($result)) {
        echo "<tr>";
        echo "<td>".$row["nazwa"]."</td><td>".$row["cena"]."</td>";
        echo "</tr>";
    }

    mysqli_close($connection);
?>
        </table>
    </section>
    <section id="srodek">
        <h2>Koszt zakupów</h2>
        <form action="index.php" method="post">
            <label for="artykul">wybierz artykuł: </label>
            <select name="artykul">
                <option value="Zeszyt 60 kartek">Zeszyt 60 kartek</option>
                <option value="Zeszyt 32 kartki">Zeszyt 32 kartki</option>
                <option value="Cyrkiel">Cyrkiel</option>
                <option value="Linijka 30 cm">Linijka 30 cm</option>
            </select><br>
            <label for="sztuki">liczba sztuk: </label>
            <input type="number" name="sztuki" id="sztuki"><br>
            <input type="submit" value="OBLICZ" name="send">
        </form>
<?php
    $user = "root";
    $password = "";
    $database = "sklep";
    $host = "localhost";

    $connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z bazą");
 

    if(isset($_POST["send"])){
        if(!empty($_POST["sztuki"])) {
            $artykul = $_POST["artykul"];
            $sztuki = $_POST["sztuki"];

            $query = "SELECT cena FROM towary WHERE nazwa = '$artykul'";
            $result = mysqli_query($connection, $query) or die("Błąd zapytania 2");
            $cena = mysqli_fetch_array($result);
            $wartosc = $cena["cena"] * $sztuki;

            echo "<p>wartość zakupów: $wartosc</p>";
        } else {
            echo "<p>Uzupełnij wszytskie dane.</p>";
        }
    }

    mysqli_close($connection);
?>
    </section>
    <section id="prawy">
        <h2>Kontakt</h2>
        <img src="zakupy.png" alt="hurtownia">
        <p>e-mail <a href="mailto:hurt@poczta.pl">hurt@poczta.pl</a></p>
    </section>
    <footer>
        <h4>Witryne wykonał: Szymon Niedziółka 3tc</h4>
    </footer>
</body>
</html>