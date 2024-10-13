<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Wycieczki po Europie</title>
    <link rel="stylesheet" href="styl4.css">
</head>
<body>
    <header>
        <h1>BIURO TURYSTYCZNE</h1>
    </header>
    <section id="top">
        <h3>Wycieczki na które sa wolne miejsca</h3>
        <ul>
<?php

$user = "root";
$password = "";
$database = "biuro";
$host = "localhost";

$connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z bazą danych");
$query = "SELECT id, dataWyjazdu, cel, cena FROM wycieczki WHERE dostepna = 1";

$result = mysqli_query($connection, $query) or die("Błąd zapytania 1");

while($row = mysqli_fetch_array($result)) {
    echo "<li>".$row["id"]." dnia ".$row["dataWyjazdu"]." jedziemy do ".$row["cel"].", cena: ".$row["cena"]."</li>";
}

mysqli_close($connection);

?>
        </ul>
    </section>
    <section id="left">
        <h2>Bestselery</h2>
        <table>
            <tbody>
                <tr>
                    <td>Wenecja</td>
                    <td>kwiecien</td>
                </tr>
                <tr>
                    <td>Londyn</td>
                    <td>lipiec</td>
                </tr>
                <tr>
                    <td>Rzym</td>
                    <td>wrzesień</td>
                </tr>
            </tbody>
        </table>
    </section>
    <section id="middle">
        <h2>Nasze zdjęcia</h2>
<?php

$user = "root";
$password = "";
$database = "biuro";
$host = "localhost";

$connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z bazą danych");
$query = "SELECT nazwaPliku, podpis FROM zdjecia ORDER BY podpis DESC";

$result = mysqli_query($connection, $query) or die("Błąd zapytania 2");
while($row = mysqli_fetch_array($result)) {
    echo "<img src='".$row['nazwaPliku']."' alt='".$row["podpis"]."'>";
}

mysqli_close($connection);

?>
    </section>
    <section id="right">
        <h2>Skontaktuj się</h2>
        <a href="mailto:turysta@wycieczki.pl">napisz do nas</a>
        <p>telefon: 111222333</p>
    </section>
    <footer>
        <p>Strone wykonał: 06526009101</p>
    </footer>
</body>
</html>