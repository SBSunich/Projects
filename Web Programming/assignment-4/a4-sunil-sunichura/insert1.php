<?php

ob_start();
require_once 'connection.php';
$Brand = $_REQUEST['Brand'];
$Model = $_REQUEST['Model'];
$Colour = $_REQUEST['Colour'];
$Size = $_REQUEST['Size'];

echo $Brand;
echo $Model;
echo $Colour;
echo $Size;

$query = "insert into ShoesInventory (Brand, Model, Colour, Size) values ('$Brand', '$Model', '$Colour', $Size)";

$result = mysqli_query($conn, $query);

if($result > 0){
    header("location:./insert.php?result=success");
    ob_end_flush();
    die();
}
else{//error
    header("location:./insert.php?result=fail");
}

