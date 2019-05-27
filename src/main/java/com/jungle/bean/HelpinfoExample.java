package com.jungle.bean;

import java.util.ArrayList;
import java.util.List;

public class HelpinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HelpinfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNull() {
            addCriterion("phonenum is null");
            return (Criteria) this;
        }

        public Criteria andPhonenumIsNotNull() {
            addCriterion("phonenum is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenumEqualTo(String value) {
            addCriterion("phonenum =", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotEqualTo(String value) {
            addCriterion("phonenum <>", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThan(String value) {
            addCriterion("phonenum >", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumGreaterThanOrEqualTo(String value) {
            addCriterion("phonenum >=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThan(String value) {
            addCriterion("phonenum <", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLessThanOrEqualTo(String value) {
            addCriterion("phonenum <=", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumLike(String value) {
            addCriterion("phonenum like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotLike(String value) {
            addCriterion("phonenum not like", value, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumIn(List<String> values) {
            addCriterion("phonenum in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotIn(List<String> values) {
            addCriterion("phonenum not in", values, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumBetween(String value1, String value2) {
            addCriterion("phonenum between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andPhonenumNotBetween(String value1, String value2) {
            addCriterion("phonenum not between", value1, value2, "phonenum");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(Long value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(Long value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(Long value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(Long value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(Long value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(Long value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<Long> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<Long> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(Long value1, Long value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(Long value1, Long value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andBasiclivingIsNull() {
            addCriterion("basicliving is null");
            return (Criteria) this;
        }

        public Criteria andBasiclivingIsNotNull() {
            addCriterion("basicliving is not null");
            return (Criteria) this;
        }

        public Criteria andBasiclivingEqualTo(Boolean value) {
            addCriterion("basicliving =", value, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingNotEqualTo(Boolean value) {
            addCriterion("basicliving <>", value, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingGreaterThan(Boolean value) {
            addCriterion("basicliving >", value, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("basicliving >=", value, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingLessThan(Boolean value) {
            addCriterion("basicliving <", value, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingLessThanOrEqualTo(Boolean value) {
            addCriterion("basicliving <=", value, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingIn(List<Boolean> values) {
            addCriterion("basicliving in", values, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingNotIn(List<Boolean> values) {
            addCriterion("basicliving not in", values, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingBetween(Boolean value1, Boolean value2) {
            addCriterion("basicliving between", value1, value2, "basicliving");
            return (Criteria) this;
        }

        public Criteria andBasiclivingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("basicliving not between", value1, value2, "basicliving");
            return (Criteria) this;
        }

        public Criteria andApplymoneyIsNull() {
            addCriterion("applymoney is null");
            return (Criteria) this;
        }

        public Criteria andApplymoneyIsNotNull() {
            addCriterion("applymoney is not null");
            return (Criteria) this;
        }

        public Criteria andApplymoneyEqualTo(Long value) {
            addCriterion("applymoney =", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyNotEqualTo(Long value) {
            addCriterion("applymoney <>", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyGreaterThan(Long value) {
            addCriterion("applymoney >", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("applymoney >=", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyLessThan(Long value) {
            addCriterion("applymoney <", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyLessThanOrEqualTo(Long value) {
            addCriterion("applymoney <=", value, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyIn(List<Long> values) {
            addCriterion("applymoney in", values, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyNotIn(List<Long> values) {
            addCriterion("applymoney not in", values, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyBetween(Long value1, Long value2) {
            addCriterion("applymoney between", value1, value2, "applymoney");
            return (Criteria) this;
        }

        public Criteria andApplymoneyNotBetween(Long value1, Long value2) {
            addCriterion("applymoney not between", value1, value2, "applymoney");
            return (Criteria) this;
        }

        public Criteria andFileurlIsNull() {
            addCriterion("fileurl is null");
            return (Criteria) this;
        }

        public Criteria andFileurlIsNotNull() {
            addCriterion("fileurl is not null");
            return (Criteria) this;
        }

        public Criteria andFileurlEqualTo(String value) {
            addCriterion("fileurl =", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotEqualTo(String value) {
            addCriterion("fileurl <>", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlGreaterThan(String value) {
            addCriterion("fileurl >", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlGreaterThanOrEqualTo(String value) {
            addCriterion("fileurl >=", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLessThan(String value) {
            addCriterion("fileurl <", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLessThanOrEqualTo(String value) {
            addCriterion("fileurl <=", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlLike(String value) {
            addCriterion("fileurl like", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotLike(String value) {
            addCriterion("fileurl not like", value, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlIn(List<String> values) {
            addCriterion("fileurl in", values, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotIn(List<String> values) {
            addCriterion("fileurl not in", values, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlBetween(String value1, String value2) {
            addCriterion("fileurl between", value1, value2, "fileurl");
            return (Criteria) this;
        }

        public Criteria andFileurlNotBetween(String value1, String value2) {
            addCriterion("fileurl not between", value1, value2, "fileurl");
            return (Criteria) this;
        }

        public Criteria andApplycontentIsNull() {
            addCriterion("applycontent is null");
            return (Criteria) this;
        }

        public Criteria andApplycontentIsNotNull() {
            addCriterion("applycontent is not null");
            return (Criteria) this;
        }

        public Criteria andApplycontentEqualTo(String value) {
            addCriterion("applycontent =", value, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentNotEqualTo(String value) {
            addCriterion("applycontent <>", value, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentGreaterThan(String value) {
            addCriterion("applycontent >", value, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentGreaterThanOrEqualTo(String value) {
            addCriterion("applycontent >=", value, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentLessThan(String value) {
            addCriterion("applycontent <", value, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentLessThanOrEqualTo(String value) {
            addCriterion("applycontent <=", value, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentLike(String value) {
            addCriterion("applycontent like", value, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentNotLike(String value) {
            addCriterion("applycontent not like", value, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentIn(List<String> values) {
            addCriterion("applycontent in", values, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentNotIn(List<String> values) {
            addCriterion("applycontent not in", values, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentBetween(String value1, String value2) {
            addCriterion("applycontent between", value1, value2, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplycontentNotBetween(String value1, String value2) {
            addCriterion("applycontent not between", value1, value2, "applycontent");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNull() {
            addCriterion("applystatus is null");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNotNull() {
            addCriterion("applystatus is not null");
            return (Criteria) this;
        }

        public Criteria andApplystatusEqualTo(Integer value) {
            addCriterion("applystatus =", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotEqualTo(Integer value) {
            addCriterion("applystatus <>", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThan(Integer value) {
            addCriterion("applystatus >", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("applystatus >=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThan(Integer value) {
            addCriterion("applystatus <", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThanOrEqualTo(Integer value) {
            addCriterion("applystatus <=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusIn(List<Integer> values) {
            addCriterion("applystatus in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotIn(List<Integer> values) {
            addCriterion("applystatus not in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusBetween(Integer value1, Integer value2) {
            addCriterion("applystatus between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotBetween(Integer value1, Integer value2) {
            addCriterion("applystatus not between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNull() {
            addCriterion("applytype is null");
            return (Criteria) this;
        }

        public Criteria andApplytypeIsNotNull() {
            addCriterion("applytype is not null");
            return (Criteria) this;
        }

        public Criteria andApplytypeEqualTo(Boolean value) {
            addCriterion("applytype =", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotEqualTo(Boolean value) {
            addCriterion("applytype <>", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThan(Boolean value) {
            addCriterion("applytype >", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("applytype >=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThan(Boolean value) {
            addCriterion("applytype <", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeLessThanOrEqualTo(Boolean value) {
            addCriterion("applytype <=", value, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeIn(List<Boolean> values) {
            addCriterion("applytype in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotIn(List<Boolean> values) {
            addCriterion("applytype not in", values, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeBetween(Boolean value1, Boolean value2) {
            addCriterion("applytype between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andApplytypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("applytype not between", value1, value2, "applytype");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeIsNull() {
            addCriterion("applymoneyusertime is null");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeIsNotNull() {
            addCriterion("applymoneyusertime is not null");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeEqualTo(String value) {
            addCriterion("applymoneyusertime =", value, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeNotEqualTo(String value) {
            addCriterion("applymoneyusertime <>", value, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeGreaterThan(String value) {
            addCriterion("applymoneyusertime >", value, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeGreaterThanOrEqualTo(String value) {
            addCriterion("applymoneyusertime >=", value, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeLessThan(String value) {
            addCriterion("applymoneyusertime <", value, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeLessThanOrEqualTo(String value) {
            addCriterion("applymoneyusertime <=", value, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeLike(String value) {
            addCriterion("applymoneyusertime like", value, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeNotLike(String value) {
            addCriterion("applymoneyusertime not like", value, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeIn(List<String> values) {
            addCriterion("applymoneyusertime in", values, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeNotIn(List<String> values) {
            addCriterion("applymoneyusertime not in", values, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeBetween(String value1, String value2) {
            addCriterion("applymoneyusertime between", value1, value2, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andApplymoneyusertimeNotBetween(String value1, String value2) {
            addCriterion("applymoneyusertime not between", value1, value2, "applymoneyusertime");
            return (Criteria) this;
        }

        public Criteria andVouchnameIsNull() {
            addCriterion("vouchname is null");
            return (Criteria) this;
        }

        public Criteria andVouchnameIsNotNull() {
            addCriterion("vouchname is not null");
            return (Criteria) this;
        }

        public Criteria andVouchnameEqualTo(String value) {
            addCriterion("vouchname =", value, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameNotEqualTo(String value) {
            addCriterion("vouchname <>", value, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameGreaterThan(String value) {
            addCriterion("vouchname >", value, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameGreaterThanOrEqualTo(String value) {
            addCriterion("vouchname >=", value, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameLessThan(String value) {
            addCriterion("vouchname <", value, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameLessThanOrEqualTo(String value) {
            addCriterion("vouchname <=", value, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameLike(String value) {
            addCriterion("vouchname like", value, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameNotLike(String value) {
            addCriterion("vouchname not like", value, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameIn(List<String> values) {
            addCriterion("vouchname in", values, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameNotIn(List<String> values) {
            addCriterion("vouchname not in", values, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameBetween(String value1, String value2) {
            addCriterion("vouchname between", value1, value2, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchnameNotBetween(String value1, String value2) {
            addCriterion("vouchname not between", value1, value2, "vouchname");
            return (Criteria) this;
        }

        public Criteria andVouchidcardIsNull() {
            addCriterion("vouchidcard is null");
            return (Criteria) this;
        }

        public Criteria andVouchidcardIsNotNull() {
            addCriterion("vouchidcard is not null");
            return (Criteria) this;
        }

        public Criteria andVouchidcardEqualTo(String value) {
            addCriterion("vouchidcard =", value, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardNotEqualTo(String value) {
            addCriterion("vouchidcard <>", value, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardGreaterThan(String value) {
            addCriterion("vouchidcard >", value, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardGreaterThanOrEqualTo(String value) {
            addCriterion("vouchidcard >=", value, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardLessThan(String value) {
            addCriterion("vouchidcard <", value, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardLessThanOrEqualTo(String value) {
            addCriterion("vouchidcard <=", value, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardLike(String value) {
            addCriterion("vouchidcard like", value, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardNotLike(String value) {
            addCriterion("vouchidcard not like", value, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardIn(List<String> values) {
            addCriterion("vouchidcard in", values, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardNotIn(List<String> values) {
            addCriterion("vouchidcard not in", values, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardBetween(String value1, String value2) {
            addCriterion("vouchidcard between", value1, value2, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchidcardNotBetween(String value1, String value2) {
            addCriterion("vouchidcard not between", value1, value2, "vouchidcard");
            return (Criteria) this;
        }

        public Criteria andVouchaddressIsNull() {
            addCriterion("vouchaddress is null");
            return (Criteria) this;
        }

        public Criteria andVouchaddressIsNotNull() {
            addCriterion("vouchaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVouchaddressEqualTo(String value) {
            addCriterion("vouchaddress =", value, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressNotEqualTo(String value) {
            addCriterion("vouchaddress <>", value, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressGreaterThan(String value) {
            addCriterion("vouchaddress >", value, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressGreaterThanOrEqualTo(String value) {
            addCriterion("vouchaddress >=", value, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressLessThan(String value) {
            addCriterion("vouchaddress <", value, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressLessThanOrEqualTo(String value) {
            addCriterion("vouchaddress <=", value, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressLike(String value) {
            addCriterion("vouchaddress like", value, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressNotLike(String value) {
            addCriterion("vouchaddress not like", value, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressIn(List<String> values) {
            addCriterion("vouchaddress in", values, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressNotIn(List<String> values) {
            addCriterion("vouchaddress not in", values, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressBetween(String value1, String value2) {
            addCriterion("vouchaddress between", value1, value2, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchaddressNotBetween(String value1, String value2) {
            addCriterion("vouchaddress not between", value1, value2, "vouchaddress");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyIsNull() {
            addCriterion("vouchcompany is null");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyIsNotNull() {
            addCriterion("vouchcompany is not null");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyEqualTo(String value) {
            addCriterion("vouchcompany =", value, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyNotEqualTo(String value) {
            addCriterion("vouchcompany <>", value, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyGreaterThan(String value) {
            addCriterion("vouchcompany >", value, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("vouchcompany >=", value, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyLessThan(String value) {
            addCriterion("vouchcompany <", value, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyLessThanOrEqualTo(String value) {
            addCriterion("vouchcompany <=", value, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyLike(String value) {
            addCriterion("vouchcompany like", value, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyNotLike(String value) {
            addCriterion("vouchcompany not like", value, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyIn(List<String> values) {
            addCriterion("vouchcompany in", values, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyNotIn(List<String> values) {
            addCriterion("vouchcompany not in", values, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyBetween(String value1, String value2) {
            addCriterion("vouchcompany between", value1, value2, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchcompanyNotBetween(String value1, String value2) {
            addCriterion("vouchcompany not between", value1, value2, "vouchcompany");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumIsNull() {
            addCriterion("vouchphonenum is null");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumIsNotNull() {
            addCriterion("vouchphonenum is not null");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumEqualTo(String value) {
            addCriterion("vouchphonenum =", value, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumNotEqualTo(String value) {
            addCriterion("vouchphonenum <>", value, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumGreaterThan(String value) {
            addCriterion("vouchphonenum >", value, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumGreaterThanOrEqualTo(String value) {
            addCriterion("vouchphonenum >=", value, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumLessThan(String value) {
            addCriterion("vouchphonenum <", value, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumLessThanOrEqualTo(String value) {
            addCriterion("vouchphonenum <=", value, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumLike(String value) {
            addCriterion("vouchphonenum like", value, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumNotLike(String value) {
            addCriterion("vouchphonenum not like", value, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumIn(List<String> values) {
            addCriterion("vouchphonenum in", values, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumNotIn(List<String> values) {
            addCriterion("vouchphonenum not in", values, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumBetween(String value1, String value2) {
            addCriterion("vouchphonenum between", value1, value2, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchphonenumNotBetween(String value1, String value2) {
            addCriterion("vouchphonenum not between", value1, value2, "vouchphonenum");
            return (Criteria) this;
        }

        public Criteria andVouchmobileIsNull() {
            addCriterion("vouchmobile is null");
            return (Criteria) this;
        }

        public Criteria andVouchmobileIsNotNull() {
            addCriterion("vouchmobile is not null");
            return (Criteria) this;
        }

        public Criteria andVouchmobileEqualTo(String value) {
            addCriterion("vouchmobile =", value, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileNotEqualTo(String value) {
            addCriterion("vouchmobile <>", value, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileGreaterThan(String value) {
            addCriterion("vouchmobile >", value, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileGreaterThanOrEqualTo(String value) {
            addCriterion("vouchmobile >=", value, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileLessThan(String value) {
            addCriterion("vouchmobile <", value, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileLessThanOrEqualTo(String value) {
            addCriterion("vouchmobile <=", value, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileLike(String value) {
            addCriterion("vouchmobile like", value, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileNotLike(String value) {
            addCriterion("vouchmobile not like", value, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileIn(List<String> values) {
            addCriterion("vouchmobile in", values, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileNotIn(List<String> values) {
            addCriterion("vouchmobile not in", values, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileBetween(String value1, String value2) {
            addCriterion("vouchmobile between", value1, value2, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchmobileNotBetween(String value1, String value2) {
            addCriterion("vouchmobile not between", value1, value2, "vouchmobile");
            return (Criteria) this;
        }

        public Criteria andVouchdddressIsNull() {
            addCriterion("vouchdddress is null");
            return (Criteria) this;
        }

        public Criteria andVouchdddressIsNotNull() {
            addCriterion("vouchdddress is not null");
            return (Criteria) this;
        }

        public Criteria andVouchdddressEqualTo(String value) {
            addCriterion("vouchdddress =", value, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressNotEqualTo(String value) {
            addCriterion("vouchdddress <>", value, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressGreaterThan(String value) {
            addCriterion("vouchdddress >", value, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressGreaterThanOrEqualTo(String value) {
            addCriterion("vouchdddress >=", value, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressLessThan(String value) {
            addCriterion("vouchdddress <", value, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressLessThanOrEqualTo(String value) {
            addCriterion("vouchdddress <=", value, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressLike(String value) {
            addCriterion("vouchdddress like", value, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressNotLike(String value) {
            addCriterion("vouchdddress not like", value, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressIn(List<String> values) {
            addCriterion("vouchdddress in", values, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressNotIn(List<String> values) {
            addCriterion("vouchdddress not in", values, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressBetween(String value1, String value2) {
            addCriterion("vouchdddress between", value1, value2, "vouchdddress");
            return (Criteria) this;
        }

        public Criteria andVouchdddressNotBetween(String value1, String value2) {
            addCriterion("vouchdddress not between", value1, value2, "vouchdddress");
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