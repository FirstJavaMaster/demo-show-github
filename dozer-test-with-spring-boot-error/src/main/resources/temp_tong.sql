/*
SQLyog Community v13.1.1 (64 bit)
MySQL - 5.6.40 : Database - temp_tong
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`temp_tong` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `temp_tong`;

/*Table structure for table `corporation` */

DROP TABLE IF EXISTS `corporation`;

CREATE TABLE `corporation` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '企业名称',
  PRIMARY KEY (`id`),
  UNIQUE KEY `proj1_user_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='企业表';

/*Data for the table `corporation` */

LOCK TABLES `corporation` WRITE;

insert  into `corporation`(`id`,`name`) values 
(1,'管理员');

UNLOCK TABLES;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `corporation_id` bigint(20) unsigned NOT NULL COMMENT '机构id',
  `user_name` varchar(30) NOT NULL DEFAULT '' COMMENT '用户名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `proj1_user_name` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `user` */

LOCK TABLES `user` WRITE;

insert  into `user`(`id`,`corporation_id`,`user_name`) values 
(1,1,'admin');

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
