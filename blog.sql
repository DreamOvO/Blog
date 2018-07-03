-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.28 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.5.0.5280
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 blog 的数据库结构
CREATE DATABASE IF NOT EXISTS `blog` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `blog`;

-- 导出  表 blog.article 结构
CREATE TABLE IF NOT EXISTS `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `article_name` varchar(40) NOT NULL,
  `content` varchar(2555) NOT NULL,
  `type` int(4) NOT NULL,
  `pic_name` varchar(400) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- 正在导出表  blog.article 的数据：~8 rows (大约)
DELETE FROM `article`;
/*!40000 ALTER TABLE `article` DISABLE KEYS */;
INSERT INTO `article` (`id`, `article_name`, `content`, `type`, `pic_name`) VALUES
	(1, '个人博客，属于我的小世界！', '自从入了这行，很多人跟我说可以做网络教程，我也有考虑，但最终没有实现，因为我觉得在这个教程泛滥的时代，直接做一套免费的原创个人博客模板更为实在。每当看到自己喜欢的配色图片或者布局，惊艳的js或者css3效果的时候，就有了做模板的冲动。', 2, '/images/917d732926d79cc2ae1012831ce51d1e.jpg'),
	(2, '个人博客，属于我的小世界！', '自从入了这行，很多人跟我说可以做网络教程，我也有考虑，但最终没有实现，因为我觉得在这个教程泛滥的时代，直接做一套免费的原创个人博客模板更为实在。每当看到自己喜欢的配色图片或者布局，惊艳的js或者css3效果的时候，就有了做模板的冲动。', 2, '/images/917d732926d79cc2ae1012831ce51d1e.jpg'),
	(3, '个人博客，属于我的小世界！', '自从入了这行，很多人跟我说可以做网络教程，我也有考虑，但最终没有实现，因为我觉得在这个教程泛滥的时代，直接做一套免费的原创个人博客模板更为实在。每当看到自己喜欢的配色图片或者布局，惊艳的js或者css3效果的时候，就有了做模板的冲动。', 2, '/images/917d732926d79cc2ae1012831ce51d1e.jpg'),
	(4, '个人博客，属于我的小世界！', '自从入了这行，很多人跟我说可以做网络教程，我也有考虑，但最终没有实现，因为我觉得在这个教程泛滥的时代，直接做一套免费的原创个人博客模板更为实在。每当看到自己喜欢的配色图片或者布局，惊艳的js或者css3效果的时候，就有了做模板的冲动。', 2, '/images/917d732926d79cc2ae1012831ce51d1e.jpg'),
	(5, '个人博客，属于我的小世界！', '自从入了这行，很多人跟我说可以做网络教程，我也有考虑，但最终没有实现，因为我觉得在这个教程泛滥的时代，直接做一套免费的原创个人博客模板更为实在。每当看到自己喜欢的配色图片或者布局，惊艳的js或者css3效果的时候，就有了做模板的冲动。', 2, '/images/917d732926d79cc2ae1012831ce51d1e.jpg'),
	(6, '个人博客，属于我的小世界！', '自从入了这行，很多人跟我说可以做网络教程，我也有考虑，但最终没有实现，因为我觉得在这个教程泛滥的时代，直接做一套免费的原创个人博客模板更为实在。每当看到自己喜欢的配色图片或者布局，惊艳的js或者css3效果的时候，就有了做模板的冲动。', 2, '/images/917d732926d79cc2ae1012831ce51d1e.jpg'),
	(7, '个人博客，属于我的小世界！', '自从入了这行，很多人跟我说可以做网络教程，我也有考虑，但最终没有实现，因为我觉得在这个教程泛滥的时代，直接做一套免费的原创个人博客模板更为实在。每当看到自己喜欢的配色图片或者布局，惊艳的js或者css3效果的时候，就有了做模板的冲动。', 2, '/images/917d732926d79cc2ae1012831ce51d1e.jpg'),
	(8, '个人博客，属于我的小世界！', '自从入了这行，很多人跟我说可以做网络教程，我也有考虑，但最终没有实现，因为我觉得在这个教程泛滥的时代，直接做一套免费的原创个人博客模板更为实在。每当看到自己喜欢的配色图片或者布局，惊艳的js或者css3效果的时候，就有了做模板的冲动。', 2, '/images/917d732926d79cc2ae1012831ce51d1e.jpg');
/*!40000 ALTER TABLE `article` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
