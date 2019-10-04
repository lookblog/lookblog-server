package com.lookblog.server.modules.sys.service.impl;

import com.lookblog.server.modules.sys.entity.MenuDO;
import com.lookblog.server.modules.sys.mapper.MenuMapper;
import com.lookblog.server.modules.sys.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuDO> implements IMenuService {

}
