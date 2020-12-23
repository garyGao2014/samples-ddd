package com.gary.order.persistence;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseDO implements IBaseDO {
    public Date createAt;
    public Long createBy;
    public Date updateAt;
    public Long updateBy;
    public Boolean delete;
    public Date deleteAt;
    public Long deleteBy;

    public void preCreate() {
        this.preCreate(null);
    }

    public void preCreate(Long userId) {
        Date now = new Date();
        this.setCreateAt(now);
        this.setCreateBy(userId);
        this.setUpdateAt(now);
        this.setUpdateBy(userId);
        this.setDelete(false);
    }

    public void preUpdate() {
        this.preUpdate(null);
    }

    public void preUpdate(Long userId) {
        Date now = new Date();
        this.setUpdateAt(now);
        this.setUpdateBy(userId);
    }

    public void preDelete(Long userId) {
        Date now = new Date();
        this.setDelete(true);
        this.setDeleteAt(now);
        this.setDeleteBy(userId);
    }

    public void preDelete() {
        this.preDelete(null);
    }
}
