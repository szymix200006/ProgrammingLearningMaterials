<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Strona główna</title>
    <link rel="stylesheet" href="styl.css">
</head>
<body>
    <header>
        <div>
            <a href="index.php">
                <h2>TOP SECRET ORGANISATION</h2>
            </a>
            <p>Tajna organizacja zrzeszająca tajnych ludzi.</p>
        </div>
    </header>
    <main>
        <article id='right'>
            <h3>Zlikwiduj tajnego członka:</h3>
            <form action="usun.php" method="post" target="index.php">
                <label for="id">
                    ID <input type="number" name="id" min="1" id="id" placeholder="id w postaci liczby">
                </label><br>
                <input type="submit" value="Usuń">
            </form>
        </article>
        <article id = 'left'>
            <table>
                <caption>Tajna tabela z listą tajnych członków</caption>
                <tr>
                    <th>ID</th>
                    <th>LOGIN</th>
                    <th>EMAIL</th>
                    <th>IMIĘ</th>
                    <th>NAZWISKO</th>
                </tr>
                <?php
                    $user = "root";
                    $password = "";
                    $host = "localhost";
                    $database = "tajnabaza";

                    $connection = mysqli_connect($host, $user, $password, $database);
                    mysqli_set_charset($connection, 'utf8');
                    if(!$connection) {
                        echo "Błąd połączenia z bazą danych.";
                    } else {
                        $query = "SELECT ID, LOGIN, EMAIL, IMIE, NAZWISKO FROM uzytkownicy";
                        $result = mysqli_query($connection, $query) or die("Błąd zapytania SQL.");
                        while($row = mysqli_fetch_assoc($result)) {
                            echo "<tr><td>".$row["ID"]."</td><td>".$row["LOGIN"]."</td><td>".$row["EMAIL"]."</td><td>".$row["IMIE"]."</td><td>".$row["NAZWISKO"]."</td></tr>";
                        }
                    }

                    mysqli_close($connection);
                ?>
            </table>
        </article>
    </main>
    <footer>
        <p>Copywright Szymon Niedziółka, ROK</p>
    </footer>
</body>
</html>