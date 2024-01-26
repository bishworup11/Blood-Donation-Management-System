-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2022 at 06:41 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `blooddonation1`
--

-- --------------------------------------------------------

--
-- Table structure for table `available_unit`
--

CREATE TABLE `available_unit` (
  `name` varchar(255) NOT NULL,
  `available` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `available_unit`
--

INSERT INTO `available_unit` (`name`, `available`) VALUES
('A+', 16),
('B+', 19),
('AB+', 16),
('O+', 14),
('A-', 9),
('B-', 7),
('AB-', 5),
('O-', 8);

-- --------------------------------------------------------

--
-- Table structure for table `donor`
--

CREATE TABLE `donor` (
  `Id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `father_name` varchar(255) NOT NULL,
  `mother_name` varchar(255) NOT NULL,
  `dob` date NOT NULL,
  `mobile` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `blood_group` varchar(10) NOT NULL,
  `city` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donor`
--

INSERT INTO `donor` (`Id`, `user_name`, `father_name`, `mother_name`, `dob`, `mobile`, `gender`, `email`, `blood_group`, `city`, `address`) VALUES
(1, 'Bishalakshmi Roy ', 'Kalipada Roy', 'Pronoti Rani Roy', '2000-02-10', '012', 'Female', 'bishalakshmi.roy.10.@gmail.com', 'B+', 'Sylhet', 'Lamabazar,Sylhet'),
(2, 'Masud Ali', 'Md. Joynal Abidin ', 'Majeda Begum', '2000-05-03', '01774687690', 'Male', 'masud.cse2019@gmail.com', 'AB+', 'Panchagarh', 'Bhoda,Pangchagarh'),
(3, 'Bishworup Mollik', 'Monoronjon Mollik', 'Bithi Mollik', '2000-10-15', '01771106071', 'Male', 'bishworupmollik@gmail.com', 'B+', 'Sylhet', 'Lamabazar,Sylhet'),
(4, 'Md. Mursaline', 'Emdadul Haque', 'Salma Sultana', '1999-12-05', '0172578', 'Male', 'mursaline.sajib@gmail.com', 'A+', 'Satkhira', 'Satkhira,Satkhira'),
(5, ' Anamika Rani Shil', 'Swapan Kumar Shil', 'Joystna Rani Shil', '1999-12-01', '01402', 'Female', 'anamikaranishil@gmail.com', 'O+', 'Khulna', 'Mollapara ,Khulna');

-- --------------------------------------------------------

--
-- Table structure for table `donorhistory`
--

CREATE TABLE `donorhistory` (
  `Id` int(11) NOT NULL,
  `bloodtype` varchar(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `donorhistory`
--

INSERT INTO `donorhistory` (`Id`, `bloodtype`, `name`, `date`, `time`) VALUES
(2, 'AB+', 'Masud Ali', '2022-04-21', '03:35:10'),
(4, 'A+', 'Md. Mursaline', '2022-04-21', '19:57:44'),
(1, 'B+', 'Bishalakshmi Roy', '2022-04-21', '23:55:45');

-- --------------------------------------------------------

--
-- Table structure for table `recipient`
--

CREATE TABLE `recipient` (
  `Id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `father_name` varchar(255) NOT NULL,
  `mother_name` varchar(255) NOT NULL,
  `dob` date NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `email` varchar(255) NOT NULL,
  `blood_group` varchar(10) NOT NULL,
  `city` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `recipient`
--

INSERT INTO `recipient` (`Id`, `user_name`, `father_name`, `mother_name`, `dob`, `mobile`, `gender`, `email`, `blood_group`, `city`, `address`) VALUES
(1, ' Md Imran Hosen', 'Arob Ali', 'Jorona Begom', '2000-03-10', '01819984388', 'Male', 'www.imransk.com@gmail.com', 'O+', 'Comilla', 'Baherchar,Doudkandi,Comilla'),
(2, 'Fuadul Hasan', 'Anowar Hossen', 'Salina Akter', '2000-01-05', '01754726519', 'Male', 'fuadul202@gmail.com', 'O+', 'Rajbari', 'Pangsha,Rajbari'),
(3, 'Amit Barmon ', 'Tarun Barmon', 'Padma Barmon', '1999-04-05', '01689378038', 'Male', 'pronuycse005@gmail.com', 'A+', 'Dhaka', 'Savar,Dhaka'),
(4, 'Tushar Sarkar', 'Ranjit Kumar Sarkar', 'Rita Rani Sarkar', '1998-12-01', '01521234871', 'Male', 'tusharcse35.bsmrstu@gmail.com', 'A+', 'Faridpur', 'Atail, Talma ,Nogorkanda ,Faridpur');

-- --------------------------------------------------------

--
-- Table structure for table `recipient_history`
--

CREATE TABLE `recipient_history` (
  `Id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `blood` varchar(11) NOT NULL,
  `mobile` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `recipient_history`
--

INSERT INTO `recipient_history` (`Id`, `name`, `blood`, `mobile`, `date`, `time`) VALUES
(1, ' Md Imran Hosen', 'O+', '01819984388', '2022-04-21', '03:03:51'),
(3, 'Amit Barmon', 'O+', '01689378038', '2022-04-21', '19:56:52'),
(4, 'Tushar Sarkar', 'A+', '01521234871', '2022-05-16', '13:12:47');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('bishworup11', '1234'),
('imransk', '1234'),
('fuad', '1234'),
('roni', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `donor`
--
ALTER TABLE `donor`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `recipient`
--
ALTER TABLE `recipient`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `donor`
--
ALTER TABLE `donor`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `recipient`
--
ALTER TABLE `recipient`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
