package com.lookblog.server.modules.sys.service.impl;

import com.lookblog.server.modules.sys.entity.RoleDO;
import com.lookblog.server.modules.sys.mapper.RoleMapper;
import com.lookblog.server.modules.sys.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, RoleDO> implements IRoleService {

}
