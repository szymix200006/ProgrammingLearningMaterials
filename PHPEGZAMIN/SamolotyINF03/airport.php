<!DOCTYPE html>
<?php

setcookie("odwiedzenie", "odwiedzono", time() + 3600);

?>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Odloty samolotów</title>
    <link rel="stylesheet" href="styl6.css">
</head>
<body>
    <header id="left">
        <h2>Odloty z lotniska</h2>
    </header>
    <header id="right">
        <img src="zad6.png" alt="logotyp">
    </header>
    <main>
        <h4>tabela odlotów</h4>
        <table>
            <thead>
                <tr>
                    <th>lp.</th>
                    <th>numer rejsu</th>
                    <th>czas</th>
                    <th>kierunek</th>
                    <th>status</th>
                </tr>
            </thead>
            <tbody>
<?php

$user = "root";
$password = "";
$database = "egzamin";
$host = "localhost";

$connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z bazą danych");
$query = "SELECT id, nr_rejsu, czas, kierunek, status_lotu FROM odloty ORDER BY czas DESC";
$result = mysqli_query($connection, $query);

while($row = mysqli_fetch_array($result)) {
    $id = $row["id"];
    $nr_rejsu = $row["nr_rejsu"];
    $czas = $row["czas"];
    $kierunek = $row["kierunek"];
    $status_lotu = $row["status_lotu"];

    echo "<tr><td>$id</td><td>$nr_rejsu</td><td>$czas</td><td>$kierunek</td><td>$status_lotu</td></tr>";
}

mysqli_close($connection);

?>
            </tbody>
        </table>
    </main>
    <footer id="fleft">
        <a href="zad6.png">Pobierz obraz</a>
    </footer>
    <footer id="fmiddle">
<?php

if(isset($_COOKIE['odwiedzenie'])) {
    echo "<p><b>Miło nam, że znowu nas odwiedziłeś</b></p>";
} else {
    echo "<p><i>Dzien dobry! Sprawdź regulamin naszej strony</i></p>";
}

?>
    </footer>
    <footer id="fright">
        Autor: 60526009110
    </footer>
</body>
</html>
