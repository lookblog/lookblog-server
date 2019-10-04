package com.lookblog.server;

import com.lookblog.server.modules.sys.entity.RoleDO;
import com.lookblog.server.modules.sys.service.IRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private IRoleService roleService;

    @Test
    public void contextLoads() {
        RoleDO roleDO = new RoleDO();
        roleDO.setRoleName("苏杉杉");
        roleDO.setCreateTime(new Date());
        roleService.save(roleDO);
    }

}
