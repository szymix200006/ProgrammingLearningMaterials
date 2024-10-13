<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="schemat.php" method="post">
        <input type="text" name="imie">
    </form>

    <?php 
        if(isset($_POST["imie"])) {
            if(empty($_POST["imie"])) {
                echo "<span>Wypełnij wszystkie dane</span>";
            } else {
                $conn = mysqli_connect("localhost", "root", "", "baza_danych_1") or die("Błąd połączenia z bazą danych");
                $imie = $_POST["imie"];
                $query = "SELECT * FROM tabela1 WHERE imie = '$imie'";
                $result = mysqli_query($conn, $query) or die("Błąd zapytania SQL");

                while($row = mysqli_fetch_array($result)) {
                    echo "<span>".$row["imie"]."</span>";
                }
            }
        }
    ?>
</body>
</html>