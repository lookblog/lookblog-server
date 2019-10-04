package com.lookblog.server.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lookblog.server.common.parentobject.BaseEntity;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@TableName("sys_user")
public class UserDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    private Integer status;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserDO{" +
            "userId=" + userId +
            ", username=" + username +
            ", password=" + password +
            ", email=" + email +
            ", mobile=" + mobile +
            ", status=" + status +
        "}";
    }
}
