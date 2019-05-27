package com.jungle.bean;

import java.util.ArrayList;
import java.util.List;

public class JoinclExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JoinclExample() {
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

        public Criteria andClnameIsNull() {
            addCriterion("clname is null");
            return (Criteria) this;
        }

        public Criteria andClnameIsNotNull() {
            addCriterion("clname is not null");
            return (Criteria) this;
        }

        public Criteria andClnameEqualTo(String value) {
            addCriterion("clname =", value, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameNotEqualTo(String value) {
            addCriterion("clname <>", value, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameGreaterThan(String value) {
            addCriterion("clname >", value, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameGreaterThanOrEqualTo(String value) {
            addCriterion("clname >=", value, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameLessThan(String value) {
            addCriterion("clname <", value, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameLessThanOrEqualTo(String value) {
            addCriterion("clname <=", value, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameLike(String value) {
            addCriterion("clname like", value, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameNotLike(String value) {
            addCriterion("clname not like", value, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameIn(List<String> values) {
            addCriterion("clname in", values, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameNotIn(List<String> values) {
            addCriterion("clname not in", values, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameBetween(String value1, String value2) {
            addCriterion("clname between", value1, value2, "clname");
            return (Criteria) this;
        }

        public Criteria andClnameNotBetween(String value1, String value2) {
            addCriterion("clname not between", value1, value2, "clname");
            return (Criteria) this;
        }

        public Criteria andPermitnoIsNull() {
            addCriterion("permitno is null");
            return (Criteria) this;
        }

        public Criteria andPermitnoIsNotNull() {
            addCriterion("permitno is not null");
            return (Criteria) this;
        }

        public Criteria andPermitnoEqualTo(String value) {
            addCriterion("permitno =", value, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoNotEqualTo(String value) {
            addCriterion("permitno <>", value, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoGreaterThan(String value) {
            addCriterion("permitno >", value, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoGreaterThanOrEqualTo(String value) {
            addCriterion("permitno >=", value, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoLessThan(String value) {
            addCriterion("permitno <", value, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoLessThanOrEqualTo(String value) {
            addCriterion("permitno <=", value, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoLike(String value) {
            addCriterion("permitno like", value, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoNotLike(String value) {
            addCriterion("permitno not like", value, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoIn(List<String> values) {
            addCriterion("permitno in", values, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoNotIn(List<String> values) {
            addCriterion("permitno not in", values, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoBetween(String value1, String value2) {
            addCriterion("permitno between", value1, value2, "permitno");
            return (Criteria) this;
        }

        public Criteria andPermitnoNotBetween(String value1, String value2) {
            addCriterion("permitno not between", value1, value2, "permitno");
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

        public Criteria andLegalnameIsNull() {
            addCriterion("legalname is null");
            return (Criteria) this;
        }

        public Criteria andLegalnameIsNotNull() {
            addCriterion("legalname is not null");
            return (Criteria) this;
        }

        public Criteria andLegalnameEqualTo(String value) {
            addCriterion("legalname =", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameNotEqualTo(String value) {
            addCriterion("legalname <>", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameGreaterThan(String value) {
            addCriterion("legalname >", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameGreaterThanOrEqualTo(String value) {
            addCriterion("legalname >=", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameLessThan(String value) {
            addCriterion("legalname <", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameLessThanOrEqualTo(String value) {
            addCriterion("legalname <=", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameLike(String value) {
            addCriterion("legalname like", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameNotLike(String value) {
            addCriterion("legalname not like", value, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameIn(List<String> values) {
            addCriterion("legalname in", values, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameNotIn(List<String> values) {
            addCriterion("legalname not in", values, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameBetween(String value1, String value2) {
            addCriterion("legalname between", value1, value2, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalnameNotBetween(String value1, String value2) {
            addCriterion("legalname not between", value1, value2, "legalname");
            return (Criteria) this;
        }

        public Criteria andLegalphoneIsNull() {
            addCriterion("legalphone is null");
            return (Criteria) this;
        }

        public Criteria andLegalphoneIsNotNull() {
            addCriterion("legalphone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalphoneEqualTo(String value) {
            addCriterion("legalphone =", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneNotEqualTo(String value) {
            addCriterion("legalphone <>", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneGreaterThan(String value) {
            addCriterion("legalphone >", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneGreaterThanOrEqualTo(String value) {
            addCriterion("legalphone >=", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneLessThan(String value) {
            addCriterion("legalphone <", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneLessThanOrEqualTo(String value) {
            addCriterion("legalphone <=", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneLike(String value) {
            addCriterion("legalphone like", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneNotLike(String value) {
            addCriterion("legalphone not like", value, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneIn(List<String> values) {
            addCriterion("legalphone in", values, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneNotIn(List<String> values) {
            addCriterion("legalphone not in", values, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneBetween(String value1, String value2) {
            addCriterion("legalphone between", value1, value2, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalphoneNotBetween(String value1, String value2) {
            addCriterion("legalphone not between", value1, value2, "legalphone");
            return (Criteria) this;
        }

        public Criteria andLegalidcardIsNull() {
            addCriterion("legalidcard is null");
            return (Criteria) this;
        }

        public Criteria andLegalidcardIsNotNull() {
            addCriterion("legalidcard is not null");
            return (Criteria) this;
        }

        public Criteria andLegalidcardEqualTo(String value) {
            addCriterion("legalidcard =", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardNotEqualTo(String value) {
            addCriterion("legalidcard <>", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardGreaterThan(String value) {
            addCriterion("legalidcard >", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardGreaterThanOrEqualTo(String value) {
            addCriterion("legalidcard >=", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardLessThan(String value) {
            addCriterion("legalidcard <", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardLessThanOrEqualTo(String value) {
            addCriterion("legalidcard <=", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardLike(String value) {
            addCriterion("legalidcard like", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardNotLike(String value) {
            addCriterion("legalidcard not like", value, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardIn(List<String> values) {
            addCriterion("legalidcard in", values, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardNotIn(List<String> values) {
            addCriterion("legalidcard not in", values, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardBetween(String value1, String value2) {
            addCriterion("legalidcard between", value1, value2, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andLegalidcardNotBetween(String value1, String value2) {
            addCriterion("legalidcard not between", value1, value2, "legalidcard");
            return (Criteria) this;
        }

        public Criteria andContactsnameIsNull() {
            addCriterion("contactsname is null");
            return (Criteria) this;
        }

        public Criteria andContactsnameIsNotNull() {
            addCriterion("contactsname is not null");
            return (Criteria) this;
        }

        public Criteria andContactsnameEqualTo(String value) {
            addCriterion("contactsname =", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotEqualTo(String value) {
            addCriterion("contactsname <>", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameGreaterThan(String value) {
            addCriterion("contactsname >", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameGreaterThanOrEqualTo(String value) {
            addCriterion("contactsname >=", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLessThan(String value) {
            addCriterion("contactsname <", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLessThanOrEqualTo(String value) {
            addCriterion("contactsname <=", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameLike(String value) {
            addCriterion("contactsname like", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotLike(String value) {
            addCriterion("contactsname not like", value, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameIn(List<String> values) {
            addCriterion("contactsname in", values, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotIn(List<String> values) {
            addCriterion("contactsname not in", values, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameBetween(String value1, String value2) {
            addCriterion("contactsname between", value1, value2, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsnameNotBetween(String value1, String value2) {
            addCriterion("contactsname not between", value1, value2, "contactsname");
            return (Criteria) this;
        }

        public Criteria andContactsmobileIsNull() {
            addCriterion("contactsmobile is null");
            return (Criteria) this;
        }

        public Criteria andContactsmobileIsNotNull() {
            addCriterion("contactsmobile is not null");
            return (Criteria) this;
        }

        public Criteria andContactsmobileEqualTo(String value) {
            addCriterion("contactsmobile =", value, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileNotEqualTo(String value) {
            addCriterion("contactsmobile <>", value, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileGreaterThan(String value) {
            addCriterion("contactsmobile >", value, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileGreaterThanOrEqualTo(String value) {
            addCriterion("contactsmobile >=", value, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileLessThan(String value) {
            addCriterion("contactsmobile <", value, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileLessThanOrEqualTo(String value) {
            addCriterion("contactsmobile <=", value, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileLike(String value) {
            addCriterion("contactsmobile like", value, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileNotLike(String value) {
            addCriterion("contactsmobile not like", value, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileIn(List<String> values) {
            addCriterion("contactsmobile in", values, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileNotIn(List<String> values) {
            addCriterion("contactsmobile not in", values, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileBetween(String value1, String value2) {
            addCriterion("contactsmobile between", value1, value2, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsmobileNotBetween(String value1, String value2) {
            addCriterion("contactsmobile not between", value1, value2, "contactsmobile");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIsNull() {
            addCriterion("contactsphone is null");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIsNotNull() {
            addCriterion("contactsphone is not null");
            return (Criteria) this;
        }

        public Criteria andContactsphoneEqualTo(String value) {
            addCriterion("contactsphone =", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotEqualTo(String value) {
            addCriterion("contactsphone <>", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneGreaterThan(String value) {
            addCriterion("contactsphone >", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactsphone >=", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLessThan(String value) {
            addCriterion("contactsphone <", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLessThanOrEqualTo(String value) {
            addCriterion("contactsphone <=", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneLike(String value) {
            addCriterion("contactsphone like", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotLike(String value) {
            addCriterion("contactsphone not like", value, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneIn(List<String> values) {
            addCriterion("contactsphone in", values, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotIn(List<String> values) {
            addCriterion("contactsphone not in", values, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneBetween(String value1, String value2) {
            addCriterion("contactsphone between", value1, value2, "contactsphone");
            return (Criteria) this;
        }

        public Criteria andContactsphoneNotBetween(String value1, String value2) {
            addCriterion("contactsphone not between", value1, value2, "contactsphone");
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