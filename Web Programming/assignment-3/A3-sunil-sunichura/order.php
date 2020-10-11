<!DOCTYPE html>
<!--
Sunil Sunichura
Student ID: 991 578 383
SYST10199 - Web Programming
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title> Order Confirmation </title>
        <link rel="stylesheet" href="styles2.css">
    </head>
    <body>

        <?php
        if (isset($_REQUEST['submit'])) {
            $numCoffee = $_REQUEST['numcoffee'];
            $sugar = $_REQUEST['sugar'];

            if ($numCoffee < 1 || $sugar < 0) {
                echo "Invalid Order";
            } else {
                echo "Thanks for your order. <br> Here is your Confirmation:";
                echo "<br><br>";

                $tax = 0.13;

                $size = $_REQUEST['size'];

                for ($i = 1; $i <= $numCoffee; $i++) {
                    if ($size == small) {
                        $cost = 1.00 * $numCoffee;
                        echo "<img src='images/cup.jpg' class='small'>";
                    }
                    if ($size == medium) {
                        $cost = 1.50 * $numCoffee;
                        echo "<img src='images/cup.jpg' class='medium'>";
                    }
                    if ($size == large) {
                        $cost = 2.00 * $numCoffee;
                        echo "<img src='images/cup.jpg' class='large'>";
                    }
                    if ($size == xlarge) {
                        $cost = 2.50 * $numCoffee;
                        echo "<img src='images/cup.jpg' class='xlarge'>";
                    }

                    $cream = $_REQUEST['cream'];

                    if ($cream > 0) {
                        echo "<img src='images/plus.jpg' alt='plus sign'>";

                        for ($j = 1; $j <= $cream; $j++) {
                            echo "<img src='images/cream.jpg' alt='cream'>";
                        }
                    }
                    if ($sugar > 0) {
                        echo "<img src='images/plus.jpg' alt='plus sign'>";

                        for ($k = 1; $k <= $sugar; $k++) {
                            echo "<img src='images/sugar.jpg' alt='sugar'>";
                        }
                    }

                    echo "<br>";
                }

                echo "<br>";
                $cost = "$" . number_format((float) $cost * ($tax + 1), 2, '.', '');
                echo "Total cost for $numCoffee x $size is: $cost";
            }
        }
        ?>

    </body>
</html>

