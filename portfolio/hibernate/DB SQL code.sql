-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 06, 2015 at 07:07 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pokestart`
--

-- --------------------------------------------------------

--
-- Table structure for table `pokestarters`
--
DROP TABLE IF EXISTS `pokestarters`;

CREATE TABLE IF NOT EXISTS `pokestarters` (
`pokemon_id` int(11) NOT NULL,
  `pokemon_name` char(20) NOT NULL,
  `type` char(20) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=94 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `pokestarters`
--

INSERT INTO `pokestarters` (`pokemon_id`, `pokemon_name`, `type`) VALUES
(1, 'Pikachu', 'Electric'),
(2, 'Charmander', 'Fire'),
(3, 'Blubasaur', 'Grass/Posion'),
(4, 'Squirtle', 'Water');

-- --------------------------------------------------------

--
-- Table structure for table `poke_number`
--
DROP TABLE IF EXISTS `poke_number`;
CREATE TABLE IF NOT EXISTS `poke_number` (
`poke_num_id` int(11) NOT NULL,
  `pokestarters_id` int(11) NOT NULL,
  `trainer_id` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `poke_number`
--

INSERT INTO `poke_number` (`poke_num_id`, `pokestarters_id`, `trainer_id`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `trainer`
--
DROP TABLE IF EXISTS `trainer`;
CREATE TABLE IF NOT EXISTS `trainer` (
`trainer_id` int(11) NOT NULL,
  `trainer_name` varchar(20) NOT NULL,
  `pokemon_id` int(11) NOT NULL
) ENGINE=MyISAM AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `trainer`
--

INSERT INTO `trainer` (`trainer_id`, `trainer_name`, `pokemon_id`) VALUES
(1, 'Ash', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pokestarters`
--
ALTER TABLE `pokestarters`
 ADD PRIMARY KEY (`pokemon_id`);

--
-- Indexes for table `poke_number`
--
ALTER TABLE `poke_number`
 ADD PRIMARY KEY (`poke_num_id`);

--
-- Indexes for table `trainer`
--
ALTER TABLE `trainer`
 ADD PRIMARY KEY (`trainer_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pokestarters`
--
ALTER TABLE `pokestarters`
MODIFY `pokemon_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=94;
--
-- AUTO_INCREMENT for table `poke_number`
--
ALTER TABLE `poke_number`
MODIFY `poke_num_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `trainer`
--
ALTER TABLE `trainer`
MODIFY `trainer_id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
