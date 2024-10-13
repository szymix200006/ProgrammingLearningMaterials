<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal społecznościowy</title>
    <link rel="stylesheet" href="styl5.css">
</head>
<body>
    <header class="left">
        <h2>Nasze osiedle</h2>
    </header>
    <header class="right">
<?php

$user = "root";
$password = "";
$database = "portal";
$host = "localhost";

$connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z baza danych");
$query = "SELECT COUNT(*) FROM uzytkownicy";

$result = mysqli_query($connection, $query) or die("Błąd zapytania 2");
echo "<h5>Liczba użytkowników portalu: ".mysqli_fetch_row($result)[0]."</h5>";

mysqli_close($connection);

?>
    </header>
    <section class="left">
        <h3>Logowanie</h3>
        <form action="uzytkownicy.php" method="post">
            <label for="login">login</label><br>
            <input type="text" name="login" id="login"><br>
            <label for="haslo">hasło</label><br>
            <input type="password" name="haslo" id="haslo">
            <input type="submit" value="Zaloguj" name="send">
        </form>
    </section>
    <section class="right">
        <h3>Wizytówka</h3>
        <article>
<?php

$user = "root";
$password = "";
$database = "portal";
$host = "localhost";

$connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z baza danych");

if(isset($_POST["send"])) {
    if(!empty($_POST["login"]) || !empty($_POST["haslo"])) {
        $login = $_POST['login'];
        $hasloForm = $_POST['haslo'];
        $query = "SELECT haslo FROM uzytkownicy WHERE login = '$login'";
        $result = mysqli_query($connection, $query) or die("Błąd zapytania 2");

        if(mysqli_num_rows($result) <= 0) {
            echo "login nie istnieje";
        } else {
            $haslo = mysqli_fetch_row($result)[0];
            if(sha1($hasloForm) == $haslo) {
                $query2 = "SELECT uzytkownicy.login, dane.rok_urodz, dane.przyjaciol, dane.hobby, dane.zdjecie FROM uzytkownicy JOIN dane ON uzytkownicy.id = dane.id WHERE login= '$login'";
                $result2 = mysqli_query($connection, $query2) or die("Błąd zapytania 3");
                $row = mysqli_fetch_array($result2);
                echo "<img src='".$row['zdjecie']."' alt = 'osoba'>";
                echo "<h4>".$row['login']." (".(Date('Y')-$row['rok_urodz']).")</h4>";
                echo "<p>hobby: ".$row['hobby']."</p>";
                echo "<h1><img src='icon-on.png'> ".$row['przyjaciol']."</h1>";
                echo "<button onclick=\"location.href='dane.html'\">Więcej informacji</button>";
            } else {
                echo "haslo nieprawidłowe";
            }
        }
    } else {
        echo "<p>Wpisz wszystkie dane.</p>";
    }
}

mysqli_close($connection);

?>
        </article>
    </section>
    <footer>
        Stronę wykonał: 06526090011
    </footer>
</body>
</html>