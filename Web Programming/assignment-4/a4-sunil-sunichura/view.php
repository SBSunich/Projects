<!DOCTYPE html>
<!--
Sunil Sunichura
Student ID: 991 578 383
SYST10199 - Web Programming
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>View Shoe Inventory</title>
        
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
            require_once 'header1.php';
            ?>
            
            <hr>

            <h2>View Shoe Inventory</h2>
        
        <?php
        
        require_once 'connection.php';

            $query = "select * from ShoesInventory";
            $result = mysqli_query($conn, $query);

            if (mysqli_num_fields($result) > 0) {
                
                echo "<table id='shoes'>";
                echo "<tr><th> Row # </th>";
                echo "<th> Brand </th>";
                echo "<th> Model </th>";
                echo "<th> Colour </th>";
                echo "<th> Size </th></tr>";
                
                $i = 1;
                while ($row = mysqli_fetch_assoc($result)) {
                    
                    echo "<tr><td>$i</td>";
                    echo "<td>" . $row['Brand'] . "</td>";
                    echo "<td>" . $row['Model'] . "</td>";
                    echo "<td>" . $row['Colour'] . "</td>";
                    echo "<td>" . $row['Size'] . "</td></tr>";
                    $i++;
                }
                echo "</table>";
            }
            
            else if(mysqli_num_fields($result) == 0){
                echo "Currently no records are found, please insert a record";
            }
        ?>
    </body>
</html>
