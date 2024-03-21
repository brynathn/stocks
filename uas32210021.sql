-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 13 Jun 2022 pada 09.55
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uas32210021`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `grand`
--

CREATE TABLE `grand` (
  `grandjual` varchar(50) NOT NULL,
  `grandbeli` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `report`
--

CREATE TABLE `report` (
  `kode` varchar(50) NOT NULL,
  `namabrg` varchar(50) NOT NULL,
  `kodesatuan` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `hargabeli` varchar(50) NOT NULL,
  `hargajual` varchar(50) NOT NULL,
  `kuantitas` varchar(50) NOT NULL,
  `diskon` varchar(50) NOT NULL,
  `totalhargajual` varchar(50) NOT NULL,
  `totalhargabeli` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbdatabrg`
--

CREATE TABLE `tbdatabrg` (
  `kode` varchar(50) NOT NULL,
  `namabrg` varchar(50) NOT NULL,
  `kodesatuan` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL,
  `hargabeli` varchar(50) NOT NULL,
  `kuantitas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbdatabrg`
--

INSERT INTO `tbdatabrg` (`kode`, `namabrg`, `kodesatuan`, `satuan`, `hargabeli`, `kuantitas`) VALUES
('001', 'Sendok', 'AM', 'Alat Makan', '20000', '12'),
('002', 'Gelas', 'AM', 'Alat Makan', '30000', '12'),
('003', 'Kulkas', 'EL', 'Elektronik', '30000', '2'),
('004', 'Televisi', 'EL', 'Elektronik', '200000', '2'),
('005', 'Printer', 'EL', 'Elektronik', '40000', '4'),
('006', 'Sikat Gigi', 'PM', 'Perlengkapan Mandi', '6000', '12'),
('007', 'Casing Handphone', 'AH', 'Aksesoris Handphone', '16000', '7');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tblogin`
--

CREATE TABLE `tblogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbsatuan`
--

CREATE TABLE `tbsatuan` (
  `kodesatuan` varchar(50) NOT NULL,
  `satuan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbsatuan`
--

INSERT INTO `tbsatuan` (`kodesatuan`, `satuan`) VALUES
('AH', 'Aksesoris Handphone'),
('AM', 'Alat Makan'),
('DK', 'Dekorasi'),
('EL', 'Elektronik'),
('PM', 'Perlengkapan Mandi');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbsignup`
--

CREATE TABLE `tbsignup` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `repassword` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbsignup`
--

INSERT INTO `tbsignup` (`username`, `password`, `repassword`) VALUES
('alex', '111', '111'),
('bry', '123', '123'),
('eve', '321', '321'),
('wanda', '222', '222');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`kode`);

--
-- Indeks untuk tabel `tbdatabrg`
--
ALTER TABLE `tbdatabrg`
  ADD PRIMARY KEY (`kode`);

--
-- Indeks untuk tabel `tbsatuan`
--
ALTER TABLE `tbsatuan`
  ADD PRIMARY KEY (`kodesatuan`);

--
-- Indeks untuk tabel `tbsignup`
--
ALTER TABLE `tbsignup`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
