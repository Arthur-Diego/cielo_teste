/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Arthur
 * Created: 22/04/2020

-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: cielo_teste
-- ------------------------------------------------------
-- Server version	5.7.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `controle_lanc`
--
CREATE DATABASE cielo_teste;

USE cielo_teste;


DROP TABLE IF EXISTS `controle_lanc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `controle_lanc` (
  `codigo_identificador_unico` varchar(255) NOT NULL,
  `data_efetiva_lancamento` date DEFAULT NULL,
  `data_lancamento_conta_corrente_cliente` date DEFAULT NULL,
  `date_efetiva_lancamento` datetime DEFAULT NULL,
  `date_lancamento_conta_corrente_cliente` datetime DEFAULT NULL,
  `descricao_grupo_pagamento` varchar(255) DEFAULT NULL,
  `nome_banco` varchar(255) DEFAULT NULL,
  `numero_evento` int(11) DEFAULT NULL,
  `numero_raizcnpj` varchar(255) DEFAULT NULL,
  `numero_sufixocnpj` varchar(255) DEFAULT NULL,
  `quantidade_lancamento_remessa` int(11) DEFAULT NULL,
  `valor_lancamento_remessa` int(11) DEFAULT NULL,
  `id_num_rem_ban` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo_identificador_unico`),
  KEY `fk_lanc_conta_corrent_cli` (`id_num_rem_ban`),
  CONSTRAINT `fk_lanc_conta_corrent_cli` FOREIGN KEY (`id_num_rem_ban`) REFERENCES `lanc_conta_corrent_cli` (`id_num_rem_ban`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `controle_lanc`
--

LOCK TABLES `controle_lanc` WRITE;
/*!40000 ALTER TABLE `controle_lanc` DISABLE KEYS */;
INSERT INTO `controle_lanc` VALUES ('1','2019-07-04','2019-07-04','2019-07-04 00:00:00','2019-07-04 00:00:00','LA-56','BANCO ABCD S.A.             ',42236790,'12996721','1597',22,9000,1),('2','2019-07-02','2019-07-02','2019-07-02 00:00:00','2019-07-02 00:00:00','LA-56','BANCO ABCD S.A.             ',42592397,'12996721','1597',2,882,2);
/*!40000 ALTER TABLE `controle_lanc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dados_domicilio_bancario`
--

DROP TABLE IF EXISTS `dados_domicilio_bancario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dados_domicilio_bancario` (
  `id_dad_ban` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_banco` int(11) DEFAULT NULL,
  `numero_agencia` int(11) DEFAULT NULL,
  `numero_conta_corrente` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_dad_ban`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dados_domicilio_bancario`
--

LOCK TABLES `dados_domicilio_bancario` WRITE;
/*!40000 ALTER TABLE `dados_domicilio_bancario` DISABLE KEYS */;
INSERT INTO `dados_domicilio_bancario` VALUES (1,1,344,'345667'),(2,322,2666,'453577657');
/*!40000 ALTER TABLE `dados_domicilio_bancario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lanc_conta_corrent_cli`
--

DROP TABLE IF EXISTS `lanc_conta_corrent_cli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lanc_conta_corrent_cli` (
  `id_num_rem_ban` int(11) NOT NULL,
  `nome_situacao_remessa` varchar(255) DEFAULT NULL,
  `nome_tipo_operacao` varchar(255) DEFAULT NULL,
  `id_dad_ban` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_num_rem_ban`),
  KEY `fk_dad_ban` (`id_dad_ban`),
  CONSTRAINT `fk_dad_ban` FOREIGN KEY (`id_dad_ban`) REFERENCES `dados_domicilio_bancario` (`id_dad_ban`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lanc_conta_corrent_cli`
--

LOCK TABLES `lanc_conta_corrent_cli` WRITE;
/*!40000 ALTER TABLE `lanc_conta_corrent_cli` DISABLE KEYS */;
INSERT INTO `lanc_conta_corrent_cli` VALUES (1,'Pago','regular',1),(2,'Pendente','irregular',2);
/*!40000 ALTER TABLE `lanc_conta_corrent_cli` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-22 15:30:00

 */

