package com.lookblog.server.modules.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lookblog.server.common.parentobject.BaseEntity;

/**
 * <p>
 * 角色
 * </p>
 *
 * @author ouyanggang
 * @since 2019-10-04
 */
@TableName("sys_role")
public class RoleDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "RoleDO{" +
            "roleId=" + roleId +
            ", roleName=" + roleName +
            ", remark=" + remark +
        "}";
    }
}
