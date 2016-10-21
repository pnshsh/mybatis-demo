/*
Navicat MySQL Data Transfer

Source Server         : mariaDB
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2016-10-20 01:53:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for man
-- ----------------------------
DROP TABLE IF EXISTS `man`;
CREATE TABLE `man` (
  `name` varchar(10) DEFAULT NULL,
  `id` bigint(19) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000000000000010000 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for mid
-- ----------------------------
DROP TABLE IF EXISTS `mid`;
CREATE TABLE `mid` (
  `id` varchar(24) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for woman
-- ----------------------------
DROP TABLE IF EXISTS `woman`;
CREATE TABLE `woman` (
  `id` varchar(19) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
