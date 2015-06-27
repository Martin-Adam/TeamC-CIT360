SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `video_games`
--

-- --------------------------------------------------------

--
-- Table structure for table `rpg`
--

CREATE TABLE IF NOT EXISTS `rpg` (
`RPG_ID` int(11) NOT NULL,
  `Name` varchar(5) NOT NULL,
  `Rating` varchar(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rpg`
--

INSERT INTO `rpg` (`RPG_ID`, `Name`, `Rating`) VALUES
(1, 'Final Fantasy', 'Good'),
(2, 'Chrono Cross', 'Lame'),
(3, 'Final Fantasy VII', 'Great'),
(4, 'Dragon Ball', 'Good'),
(5, 'destiny', 'Great');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `rpg`
--
ALTER TABLE `rpg`
 ADD PRIMARY KEY (`RPG_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mongoose`
--
ALTER TABLE `rpg`
MODIFY `RPG_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
