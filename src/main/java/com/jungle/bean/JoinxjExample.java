package com.jungle.bean;

import java.util.ArrayList;
import java.util.List;

public class JoinxjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JoinxjExample() {
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

        public Criteria andXjnameIsNull() {
            addCriterion("xjname is null");
            return (Criteria) this;
        }

        public Criteria andXjnameIsNotNull() {
            addCriterion("xjname is not null");
            return (Criteria) this;
        }

        public Criteria andXjnameEqualTo(String value) {
            addCriterion("xjname =", value, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameNotEqualTo(String value) {
            addCriterion("xjname <>", value, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameGreaterThan(String value) {
            addCriterion("xjname >", value, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameGreaterThanOrEqualTo(String value) {
            addCriterion("xjname >=", value, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameLessThan(String value) {
            addCriterion("xjname <", value, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameLessThanOrEqualTo(String value) {
            addCriterion("xjname <=", value, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameLike(String value) {
            addCriterion("xjname like", value, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameNotLike(String value) {
            addCriterion("xjname not like", value, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameIn(List<String> values) {
            addCriterion("xjname in", values, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameNotIn(List<String> values) {
            addCriterion("xjname not in", values, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameBetween(String value1, String value2) {
            addCriterion("xjname between", value1, value2, "xjname");
            return (Criteria) this;
        }

        public Criteria andXjnameNotBetween(String value1, String value2) {
            addCriterion("xjname not between", value1, value2, "xjname");
            return (Criteria) this;
        }

        public Criteria andHousenoIsNull() {
            addCriterion("houseno is null");
            return (Criteria) this;
        }

        public Criteria andHousenoIsNotNull() {
            addCriterion("houseno is not null");
            return (Criteria) this;
        }

        public Criteria andHousenoEqualTo(String value) {
            addCriterion("houseno =", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotEqualTo(String value) {
            addCriterion("houseno <>", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoGreaterThan(String value) {
            addCriterion("houseno >", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoGreaterThanOrEqualTo(String value) {
            addCriterion("houseno >=", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLessThan(String value) {
            addCriterion("houseno <", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLessThanOrEqualTo(String value) {
            addCriterion("houseno <=", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLike(String value) {
            addCriterion("houseno like", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotLike(String value) {
            addCriterion("houseno not like", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoIn(List<String> values) {
            addCriterion("houseno in", values, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotIn(List<String> values) {
            addCriterion("houseno not in", values, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoBetween(String value1, String value2) {
            addCriterion("houseno between", value1, value2, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotBetween(String value1, String value2) {
            addCriterion("houseno not between", value1, value2, "houseno");
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

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andHouseidcardIsNull() {
            addCriterion("houseidcard is null");
            return (Criteria) this;
        }

        public Criteria andHouseidcardIsNotNull() {
            addCriterion("houseidcard is not null");
            return (Criteria) this;
        }

        public Criteria andHouseidcardEqualTo(String value) {
            addCriterion("houseidcard =", value, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardNotEqualTo(String value) {
            addCriterion("houseidcard <>", value, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardGreaterThan(String value) {
            addCriterion("houseidcard >", value, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardGreaterThanOrEqualTo(String value) {
            addCriterion("houseidcard >=", value, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardLessThan(String value) {
            addCriterion("houseidcard <", value, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardLessThanOrEqualTo(String value) {
            addCriterion("houseidcard <=", value, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardLike(String value) {
            addCriterion("houseidcard like", value, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardNotLike(String value) {
            addCriterion("houseidcard not like", value, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardIn(List<String> values) {
            addCriterion("houseidcard in", values, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardNotIn(List<String> values) {
            addCriterion("houseidcard not in", values, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardBetween(String value1, String value2) {
            addCriterion("houseidcard between", value1, value2, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHouseidcardNotBetween(String value1, String value2) {
            addCriterion("houseidcard not between", value1, value2, "houseidcard");
            return (Criteria) this;
        }

        public Criteria andHousephoneIsNull() {
            addCriterion("housephone is null");
            return (Criteria) this;
        }

        public Criteria andHousephoneIsNotNull() {
            addCriterion("housephone is not null");
            return (Criteria) this;
        }

        public Criteria andHousephoneEqualTo(String value) {
            addCriterion("housephone =", value, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneNotEqualTo(String value) {
            addCriterion("housephone <>", value, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneGreaterThan(String value) {
            addCriterion("housephone >", value, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneGreaterThanOrEqualTo(String value) {
            addCriterion("housephone >=", value, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneLessThan(String value) {
            addCriterion("housephone <", value, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneLessThanOrEqualTo(String value) {
            addCriterion("housephone <=", value, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneLike(String value) {
            addCriterion("housephone like", value, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneNotLike(String value) {
            addCriterion("housephone not like", value, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneIn(List<String> values) {
            addCriterion("housephone in", values, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneNotIn(List<String> values) {
            addCriterion("housephone not in", values, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneBetween(String value1, String value2) {
            addCriterion("housephone between", value1, value2, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousephoneNotBetween(String value1, String value2) {
            addCriterion("housephone not between", value1, value2, "housephone");
            return (Criteria) this;
        }

        public Criteria andHousemobileIsNull() {
            addCriterion("housemobile is null");
            return (Criteria) this;
        }

        public Criteria andHousemobileIsNotNull() {
            addCriterion("housemobile is not null");
            return (Criteria) this;
        }

        public Criteria andHousemobileEqualTo(String value) {
            addCriterion("housemobile =", value, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileNotEqualTo(String value) {
            addCriterion("housemobile <>", value, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileGreaterThan(String value) {
            addCriterion("housemobile >", value, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileGreaterThanOrEqualTo(String value) {
            addCriterion("housemobile >=", value, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileLessThan(String value) {
            addCriterion("housemobile <", value, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileLessThanOrEqualTo(String value) {
            addCriterion("housemobile <=", value, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileLike(String value) {
            addCriterion("housemobile like", value, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileNotLike(String value) {
            addCriterion("housemobile not like", value, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileIn(List<String> values) {
            addCriterion("housemobile in", values, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileNotIn(List<String> values) {
            addCriterion("housemobile not in", values, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileBetween(String value1, String value2) {
            addCriterion("housemobile between", value1, value2, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousemobileNotBetween(String value1, String value2) {
            addCriterion("housemobile not between", value1, value2, "housemobile");
            return (Criteria) this;
        }

        public Criteria andHousepersonIsNull() {
            addCriterion("houseperson is null");
            return (Criteria) this;
        }

        public Criteria andHousepersonIsNotNull() {
            addCriterion("houseperson is not null");
            return (Criteria) this;
        }

        public Criteria andHousepersonEqualTo(String value) {
            addCriterion("houseperson =", value, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonNotEqualTo(String value) {
            addCriterion("houseperson <>", value, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonGreaterThan(String value) {
            addCriterion("houseperson >", value, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonGreaterThanOrEqualTo(String value) {
            addCriterion("houseperson >=", value, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonLessThan(String value) {
            addCriterion("houseperson <", value, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonLessThanOrEqualTo(String value) {
            addCriterion("houseperson <=", value, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonLike(String value) {
            addCriterion("houseperson like", value, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonNotLike(String value) {
            addCriterion("houseperson not like", value, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonIn(List<String> values) {
            addCriterion("houseperson in", values, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonNotIn(List<String> values) {
            addCriterion("houseperson not in", values, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonBetween(String value1, String value2) {
            addCriterion("houseperson between", value1, value2, "houseperson");
            return (Criteria) this;
        }

        public Criteria andHousepersonNotBetween(String value1, String value2) {
            addCriterion("houseperson not between", value1, value2, "houseperson");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
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

        public Criteria andJointimeIsNull() {
            addCriterion("jointime is null");
            return (Criteria) this;
        }

        public Criteria andJointimeIsNotNull() {
            addCriterion("jointime is not null");
            return (Criteria) this;
        }

        public Criteria andJointimeEqualTo(String value) {
            addCriterion("jointime =", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotEqualTo(String value) {
            addCriterion("jointime <>", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThan(String value) {
            addCriterion("jointime >", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeGreaterThanOrEqualTo(String value) {
            addCriterion("jointime >=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThan(String value) {
            addCriterion("jointime <", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLessThanOrEqualTo(String value) {
            addCriterion("jointime <=", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeLike(String value) {
            addCriterion("jointime like", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotLike(String value) {
            addCriterion("jointime not like", value, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeIn(List<String> values) {
            addCriterion("jointime in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotIn(List<String> values) {
            addCriterion("jointime not in", values, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeBetween(String value1, String value2) {
            addCriterion("jointime between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andJointimeNotBetween(String value1, String value2) {
            addCriterion("jointime not between", value1, value2, "jointime");
            return (Criteria) this;
        }

        public Criteria andJoinstatusIsNull() {
            addCriterion("joinstatus is null");
            return (Criteria) this;
        }

        public Criteria andJoinstatusIsNotNull() {
            addCriterion("joinstatus is not null");
            return (Criteria) this;
        }

        public Criteria andJoinstatusEqualTo(Integer value) {
            addCriterion("joinstatus =", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusNotEqualTo(Integer value) {
            addCriterion("joinstatus <>", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusGreaterThan(Integer value) {
            addCriterion("joinstatus >", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinstatus >=", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusLessThan(Integer value) {
            addCriterion("joinstatus <", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusLessThanOrEqualTo(Integer value) {
            addCriterion("joinstatus <=", value, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusIn(List<Integer> values) {
            addCriterion("joinstatus in", values, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusNotIn(List<Integer> values) {
            addCriterion("joinstatus not in", values, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusBetween(Integer value1, Integer value2) {
            addCriterion("joinstatus between", value1, value2, "joinstatus");
            return (Criteria) this;
        }

        public Criteria andJoinstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("joinstatus not between", value1, value2, "joinstatus");
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