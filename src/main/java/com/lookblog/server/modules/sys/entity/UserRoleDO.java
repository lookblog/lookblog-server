package com.lookblog.server.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lookblog.server.common.parentobject.BaseEntity;

/**
 * <p>
 * 用户与角色对应关系
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@TableName("sys_user_role")
public class UserRoleDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRoleDO{" +
            "id=" + id +
            ", userId=" + userId +
            ", roleId=" + roleId +
        "}";
    }
}
