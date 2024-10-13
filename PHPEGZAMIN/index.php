<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    
    <form action="index.php" method="post" target="_blank">
        <label for="klasa">
            Podaj nazwe klasy: <input type="text" name="klasa" id="klasa">
        </label>
        <input type="submit" value="Pokaż oceny">
    </form>
    <?php
        function getPupils() {
            require_once "dbconnect.php";

            $connection = mysqli_connect($host, $user, $password, $database);
            mysqli_set_charset($connection, "utf8");
            $klasa = $_POST['klasa'];
            if(empty($klasa)) {
                echo '<span style="color: yellow;> Nie podano nazwy klasy </span>"';
            } else 

            {
                if(!$connection) {
                    echo "Błąd połączenia";
                } else {
                    $query = "SELECT Nazwisko, Imie, Srednia_ocen FROM uczen, klasa WHERE nazwa='$klasa' AND klasa.id = uczen.id_klasy";
                    $result = mysqli_query($connection, $query) or die("Problemy z odczytem danych");
                    $ile = mysqli_num_rows($result);
                    if(empty($ile)) {
                        echo '<span style="color: red;> Nie ma takiej klasy w szkole </span>"'
                    } else {
echo <<<END
                            <table> 
                             <thead>
                                <tr>
                                    <th>Imie</th>
                                    <th>Nazwisko</th>
                                    <th>Średnia ocen</th>
                                </tr>
                             </thead>
                             <tbody>
END;
                            while($row = mysqli_fetch_assoc($result)) {
                                echo "<tr><td>".$row['Imie']."</td><td>".$row['Nazwisko']."</td><td>".$row['Srednia ocen']."</td></tr>"
                            }
                            echo   "</tbody>";
                            echo "</table>";
                    }
                }
            }
            mysqli_close($connection);
        }

        if(isset($_POST['klasa'])) getPupils(); 
    ?>

</body>
</html>