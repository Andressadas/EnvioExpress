-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema db_envios
--

CREATE DATABASE IF NOT EXISTS db_envios;
USE db_envios;

--
-- Definition of table `ciudad`
--

DROP TABLE IF EXISTS `ciudad`;
CREATE TABLE `ciudad` (
  `idciudad` int(10) unsigned NOT NULL auto_increment,
  `iddepartamento` int(10) unsigned NOT NULL,
  `nombreciudad` varchar(45) NOT NULL,
  PRIMARY KEY  (`idciudad`),
  KEY `FK_ciudad_1` (`iddepartamento`),
  CONSTRAINT `FK_ciudad_1` FOREIGN KEY (`iddepartamento`) REFERENCES `departamento` (`iddepartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ciudad`
--

/*!40000 ALTER TABLE `ciudad` DISABLE KEYS */;
INSERT INTO `ciudad` (`idciudad`,`iddepartamento`,`nombreciudad`) VALUES 
 (1,1,'Santa Marta');
/*!40000 ALTER TABLE `ciudad` ENABLE KEYS */;


--
-- Definition of table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE `cliente` (
  `idcliente` int(10) unsigned NOT NULL auto_increment,
  `nombrecliente` varchar(45) NOT NULL,
  `tipocliente` char(10) NOT NULL,
  `tipoidentificacion` char(2) NOT NULL,
  `numeroidentificacion` varchar(45) NOT NULL,
  `telefonocliente` char(15) NOT NULL,
  `emailcliente` varchar(45) NOT NULL,
  PRIMARY KEY  (`idcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cliente`
--

/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;


--
-- Definition of table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
CREATE TABLE `departamento` (
  `iddepartamento` int(10) unsigned NOT NULL auto_increment,
  `nombredepartamento` varchar(45) NOT NULL,
  PRIMARY KEY  (`iddepartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `departamento`
--

/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` (`iddepartamento`,`nombredepartamento`) VALUES 
 (1,'Madgalena');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;


--
-- Definition of table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE `empleado` (
  `idempleado` int(10) unsigned NOT NULL auto_increment,
  `nombreempleado` varchar(45) NOT NULL,
  `emailempleado` varchar(45) NOT NULL,
  `direccionempleado` varchar(45) NOT NULL,
  `estadoempleado` varchar(45) NOT NULL,
  `telefonoempleado` varchar(45) NOT NULL,
  `perfil` varchar(45) NOT NULL,
  `iddepartamento` int(10) unsigned NOT NULL,
  `idciudad` int(10) unsigned NOT NULL,
  `username` char(10) NOT NULL,
  `password` char(10) NOT NULL,
  PRIMARY KEY  (`idempleado`),
  KEY `FK_emplado_1` (`iddepartamento`),
  KEY `FK_emplado_2` (`idciudad`),
  CONSTRAINT `FK_emplado_1` FOREIGN KEY (`iddepartamento`) REFERENCES `departamento` (`iddepartamento`),
  CONSTRAINT `FK_emplado_2` FOREIGN KEY (`idciudad`) REFERENCES `ciudad` (`idciudad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `empleado`
--

/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` (`idempleado`,`nombreempleado`,`emailempleado`,`direccionempleado`,`estadoempleado`,`telefonoempleado`,`perfil`,`iddepartamento`,`idciudad`,`username`,`password`) VALUES 
 (1,'Andres Gonzalez','andressadas@hotmail.com','diagonal 117','ACTIVO','3004719805','ADMINISTRADOR',1,1,'aaa','aaa');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;


--
-- Definition of table `envio`
--

DROP TABLE IF EXISTS `envio`;
CREATE TABLE `envio` (
  `idenvio` int(10) unsigned NOT NULL auto_increment,
  `fechaingreso` datetime NOT NULL,
  `fechaentrega` datetime NOT NULL,
  `piezas` int(10) unsigned NOT NULL,
  `idciudadorigen` int(10) unsigned NOT NULL,
  `iddepartamentoorigen` int(10) unsigned NOT NULL,
  `idempleado` int(10) unsigned NOT NULL,
  `idsucursal` int(10) unsigned NOT NULL,
  `idclienteremite` int(10) unsigned NOT NULL,
  `valordeclarado` int(10) unsigned NOT NULL,
  `costoenvio` int(10) unsigned NOT NULL,
  `peso` int(10) unsigned NOT NULL,
  `modoenvio` char(15) NOT NULL,
  `idclientedestinatario` int(10) unsigned NOT NULL,
  `iddepartamentodestino` int(10) unsigned NOT NULL,
  `idciudaddestino` int(10) unsigned NOT NULL,
  `direcciondestino` varchar(45) NOT NULL,
  `descripcionenvio` varchar(100) NOT NULL,
  PRIMARY KEY  (`idenvio`),
  KEY `FK_envio_1` (`idciudadorigen`),
  KEY `FK_envio_2` (`iddepartamentoorigen`),
  KEY `FK_envio_3` (`idempleado`),
  KEY `FK_envio_4` (`idsucursal`),
  KEY `FK_envio_5` (`idclienteremite`),
  KEY `FK_envio_6` (`idclientedestinatario`),
  KEY `FK_envio_7` (`iddepartamentodestino`),
  KEY `FK_envio_8` (`idciudaddestino`),
  CONSTRAINT `FK_envio_8` FOREIGN KEY (`idciudaddestino`) REFERENCES `ciudad` (`idciudad`),
  CONSTRAINT `FK_envio_1` FOREIGN KEY (`idciudadorigen`) REFERENCES `ciudad` (`idciudad`),
  CONSTRAINT `FK_envio_2` FOREIGN KEY (`iddepartamentoorigen`) REFERENCES `departamento` (`iddepartamento`),
  CONSTRAINT `FK_envio_3` FOREIGN KEY (`idempleado`) REFERENCES `empleado` (`idempleado`),
  CONSTRAINT `FK_envio_4` FOREIGN KEY (`idsucursal`) REFERENCES `sucursal` (`idsucursal`),
  CONSTRAINT `FK_envio_5` FOREIGN KEY (`idclienteremite`) REFERENCES `cliente` (`idcliente`),
  CONSTRAINT `FK_envio_6` FOREIGN KEY (`idclientedestinatario`) REFERENCES `cliente` (`idcliente`),
  CONSTRAINT `FK_envio_7` FOREIGN KEY (`iddepartamentodestino`) REFERENCES `departamento` (`iddepartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `envio`
--

/*!40000 ALTER TABLE `envio` DISABLE KEYS */;
/*!40000 ALTER TABLE `envio` ENABLE KEYS */;


--
-- Definition of table `sucursal`
--

DROP TABLE IF EXISTS `sucursal`;
CREATE TABLE `sucursal` (
  `idsucursal` int(10) unsigned NOT NULL auto_increment,
  `direccionsucursal` varchar(45) NOT NULL,
  `nombresucursal` varchar(45) NOT NULL,
  `iddepartamento` int(10) unsigned NOT NULL,
  `idciudad` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`idsucursal`),
  KEY `FK_sucursal_1` (`iddepartamento`),
  KEY `FK_sucursal_2` (`idciudad`),
  CONSTRAINT `FK_sucursal_2` FOREIGN KEY (`idciudad`) REFERENCES `ciudad` (`idciudad`),
  CONSTRAINT `FK_sucursal_1` FOREIGN KEY (`iddepartamento`) REFERENCES `departamento` (`iddepartamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sucursal`
--

/*!40000 ALTER TABLE `sucursal` DISABLE KEYS */;
/*!40000 ALTER TABLE `sucursal` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
