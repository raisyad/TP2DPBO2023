-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2023 at 07:42 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dpbo_tp2`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id_account` int(100) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nameAccount` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id_account`, `username`, `password`, `nameAccount`) VALUES
(10, 'admin', '21232F297A57A5A743894A0E4A801FC3', 'Admin'),
(11, 'syad12', '7E640A6A61D43E74BBE2E975D0692AFE', 'Raisyad');

-- --------------------------------------------------------

--
-- Table structure for table `component`
--

CREATE TABLE `component` (
  `id_component` int(100) NOT NULL,
  `cpu` varchar(255) NOT NULL,
  `graphics_card` varchar(255) NOT NULL,
  `ram` varchar(255) NOT NULL,
  `hdd_ssd` varchar(255) NOT NULL,
  `id_layar` int(100) NOT NULL,
  `keyboard` varchar(255) NOT NULL,
  `camera` varchar(255) NOT NULL,
  `stats_used` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `component`
--

INSERT INTO `component` (`id_component`, `cpu`, `graphics_card`, `ram`, `hdd_ssd`, `id_layar`, `keyboard`, `camera`, `stats_used`) VALUES
(20, 'Intel Core i7-1165G7', 'Nvidia GeForce GTX 1650', '16 GB DDR4', '1 TB SSD', 13, 'Keyboard Backlit', 'Kamera Webcam HD', 0),
(22, 'Apple M1 Max', 'AMD Radeon Pro 6700M 10GB', '32 GB unified memory', '1 TB SSD', 11, 'Keyboard Backlit', 'Kamera Webcam HD', 1);

-- --------------------------------------------------------

--
-- Table structure for table `laptop`
--

CREATE TABLE `laptop` (
  `id_laptop` int(100) NOT NULL,
  `merk_laptop` varchar(255) NOT NULL,
  `model_laptop` varchar(255) NOT NULL,
  `jenis_laptop` varchar(255) NOT NULL,
  `id_component` int(100) NOT NULL,
  `image_laptop` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `laptop`
--

INSERT INTO `laptop` (`id_laptop`, `merk_laptop`, `model_laptop`, `jenis_laptop`, `id_component`, `image_laptop`) VALUES
(46, 'Lenovo', 'IdeaPad Slim 7', 'Office/Semi-Gaming', 22, 'src\\ImgUpload\\50oled9.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `layar`
--

CREATE TABLE `layar` (
  `id_layar` int(100) NOT NULL,
  `ukuran_layar` varchar(255) NOT NULL,
  `jenis_layar` varchar(255) NOT NULL,
  `jenis_panel` varchar(255) NOT NULL,
  `resolusi_layar` varchar(255) NOT NULL,
  `stats_used` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `layar`
--

INSERT INTO `layar` (`id_layar`, `ukuran_layar`, `jenis_layar`, `jenis_panel`, `resolusi_layar`, `stats_used`) VALUES
(11, '13.3 inci', 'Layar OLED', 'Panel TN', '1920 x 1080 piksel (Full HD)', 1),
(13, '14 inci', 'Layar Glossy', 'Panel VA', '1920 x 1080 piksel (Full HD)', 1),
(14, '15 inci', 'Layar Matte', 'Panel OLED', '1600 x 900 piksel (HD+)', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id_account`);

--
-- Indexes for table `component`
--
ALTER TABLE `component`
  ADD PRIMARY KEY (`id_component`),
  ADD KEY `fk_to_layar` (`id_layar`);

--
-- Indexes for table `laptop`
--
ALTER TABLE `laptop`
  ADD PRIMARY KEY (`id_laptop`),
  ADD KEY `fk_to_component` (`id_component`);

--
-- Indexes for table `layar`
--
ALTER TABLE `layar`
  ADD PRIMARY KEY (`id_layar`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id_account` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `component`
--
ALTER TABLE `component`
  MODIFY `id_component` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `laptop`
--
ALTER TABLE `laptop`
  MODIFY `id_laptop` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT for table `layar`
--
ALTER TABLE `layar`
  MODIFY `id_layar` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `component`
--
ALTER TABLE `component`
  ADD CONSTRAINT `fk_to_layar` FOREIGN KEY (`id_layar`) REFERENCES `layar` (`id_layar`);

--
-- Constraints for table `laptop`
--
ALTER TABLE `laptop`
  ADD CONSTRAINT `fk_to_component` FOREIGN KEY (`id_component`) REFERENCES `component` (`id_component`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
