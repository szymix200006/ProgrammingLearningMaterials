<?php
    $host = "localhost";
    $database = "szkola";
    $user = "root";
    $password = "";

    setcookie("owoce", "jablko", time()+3600) // cookie o nazwie owoce z wartoscia jablko utworzone na godzine
    $_COOKIE["owoce"] //jablko
?>

<?php
$cookie_name = "user";
$cookie_value = "John Doe";
setcookie($cookie_name, $cookie_value, time() + (86400 * 30), "/"); // 86400 = 1 day
?>
<html>
<body>

<?php
if(!isset($_COOKIE[$cookie_name])) {
  echo "Cookie named '" . $cookie_name . "' is not set!";
} else {
  echo "Cookie '" . $cookie_name . "' is set!<br>";
  echo "Value is: " . $_COOKIE[$cookie_name];
}

define("OSOBA", "osoba1");
$kolory = array("czarny", "miebieski");
rsort($kolory) //sortuje odwrotnie, sort() -> normalnie
$dlugosc = count($kolory)
//formaty daty itd
mysqli_set_charset($connection, 'utf8');

?>