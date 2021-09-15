package com.ebiz.zhanye.db.generated.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbizCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbizCustomerExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("customer_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("customer_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(Integer value) {
            addCriterion("customer_status =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(Integer value) {
            addCriterion("customer_status <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(Integer value) {
            addCriterion("customer_status >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_status >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(Integer value) {
            addCriterion("customer_status <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_status <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<Integer> values) {
            addCriterion("customer_status in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<Integer> values) {
            addCriterion("customer_status not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_status between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_status not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIsNull() {
            addCriterion("social_code is null");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIsNotNull() {
            addCriterion("social_code is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCodeEqualTo(String value) {
            addCriterion("social_code =", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotEqualTo(String value) {
            addCriterion("social_code <>", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeGreaterThan(String value) {
            addCriterion("social_code >", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("social_code >=", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLessThan(String value) {
            addCriterion("social_code <", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLessThanOrEqualTo(String value) {
            addCriterion("social_code <=", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLike(String value) {
            addCriterion("social_code like", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotLike(String value) {
            addCriterion("social_code not like", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIn(List<String> values) {
            addCriterion("social_code in", values, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotIn(List<String> values) {
            addCriterion("social_code not in", values, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeBetween(String value1, String value2) {
            addCriterion("social_code between", value1, value2, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotBetween(String value1, String value2) {
            addCriterion("social_code not between", value1, value2, "socialCode");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customer_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(Integer value) {
            addCriterion("customer_sex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(Integer value) {
            addCriterion("customer_sex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(Integer value) {
            addCriterion("customer_sex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_sex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(Integer value) {
            addCriterion("customer_sex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(Integer value) {
            addCriterion("customer_sex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<Integer> values) {
            addCriterion("customer_sex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<Integer> values) {
            addCriterion("customer_sex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(Integer value1, Integer value2) {
            addCriterion("customer_sex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_sex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptIsNull() {
            addCriterion("customer_dept is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptIsNotNull() {
            addCriterion("customer_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptEqualTo(String value) {
            addCriterion("customer_dept =", value, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptNotEqualTo(String value) {
            addCriterion("customer_dept <>", value, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptGreaterThan(String value) {
            addCriterion("customer_dept >", value, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptGreaterThanOrEqualTo(String value) {
            addCriterion("customer_dept >=", value, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptLessThan(String value) {
            addCriterion("customer_dept <", value, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptLessThanOrEqualTo(String value) {
            addCriterion("customer_dept <=", value, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptLike(String value) {
            addCriterion("customer_dept like", value, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptNotLike(String value) {
            addCriterion("customer_dept not like", value, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptIn(List<String> values) {
            addCriterion("customer_dept in", values, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptNotIn(List<String> values) {
            addCriterion("customer_dept not in", values, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptBetween(String value1, String value2) {
            addCriterion("customer_dept between", value1, value2, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerDeptNotBetween(String value1, String value2) {
            addCriterion("customer_dept not between", value1, value2, "customerDept");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionIsNull() {
            addCriterion("customer_position is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionIsNotNull() {
            addCriterion("customer_position is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionEqualTo(String value) {
            addCriterion("customer_position =", value, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionNotEqualTo(String value) {
            addCriterion("customer_position <>", value, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionGreaterThan(String value) {
            addCriterion("customer_position >", value, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionGreaterThanOrEqualTo(String value) {
            addCriterion("customer_position >=", value, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionLessThan(String value) {
            addCriterion("customer_position <", value, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionLessThanOrEqualTo(String value) {
            addCriterion("customer_position <=", value, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionLike(String value) {
            addCriterion("customer_position like", value, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionNotLike(String value) {
            addCriterion("customer_position not like", value, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionIn(List<String> values) {
            addCriterion("customer_position in", values, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionNotIn(List<String> values) {
            addCriterion("customer_position not in", values, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionBetween(String value1, String value2) {
            addCriterion("customer_position between", value1, value2, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerPositionNotBetween(String value1, String value2) {
            addCriterion("customer_position not between", value1, value2, "customerPosition");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNull() {
            addCriterion("customer_email is null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIsNotNull() {
            addCriterion("customer_email is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailEqualTo(String value) {
            addCriterion("customer_email =", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotEqualTo(String value) {
            addCriterion("customer_email <>", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThan(String value) {
            addCriterion("customer_email >", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("customer_email >=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThan(String value) {
            addCriterion("customer_email <", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLessThanOrEqualTo(String value) {
            addCriterion("customer_email <=", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailLike(String value) {
            addCriterion("customer_email like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotLike(String value) {
            addCriterion("customer_email not like", value, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailIn(List<String> values) {
            addCriterion("customer_email in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotIn(List<String> values) {
            addCriterion("customer_email not in", values, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailBetween(String value1, String value2) {
            addCriterion("customer_email between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerEmailNotBetween(String value1, String value2) {
            addCriterion("customer_email not between", value1, value2, "customerEmail");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelIsNull() {
            addCriterion("customer_office_tel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelIsNotNull() {
            addCriterion("customer_office_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelEqualTo(String value) {
            addCriterion("customer_office_tel =", value, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelNotEqualTo(String value) {
            addCriterion("customer_office_tel <>", value, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelGreaterThan(String value) {
            addCriterion("customer_office_tel >", value, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelGreaterThanOrEqualTo(String value) {
            addCriterion("customer_office_tel >=", value, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelLessThan(String value) {
            addCriterion("customer_office_tel <", value, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelLessThanOrEqualTo(String value) {
            addCriterion("customer_office_tel <=", value, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelLike(String value) {
            addCriterion("customer_office_tel like", value, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelNotLike(String value) {
            addCriterion("customer_office_tel not like", value, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelIn(List<String> values) {
            addCriterion("customer_office_tel in", values, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelNotIn(List<String> values) {
            addCriterion("customer_office_tel not in", values, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelBetween(String value1, String value2) {
            addCriterion("customer_office_tel between", value1, value2, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerOfficeTelNotBetween(String value1, String value2) {
            addCriterion("customer_office_tel not between", value1, value2, "customerOfficeTel");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumIsNull() {
            addCriterion("dept_total_num is null");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumIsNotNull() {
            addCriterion("dept_total_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumEqualTo(Integer value) {
            addCriterion("dept_total_num =", value, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumNotEqualTo(Integer value) {
            addCriterion("dept_total_num <>", value, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumGreaterThan(Integer value) {
            addCriterion("dept_total_num >", value, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_total_num >=", value, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumLessThan(Integer value) {
            addCriterion("dept_total_num <", value, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("dept_total_num <=", value, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumIn(List<Integer> values) {
            addCriterion("dept_total_num in", values, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumNotIn(List<Integer> values) {
            addCriterion("dept_total_num not in", values, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("dept_total_num between", value1, value2, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_total_num not between", value1, value2, "deptTotalNum");
            return (Criteria) this;
        }

        public Criteria andDeptNatureIsNull() {
            addCriterion("dept_nature is null");
            return (Criteria) this;
        }

        public Criteria andDeptNatureIsNotNull() {
            addCriterion("dept_nature is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNatureEqualTo(Integer value) {
            addCriterion("dept_nature =", value, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureNotEqualTo(Integer value) {
            addCriterion("dept_nature <>", value, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureGreaterThan(Integer value) {
            addCriterion("dept_nature >", value, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_nature >=", value, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureLessThan(Integer value) {
            addCriterion("dept_nature <", value, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureLessThanOrEqualTo(Integer value) {
            addCriterion("dept_nature <=", value, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureIn(List<Integer> values) {
            addCriterion("dept_nature in", values, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureNotIn(List<Integer> values) {
            addCriterion("dept_nature not in", values, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureBetween(Integer value1, Integer value2) {
            addCriterion("dept_nature between", value1, value2, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_nature not between", value1, value2, "deptNature");
            return (Criteria) this;
        }

        public Criteria andDeptFaxIsNull() {
            addCriterion("dept_fax is null");
            return (Criteria) this;
        }

        public Criteria andDeptFaxIsNotNull() {
            addCriterion("dept_fax is not null");
            return (Criteria) this;
        }

        public Criteria andDeptFaxEqualTo(String value) {
            addCriterion("dept_fax =", value, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxNotEqualTo(String value) {
            addCriterion("dept_fax <>", value, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxGreaterThan(String value) {
            addCriterion("dept_fax >", value, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxGreaterThanOrEqualTo(String value) {
            addCriterion("dept_fax >=", value, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxLessThan(String value) {
            addCriterion("dept_fax <", value, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxLessThanOrEqualTo(String value) {
            addCriterion("dept_fax <=", value, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxLike(String value) {
            addCriterion("dept_fax like", value, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxNotLike(String value) {
            addCriterion("dept_fax not like", value, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxIn(List<String> values) {
            addCriterion("dept_fax in", values, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxNotIn(List<String> values) {
            addCriterion("dept_fax not in", values, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxBetween(String value1, String value2) {
            addCriterion("dept_fax between", value1, value2, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptFaxNotBetween(String value1, String value2) {
            addCriterion("dept_fax not between", value1, value2, "deptFax");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIsNull() {
            addCriterion("dept_area is null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIsNotNull() {
            addCriterion("dept_area is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAreaEqualTo(Integer value) {
            addCriterion("dept_area =", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotEqualTo(Integer value) {
            addCriterion("dept_area <>", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaGreaterThan(Integer value) {
            addCriterion("dept_area >", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_area >=", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaLessThan(Integer value) {
            addCriterion("dept_area <", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaLessThanOrEqualTo(Integer value) {
            addCriterion("dept_area <=", value, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaIn(List<Integer> values) {
            addCriterion("dept_area in", values, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotIn(List<Integer> values) {
            addCriterion("dept_area not in", values, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaBetween(Integer value1, Integer value2) {
            addCriterion("dept_area between", value1, value2, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_area not between", value1, value2, "deptArea");
            return (Criteria) this;
        }

        public Criteria andDeptAddressIsNull() {
            addCriterion("dept_address is null");
            return (Criteria) this;
        }

        public Criteria andDeptAddressIsNotNull() {
            addCriterion("dept_address is not null");
            return (Criteria) this;
        }

        public Criteria andDeptAddressEqualTo(String value) {
            addCriterion("dept_address =", value, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressNotEqualTo(String value) {
            addCriterion("dept_address <>", value, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressGreaterThan(String value) {
            addCriterion("dept_address >", value, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressGreaterThanOrEqualTo(String value) {
            addCriterion("dept_address >=", value, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressLessThan(String value) {
            addCriterion("dept_address <", value, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressLessThanOrEqualTo(String value) {
            addCriterion("dept_address <=", value, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressLike(String value) {
            addCriterion("dept_address like", value, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressNotLike(String value) {
            addCriterion("dept_address not like", value, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressIn(List<String> values) {
            addCriterion("dept_address in", values, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressNotIn(List<String> values) {
            addCriterion("dept_address not in", values, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressBetween(String value1, String value2) {
            addCriterion("dept_address between", value1, value2, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptAddressNotBetween(String value1, String value2) {
            addCriterion("dept_address not between", value1, value2, "deptAddress");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonIsNull() {
            addCriterion("dept_legal_person is null");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonIsNotNull() {
            addCriterion("dept_legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonEqualTo(String value) {
            addCriterion("dept_legal_person =", value, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonNotEqualTo(String value) {
            addCriterion("dept_legal_person <>", value, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonGreaterThan(String value) {
            addCriterion("dept_legal_person >", value, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("dept_legal_person >=", value, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonLessThan(String value) {
            addCriterion("dept_legal_person <", value, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("dept_legal_person <=", value, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonLike(String value) {
            addCriterion("dept_legal_person like", value, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonNotLike(String value) {
            addCriterion("dept_legal_person not like", value, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonIn(List<String> values) {
            addCriterion("dept_legal_person in", values, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonNotIn(List<String> values) {
            addCriterion("dept_legal_person not in", values, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonBetween(String value1, String value2) {
            addCriterion("dept_legal_person between", value1, value2, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andDeptLegalPersonNotBetween(String value1, String value2) {
            addCriterion("dept_legal_person not between", value1, value2, "deptLegalPerson");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("account_no =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("account_no <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("account_no >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("account_no <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("account_no like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("account_no not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("account_no in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("account_no not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIsNull() {
            addCriterion("dept_phone is null");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIsNotNull() {
            addCriterion("dept_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneEqualTo(String value) {
            addCriterion("dept_phone =", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotEqualTo(String value) {
            addCriterion("dept_phone <>", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneGreaterThan(String value) {
            addCriterion("dept_phone >", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("dept_phone >=", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLessThan(String value) {
            addCriterion("dept_phone <", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLessThanOrEqualTo(String value) {
            addCriterion("dept_phone <=", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneLike(String value) {
            addCriterion("dept_phone like", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotLike(String value) {
            addCriterion("dept_phone not like", value, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneIn(List<String> values) {
            addCriterion("dept_phone in", values, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotIn(List<String> values) {
            addCriterion("dept_phone not in", values, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneBetween(String value1, String value2) {
            addCriterion("dept_phone between", value1, value2, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptPhoneNotBetween(String value1, String value2) {
            addCriterion("dept_phone not between", value1, value2, "deptPhone");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("dept_code =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("dept_code >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("dept_code <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("dept_code like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("dept_code not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("dept_code in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIsNull() {
            addCriterion("industry_type is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIsNotNull() {
            addCriterion("industry_type is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeEqualTo(Integer value) {
            addCriterion("industry_type =", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotEqualTo(Integer value) {
            addCriterion("industry_type <>", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeGreaterThan(Integer value) {
            addCriterion("industry_type >", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("industry_type >=", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeLessThan(Integer value) {
            addCriterion("industry_type <", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeLessThanOrEqualTo(Integer value) {
            addCriterion("industry_type <=", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIn(List<Integer> values) {
            addCriterion("industry_type in", values, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotIn(List<Integer> values) {
            addCriterion("industry_type not in", values, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeBetween(Integer value1, Integer value2) {
            addCriterion("industry_type between", value1, value2, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("industry_type not between", value1, value2, "industryType");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNull() {
            addCriterion("business_code is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIsNotNull() {
            addCriterion("business_code is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeEqualTo(String value) {
            addCriterion("business_code =", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotEqualTo(String value) {
            addCriterion("business_code <>", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThan(String value) {
            addCriterion("business_code >", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeGreaterThanOrEqualTo(String value) {
            addCriterion("business_code >=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThan(String value) {
            addCriterion("business_code <", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLessThanOrEqualTo(String value) {
            addCriterion("business_code <=", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeLike(String value) {
            addCriterion("business_code like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotLike(String value) {
            addCriterion("business_code not like", value, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeIn(List<String> values) {
            addCriterion("business_code in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotIn(List<String> values) {
            addCriterion("business_code not in", values, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeBetween(String value1, String value2) {
            addCriterion("business_code between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andBusinessCodeNotBetween(String value1, String value2) {
            addCriterion("business_code not between", value1, value2, "businessCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIsNull() {
            addCriterion("tax_code is null");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIsNotNull() {
            addCriterion("tax_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCodeEqualTo(String value) {
            addCriterion("tax_code =", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotEqualTo(String value) {
            addCriterion("tax_code <>", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeGreaterThan(String value) {
            addCriterion("tax_code >", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_code >=", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLessThan(String value) {
            addCriterion("tax_code <", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLessThanOrEqualTo(String value) {
            addCriterion("tax_code <=", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeLike(String value) {
            addCriterion("tax_code like", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotLike(String value) {
            addCriterion("tax_code not like", value, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeIn(List<String> values) {
            addCriterion("tax_code in", values, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotIn(List<String> values) {
            addCriterion("tax_code not in", values, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeBetween(String value1, String value2) {
            addCriterion("tax_code between", value1, value2, "taxCode");
            return (Criteria) this;
        }

        public Criteria andTaxCodeNotBetween(String value1, String value2) {
            addCriterion("tax_code not between", value1, value2, "taxCode");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNull() {
            addCriterion("created_user is null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIsNotNull() {
            addCriterion("created_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedUserEqualTo(String value) {
            addCriterion("created_user =", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotEqualTo(String value) {
            addCriterion("created_user <>", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThan(String value) {
            addCriterion("created_user >", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserGreaterThanOrEqualTo(String value) {
            addCriterion("created_user >=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThan(String value) {
            addCriterion("created_user <", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLessThanOrEqualTo(String value) {
            addCriterion("created_user <=", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserLike(String value) {
            addCriterion("created_user like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotLike(String value) {
            addCriterion("created_user not like", value, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserIn(List<String> values) {
            addCriterion("created_user in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotIn(List<String> values) {
            addCriterion("created_user not in", values, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserBetween(String value1, String value2) {
            addCriterion("created_user between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedUserNotBetween(String value1, String value2) {
            addCriterion("created_user not between", value1, value2, "createdUser");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIsNull() {
            addCriterion("modified_user is null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIsNotNull() {
            addCriterion("modified_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedUserEqualTo(String value) {
            addCriterion("modified_user =", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotEqualTo(String value) {
            addCriterion("modified_user <>", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserGreaterThan(String value) {
            addCriterion("modified_user >", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserGreaterThanOrEqualTo(String value) {
            addCriterion("modified_user >=", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLessThan(String value) {
            addCriterion("modified_user <", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLessThanOrEqualTo(String value) {
            addCriterion("modified_user <=", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserLike(String value) {
            addCriterion("modified_user like", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotLike(String value) {
            addCriterion("modified_user not like", value, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserIn(List<String> values) {
            addCriterion("modified_user in", values, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotIn(List<String> values) {
            addCriterion("modified_user not in", values, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserBetween(String value1, String value2) {
            addCriterion("modified_user between", value1, value2, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedUserNotBetween(String value1, String value2) {
            addCriterion("modified_user not between", value1, value2, "modifiedUser");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNull() {
            addCriterion("modified_date is null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIsNotNull() {
            addCriterion("modified_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedDateEqualTo(Date value) {
            addCriterion("modified_date =", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotEqualTo(Date value) {
            addCriterion("modified_date <>", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThan(Date value) {
            addCriterion("modified_date >", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_date >=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThan(Date value) {
            addCriterion("modified_date <", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateLessThanOrEqualTo(Date value) {
            addCriterion("modified_date <=", value, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateIn(List<Date> values) {
            addCriterion("modified_date in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotIn(List<Date> values) {
            addCriterion("modified_date not in", values, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateBetween(Date value1, Date value2) {
            addCriterion("modified_date between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andModifiedDateNotBetween(Date value1, Date value2) {
            addCriterion("modified_date not between", value1, value2, "modifiedDate");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}