<?php

$host = 'localhost';
$username = 'sunichus_sunichus1';
$passwd = '3NjFui4]i7#n';
$dbname = 'sunichus_mydatabase';

$conn = mysqli_connect($host, $username, $passwd, $dbname);

if (empty($conn)) {
    die("Connection failed" . mysqli_connect_error());
}


