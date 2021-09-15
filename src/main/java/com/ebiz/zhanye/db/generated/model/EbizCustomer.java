package com.ebiz.zhanye.db.generated.model;

import com.ebiz.zhanye.commons.validation.customer.Update;
import com.ebiz.zhanye.config.AutoId;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class EbizCustomer implements Serializable {
    /**
     * 客户id
     */
    @AutoId
    private String id;

    /**
     * 员工id
     */
    private String userId;

    /**
     * 客户状态，0-未指派，1-待指派
     */
    private Integer customerStatus;

    /**
     * 单位名称
     */
    @NotBlank(message = "单位名称不能为空", groups = {Update.class})
    private String deptName;

    /**
     * 统一社会代码
     */
    @NotBlank(message = "统一社会代码不能为空", groups = {Update.class})
    private String socialCode;

    /**
     * 客户姓名
     */
    @NotBlank(message = "联系人姓名不能为空", groups = {Update.class})
    private String customerName;

    /**
     * 客户性别，0-男，1女
     */
    private Integer customerSex;

    /**
     * 所属部门
     */
    private String customerDept;

    /**
     * 所在职务
     */
    private String customerPosition;

    /**
     * 电子邮箱
     */
//    @Pattern(regexp = "/^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$/\n", message = "电子邮箱格式不正确", groups = {Update.class})
//    @NotBlank(message = "电子邮箱不能为空", groups = {Update.class})
    private String customerEmail;

    /**
     * 客户办公电话
     */
    private String customerOfficeTel;

    /**
     * 客户移动电话
     */
//    @Pattern(regexp = "/^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$/\n", message = "手机号格式错误", groups = {Update.class})
    @NotBlank(message = "移动电话不能为空", groups = {Update.class})
    private String customerPhone;

    /**
     * 单位总人数
     */
    @NotNull(message = "单位总人数不能为空", groups = {Update.class})
    private Integer deptTotalNum;

    /**
     * 单位性质，0-国有，1-集体，2-民营，3-其他
     */
    @NotNull(message = "单位性质不能为空", groups = {Update.class})
    private Integer deptNature;

    /**
     * 单位传真号
     */
    private String deptFax;

    /**
     * 单位区域，0-当地，1-全省/直辖市，2-全国，3-跨国
     */
    @NotNull(message = "单位经营区域不能为空", groups = {Update.class})
    private Integer deptArea;

    /**
     * 单位地址
     */
    @NotBlank(message = "单位地址不能为空", groups = {Update.class})
    private String deptAddress;

    /**
     * 单位的法定代表人
     */
    @NotBlank(message = "法定代表人不能为空", groups = {Update.class})
    private String deptLegalPerson;

    /**
     * 开户的银行名称
     */
    private String bankName;

    /**
     * 开户的银行账号
     */
    private String accountNo;

    /**
     * 邮政编码
     */
//    @Pattern(regexp = "/^[1-9]\\d{5}$/\n", message = "邮政编码格式错误", groups = {Update.class})
    @Min(value = 7, message = "邮政编码最长为7位", groups = {Update.class})
    @NotBlank(message = "邮政编码不能为空", groups = {Update.class})
    private String postCode;

    /**
     * 手机号
     */
//    @Min(value = 11, message = "手机号长度最长11位", groups = {Update.class})
    private String deptPhone;

    /**
     * 组织机构代码
     */
    private String deptCode;

    /**
     * 行业类别，0-农业，1-林业，2-畜牧业，3-渔业，4-制造业，5-服务业，6-运输业，7-信息技术业，8-其他
     */
    @NotNull(message = "行业类别不能为空", groups = {Update.class})
    private Integer industryType;

    /**
     * 营业执照号码
     */
    private String businessCode;

    /**
     * 税务登记号
     */
    private String taxCode;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(Integer customerStatus) {
        this.customerStatus = customerStatus;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getSocialCode() {
        return socialCode;
    }

    public void setSocialCode(String socialCode) {
        this.socialCode = socialCode == null ? null : socialCode.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(Integer customerSex) {
        this.customerSex = customerSex;
    }

    public String getCustomerDept() {
        return customerDept;
    }

    public void setCustomerDept(String customerDept) {
        this.customerDept = customerDept == null ? null : customerDept.trim();
    }

    public String getCustomerPosition() {
        return customerPosition;
    }

    public void setCustomerPosition(String customerPosition) {
        this.customerPosition = customerPosition == null ? null : customerPosition.trim();
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail == null ? null : customerEmail.trim();
    }

    public String getCustomerOfficeTel() {
        return customerOfficeTel;
    }

    public void setCustomerOfficeTel(String customerOfficeTel) {
        this.customerOfficeTel = customerOfficeTel == null ? null : customerOfficeTel.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public Integer getDeptTotalNum() {
        return deptTotalNum;
    }

    public void setDeptTotalNum(Integer deptTotalNum) {
        this.deptTotalNum = deptTotalNum;
    }

    public Integer getDeptNature() {
        return deptNature;
    }

    public void setDeptNature(Integer deptNature) {
        this.deptNature = deptNature;
    }

    public String getDeptFax() {
        return deptFax;
    }

    public void setDeptFax(String deptFax) {
        this.deptFax = deptFax == null ? null : deptFax.trim();
    }

    public Integer getDeptArea() {
        return deptArea;
    }

    public void setDeptArea(Integer deptArea) {
        this.deptArea = deptArea;
    }

    public String getDeptAddress() {
        return deptAddress;
    }

    public void setDeptAddress(String deptAddress) {
        this.deptAddress = deptAddress == null ? null : deptAddress.trim();
    }

    public String getDeptLegalPerson() {
        return deptLegalPerson;
    }

    public void setDeptLegalPerson(String deptLegalPerson) {
        this.deptLegalPerson = deptLegalPerson == null ? null : deptLegalPerson.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getDeptPhone() {
        return deptPhone;
    }

    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone == null ? null : deptPhone.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public Integer getIndustryType() {
        return industryType;
    }

    public void setIndustryType(Integer industryType) {
        this.industryType = industryType;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode == null ? null : taxCode.trim();
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
        sb.append(", userId=").append(userId);
        sb.append(", customerStatus=").append(customerStatus);
        sb.append(", deptName=").append(deptName);
        sb.append(", socialCode=").append(socialCode);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerSex=").append(customerSex);
        sb.append(", customerDept=").append(customerDept);
        sb.append(", customerPosition=").append(customerPosition);
        sb.append(", customerEmail=").append(customerEmail);
        sb.append(", customerOfficeTel=").append(customerOfficeTel);
        sb.append(", customerPhone=").append(customerPhone);
        sb.append(", deptTotalNum=").append(deptTotalNum);
        sb.append(", deptNature=").append(deptNature);
        sb.append(", deptFax=").append(deptFax);
        sb.append(", deptArea=").append(deptArea);
        sb.append(", deptAddress=").append(deptAddress);
        sb.append(", deptLegalPerson=").append(deptLegalPerson);
        sb.append(", bankName=").append(bankName);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", postCode=").append(postCode);
        sb.append(", deptPhone=").append(deptPhone);
        sb.append(", deptCode=").append(deptCode);
        sb.append(", industryType=").append(industryType);
        sb.append(", businessCode=").append(businessCode);
        sb.append(", taxCode=").append(taxCode);
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
