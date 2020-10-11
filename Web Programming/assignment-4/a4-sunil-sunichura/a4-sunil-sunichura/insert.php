<!DOCTYPE html>
<!--
Sunil Sunichura
Student ID: 991 578 383
SYST10199 - Web Programming
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert to Shoe Inventory</title>

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
            }        </style>
    </head>
    <body>

        <div id="wrapper">

            <h1>Sunil's Shoe Store</h1>
            
            <?php
            require_once 'header1.php';
            ?>
            

            <hr>

            <h2>Add to Shoe Inventory</h2>
            
            <form action="insert1.php" method="post">
                <table>
                    <tr>
                        <td>Brand:</td>
                        <td>
                            <input type="text" name="Brand">
                        </td>
                    </tr>
                    <tr>
                        <td>Model:</td>
                        <td>
                            <input type="text" name="Model">
                        </td>
                    </tr>
                    <tr>
                        <td>Colour:</td>
                        <td>
                            <input type="text" name="Colour">
                        </td>
                    </tr>
                    <tr>
                        <td>Size:</td>
                        <td>
                            <input type="text" name="Size">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <input type="submit" value="Add to Shoe Inventory" class="button">
                        </td>
                    </tr>
                </table>
            </form>

            <?php
            
            if(isset($_REQUEST['result'])){
                    if($_REQUEST['result'] == "success"){
                        echo "Shoe Added to Inventory";
                    }
                    else if($_REQUEST['result'] == "fail"){
                        echo "Error";
                    }
                }
            ?>
    </body>
</html>
