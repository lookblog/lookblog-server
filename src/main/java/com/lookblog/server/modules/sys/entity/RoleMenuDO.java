package com.lookblog.server.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lookblog.server.common.parentobject.BaseEntity;

/**
 * <p>
 * 角色与菜单对应关系
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@TableName("sys_role_menu")
public class RoleMenuDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 菜单ID
     */
    private Long menuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "RoleMenuDO{" +
            "id=" + id +
            ", roleId=" + roleId +
            ", menuId=" + menuId +
        "}";
    }
}
