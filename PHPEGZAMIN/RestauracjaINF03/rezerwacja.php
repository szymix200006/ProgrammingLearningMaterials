<?php

$user = "root";
$password = "";
$database = "baza";
$host = "localhost";

$connection = mysqli_connect($host, $user, $password, $database) or die("Błą łączenia z bazą danych");

if(isset($_POST["send"]))  {

    if(isset($_POST["data"]) && isset($_POST["osoby"]) && isset($_POST["telefon"]) && isset($_POST["dane"])){
        $data = $_POST["data"];
        $osoby = $_POST["osoby"];
        $telefon = $_POST["telefon"];
        $query = "INSERT INTO rezerwacje VALUES (NULL, 1, '$data', '$osoby', '$telefon')";
        $result = mysqli_query($connection, $query) or die("Błąd zapytania 1");
    }
}


mysqli_close($connection);
echo "Dodano rezerwacje";
?>