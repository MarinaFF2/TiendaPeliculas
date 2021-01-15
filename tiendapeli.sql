-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-01-2021 a las 18:57:09
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendapeli`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `peliculas`
--

CREATE TABLE `peliculas` (
  `ID_PELI` int(111) NOT NULL,
  `TITULO` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `DIRECTOR` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `ANIO` int(11) NOT NULL,
  `CARATULA` varchar(500) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SINOPSIS` varchar(500) COLLATE utf8_unicode_ci NOT NULL,
  `GENEROS` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `RANGO_EDAD` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `PRECIO` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `ID_USUARIO` int(11) NOT NULL,
  `NOMBRE` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `APELLIDO` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `CORREO` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `PWD` varchar(64) COLLATE utf8_unicode_ci NOT NULL DEFAULT '1',
  `FOTO` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '/img/imgIconos/user.jpeg',
  `IDROL` int(1) NOT NULL DEFAULT 0,
  `ACTIVO` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`ID_USUARIO`, `NOMBRE`, `APELLIDO`, `CORREO`, `PWD`, `FOTO`, `IDROL`, `ACTIVO`) VALUES
(1, 'admin', 'admin', 'admin@admin.com', 'admin', '/img/imgIconos/user.jpeg', 2, 1),
(2, 'user', 'user', 'user@user.com', 'user', '/img/imgIconos/user.jpeg', 1, 1),
(3, 'eliminar', 'eliminar', 'eliminar@e.e', 'eliminar', '/img/imgUser/eliminar@e.e.PNG', 1, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  ADD PRIMARY KEY (`ID_PELI`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID_USUARIO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `peliculas`
--
ALTER TABLE `peliculas`
  MODIFY `ID_PELI` int(111) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `ID_USUARIO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
