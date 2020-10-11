<?php

ob_start();

session_start();
require_once 'connection.php';


$username = $_REQUEST['username'];
$password = $_REQUEST['password'];


$query = "Select * from tbluser where user = '$username'";

$result = mysqli_query($conn, $query);

if (mysqli_num_rows($result) == 1) {
    $row = mysqli_fetch_assoc($result); 
    $hashed_password = $row['password'];   

    if (password_verify($password, $hashed_password)) {
        
        $_SESSION['user'] = $username;

        header('location:view.php');
        require_once 'header1.php';
        ob_end_flush();
        die();
    }
}

header('location:login.php?result=fail');
?>


