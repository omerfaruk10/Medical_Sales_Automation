-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: users
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `infos`
--

DROP TABLE IF EXISTS `infos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `infos` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Surname` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `User_name` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `infos`
--

LOCK TABLES `infos` WRITE;
/*!40000 ALTER TABLE `infos` DISABLE KEYS */;
INSERT INTO `infos` VALUES (8,'Mustafa','Yılmaz','mustafa@gmail.com','mustafa_123','123'),(9,'Vahap','Şanal','vahap@gamil.com','vahap_456','456'),(10,'Yasin','Yağız','yasin@gmail.com','yasin_789','789');
/*!40000 ALTER TABLE `infos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicines`
--

DROP TABLE IF EXISTS `medicines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicines` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Pharmacy_ID` varchar(45) DEFAULT NULL,
  `User_ID` varchar(45) DEFAULT NULL,
  `Medicine_ID` varchar(45) DEFAULT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Pharmacy_name` varchar(45) DEFAULT NULL,
  `Dosage` varchar(45) DEFAULT NULL,
  `Stock` varchar(45) DEFAULT NULL,
  `Time` varchar(45) DEFAULT NULL,
  `Form` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicines`
--

LOCK TABLES `medicines` WRITE;
/*!40000 ALTER TABLE `medicines` DISABLE KEYS */;
INSERT INTO `medicines` VALUES (55,'1','','1','X ilaç','Güneş Eczanesi','Günde 2 kere','20','1 Hafta','Hap'),(56,'1','','2','Y ilaç','Güneş Eczanesi','Günde 1 kere','10','5 Gün','Hap'),(58,'2','','1','X ilaç','Hayat Eczanesi','Günde 2 kere','30','1 Hafta','Hap'),(59,'3','','1','X ilaç','Şifa Eczanesi','Günde 2 kere','15','1 Hafta','Hap'),(60,'3','','2','Y ilaç','Şifa Eczanesi','Günde 1 kere','13','5 Gün','Hap'),(61,'3','','3','Z ilaç','Şifa Eczanesi','Günde 3 kere','40','4 Gün','Şurup'),(62,'2','yasin_789','1','X ilaç','Hayat Eczanesi','Günde 2 kere','30','1 Hafta','Hap'),(63,'1','yasin_789','2','Y ilaç','Güneş Eczanesi','Günde 1 kere','10','5 Gün','Hap'),(64,'3','yasin_789','3','Z ilaç','Şifa Eczanesi','Günde 3 kere','40','4 Gün','Şurup'),(65,'1','mustafa_123','1','X ilaç','Güneş Eczanesi','Günde 2 kere','20','1 Hafta','Hap'),(66,'1','vahap_456','1','X ilaç','Güneş Eczanesi','Günde 2 kere','20','1 Hafta','Hap'),(67,'3','vahap_456','2','Y ilaç','Şifa Eczanesi','Günde 1 kere','13','5 Gün','Hap');
/*!40000 ALTER TABLE `medicines` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pharmacies`
--

DROP TABLE IF EXISTS `pharmacies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pharmacies` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Business_no` varchar(45) DEFAULT NULL,
  `Business_name` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `User_name` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pharmacies`
--

LOCK TABLES `pharmacies` WRITE;
/*!40000 ALTER TABLE `pharmacies` DISABLE KEYS */;
INSERT INTO `pharmacies` VALUES (8,'1','Güneş Eczanesi','gunes@gmail.com','gunes_123','123'),(9,'2','Hayat Eczanesi','hayat@gmail.com','hayat_456','456'),(10,'3','Şifa Eczanesi','sifa@gmail.com','sifa_789','789'),(11,'Yasin','Yağız','yasin@gmail.com','yasin_789','789');
/*!40000 ALTER TABLE `pharmacies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-01 21:13:40
