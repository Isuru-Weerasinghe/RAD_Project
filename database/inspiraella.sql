-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 13, 2023 at 03:12 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inspiraella`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact_us`
--

CREATE TABLE `contact_us` (
  `userid` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `subject` varchar(255) NOT NULL,
  `message` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `contact_us`
--

INSERT INTO `contact_us` (`userid`, `username`, `email`, `subject`, `message`) VALUES
(1, 'dinidu', 'john@gmail.com', 'sub', 'dwdefef'),
(2, 'dinidu', 'john@gmail.com', 'sub', 'dwdefef'),
(3, 'dinidu', 'john@gmail.com', 'subss', 'adqdqdq'),
(4, 'isuru', 'isuru@gmail.com', 'x', 'y'),
(5, 'isuru', 'isuru@gmail.com', 'x', ''),
(6, 'isuru', 'isuru@gmail.com', 'x', 'x'),
(7, 'user1', 'user1@gmail.com', 'y', 'z'),
(8, 'isuru', 'isurutest@gmail.com', 'z', 'zzzz'),
(9, 'tttt', 'tttt@gmail.com', 'tttt', 'tttt'),
(10, 'test', 'test@gmail.com', 'testsub', 'test'),
(11, 'test', 'test@gmail.com', 'test', 'aaaaa'),
(12, 'rrr', 'rrr@gmail.com', 'rrr', 'rrr');

-- --------------------------------------------------------

--
-- Table structure for table `packagebooking`
--

CREATE TABLE `packagebooking` (
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `datetime` varchar(100) NOT NULL,
  `select1` varchar(50) NOT NULL,
  `message` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `packagebooking`
--

INSERT INTO `packagebooking` (`name`, `email`, `datetime`, `select1`, `message`) VALUES
('isuru', 'isuru@gmail.com', '08/12/2023 8:54 PM', '1', 'dd'),
('ssss', 'sss@gmail.com', '08/22/2023 11:16 AM', '2', 'aaa'),
('aaa bbb', 'isuruaaa@gmail.com', '08/21/2023 11:58 PM', '2', 'aaaaaaaaaa'),
('rrr', 'rrr@gmail.com', '08/25/2023 6:32 PM', '1', 'rrr');

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `reservation_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `checkinDate` varchar(50) NOT NULL,
  `checkoutDate` varchar(50) NOT NULL,
  `NoOfGuests` int(11) NOT NULL,
  `roomtype` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`reservation_id`, `name`, `email`, `checkinDate`, `checkoutDate`, `NoOfGuests`, `roomtype`) VALUES
(10, 'Ashwin', 'Ash000@gmail.com', '08/20/2023 8:58 PM', '08/22/2023 8:58 PM', 3, 'Family Room'),
(12, 'Kanchana Anuruddha', 'KanchuAnu@gmail.com', '08/30/2023 9:05 PM', '09/01/2023 9:05 PM', 1, 'Single'),
(13, 'Nimali Aththanayaka', 'Nima77@gmail.com', '08/22/2023 9:10 PM', '08/25/2023 9:10 PM', 2, 'Double');

-- --------------------------------------------------------

--
-- Table structure for table `review_table`
--

CREATE TABLE `review_table` (
  `review_id` int(11) NOT NULL,
  `user_name` varchar(200) NOT NULL,
  `user_rating` int(1) NOT NULL,
  `user_review` text NOT NULL,
  `datetime` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `review_table`
--

INSERT INTO `review_table` (`review_id`, `user_name`, `user_rating`, `user_review`, `datetime`) VALUES
(102, 'Heshan', 3, 'Great', '2023-04-05'),
(103, 'HesLK', 4, 'Superb', '2023-04-05'),
(104, 'HesLK', 4, 'Superb', '2023-04-05'),
(105, 'Nimal', 5, 'Lovely', '2023-04-10'),
(106, 'Kamal', 3, 'Good', '2023-04-04');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `phoneno` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `firstname`, `lastname`, `username`, `phoneno`, `email`, `password`) VALUES
(1, 'abc', 'def', 'abc50', '0772536987', 'abc@', 'd41d8cd98f00b204e9800998ecf8427e'),
(2, 'abc', 'def', 'abc50', '0772536987', 'abc@', 'd41d8cd98f00b204e9800998ecf8427e'),
(3, 'abc', 'def', 'abc50', '0772536987', 'abc@gmail.com', 'ab56b4d92b40713acc5af89985d4b786'),
(5, 'admin', 'admin', 'admin', '0772536987', 'admin@gmail.com', '0192023a7bbd73250516f069df18b500'),
(6, 'Nimal', 'Perera', 'nimal', '0772536987', 'nimal@gmail.com', '8e238955d8926765a95329a6635bcd42'),
(7, 'bybyi', 'erWWE', 'wrar', '165484', 'hgvuygy@gmail.com', '54f8b227a1b66c7b81f0e88a20af25de'),
(8, 'Aruna ', 'Perera', 'aruna', '0772536987', 'aruna@gmail.com', '40645ff3d37acc0391ac19739c7dfdc3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `contact_us`
--
ALTER TABLE `contact_us`
  ADD PRIMARY KEY (`userid`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`reservation_id`);

--
-- Indexes for table `review_table`
--
ALTER TABLE `review_table`
  ADD PRIMARY KEY (`review_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `contact_us`
--
ALTER TABLE `contact_us`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `reservation_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `review_table`
--
ALTER TABLE `review_table`
  MODIFY `review_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=107;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
