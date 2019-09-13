-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Sep 12, 2019 at 09:07 PM
-- Server version: 5.7.24-log
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cars`
--

-- --------------------------------------------------------

--
-- Table structure for table `typecar`
--

CREATE TABLE `typecar` (
  `make` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `year` int(11) NOT NULL,
  `Id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `typecar`
--

INSERT INTO `typecar` (`make`, `model`, `year`, `Id`) VALUES
('Ford', 'Focus', 2000, 1),
('Lexus', 'ES 300', 2000, 2),
('Ford', 'Fusion', 2010, 3),
('Lexus', 'ES 350', 2019, 4),
('KIA', 'Rondo', 2007, 5),
('chrysler', 'Sebering', 2007, 6),
('Toyota', 'Camry', 2003, 7),
('Toyota', 'Corolla', 2005, 8),
('Nissan', 'GTR', 2017, 9),
('Acura', 'NSX', 2019, 10),
('Chevy', 'Cruze', 2014, 11),
('Chevy', 'Cruze', 2014, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `typecar`
--
ALTER TABLE `typecar`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `typecar`
--
ALTER TABLE `typecar`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
