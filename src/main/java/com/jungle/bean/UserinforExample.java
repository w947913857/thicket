package com.jungle.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserinforExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinforExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Boolean value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Boolean value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Boolean value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Boolean value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Boolean value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Boolean> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Boolean> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Boolean value1, Boolean value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserWorkIsNull() {
            addCriterion("user_work is null");
            return (Criteria) this;
        }

        public Criteria andUserWorkIsNotNull() {
            addCriterion("user_work is not null");
            return (Criteria) this;
        }

        public Criteria andUserWorkEqualTo(String value) {
            addCriterion("user_work =", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkNotEqualTo(String value) {
            addCriterion("user_work <>", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkGreaterThan(String value) {
            addCriterion("user_work >", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkGreaterThanOrEqualTo(String value) {
            addCriterion("user_work >=", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkLessThan(String value) {
            addCriterion("user_work <", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkLessThanOrEqualTo(String value) {
            addCriterion("user_work <=", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkLike(String value) {
            addCriterion("user_work like", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkNotLike(String value) {
            addCriterion("user_work not like", value, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkIn(List<String> values) {
            addCriterion("user_work in", values, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkNotIn(List<String> values) {
            addCriterion("user_work not in", values, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkBetween(String value1, String value2) {
            addCriterion("user_work between", value1, value2, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserWorkNotBetween(String value1, String value2) {
            addCriterion("user_work not between", value1, value2, "userWork");
            return (Criteria) this;
        }

        public Criteria andUserContactIsNull() {
            addCriterion("user_contact is null");
            return (Criteria) this;
        }

        public Criteria andUserContactIsNotNull() {
            addCriterion("user_contact is not null");
            return (Criteria) this;
        }

        public Criteria andUserContactEqualTo(String value) {
            addCriterion("user_contact =", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotEqualTo(String value) {
            addCriterion("user_contact <>", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactGreaterThan(String value) {
            addCriterion("user_contact >", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactGreaterThanOrEqualTo(String value) {
            addCriterion("user_contact >=", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLessThan(String value) {
            addCriterion("user_contact <", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLessThanOrEqualTo(String value) {
            addCriterion("user_contact <=", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactLike(String value) {
            addCriterion("user_contact like", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotLike(String value) {
            addCriterion("user_contact not like", value, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactIn(List<String> values) {
            addCriterion("user_contact in", values, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotIn(List<String> values) {
            addCriterion("user_contact not in", values, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactBetween(String value1, String value2) {
            addCriterion("user_contact between", value1, value2, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserContactNotBetween(String value1, String value2) {
            addCriterion("user_contact not between", value1, value2, "userContact");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNull() {
            addCriterion("user_address is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressIsNotNull() {
            addCriterion("user_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressEqualTo(String value) {
            addCriterion("user_address =", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotEqualTo(String value) {
            addCriterion("user_address <>", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThan(String value) {
            addCriterion("user_address >", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address >=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThan(String value) {
            addCriterion("user_address <", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLessThanOrEqualTo(String value) {
            addCriterion("user_address <=", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressLike(String value) {
            addCriterion("user_address like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotLike(String value) {
            addCriterion("user_address not like", value, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressIn(List<String> values) {
            addCriterion("user_address in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotIn(List<String> values) {
            addCriterion("user_address not in", values, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressBetween(String value1, String value2) {
            addCriterion("user_address between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressNotBetween(String value1, String value2) {
            addCriterion("user_address not between", value1, value2, "userAddress");
            return (Criteria) this;
        }

        public Criteria andUserMarriageIsNull() {
            addCriterion("user_marriage is null");
            return (Criteria) this;
        }

        public Criteria andUserMarriageIsNotNull() {
            addCriterion("user_marriage is not null");
            return (Criteria) this;
        }

        public Criteria andUserMarriageEqualTo(Boolean value) {
            addCriterion("user_marriage =", value, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageNotEqualTo(Boolean value) {
            addCriterion("user_marriage <>", value, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageGreaterThan(Boolean value) {
            addCriterion("user_marriage >", value, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("user_marriage >=", value, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageLessThan(Boolean value) {
            addCriterion("user_marriage <", value, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageLessThanOrEqualTo(Boolean value) {
            addCriterion("user_marriage <=", value, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageIn(List<Boolean> values) {
            addCriterion("user_marriage in", values, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageNotIn(List<Boolean> values) {
            addCriterion("user_marriage not in", values, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageBetween(Boolean value1, Boolean value2) {
            addCriterion("user_marriage between", value1, value2, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserMarriageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("user_marriage not between", value1, value2, "userMarriage");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentIsNull() {
            addCriterion("user_department is null");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentIsNotNull() {
            addCriterion("user_department is not null");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentEqualTo(Integer value) {
            addCriterion("user_department =", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentNotEqualTo(Integer value) {
            addCriterion("user_department <>", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentGreaterThan(Integer value) {
            addCriterion("user_department >", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_department >=", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentLessThan(Integer value) {
            addCriterion("user_department <", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("user_department <=", value, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentIn(List<Integer> values) {
            addCriterion("user_department in", values, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentNotIn(List<Integer> values) {
            addCriterion("user_department not in", values, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("user_department between", value1, value2, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("user_department not between", value1, value2, "userDepartment");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeIsNull() {
            addCriterion("user_employTime is null");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeIsNotNull() {
            addCriterion("user_employTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeEqualTo(Date value) {
            addCriterion("user_employTime =", value, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeNotEqualTo(Date value) {
            addCriterion("user_employTime <>", value, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeGreaterThan(Date value) {
            addCriterion("user_employTime >", value, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_employTime >=", value, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeLessThan(Date value) {
            addCriterion("user_employTime <", value, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeLessThanOrEqualTo(Date value) {
            addCriterion("user_employTime <=", value, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeIn(List<Date> values) {
            addCriterion("user_employTime in", values, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeNotIn(List<Date> values) {
            addCriterion("user_employTime not in", values, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeBetween(Date value1, Date value2) {
            addCriterion("user_employTime between", value1, value2, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserEmploytimeNotBetween(Date value1, Date value2) {
            addCriterion("user_employTime not between", value1, value2, "userEmploytime");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserEducationIsNull() {
            addCriterion("user_education is null");
            return (Criteria) this;
        }

        public Criteria andUserEducationIsNotNull() {
            addCriterion("user_education is not null");
            return (Criteria) this;
        }

        public Criteria andUserEducationEqualTo(String value) {
            addCriterion("user_education =", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotEqualTo(String value) {
            addCriterion("user_education <>", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationGreaterThan(String value) {
            addCriterion("user_education >", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationGreaterThanOrEqualTo(String value) {
            addCriterion("user_education >=", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLessThan(String value) {
            addCriterion("user_education <", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLessThanOrEqualTo(String value) {
            addCriterion("user_education <=", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationLike(String value) {
            addCriterion("user_education like", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotLike(String value) {
            addCriterion("user_education not like", value, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationIn(List<String> values) {
            addCriterion("user_education in", values, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotIn(List<String> values) {
            addCriterion("user_education not in", values, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationBetween(String value1, String value2) {
            addCriterion("user_education between", value1, value2, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserEducationNotBetween(String value1, String value2) {
            addCriterion("user_education not between", value1, value2, "userEducation");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIsNull() {
            addCriterion("user_loginName is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIsNotNull() {
            addCriterion("user_loginName is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameEqualTo(String value) {
            addCriterion("user_loginName =", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotEqualTo(String value) {
            addCriterion("user_loginName <>", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameGreaterThan(String value) {
            addCriterion("user_loginName >", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_loginName >=", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLessThan(String value) {
            addCriterion("user_loginName <", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLessThanOrEqualTo(String value) {
            addCriterion("user_loginName <=", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameLike(String value) {
            addCriterion("user_loginName like", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotLike(String value) {
            addCriterion("user_loginName not like", value, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameIn(List<String> values) {
            addCriterion("user_loginName in", values, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotIn(List<String> values) {
            addCriterion("user_loginName not in", values, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameBetween(String value1, String value2) {
            addCriterion("user_loginName between", value1, value2, "userLoginname");
            return (Criteria) this;
        }

        public Criteria andUserLoginnameNotBetween(String value1, String value2) {
            addCriterion("user_loginName not between", value1, value2, "userLoginname");
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