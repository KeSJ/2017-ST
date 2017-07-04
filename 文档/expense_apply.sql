/*
Navicat MySQL Data Transfer

Source Server         : K
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : expense_apply

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-07-04 13:59:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `budget`
-- ----------------------------
DROP TABLE IF EXISTS `budget`;
CREATE TABLE `budget` (
  `BudId` int(11) NOT NULL,
  `PPCCode` varchar(5) NOT NULL,
  `TMACode` varchar(5) NOT NULL,
  `PTRCode` varchar(5) NOT NULL,
  `BName` varchar(50) NOT NULL,
  `ProStartTime` datetime NOT NULL,
  `ProFinishTime` datetime NOT NULL,
  `BEquip` double DEFAULT NULL,
  `BMaterial` double DEFAULT NULL,
  `BTest` double DEFAULT NULL,
  `BCooprt` double DEFAULT NULL,
  `BTravel` double DEFAULT NULL,
  `BLabor` double DEFAULT NULL,
  `BFuel` double DEFAULT NULL,
  `BPublish` double DEFAULT NULL,
  `BMeeting` double DEFAULT NULL,
  `BIncentive` double DEFAULT NULL,
  `BManag` double DEFAULT NULL,
  `BExpert` double DEFAULT NULL,
  `SelfRaised` double NOT NULL,
  `Apply` double NOT NULL,
  PRIMARY KEY (`BudId`),
  KEY `FK_BPPC` (`PPCCode`),
  KEY `FK_BPTR` (`PTRCode`),
  KEY `FK_BTMA` (`TMACode`),
  CONSTRAINT `FK_BPPC` FOREIGN KEY (`PPCCode`) REFERENCES `proplancategory` (`PPCCode`),
  CONSTRAINT `FK_BPTR` FOREIGN KEY (`PTRCode`) REFERENCES `protecres` (`PTRCode`),
  CONSTRAINT `FK_BTMA` FOREIGN KEY (`TMACode`) REFERENCES `tecmngarea` (`TMACode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of budget
-- ----------------------------

-- ----------------------------
-- Table structure for `business`
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `BusId` int(11) NOT NULL AUTO_INCREMENT,
  `BSumId` int(11) NOT NULL,
  `InProvince` binary(1) NOT NULL,
  `BusStartDate` date NOT NULL,
  `BusFinishDate` date NOT NULL,
  `BusPlane` double DEFAULT NULL,
  `BusTrain` double DEFAULT NULL,
  `BusTravelOther` double DEFAULT NULL,
  `BusStay` double DEFAULT NULL,
  `BusFood` double DEFAULT NULL,
  `BusSubsideOther` double DEFAULT NULL,
  `BusOther` double DEFAULT NULL,
  PRIMARY KEY (`BusId`),
  KEY `FK_Reference_5` (`BSumId`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`BSumId`) REFERENCES `businesssum` (`BSumId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business
-- ----------------------------

-- ----------------------------
-- Table structure for `businesssum`
-- ----------------------------
DROP TABLE IF EXISTS `businesssum`;
CREATE TABLE `businesssum` (
  `BSumId` int(11) NOT NULL,
  `BudId` int(11) DEFAULT NULL,
  `BSUnit` varchar(50) NOT NULL,
  `BSTeaId` varchar(10) NOT NULL,
  `BSReason` varchar(30) NOT NULL,
  `BSAppend` int(11) NOT NULL,
  `BSSum` double NOT NULL,
  `BSAccepTeaId` varchar(10) NOT NULL,
  `BSAccepSum` double NOT NULL,
  `BSFinStaffId` varchar(10) NOT NULL,
  `BSAgent` varchar(10) DEFAULT NULL,
  `BSDate` datetime NOT NULL,
  PRIMARY KEY (`BSumId`),
  KEY `FK_BusinessBudgetId` (`BudId`),
  KEY `FK_Reference_6` (`BSFinStaffId`),
  KEY `FK_Reference_7` (`BSTeaId`),
  KEY `FK_Reference_8` (`BSAccepTeaId`),
  CONSTRAINT `FK_BusinessBudgetId` FOREIGN KEY (`BudId`) REFERENCES `budget` (`BudId`),
  CONSTRAINT `FK_Reference_6` FOREIGN KEY (`BSFinStaffId`) REFERENCES `financialstaff` (`FSId`),
  CONSTRAINT `FK_Reference_7` FOREIGN KEY (`BSTeaId`) REFERENCES `teacher` (`TId`),
  CONSTRAINT `FK_Reference_8` FOREIGN KEY (`BSAccepTeaId`) REFERENCES `teacher` (`TId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of businesssum
-- ----------------------------

-- ----------------------------
-- Table structure for `financialstaff`
-- ----------------------------
DROP TABLE IF EXISTS `financialstaff`;
CREATE TABLE `financialstaff` (
  `FSId` varchar(10) NOT NULL,
  `FSName` varchar(20) NOT NULL,
  `FSPwd` varchar(20) NOT NULL,
  PRIMARY KEY (`FSId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of financialstaff
-- ----------------------------

-- ----------------------------
-- Table structure for `proplancategory`
-- ----------------------------
DROP TABLE IF EXISTS `proplancategory`;
CREATE TABLE `proplancategory` (
  `PPCCode` varchar(5) NOT NULL,
  `PPCName` varchar(30) NOT NULL,
  PRIMARY KEY (`PPCCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of proplancategory
-- ----------------------------
INSERT INTO `proplancategory` VALUES ('A11', '自然科学基金重大项目');
INSERT INTO `proplancategory` VALUES ('A12', '自然科学基金一般项目');
INSERT INTO `proplancategory` VALUES ('A13', '自然科学基金青年人才培养专项资金项目');
INSERT INTO `proplancategory` VALUES ('C01', '重大科技专项（优先主题）重大工业项目');
INSERT INTO `proplancategory` VALUES ('C02', '重大科技专项（优先主题）重大农业项目');
INSERT INTO `proplancategory` VALUES ('C03', '重大科技专项（优先主题）重大社会发展项目');
INSERT INTO `proplancategory` VALUES ('C04', '重大科技专项（优先主题）重大国际科技合作合作研究项目');
INSERT INTO `proplancategory` VALUES ('C06', '重大科技专项（优先主题）重大国内合作成果转化项目');
INSERT INTO `proplancategory` VALUES ('C07', '重大科技专项（优先主题）重大”863”科技成果对接项目');
INSERT INTO `proplancategory` VALUES ('C11', '重大科技专项（优先主题）重点工业项目');
INSERT INTO `proplancategory` VALUES ('C12', '重大科技专项（优先主题）重点农业项目');
INSERT INTO `proplancategory` VALUES ('C13', '重大科技专项（优先主题）重点社会发展项目');
INSERT INTO `proplancategory` VALUES ('C14', '重大科技专项（优先主题）重点国际科技合作合作研究项目');
INSERT INTO `proplancategory` VALUES ('C15', '重大软科学项目');
INSERT INTO `proplancategory` VALUES ('C16', '重大科技专项（优先主题）重点国内合作成果转化项目');
INSERT INTO `proplancategory` VALUES ('C17', '重大科技专项（优先主题）重点”863”科技成果对接项目');
INSERT INTO `proplancategory` VALUES ('C21', '公益技术应用研究工业项目');
INSERT INTO `proplancategory` VALUES ('C22', '公益技术应用研究农业项目');
INSERT INTO `proplancategory` VALUES ('C23', '公益技术应用研究社会发展项目');
INSERT INTO `proplancategory` VALUES ('C24', '公益技术应用研究科技合作项目');
INSERT INTO `proplancategory` VALUES ('C25', '重点软科学项目');
INSERT INTO `proplancategory` VALUES ('C35', '一般软科学项目');
INSERT INTO `proplancategory` VALUES ('C80', '自主知识产权成果转化项目');
INSERT INTO `proplancategory` VALUES ('D20', '火炬计划');
INSERT INTO `proplancategory` VALUES ('D30', '星火计划');
INSERT INTO `proplancategory` VALUES ('D40', '科技型中小企业技术创新项目');
INSERT INTO `proplancategory` VALUES ('D60', '新产品计划');
INSERT INTO `proplancategory` VALUES ('D70', '农业科技成果转化项目');
INSERT INTO `proplancategory` VALUES ('D80', '国际科技合作与引进消化吸收再创新重点项目');
INSERT INTO `proplancategory` VALUES ('E10', '重点实验室和中试基地');
INSERT INTO `proplancategory` VALUES ('E20', '区域科技创新服务中心');
INSERT INTO `proplancategory` VALUES ('E40', '高新技术企业研究开发中心');
INSERT INTO `proplancategory` VALUES ('E60', '科技创新平台');
INSERT INTO `proplancategory` VALUES ('E70', '重点科技企业孵化器');
INSERT INTO `proplancategory` VALUES ('E80', '引进大院名校共建创新载体');
INSERT INTO `proplancategory` VALUES ('F10', '省属科研院所专项科技条件建设项目');
INSERT INTO `proplancategory` VALUES ('F20', '省属科研院所专项创新团队建设与人才培项目');
INSERT INTO `proplancategory` VALUES ('F30', '省属科研院所专项公共科技服务项目');
INSERT INTO `proplancategory` VALUES ('G10', '科技特派员和科技扶贫');
INSERT INTO `proplancategory` VALUES ('G20', '网上技术市场重点签约项目');
INSERT INTO `proplancategory` VALUES ('G30', '长三角科技合作项目');
INSERT INTO `proplancategory` VALUES ('G40', '院士基金');
INSERT INTO `proplancategory` VALUES ('G90', '其他');
INSERT INTO `proplancategory` VALUES ('R10', '钱江人才');
INSERT INTO `proplancategory` VALUES ('R20', '科研院所优秀青年科技人才资助计划');
INSERT INTO `proplancategory` VALUES ('R40', '新苗人才');

-- ----------------------------
-- Table structure for `protecres`
-- ----------------------------
DROP TABLE IF EXISTS `protecres`;
CREATE TABLE `protecres` (
  `PTRCode` varchar(5) NOT NULL,
  `PTRName` varchar(20) NOT NULL,
  PRIMARY KEY (`PTRCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of protecres
-- ----------------------------
INSERT INTO `protecres` VALUES ('1', '自主开发');
INSERT INTO `protecres` VALUES ('2', '产学研合作开发');
INSERT INTO `protecres` VALUES ('3', '引进技术本企业消化创新');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `TId` varchar(10) NOT NULL,
  `TName` varchar(20) NOT NULL,
  `TPosition` varchar(10) NOT NULL,
  `TCardId` varchar(20) NOT NULL,
  PRIMARY KEY (`TId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `tecmngarea`
-- ----------------------------
DROP TABLE IF EXISTS `tecmngarea`;
CREATE TABLE `tecmngarea` (
  `TMACode` varchar(5) NOT NULL,
  `TMAName` varchar(20) NOT NULL,
  PRIMARY KEY (`TMACode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tecmngarea
-- ----------------------------
INSERT INTO `tecmngarea` VALUES ('A1', '电子信息');
INSERT INTO `tecmngarea` VALUES ('A11', '网络');
INSERT INTO `tecmngarea` VALUES ('A12', '通信');
INSERT INTO `tecmngarea` VALUES ('A13', '计算机硬件');
INSERT INTO `tecmngarea` VALUES ('A14', '计算机软件');
INSERT INTO `tecmngarea` VALUES ('A15', '自动化控制');
INSERT INTO `tecmngarea` VALUES ('A16', '电子及其他');
INSERT INTO `tecmngarea` VALUES ('A2', '能源');
INSERT INTO `tecmngarea` VALUES ('A21', '新能源');
INSERT INTO `tecmngarea` VALUES ('A22', '节能技术及其他');
INSERT INTO `tecmngarea` VALUES ('A30', '交通');
INSERT INTO `tecmngarea` VALUES ('A4', '材料');
INSERT INTO `tecmngarea` VALUES ('A41', '无机材料');
INSERT INTO `tecmngarea` VALUES ('A42', '有机材料');
INSERT INTO `tecmngarea` VALUES ('A43', '金属材料');
INSERT INTO `tecmngarea` VALUES ('A5', '化工');
INSERT INTO `tecmngarea` VALUES ('A51', '无机化工');
INSERT INTO `tecmngarea` VALUES ('A52', '有机化工');
INSERT INTO `tecmngarea` VALUES ('A53', '精细化工');
INSERT INTO `tecmngarea` VALUES ('A54', '催化');
INSERT INTO `tecmngarea` VALUES ('A55', '化学工程与工艺');
INSERT INTO `tecmngarea` VALUES ('A60', '纺织');
INSERT INTO `tecmngarea` VALUES ('A70', '轻工');
INSERT INTO `tecmngarea` VALUES ('A8', '建材与城建');
INSERT INTO `tecmngarea` VALUES ('A80', '建材');
INSERT INTO `tecmngarea` VALUES ('A85', '城建');
INSERT INTO `tecmngarea` VALUES ('A9', '机电');
INSERT INTO `tecmngarea` VALUES ('A91', '机电一体化');
INSERT INTO `tecmngarea` VALUES ('A92', '通用机械与设备');
INSERT INTO `tecmngarea` VALUES ('A93', '化工机械');
INSERT INTO `tecmngarea` VALUES ('A94', '仪器仪表');
INSERT INTO `tecmngarea` VALUES ('B1', '种植业');
INSERT INTO `tecmngarea` VALUES ('B11', '粮油作物');
INSERT INTO `tecmngarea` VALUES ('B12', '经济作物');
INSERT INTO `tecmngarea` VALUES ('B2', '渔业');
INSERT INTO `tecmngarea` VALUES ('B21', '海洋渔业');
INSERT INTO `tecmngarea` VALUES ('B22', '淡水渔业');
INSERT INTO `tecmngarea` VALUES ('B3', '林特业');
INSERT INTO `tecmngarea` VALUES ('B31', '林业');
INSERT INTO `tecmngarea` VALUES ('B32', '林特产');
INSERT INTO `tecmngarea` VALUES ('B4', '畜牧业');
INSERT INTO `tecmngarea` VALUES ('B41', '畜禽养殖');
INSERT INTO `tecmngarea` VALUES ('B49', '其他畜牧业');
INSERT INTO `tecmngarea` VALUES ('B5', '农产品加工');
INSERT INTO `tecmngarea` VALUES ('B51', '动植物加工');
INSERT INTO `tecmngarea` VALUES ('B52', '林特产加工及其他');
INSERT INTO `tecmngarea` VALUES ('C1', '医药卫生');
INSERT INTO `tecmngarea` VALUES ('C11', '外科');
INSERT INTO `tecmngarea` VALUES ('C12', '内科');
INSERT INTO `tecmngarea` VALUES ('C13', '综合医学');
INSERT INTO `tecmngarea` VALUES ('C14', '生物制药');
INSERT INTO `tecmngarea` VALUES ('C15', '化学制药');
INSERT INTO `tecmngarea` VALUES ('C16', '中医药');
INSERT INTO `tecmngarea` VALUES ('C2', '资源与环境');
INSERT INTO `tecmngarea` VALUES ('C21', '资源开发利用');
INSERT INTO `tecmngarea` VALUES ('C22', '环保技术');
INSERT INTO `tecmngarea` VALUES ('C23', '环保装备');
INSERT INTO `tecmngarea` VALUES ('C30', '社会事业');
INSERT INTO `tecmngarea` VALUES ('C40', '服务业');
INSERT INTO `tecmngarea` VALUES ('C5', '海洋');
INSERT INTO `tecmngarea` VALUES ('C51', '养殖与捕捞');
INSERT INTO `tecmngarea` VALUES ('C52', '临港工业');
INSERT INTO `tecmngarea` VALUES ('C60', '公共安全与防灾减灾');
INSERT INTO `tecmngarea` VALUES ('D10', '软科学');
