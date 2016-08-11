/*
SQLyog Ultimate v12.09 (32 bit)
MySQL - 5.6.26-log : Database - weiyunpan
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`weiyunpan` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `weiyunpan`;

/*Table structure for table `favorinfo` */

DROP TABLE IF EXISTS `favorinfo`;

CREATE TABLE `favorinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `favor_userid` int(11) DEFAULT NULL,
  `file_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8;

/*Data for the table `favorinfo` */

insert  into `favorinfo`(`id`,`favor_userid`,`file_id`) values (26,21,56),(57,20,57),(58,20,59),(60,21,63),(61,20,67),(62,27,69);

/*Table structure for table `test` */

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `a` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `test` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(50) NOT NULL COMMENT '用户邮箱',
  `role` char(1) DEFAULT '1' COMMENT '1:代表普通用户；2:代表管理员',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`email`,`role`) values (1,'pamgo','698d51a19d8a121ce581499d7b701668','pamgogdpyc@163.com','1'),(20,'alison','96e79218965eb72c92a549dd5a330112','alison@qq.com','1'),(21,'alisonp','96e79218965eb72c92a549dd5a330112','alisonp@qq.com','1'),(22,'admin','96e79218965eb72c92a549dd5a330112','admin@qq.com','2'),(23,'alison','96e79218965eb72c92a549dd5a330112','','1'),(26,'11','96e79218965eb72c92a549dd5a330112','123@qq.com','1'),(27,'111','96e79218965eb72c92a549dd5a330112','123@qq.com','1');

/*Table structure for table `yp_diskinfo` */

DROP TABLE IF EXISTS `yp_diskinfo`;

CREATE TABLE `yp_diskinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '云盘id',
  `disk_userid` int(11) DEFAULT NULL COMMENT '所属用户',
  `total_size` bigint(20) DEFAULT NULL COMMENT '总大小',
  `used_size` binary(20) DEFAULT NULL COMMENT '已使用',
  `filenumber` int(11) DEFAULT NULL COMMENT '文件数量',
  `diskuser` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `disk_userid` (`disk_userid`),
  CONSTRAINT `disk_userid` FOREIGN KEY (`disk_userid`) REFERENCES `users` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `yp_diskinfo` */

insert  into `yp_diskinfo`(`id`,`disk_userid`,`total_size`,`used_size`,`filenumber`,`diskuser`) values (20,20,1073741824,'109264\0\0\0\0\0\0\0\0\0\0\0\0\0\0',2,'alison'),(21,21,1073741824,'82324\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0',2,'alisonp'),(22,27,1073741824,'54690\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0',1,'111');

/*Table structure for table `yp_fileinfo` */

DROP TABLE IF EXISTS `yp_fileinfo`;

CREATE TABLE `yp_fileinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件id',
  `filename` varchar(50) NOT NULL COMMENT '文件名称',
  `size` bigint(11) DEFAULT NULL COMMENT '文件大小',
  `path` varchar(255) DEFAULT NULL COMMENT '文件存储路径',
  `isshare` int(1) DEFAULT '1' COMMENT '是否已分享（1：代表未分享；2:代表已分享)',
  `isfavorite` int(1) DEFAULT '1' COMMENT '是否收藏（1：代表未收藏;2代表收藏)',
  `created_time` bigint(20) DEFAULT NULL COMMENT '上传时间',
  `create_user` int(11) DEFAULT NULL COMMENT '上传人',
  `change_time` varchar(20) DEFAULT NULL,
  `show_pic` varchar(20) DEFAULT NULL,
  `fileuser` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`create_user`),
  CONSTRAINT `user_id` FOREIGN KEY (`create_user`) REFERENCES `users` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8;

/*Data for the table `yp_fileinfo` */

insert  into `yp_fileinfo`(`id`,`filename`,`size`,`path`,`isshare`,`isfavorite`,`created_time`,`create_user`,`change_time`,`show_pic`,`fileuser`) values (63,'doc_files.png',27634,'doc_files.png',2,1,1452941321260,21,'2016-01-16 06:48:41','zly.jpg','alisonp'),(64,'file-txt.zip',54690,'file-txt.zip',1,1,1452941321400,21,'2016-01-16 06:48:41','doc_files.png','alisonp'),(67,'file-txt.zip',54690,'file-txt.zip',2,1,1452948682311,20,'2016-01-25','zip7.png','alison'),(68,'file-txt.png',54574,'file-txt.png',1,1,1452948689221,20,'2016-01-16 08:51:29','zly.jpg','alison'),(74,'鍓湰.zip',54690,'鍓湰.zip',1,1,1459679416859,27,'2016-04-03 06:30:16','zip7.png','111');

/*Table structure for table `yp_folderinfo` */

DROP TABLE IF EXISTS `yp_folderinfo`;

CREATE TABLE `yp_folderinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文件夹id',
  `foldername` varchar(50) DEFAULT NULL COMMENT '文件夹名称',
  `create_userid` int(11) NOT NULL COMMENT '创建人',
  `path` varchar(200) DEFAULT NULL COMMENT '文件夹路径',
  `parent_path` varchar(200) DEFAULT NULL COMMENT '父目录',
  `created_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

/*Data for the table `yp_folderinfo` */

insert  into `yp_folderinfo`(`id`,`foldername`,`create_userid`,`path`,`parent_path`,`created_time`) values (19,'alison1073741824KB',19,'weiyunpan/files','F:/weiyunpan/File/files/',NULL),(20,'alison1073741824KB',20,'weiyunpan/files','F:/weiyunpan/File/files/',NULL),(21,'alisonp1073741824KB',21,'weiyunpan/files','F:/weiyunpan/File/files/',NULL),(22,'alison1073741824KB',23,'weiyunpan/files','F:/weiyunpan/File/files/',NULL),(23,'111073741824KB',24,'weiyunpan/files','F:/weiyunpan/File/files/',NULL),(24,'111073741824KB',25,'weiyunpan/files','F:/weiyunpan/File/files/',NULL),(25,'111073741824KB',26,'weiyunpan/files','F:/weiyunpan/File/files/',NULL),(26,'1111073741824KB',27,'weiyunpan/files','F:/weiyunpan/File/files/',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
