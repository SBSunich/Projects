<!DOCTYPE html>
<!--
Sunil Sunichura
Student ID: 991 578 383
SYST10199 - Web Programming
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title> Welcome to Starbucks's! </title>
        <link rel="stylesheet" href="styles1.css">
    </head>
    <body>
        <img src="images/logo-en.png" alt="Starbucks" height="200" width="200">
        <h1>Welcome to Starbucks's!</h1><br>
        <form action="order.php" method="POST">
            <h2>Please place your order:</h2>
            <br>
            <label for="numcoffees">Number of Coffees:</label>
            <input type="text" id="numcoffees" name="numcoffee"><br><br>

            <label for="size">Size:</label>
            <select id="size" name="size">
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
                <option value="xlarge">Extra-Large</option>
            </select>
            <br><br>

            <label for="cream">How many creams?</label>
            <input id="cream" type="number" name="cream" min="0" max="5" value="0"><br><br>

            <label for="sugar">How many sugars?</label>
            <input type="text" id="sugar" name="sugar"><br><br>

            <br><br>

            <input type="submit" name="submit" value="Order Coffee"><br><br>
            
        </form>

    </body>
</html>

