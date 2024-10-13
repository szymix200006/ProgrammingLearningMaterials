<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="checkboxes.php" method="post">
        <input type="checkbox" name="brands[]" value="Red MI"> Red MI <br>
        <input type="checkbox" name="brands[]" value="Samsung"> Samsung <br>
        <input type="checkbox" name="brands[]" value="Nokia"> Nokia <br>
        <input type="checkbox" name="brands[]" value="Vivo"> Vivo <br>
        <input type="checkbox" name="brands[]" value="Apple"> Apple <br>
        <input type="submit" name='send'>
    </form>

    <?php
        $user = "root";
        $password = "";
        $database = "checkboxes";
        $host = "localhost";

        $connection = mysqli_connect($host, $user, $password, $database) or die("Błąd połączenia z bazą danych");

        if(isset($_POST['send'])) {
            $brands = $_POST['brands'];
            foreach($brands as $item) {
                $query = "INSERT INTO demo VALUES(NULL, '$item')";
                $result = mysqli_query($connection, $query) or die("Bład zapytania do bazy danych.");
            }
        }

        mysqli_close($connection);

        $str = "Hello";
        trim($str, "Ho"); //ell
        $str_2 = "   Hello   ";
        trim($str_2); //Hello ,rtrim(), ltrim()
        strstr($str1, "ell") //true = include() w JS
    ?>
</body>
</html>