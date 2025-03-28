DROP TABLE IF EXISTS `wekan_webhook_log`;
CREATE TABLE `wekan_webhook_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `type` varchar(50) DEFAULT NULL COMMENT '通知类型',
  `payload` text COMMENT '通知内容',
  `status` char(1) DEFAULT '0' COMMENT '处理状态（0成功 1失败）',
  `error_msg` varchar(500) DEFAULT NULL COMMENT '错误信息',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='Wekan WebHook日志表'; 
