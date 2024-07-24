-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: ebook_project
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `cash_charge`
--

DROP TABLE IF EXISTS `cash_charge`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cash_charge` (
  `merchant_uid` varchar(255) NOT NULL,
  `imp_uid` varchar(255) NOT NULL,
  `user_id` varchar(16) NOT NULL,
  `name` varchar(255) NOT NULL,
  `cash_amount` int NOT NULL,
  `paid_amount` int NOT NULL,
  `pg_provider` varchar(255) DEFAULT NULL,
  `paid_at` bigint DEFAULT NULL,
  PRIMARY KEY (`merchant_uid`),
  UNIQUE KEY `imp_uid_UNIQUE` (`imp_uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cash_charge`
--

LOCK TABLES `cash_charge` WRITE;
/*!40000 ALTER TABLE `cash_charge` DISABLE KEYS */;
INSERT INTO `cash_charge` VALUES ('order_no_1721611888662','imp_501888487550','a','캐쉬충전',10000,1000,'kakaopay',1721611903),('order_no_1721613406494','imp_269406326312','a','캐쉬충전',50000,50000,'kakaopay',1721613421),('order_no_1721619808789','imp_711808409200','a','캐쉬충전',5000,5000,'kakaopay',1721619976),('order_no_1721624677716','imp_794677142080','kdjcul','캐쉬충전',50000,50000,'kakaopay',1721624710),('order_no_1721699583557','imp_305583508695','korea','캐쉬충전',1000,1000,'kakaopay',1721699602);
/*!40000 ALTER TABLE `cash_charge` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-24 19:07:00
