package com.lookblog.server.modules.sys.service.impl;

import com.lookblog.server.modules.sys.entity.RoleMenuDO;
import com.lookblog.server.modules.sys.mapper.RoleMenuMapper;
import com.lookblog.server.modules.sys.service.IRoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与菜单对应关系 服务实现类
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenuDO> implements IRoleMenuService {

}
