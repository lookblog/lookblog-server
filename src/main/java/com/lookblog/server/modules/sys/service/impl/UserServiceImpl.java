package com.lookblog.server.modules.sys.service.impl;

import com.lookblog.server.modules.sys.entity.UserDO;
import com.lookblog.server.modules.sys.mapper.UserMapper;
import com.lookblog.server.modules.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements IUserService {

}
