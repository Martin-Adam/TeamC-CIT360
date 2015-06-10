-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2015 at 08:52 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `trucknames`
--

-- --------------------------------------------------------

--
-- Table structure for table `mongoose`
--

CREATE TABLE IF NOT EXISTS `mongoose` (
`Mongoose_ID` int(11) NOT NULL,
  `Name` varchar(5) NOT NULL,
  `Weapon` varchar(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mongoose`
--

INSERT INTO `mongoose` (`Mongoose_ID`, `Name`, `Weapon`) VALUES
(1, 'HQ115', 'MK19'),
(2, 'HQ203', 'Cal.50'),
(3, 'H313', 'Cal.50'),
(4, 'HQ101', '240-B'),
(5, 'HQ405', '25MM');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mongoose`
--
ALTER TABLE `mongoose`
 ADD PRIMARY KEY (`Mongoose_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mongoose`
--
ALTER TABLE `mongoose`
MODIFY `Mongoose_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
