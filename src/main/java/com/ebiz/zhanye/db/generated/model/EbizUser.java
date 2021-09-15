package com.ebiz.zhanye.db.generated.model;


import com.ebiz.zhanye.commons.validation.user.Login;
import com.ebiz.zhanye.config.AutoId;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 *
 */

public class EbizUser implements Serializable {
    /**
     *
     */
    @AutoId
    private String id;

    /**
     * 工号
     */
    private Integer workNo;

    /**
     * 员工姓名
     */
    private String workName;

    /**
     * 用户名
     */
    @NotNull(message = "用户名不能为空", groups = {Login.class})
    private String username;

    /**
     * 密码，8-20位之间
     */
    @NotNull(message = "密码不能为空", groups = {Login.class})
    @Size(min = 8, max = 20, message = "密码长度不小于8位并且不大于20位", groups = {Login.class})
    private String password;

    /**
     * 创建人
     */
    private String createdUser;

    /**
     * 创建时间
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdDate;

    /**
     * 修改人
     */
    private String modifiedUser;

    /**
     * 修改时间
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifiedDate;

    /**
     * 删除标记，0-未删除，1-已删除
     */
    private Integer isDelete;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getWorkNo() {
        return workNo;
    }

    public void setWorkNo(Integer workNo) {
        this.workNo = workNo;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser == null ? null : modifiedUser.trim();
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workNo=").append(workNo);
        sb.append(", workName=").append(workName);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", createdUser=").append(createdUser);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", modifiedUser=").append(modifiedUser);
        sb.append(", modifiedDate=").append(modifiedDate);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}