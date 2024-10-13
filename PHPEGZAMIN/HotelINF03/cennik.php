<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wynajem pokoi</title>
    <link rel="stylesheet" href="styl2.css">
</head>
<body>
    <header>
        <h1>Pensjonat pod dobrym humorem</h1>
    </header>
    <section id="left">
        <a href="index.html">GŁÓWNA</a>
        <img src="1.jpeg" alt="pokoje">
    </section>
    <section id="middle">
        <a href="cennik.php">CENNIK</a>
        <table>
<?php

$user = "root";
$password = "";
$database = "wynajem";
$host = "localhost";

$connection = mysqli_connect($host, $user, $password, $database) or die("Błąd łączenia z bazą danych");
$query = "SELECT * FROM pokoje";
$result = mysqli_query($connection, $query) or die("Błąd zapytania 1");

while($row = mysqli_fetch_array($result)) {
    $nazwa = $row["nazwa"];
    $id = $row["id"];
    $cena = $row["cena"];

    echo "<tr><td>$id</td><td>$nazwa</td><td>$cena</td></tr>";
}

mysqli_close($connection);

?>
        </table>
    </section>
    <section id="right">
        <a href="kalkulator.html">KALKULATOR</a>
        <img src="3.jpeg" alt="pokoje">
    </section>
    <footer>
        <p>Stronę opracował: 0652605209011</p>
    </footer>
</body>
</html>