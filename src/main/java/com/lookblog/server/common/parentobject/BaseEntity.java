package com.lookblog.server.common.parentobject;

import java.util.Date;

/**
 * @Author ouyanggang
 * @Date 2019/10/4 - 10:41
 */
public class BaseEntity {

    private Long createUserId;

    private Date createTime;

    private Long updateUserId;

    private Date updateUserTime;

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Date getUpdateUserTime() {
        return updateUserTime;
    }

    public void setUpdateUserTime(Date updateUserTime) {
        this.updateUserTime = updateUserTime;
    }
}
