<?php
    function deleteUser() {
        $user = "root";
        $password = "";
        $host = "localhost";
        $database = "tajnabaza";

        $connection = mysqli_connect($host, $user, $password, $database);
        mysqli_set_charset($connection, 'utf8');

        if(!$connection) {
            echo "Błąd połączenia z bazą danych";
        } else {
            $id = $_POST['id'];
            if(empty($id)) {
                echo "Pole nie może być puste";
            } else {
                $query = "DELETE FROM uzytkownicy WHERE ID = '$id' ";
                $result = mysqli_query($connection, $query);
                echo $result;
                //$ile = mysqli_num_rows($result);
                //if(empty($ile)) {
                //    echo "Użytkownik o podanym id nie istnieje";
               // } 
            }
        }

        mysqli_close($connection);
    }

    if(isset($_POST['id'])) deleteUser();
    header('location: index.php')
?>