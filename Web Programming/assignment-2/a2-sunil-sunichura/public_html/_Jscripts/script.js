/* 
 * Sunil Sunichura
 * Student ID: 991 578 383
 * SYST10199 - Web Programming
 */

var head1 = document.getElementById("hh1");
var head2 = document.getElementById("hh2");
var head3 = document.getElementById("hh3");
head1.style.backgroundColor = "#679bf0";
head1.style.color = "white";
head1.style.border = "thick solid #0000FF";
head2.style.backgroundColor = "#4d88e8";
head2.style.color = "white";
head2.style.border = "thick solid #0000FF";
head3.style.backgroundColor = "#2f78ed";
head3.style.color = "white";
head3.style.border = "thick solid #0000FF";

var number = document.getElementById("num");

var para1 = document.getElementById("p1");
var but1 = document.getElementById("b1");
but1.onclick = function () {
    var num = number.value;
    if (num == "") {
        para1.innerHTML = "";
    } else if (isNaN(num)) {
        para1.innerHTML = "Please enter a number";
    } else {
        var ans1 = ((9 / 5 * num) + 32).toFixed(2);
        para1.innerHTML = ans1 + " fahrenheit";
        para1.style.backgroundColor = "#f04f4f";
    }
};

var para2 = document.getElementById("p2");
var but2 = document.getElementById("b2");
but2.onclick = function () {
    var num = number.value;
    if (num == "") {
        para2.innerHTML = "";
    } else if (isNaN(num)) {
        para2.innerHTML = "Please enter a number";
    } else {
        var ans2 = (((num - 32)) * 5 / 9).toFixed(2);
        para2.innerHTML = ans2 + " celsius";
        para2.style.backgroundColor = "#f28b4b";
    }
};

var para3 = document.getElementById("p3");
var but3 = document.getElementById("b3");
but3.onclick = function () {
    var num = number.value;
    if (num == "") {
        para3.innerHTML = "";
    } else if (isNaN(num)) {
        para3.innerHTML = "Please enter a number";
    } else {
        var ans3 = (num / 3.281).toFixed(2);
        para3.innerHTML = ans3 + " meters";
        para3.style.backgroundColor = "#f2ea4b";
    }
};

var para4 = document.getElementById("p4");
var but4 = document.getElementById("b4");
but4.onclick = function () {
    var num = number.value;
    if (num == "") {
        para4.innerHTML = "";
    } else if (isNaN(num)) {
        para4.innerHTML = "Please enter a number";
    } else {
        var ans4 = (num * 3.281).toFixed(2);
        para4.innerHTML = ans4 + " feet";
        para4.style.backgroundColor = "#9ef24b";
    }
};

var para5 = document.getElementById("p5");
var but5 = document.getElementById("b5");
but5.onclick = function () {
    var num = number.value;
    if (num == "") {
        para5.innerHTML = "";
    } else if (isNaN(num)) {
        para5.innerHTML = "Please enter a number";
    } else {
        var ans5 = (num * 2.54).toFixed(2);
        para5.innerHTML = ans5 + " centimeters";
        para5.style.backgroundColor = "#4bf2ec";
    }
};

var para6 = document.getElementById("p6");
var but6 = document.getElementById("b6");
but6.onclick = function () {
    var num = number.value;
    if (num == "") {
        para6.innerHTML = "";
    } else if (isNaN(num)) {
        para6.innerHTML = "Please enter a number";
    } else {
        var ans6 = (num / 2.54).toFixed(2);
        para6.innerHTML = ans6 + " inches";
        para6.style.backgroundColor = "#564bf2";
    }
};

var para7 = document.getElementById("p7");
var but7 = document.getElementById("b7");
but7.onclick = function () {
    var num = number.value;
    if (num == "") {
        para7.innerHTML = "";
    } else if (isNaN(num)) {
        para7.innerHTML = "Please enter a number";
    } else {
        var ans7 = (num / 2.2046).toFixed(2);
        para7.innerHTML = ans7 + " kilograms";
        para7.style.backgroundColor = "#f24bec";
    }
};

var para8 = document.getElementById("p8");
var but8 = document.getElementById("b8");
but8.onclick = function () {
    var num = number.value;
    if (num == "") {
        para8.innerHTML = "";
    } else if (isNaN(num)) {
        para8.innerHTML = "Please enter a number";
    } else {
        var ans8 = (num * 2.2046).toFixed(2);
        para8.innerHTML = ans8 + " pounds";
        para8.style.backgroundColor = "#f24b59";
    }
};

var but9 = document.getElementById("b9");
but9.onclick = function () {
    number.value = " ";
    number.focus();
    para1.innerHTML = " ";
    para2.innerHTML = " ";
    para3.innerHTML = " ";
    para4.innerHTML = " ";
    para5.innerHTML = " ";
    para6.innerHTML = " ";
    para7.innerHTML = " ";
    para8.innerHTML = " ";
};