package com.lookblog.server.modules.sys.service.impl;

import com.lookblog.server.modules.sys.entity.UserRoleDO;
import com.lookblog.server.modules.sys.mapper.UserRoleMapper;
import com.lookblog.server.modules.sys.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与角色对应关系 服务实现类
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleDO> implements IUserRoleService {

}
