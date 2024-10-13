<?php

$user = "root";
$password = "";
$host = "localhost";
$database = "sklep";

$connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z bazą danych");

?>

<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SKlep dla uczniów</title>
    <link rel="stylesheet" href="styl.css">
</head>
<body>
    <header>
        <h1>Dzisiejsze promocje naszego sklepu</h1>
    </header>
    <section id="left">
        <h2>Taniej o 30%</h2>
        <ol>
<?php

$query = "SELECT nazwa FROM towary WHERE promocja = 1";
$result = mysqli_query($connection, $query) or die("Błąd zapytania 1");
while($row = mysqli_fetch_array($result)) {
    $nazwa = $row['nazwa'];
    echo "<li>$nazwa</li>";
}

?>
        </ol>
    </section>
    <section id="middle">
        <h2>Sprawdż cenę</h2>
        <form action="index.php" method="post">
            <select name="towary">
                <option value="Gumka do mazania">Gumka do mazania</option>
                <option value="Cienkopis">Cienkopis</option>
                <option value="Pisaki 60 szt.">Pisaki 60 szt.</option>
                <option value="Markery 4 szt.">Markery 4 szt.</option>
            </select>
            <input type="submit" value="SPRAWDŹ" name='send'>
        </form>
        <article>
<?php

if(isset($_POST['send'])) {
    if(isset($_POST["towary"])) {
        $towar = $_POST['towary'];
        $query = "SELECT cena FROM towary WHERE nazwa = '$towar'";
        $result = mysqli_query($connection, $query) or die("Błąd zapytania 2");
        $row = mysqli_fetch_array($result);
        $cena_regularna = $row["cena"];
        $cena_promocyjna = $cena_regularna * 0.7;
        echo "<p>cena regularna: $cena_regularna <br> cena w promocji 30%: $cena_promocyjna</p>";
    } else {
        echo "Prosze o wybranie produktu.";
    }
}

?>
        </article>
    </section>
    <section id="right">
        <h2>Kontakt</h2>
        <p>e-mail: <a href="mailto:bok@sklep.pl">bok@sklep.pl</a></p>
        <img src="promocja.png" alt="promocja">
    </section>
    <footer>
        <h4>Autor strony: 06526090110</h4>
    </footer>
</body>
</html>

<?php

mysqli_close($connection);

?>