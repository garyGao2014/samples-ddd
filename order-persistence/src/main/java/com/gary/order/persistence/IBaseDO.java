package com.gary.order.persistence;

import java.util.Date;

public interface IBaseDO {

    void setCreateAt(Date time);

    Date getCreateAt();

    void setCreateBy(Long userId);

    Long getCreateBy();

    void setUpdateAt(Date time);

    Date getUpdateAt();

    void setUpdateBy(Long userId);

    Long getUpdateBy();

    void setDelete(Boolean delete);

    Boolean getDelete();

    void setDeleteAt(Date time);

    Date getDeleteAt();

    void setDeleteBy(Long userId);

    Long getDeleteBy();
}
