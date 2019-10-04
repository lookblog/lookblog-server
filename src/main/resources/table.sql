-- 系统用户
CREATE TABLE `sys_user` (
  `user_id` BIGINT NOT NULL ,
  `username` VARCHAR(50) NOT NULL COMMENT '用户名',
  `password` VARCHAR(100) COMMENT '密码',
  `email` VARCHAR(100) COMMENT '邮箱',
  `mobile` VARCHAR(100) COMMENT '手机号',
  `status` TINYINT COMMENT '状态  0：禁用   1：正常',
  `create_user_id` BIGINT(20) COMMENT '创建者ID',
  `create_time` DATETIME COMMENT '创建时间',
  `update_user_id` BIGINT(20) COMMENT '创建者ID',
  `update_time` DATETIME COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX (`username`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='系统用户';

-- 菜单
CREATE TABLE `sys_menu` (
  `menu_id` BIGINT NOT NULL,
  `parent_id` BIGINT COMMENT '父菜单ID，一级菜单为0',
  `name` VARCHAR(50) COMMENT '菜单名称',
  `url` VARCHAR(200) COMMENT '菜单URL',
  `perms` VARCHAR(500) COMMENT '授权(多个用逗号分隔，如：user:list,user:create)',
  `type` INT COMMENT '类型   0：目录   1：菜单   2：按钮',
  `icon` VARCHAR(50) COMMENT '菜单图标',
  `order_num` INT COMMENT '排序',
  `create_user_id` BIGINT(20) COMMENT '创建者ID',
  `create_time` DATETIME COMMENT '创建时间',
  `update_user_id` BIGINT(20) COMMENT '创建者ID',
  `update_time` DATETIME COMMENT '创建时间',
  PRIMARY KEY (`menu_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='菜单管理';




-- 角色
CREATE TABLE `sys_role` (
  `role_id` BIGINT NOT NULL,
  `role_name` VARCHAR(100) COMMENT '角色名称',
  `remark` VARCHAR(100) COMMENT '备注',
  `create_user_id` BIGINT(20) COMMENT '创建者ID',
  `create_time` DATETIME COMMENT '创建时间',
  `update_user_id` BIGINT(20) COMMENT '创建者ID',
  `update_time` DATETIME COMMENT '创建时间',
  PRIMARY KEY (`role_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='角色';

-- 用户与角色对应关系
CREATE TABLE `sys_user_role` (
  `id` BIGINT NOT NULL ,
  `user_id` BIGINT COMMENT '用户ID',
  `role_id` BIGINT COMMENT '角色ID',
  `create_user_id` BIGINT(20) COMMENT '创建者ID',
  `create_time` DATETIME COMMENT '创建时间',
  `update_user_id` BIGINT(20) COMMENT '创建者ID',
  `update_time` DATETIME COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='用户与角色对应关系';

-- 角色与菜单对应关系
CREATE TABLE `sys_role_menu` (
  `id` BIGINT NOT NULL ,
  `role_id` BIGINT COMMENT '角色ID',
  `menu_id` BIGINT COMMENT '菜单ID',
  `create_user_id` BIGINT(20) COMMENT '创建者ID',
  `create_time` DATETIME COMMENT '创建时间',
  `update_user_id` BIGINT(20) COMMENT '创建者ID',
  `update_time` DATETIME COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 COMMENT='角色与菜单对应关系';


