/*
 Navicat Premium Data Transfer

 Source Server         : TestMySQL
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : othersql

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 14/02/2023 20:54:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_word
-- ----------------------------
DROP TABLE IF EXISTS `tb_word`;
CREATE TABLE `tb_word`  (
  `word_id` int(0) NOT NULL AUTO_INCREMENT,
  `word_wordname` varchar(1200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`word_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 60 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_word
-- ----------------------------
INSERT INTO `tb_word` VALUES (2, '用爱心来做事，用感恩的心做人。');
INSERT INTO `tb_word` VALUES (3, '永远在追求快乐，永远在逃避痛苦。');
INSERT INTO `tb_word` VALUES (4, '多大的思想，才有多大的能量。');
INSERT INTO `tb_word` VALUES (5, '的能量=思想+行动速度的平方。');
INSERT INTO `tb_word` VALUES (6, '志是给人快乐，激励是给人痛苦。');
INSERT INTO `tb_word` VALUES (7, '功者绝不给自己软弱的借口。');
INSERT INTO `tb_word` VALUES (8, '只有一定要，才一定会得到。');
INSERT INTO `tb_word` VALUES (9, '心是成功的开始。');
INSERT INTO `tb_word` VALUES (10, '你没有借口的那一刻，就是你成功的开始。');
INSERT INTO `tb_word` VALUES (11, '命运是可以改变的。');
INSERT INTO `tb_word` VALUES (12, '成功者绝不放弃。');
INSERT INTO `tb_word` VALUES (13, '成功永远属于马上行动的人。');
INSERT INTO `tb_word` VALUES (14, '下定决心一定要，才是成功的关键。');
INSERT INTO `tb_word` VALUES (15, '成功等于目标，其他都是这句话的注解。');
INSERT INTO `tb_word` VALUES (16, '成功是一个过程，并不是一个结果。');
INSERT INTO `tb_word` VALUES (17, '成功者学习别人的经验，一般人学习自己的经验。');
INSERT INTO `tb_word` VALUES (18, '只有第一名可以教你如何成为第一名。');
INSERT INTO `tb_word` VALUES (19, '学习需要有计划。');
INSERT INTO `tb_word` VALUES (20, '完全照成功者的方法来执行。');
INSERT INTO `tb_word` VALUES (21, '九十九次的理论不如一次的行动来得实际。');
INSERT INTO `tb_word` VALUES (22, '一个胜利者不会放弃，而一个放弃者永远不会胜利。');
INSERT INTO `tb_word` VALUES (23, '信心、毅力、勇气三者具备，则天下没有做不成的事。');
INSERT INTO `tb_word` VALUES (24, '如果你想得到，你就会得到，你所需要付出的只是行动。');
INSERT INTO `tb_word` VALUES (25, '一个缺口的杯子，如果换一个角度看它，它仍然是圆的。');
INSERT INTO `tb_word` VALUES (26, '对于每一个不利条件，都会存在与之相对应的有利条件。');
INSERT INTO `tb_word` VALUES (27, '一个人的快乐，不是因为他拥有的多，而是他计较的少。');
INSERT INTO `tb_word` VALUES (28, '世间成事，不求其绝对圆满，留一份不足，可得无限美好。');
INSERT INTO `tb_word` VALUES (29, '你要做多大的事情，就该承受多大的压力。');
INSERT INTO `tb_word` VALUES (30, '如果你相信自己，你可以做任何事。');
INSERT INTO `tb_word` VALUES (31, '天空黑暗到一定程度，星辰就会熠熠生辉。');
INSERT INTO `tb_word` VALUES (32, '时间顺流而下，生活逆水行舟。');
INSERT INTO `tb_word` VALUES (33, '生活充满了选择，而生活的态度就是一切。');
INSERT INTO `tb_word` VALUES (34, '人各有志，自己的路自己走。');
INSERT INTO `tb_word` VALUES (35, '别人的话只能作为一种参考，是不能左右自己的。');
INSERT INTO `tb_word` VALUES (36, '成功来自使我们成功的信念。');
INSERT INTO `tb_word` VALUES (37, '相互了解是朋友，相互理解是知己。');
INSERT INTO `tb_word` VALUES (38, '没有所谓失败，除非你不再尝试。');
INSERT INTO `tb_word` VALUES (39, '有时可能别人不在乎你，但你不能不在乎自己。');
INSERT INTO `tb_word` VALUES (40, '你必须成功，因为你不能失败。');
INSERT INTO `tb_word` VALUES (41, '羡慕别人得到的，不如珍惜自己拥有的。');
INSERT INTO `tb_word` VALUES (42, '喜欢一个人，就该让他（她）快乐。');
INSERT INTO `tb_word` VALUES (43, '别把生活当作游戏，谁游戏人生，生活就惩罚谁，这不是劝诫，而是--规则！');
INSERT INTO `tb_word` VALUES (44, '你要求的次数愈多，你就越容易得到你要的东西，而且连带地也会得到更多乐趣。');
INSERT INTO `tb_word` VALUES (45, '把气愤的心境转化为柔和，把柔和的心境转化为爱，如此，这个世间将更加完美。');
INSERT INTO `tb_word` VALUES (46, '一份耕耘，一份收获，付出就有回报永不遭遇过失败，因我所碰到的都是暂时的挫折。');
INSERT INTO `tb_word` VALUES (47, '心如镜，虽外景不断变化，镜面却不会转动，这就是一颗平常心，能够景转而心不转。');
INSERT INTO `tb_word` VALUES (48, '每件事情都必须有一个期限，否则，大多数人都会有多少时间就花掉多少时间。');
INSERT INTO `tb_word` VALUES (49, '人，其实不需要太多的东西，只要健康地活着，真诚地爱着，也不失为一种富有。');
INSERT INTO `tb_word` VALUES (50, '生命之长短殊不重要，只要你活得快乐，在有生之年做些有意义的事，便已足够。');
INSERT INTO `tb_word` VALUES (51, '活在忙与闲的两种境界里，才能俯仰自得，享受生活的乐趣，成就人生的意义。');
INSERT INTO `tb_word` VALUES (52, '一个从来没有失败过的人，必然是一个从未尝试过什么的人。');
INSERT INTO `tb_word` VALUES (53, '待人退一步，爱人宽一寸，人生自然活得很快乐。');
INSERT INTO `tb_word` VALUES (54, '经验不是发生在一个人身上的事件，而是一个人如何看待发生在他身上的事。');
INSERT INTO `tb_word` VALUES (55, '加倍努力，证明你想要的不是空中楼阁。胜利是在多次失败之后才姗姗而来。');
INSERT INTO `tb_word` VALUES (56, '只要能执着远大的理想，且有不达目的绝不终止的意愿，便能产生惊人的力量。');
INSERT INTO `tb_word` VALUES (57, '一个人，只要知道付出爱与关心，她内心自然会被爱与关心充满。');
INSERT INTO `tb_word` VALUES (58, '如果我们可以改变情绪，我们就可以改变未来。');
INSERT INTO `tb_word` VALUES (59, '明白事理的人使自己适应世界，不明事理的人硬想使世界适应自己。');
INSERT INTO `tb_word` VALUES (60, '当困苦姗姗而来之时，超越它们会更有余。');

SET FOREIGN_KEY_CHECKS = 1;
