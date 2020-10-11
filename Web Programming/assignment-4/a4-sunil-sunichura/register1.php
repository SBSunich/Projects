<?php

ob_start();
require_once 'connection.php';
$username = $_REQUEST['username'];
$hashed_password = password_hash($_REQUEST['password'], PASSWORD_DEFAULT);

$query = "select user from tbluser where user = '$username'";
$result = mysqli_query($conn, $query);

if(mysqli_num_rows($result) == 1){
    header('location:./register.php?result=userexist');
}
else{
    $query = "Insert into tbluser (user, password) values ('" . $username . "', '" . $hashed_password . "')";
    
    $result = mysqli_query($conn, $query);
    
    if ($result == 1){
        header('location:register.php?result=success');
    }
    else{
        header('location:register.php?result=fail');
    }
}

