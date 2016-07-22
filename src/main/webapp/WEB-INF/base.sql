--创建一个demo用户 密码为demo
GRANT USAGE ON *.* TO 'demo'@'localhost' IDENTIFIED BY 'demo' WITH GRANT OPTION;
--创建数据库db_demo
create database db_demo;
--为demo授权
grant all privileges on db_demo.* to demo@localhost identified by 'demo';
--刷新权限表
flush privileges;


--数据库业务数据 用户表
DROP TABLE IF EXISTS `user`;  
  
CREATE TABLE `user` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `user_name` varchar(40) NOT NULL,  
  `password` varchar(255) NOT NULL,  
  `age` int(4) NOT NULL,  
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;  
  
/*Data for the table `user` */  
  
insert  into `user`(`id`,`user_name`,`password`,`age`) values (1,'测试','sfasgfaf',24);

--数据库业务数据  人员表
DROP TABLE IF EXISTS `person`; 

CREATE TABLE `person` ( 
  `id` int(11) NOT NULL AUTO_INCREMENT,  
  `person_name` varchar(40) NOT NULL,  
  `sex` varchar(2) NOT NULL,  
  `id_num` varchar(20) NOT NULL,    
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8; 
