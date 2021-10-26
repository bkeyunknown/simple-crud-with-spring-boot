-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 26, 2021 at 09:18 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datamahasiswa`
--

-- --------------------------------------------------------

--
-- Table structure for table `fakultas`
--

CREATE TABLE `fakultas` (
  `id` int(11) NOT NULL,
  `faculty_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fakultas`
--

INSERT INTO `fakultas` (`id`, `faculty_name`) VALUES
(2, 'Teknologi'),
(4, 'Informatika'),
(9, 'RPL'),
(28, 'Informatika'),
(29, 'Informatika'),
(30, 'Informatika'),
(31, 'Informatika'),
(32, 'Informatika'),
(33, 'Informatika'),
(34, 'Informatika'),
(35, 'Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(48);

-- --------------------------------------------------------

--
-- Table structure for table `jurusan`
--

CREATE TABLE `jurusan` (
  `id` int(11) NOT NULL,
  `jurusan_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jurusan`
--

INSERT INTO `jurusan` (`id`, `jurusan_name`) VALUES
(6, 'S1 Informatika'),
(7, 'S1 Informatika2'),
(20, 'S1 Informatika2'),
(21, 'S1 Informatika2'),
(22, 'S1 Informatika2'),
(23, 'S1 Informatika'),
(24, 'S1 Informatika'),
(25, 'S1 Informatika'),
(26, 'S1 Informatika'),
(27, 'S1 Informatika');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` int(11) NOT NULL,
  `mahasiswa_fakultas` varchar(255) DEFAULT NULL,
  `mahasiswa_jurusan` varchar(255) DEFAULT NULL,
  `mahasiswanim` varchar(255) DEFAULT NULL,
  `mahasiswa_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `mahasiswa_fakultas`, `mahasiswa_jurusan`, `mahasiswanim`, `mahasiswa_name`, `password`) VALUES
(5, 'Informatika', 'S1 Informatika', '1234567890', 'Rifki', '12345'),
(11, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki2', '123458'),
(12, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki', '123458'),
(13, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki', '123458'),
(14, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki', '123458'),
(15, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki', '123458'),
(16, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki', '123458'),
(17, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki', '123458'),
(18, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki', '123458'),
(19, 'Informatika', 'S2 Informatika', '1234567891', 'Rifki', '123458');

-- --------------------------------------------------------

--
-- Table structure for table `matkul`
--

CREATE TABLE `matkul` (
  `id` int(11) NOT NULL,
  `matkul_name` varchar(255) DEFAULT NULL,
  `matkul_semester` varchar(255) DEFAULT NULL,
  `matkul_sks` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `matkul`
--

INSERT INTO `matkul` (`id`, `matkul_name`, `matkul_semester`, `matkul_sks`) VALUES
(10, 'DAP', '1', '3'),
(36, 'DAP', '2', '3'),
(37, 'DAP', '2', '3'),
(38, 'DAP', '2', '3'),
(39, 'DAP', '2', '3'),
(40, 'DAP', '2', '3'),
(41, 'DAP', '2', '3'),
(42, 'DAP', '2', '3'),
(43, 'DAP', '2', '3'),
(44, 'DAP', '2', '3'),
(45, 'DAP', '2', '3'),
(46, 'DAP', '2', '3'),
(47, 'DAP', '2', '3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fakultas`
--
ALTER TABLE `fakultas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jurusan`
--
ALTER TABLE `jurusan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `matkul`
--
ALTER TABLE `matkul`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
