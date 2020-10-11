<!DOCTYPE html>
<!--
Sunil Sunichura
Student ID: 991 578 383
SYST10199 - Web Programming
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Register</title>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <style>
            #wrapper
            {
                width:70%;
                margin:auto;
            }

            table, td, th
            {    
                border: 1px solid #ddd;
                text-align: left;
            }

            table
            {
                border-collapse: collapse;
                width: 40%;
                margin: auto;
            }

            th, td
            {
                padding: 15px;
            }
            
            h1
            {
                color: red;
            }

            h2
            {
                text-align: center;
            }
            
            body
            {
                background-color: black;
                color: red;
            }
            
            .button
            {
                background-color: red;
                color: white;
            }

            #msg
            {
                width:40%;
                margin:auto;
            }
        </style>

    </head>
    <body>
        <div id="wrapper">

            <h1>Sunil's Shoe Store</h1>

            <?php
            require_once 'header.php';
            ?>

            <hr>


            <h2>Register</h2>

            <form action="register1.php" method="post">
                <table style="margin:0 auto; width:30%;">
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="username" autofocus></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="password"></td>
                    </tr>
                    <tr><td colspan="2"><input type="submit" value="Register" class="button"></td></tr>
                </table>
            </form>


            <?php
            if (isset($_REQUEST['result'])) {
                if ($_REQUEST['result'] == "userexists") {
                    echo "<p>This username is already taken up. Please try again.</p>";
                } else if ($_REQUEST['result'] == "success") {
                    echo "<p>New user was registered</p>";
                } else if ($_REQUEST['result'] == "fail") {
                    echo "<p>New user was not registered</p>";
                }
            }
            ?>


        </div>

    </body>
</html>
