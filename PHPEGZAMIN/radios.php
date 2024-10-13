<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="radios.php" method="post">
        <p>What is the capital city of Australia?</p>
        <input type="radio" name="capital" value="Sydney">Sydney<br>
        <input type="radio" name="capital" value="Canberra">Canberra<br>
        <input type="radio" name="capital" value="Melbourne">Melbourne
        <p>
            <input name="send" type="submit">
        </p>
    </form>

    <?php
        function checkAnswear() {if(isset($_POST["capital"])) {
            $capital = $_POST['capital'];
        } else {
            $capital = NULL;
        }

        if($capital != NULL) {
            if($capital != 'Canberra') {
                echo "Capital is incorrect";
            } else {
                echo "Capital is correct";
            }
        } else {
            echo "You must select an answear";
        }}

        if(isset($_POST['send'])) checkAnswear();
    ?>
</body>
</html>