-- phpMyAdmin SQL Dump
-- version 4.9.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 12, 2020 at 04:16 PM
-- Server version: 10.3.22-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sunichus_mydatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `Product`
--

CREATE TABLE `Product` (
  `productID` int(6) NOT NULL,
  `productName` varchar(15) NOT NULL,
  `productPrice` decimal(8,0) NOT NULL,
  `Mis` int(2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `ShoesInventory`
--

CREATE TABLE `ShoesInventory` (
  `Brand` varchar(50) NOT NULL,
  `Model` varchar(50) NOT NULL,
  `Colour` varchar(50) NOT NULL,
  `Size` double(50,1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ShoesInventory`
--

INSERT INTO `ShoesInventory` (`Brand`, `Model`, `Colour`, `Size`) VALUES
('Nike', 'Air Max', 'Black', 10.0),
('Adidas', 'Superstar', 'white', 9.5),
('Nike', 'Air Force', 'Red', 7.5),
('Nike', 'Lebron', 'Black', 10.0);

-- --------------------------------------------------------

--
-- Table structure for table `tblProducts`
--

CREATE TABLE `tblProducts` (
  `productID` int(3) NOT NULL,
  `productName` varchar(50) NOT NULL,
  `productPrice` decimal(9,2) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblProducts`
--

INSERT INTO `tblProducts` (`productID`, `productName`, `productPrice`) VALUES
(1, 'Laptop', 456.00),
(2, 'Tv', 235.00),
(6, 'car', 9000.00),
(5, 'Hat', 29.99),
(7, 'basketball', 50.00),
(8, 'iphone8', 800.00),
(9, 'iphone8', 800.00);

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `user` varchar(6) NOT NULL,
  `password` varchar(999) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`user`, `password`) VALUES
('test', 'password_hash'),
('test', 'password_hash'),
('sunil', '$2y$10$AmLi/xPOY5X9KZ5Y7IWsNOinL/CdDjSRAEHwinfRYKN26hkVsr9X.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Product`
--
ALTER TABLE `Product`
  ADD PRIMARY KEY (`productID`);

--
-- Indexes for table `tblProducts`
--
ALTER TABLE `tblProducts`
  ADD PRIMARY KEY (`productID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tblProducts`
--
ALTER TABLE `tblProducts`
  MODIFY `productID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
