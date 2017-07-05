/*
Navicat MySQL Data Transfer

Source Server         : K
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : expense_apply

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2017-07-05 14:49:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `accept`
-- ----------------------------
DROP TABLE IF EXISTS `accept`;
CREATE TABLE `accept` (
  `AcceptId` int(11) NOT NULL AUTO_INCREMENT,
  `TId` varchar(10) NOT NULL,
  `AcceptSum` double NOT NULL,
  `ApplyId` int(11) NOT NULL,
  `ApplyType` binary(1) NOT NULL,
  PRIMARY KEY (`AcceptId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of accept
-- ----------------------------

-- ----------------------------
-- Table structure for `budget`
-- ----------------------------
DROP TABLE IF EXISTS `budget`;
CREATE TABLE `budget` (
  `BudId` int(11) NOT NULL AUTO_INCREMENT,
  `PPCCode` varchar(5) NOT NULL,
  `TMACode` varchar(5) NOT NULL,
  `PTRCode` varchar(5) NOT NULL,
  `BName` varchar(50) NOT NULL,
  `ProStartTime` date NOT NULL,
  `ProFinishTime` date NOT NULL,
  `SelfRaised` double NOT NULL,
  `Apply` double NOT NULL,
  PRIMARY KEY (`BudId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of budget
-- ----------------------------

-- ----------------------------
-- Table structure for `budgetdetail`
-- ----------------------------
DROP TABLE IF EXISTS `budgetdetail`;
CREATE TABLE `budgetdetail` (
  `BudDetId` int(11) NOT NULL AUTO_INCREMENT,
  `BudItemId` int(11) NOT NULL,
  `BudId` int(11) NOT NULL,
  `ButDetSum` char(10) NOT NULL,
  PRIMARY KEY (`BudDetId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of budgetdetail
-- ----------------------------

-- ----------------------------
-- Table structure for `budgetitem`
-- ----------------------------
DROP TABLE IF EXISTS `budgetitem`;
CREATE TABLE `budgetitem` (
  `BudItemId` int(11) NOT NULL AUTO_INCREMENT,
  `BudItemName` varchar(20) NOT NULL,
  `BudInUse` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`BudItemId`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of budgetitem
-- ----------------------------
INSERT INTO `budgetitem` VALUES ('1', '设备费', '1');
INSERT INTO `budgetitem` VALUES ('2', '材料费', '1');
INSERT INTO `budgetitem` VALUES ('3', '测试化验加工费', '1');
INSERT INTO `budgetitem` VALUES ('4', '合作、协作研究与交流费', '1');
INSERT INTO `budgetitem` VALUES ('5', '差旅费', '1');
INSERT INTO `budgetitem` VALUES ('6', '劳务费', '1');
INSERT INTO `budgetitem` VALUES ('7', '燃料动力费', '1');
INSERT INTO `budgetitem` VALUES ('8', '出版/文献/信息传播知识产权事务费', '1');
INSERT INTO `budgetitem` VALUES ('9', '会议费', '1');
INSERT INTO `budgetitem` VALUES ('10', '激励费', '1');
INSERT INTO `budgetitem` VALUES ('11', '管理费', '1');
INSERT INTO `budgetitem` VALUES ('12', '专家咨询费', '1');

-- ----------------------------
-- Table structure for `business`
-- ----------------------------
DROP TABLE IF EXISTS `business`;
CREATE TABLE `business` (
  `BId` int(11) NOT NULL AUTO_INCREMENT,
  `BudId` int(11) DEFAULT NULL,
  `BUnit` varchar(50) NOT NULL,
  `BTeaName` varchar(20) NOT NULL,
  `BTeaPos` varchar(10) DEFAULT NULL,
  `BReason` varchar(30) NOT NULL,
  `BAppend` int(11) NOT NULL,
  `BSum` double NOT NULL,
  `BFinStaffId` varchar(10) NOT NULL,
  `BAgent` varchar(10) DEFAULT NULL,
  `BDate` date NOT NULL,
  PRIMARY KEY (`BId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of business
-- ----------------------------

-- ----------------------------
-- Table structure for `businessitem`
-- ----------------------------
DROP TABLE IF EXISTS `businessitem`;
CREATE TABLE `businessitem` (
  `BusItemId` int(11) NOT NULL AUTO_INCREMENT,
  `BusItemName` varchar(20) NOT NULL,
  `BusInUse` tinyint(1) NOT NULL,
  PRIMARY KEY (`BusItemId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of businessitem
-- ----------------------------
INSERT INTO `businessitem` VALUES ('1', '飞机', '1');
INSERT INTO `businessitem` VALUES ('2', '火车', '1');
INSERT INTO `businessitem` VALUES ('3', '其他交通费', '1');
INSERT INTO `businessitem` VALUES ('4', '住宿费', '1');
INSERT INTO `businessitem` VALUES ('5', '伙食补助费', '1');
INSERT INTO `businessitem` VALUES ('6', '公杂费', '1');
INSERT INTO `businessitem` VALUES ('7', '其他', '1');

-- ----------------------------
-- Table structure for `busnisedetail`
-- ----------------------------
DROP TABLE IF EXISTS `busnisedetail`;
CREATE TABLE `busnisedetail` (
  `BusDetId` int(11) NOT NULL AUTO_INCREMENT,
  `BusLocId` int(11) NOT NULL,
  `BusItemId` int(11) NOT NULL,
  `BusDetSum` double NOT NULL,
  PRIMARY KEY (`BusDetId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of busnisedetail
-- ----------------------------

-- ----------------------------
-- Table structure for `busnisslocation`
-- ----------------------------
DROP TABLE IF EXISTS `busnisslocation`;
CREATE TABLE `busnisslocation` (
  `BusLocId` int(11) NOT NULL AUTO_INCREMENT,
  `BId` int(11) DEFAULT NULL,
  `InProvince` binary(1) NOT NULL,
  `BusLocation` varchar(20) NOT NULL,
  `BusStartDate` date NOT NULL,
  `BusFinishDate` date NOT NULL,
  PRIMARY KEY (`BusLocId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of busnisslocation
-- ----------------------------

-- ----------------------------
-- Table structure for `expenddetail`
-- ----------------------------
DROP TABLE IF EXISTS `expenddetail`;
CREATE TABLE `expenddetail` (
  `ExpDetId` int(11) NOT NULL AUTO_INCREMENT,
  `ExpItemId` int(11) NOT NULL,
  `EId` int(11) NOT NULL,
  `ExpDetSum` double NOT NULL,
  PRIMARY KEY (`ExpDetId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of expenddetail
-- ----------------------------

-- ----------------------------
-- Table structure for `expense`
-- ----------------------------
DROP TABLE IF EXISTS `expense`;
CREATE TABLE `expense` (
  `EId` int(11) NOT NULL AUTO_INCREMENT,
  `BudId` int(11) NOT NULL,
  `EAppend` int(11) NOT NULL,
  `EManager` varchar(10) DEFAULT NULL,
  `EAgent` varchar(20) DEFAULT NULL,
  `EPhone` varchar(15) DEFAULT NULL,
  `EDate` date NOT NULL,
  PRIMARY KEY (`EId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of expense
-- ----------------------------

-- ----------------------------
-- Table structure for `expenseitem`
-- ----------------------------
DROP TABLE IF EXISTS `expenseitem`;
CREATE TABLE `expenseitem` (
  `ExpItemId` int(11) NOT NULL AUTO_INCREMENT,
  `BudItemId` int(11) NOT NULL,
  `ExpItemName` varchar(10) NOT NULL,
  `ExpInUse` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ExpItemId`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of expenseitem
-- ----------------------------
INSERT INTO `expenseitem` VALUES ('1', '11', '办公用品', '1');
INSERT INTO `expenseitem` VALUES ('2', '5', '市内交通费', '1');
INSERT INTO `expenseitem` VALUES ('3', '1', '固定资产购建费', '1');
INSERT INTO `expenseitem` VALUES ('4', '11', '通讯、邮寄费', '1');
INSERT INTO `expenseitem` VALUES ('5', '7', '燃油、燃料费', '1');
INSERT INTO `expenseitem` VALUES ('6', '10', '体育用品购置费', '1');
INSERT INTO `expenseitem` VALUES ('7', '12', '技术服务咨询费', '1');
INSERT INTO `expenseitem` VALUES ('8', '5', '过路、过桥费', '1');
INSERT INTO `expenseitem` VALUES ('9', '2', '日用品、材料费', '1');
INSERT INTO `expenseitem` VALUES ('10', '4', '业务招待费', '1');
INSERT INTO `expenseitem` VALUES ('11', '1', '机动车辆维修费', '1');
INSERT INTO `expenseitem` VALUES ('12', '3', '材料测试加工费', '1');
INSERT INTO `expenseitem` VALUES ('13', '8', '宣传广告费', '1');
INSERT INTO `expenseitem` VALUES ('14', '1', '机动车辆保险费', '1');
INSERT INTO `expenseitem` VALUES ('15', '1', '设备维修费', '1');
INSERT INTO `expenseitem` VALUES ('16', '8', '图书资料版面费', '1');
INSERT INTO `expenseitem` VALUES ('17', '9', '会议、会务费', '1');
INSERT INTO `expenseitem` VALUES ('18', '6', '劳务费', '1');
INSERT INTO `expenseitem` VALUES ('19', '2', '复印、印刷费', '1');
INSERT INTO `expenseitem` VALUES ('20', '4', '培训费', '1');
INSERT INTO `expenseitem` VALUES ('21', '11', '其他', '1');

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
