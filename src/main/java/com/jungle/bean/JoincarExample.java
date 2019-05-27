package com.jungle.bean;

import java.util.ArrayList;
import java.util.List;

public class JoincarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JoincarExample() {
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

        public Criteria andTheownerIsNull() {
            addCriterion("theowner is null");
            return (Criteria) this;
        }

        public Criteria andTheownerIsNotNull() {
            addCriterion("theowner is not null");
            return (Criteria) this;
        }

        public Criteria andTheownerEqualTo(String value) {
            addCriterion("theowner =", value, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerNotEqualTo(String value) {
            addCriterion("theowner <>", value, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerGreaterThan(String value) {
            addCriterion("theowner >", value, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerGreaterThanOrEqualTo(String value) {
            addCriterion("theowner >=", value, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerLessThan(String value) {
            addCriterion("theowner <", value, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerLessThanOrEqualTo(String value) {
            addCriterion("theowner <=", value, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerLike(String value) {
            addCriterion("theowner like", value, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerNotLike(String value) {
            addCriterion("theowner not like", value, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerIn(List<String> values) {
            addCriterion("theowner in", values, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerNotIn(List<String> values) {
            addCriterion("theowner not in", values, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerBetween(String value1, String value2) {
            addCriterion("theowner between", value1, value2, "theowner");
            return (Criteria) this;
        }

        public Criteria andTheownerNotBetween(String value1, String value2) {
            addCriterion("theowner not between", value1, value2, "theowner");
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

        public Criteria andCarnameIsNull() {
            addCriterion("carname is null");
            return (Criteria) this;
        }

        public Criteria andCarnameIsNotNull() {
            addCriterion("carname is not null");
            return (Criteria) this;
        }

        public Criteria andCarnameEqualTo(String value) {
            addCriterion("carname =", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotEqualTo(String value) {
            addCriterion("carname <>", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameGreaterThan(String value) {
            addCriterion("carname >", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameGreaterThanOrEqualTo(String value) {
            addCriterion("carname >=", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLessThan(String value) {
            addCriterion("carname <", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLessThanOrEqualTo(String value) {
            addCriterion("carname <=", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameLike(String value) {
            addCriterion("carname like", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotLike(String value) {
            addCriterion("carname not like", value, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameIn(List<String> values) {
            addCriterion("carname in", values, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotIn(List<String> values) {
            addCriterion("carname not in", values, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameBetween(String value1, String value2) {
            addCriterion("carname between", value1, value2, "carname");
            return (Criteria) this;
        }

        public Criteria andCarnameNotBetween(String value1, String value2) {
            addCriterion("carname not between", value1, value2, "carname");
            return (Criteria) this;
        }

        public Criteria andTravelnumberIsNull() {
            addCriterion("travelnumber is null");
            return (Criteria) this;
        }

        public Criteria andTravelnumberIsNotNull() {
            addCriterion("travelnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTravelnumberEqualTo(String value) {
            addCriterion("travelnumber =", value, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberNotEqualTo(String value) {
            addCriterion("travelnumber <>", value, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberGreaterThan(String value) {
            addCriterion("travelnumber >", value, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("travelnumber >=", value, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberLessThan(String value) {
            addCriterion("travelnumber <", value, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberLessThanOrEqualTo(String value) {
            addCriterion("travelnumber <=", value, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberLike(String value) {
            addCriterion("travelnumber like", value, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberNotLike(String value) {
            addCriterion("travelnumber not like", value, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberIn(List<String> values) {
            addCriterion("travelnumber in", values, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberNotIn(List<String> values) {
            addCriterion("travelnumber not in", values, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberBetween(String value1, String value2) {
            addCriterion("travelnumber between", value1, value2, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelnumberNotBetween(String value1, String value2) {
            addCriterion("travelnumber not between", value1, value2, "travelnumber");
            return (Criteria) this;
        }

        public Criteria andTravelrunIsNull() {
            addCriterion("travelrun is null");
            return (Criteria) this;
        }

        public Criteria andTravelrunIsNotNull() {
            addCriterion("travelrun is not null");
            return (Criteria) this;
        }

        public Criteria andTravelrunEqualTo(String value) {
            addCriterion("travelrun =", value, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunNotEqualTo(String value) {
            addCriterion("travelrun <>", value, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunGreaterThan(String value) {
            addCriterion("travelrun >", value, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunGreaterThanOrEqualTo(String value) {
            addCriterion("travelrun >=", value, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunLessThan(String value) {
            addCriterion("travelrun <", value, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunLessThanOrEqualTo(String value) {
            addCriterion("travelrun <=", value, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunLike(String value) {
            addCriterion("travelrun like", value, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunNotLike(String value) {
            addCriterion("travelrun not like", value, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunIn(List<String> values) {
            addCriterion("travelrun in", values, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunNotIn(List<String> values) {
            addCriterion("travelrun not in", values, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunBetween(String value1, String value2) {
            addCriterion("travelrun between", value1, value2, "travelrun");
            return (Criteria) this;
        }

        public Criteria andTravelrunNotBetween(String value1, String value2) {
            addCriterion("travelrun not between", value1, value2, "travelrun");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNull() {
            addCriterion("drivername is null");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNotNull() {
            addCriterion("drivername is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernameEqualTo(String value) {
            addCriterion("drivername =", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotEqualTo(String value) {
            addCriterion("drivername <>", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThan(String value) {
            addCriterion("drivername >", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThanOrEqualTo(String value) {
            addCriterion("drivername >=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThan(String value) {
            addCriterion("drivername <", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThanOrEqualTo(String value) {
            addCriterion("drivername <=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLike(String value) {
            addCriterion("drivername like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotLike(String value) {
            addCriterion("drivername not like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameIn(List<String> values) {
            addCriterion("drivername in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotIn(List<String> values) {
            addCriterion("drivername not in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameBetween(String value1, String value2) {
            addCriterion("drivername between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotBetween(String value1, String value2) {
            addCriterion("drivername not between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernumberIsNull() {
            addCriterion("drivernumber is null");
            return (Criteria) this;
        }

        public Criteria andDrivernumberIsNotNull() {
            addCriterion("drivernumber is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernumberEqualTo(String value) {
            addCriterion("drivernumber =", value, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberNotEqualTo(String value) {
            addCriterion("drivernumber <>", value, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberGreaterThan(String value) {
            addCriterion("drivernumber >", value, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberGreaterThanOrEqualTo(String value) {
            addCriterion("drivernumber >=", value, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberLessThan(String value) {
            addCriterion("drivernumber <", value, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberLessThanOrEqualTo(String value) {
            addCriterion("drivernumber <=", value, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberLike(String value) {
            addCriterion("drivernumber like", value, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberNotLike(String value) {
            addCriterion("drivernumber not like", value, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberIn(List<String> values) {
            addCriterion("drivernumber in", values, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberNotIn(List<String> values) {
            addCriterion("drivernumber not in", values, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberBetween(String value1, String value2) {
            addCriterion("drivernumber between", value1, value2, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDrivernumberNotBetween(String value1, String value2) {
            addCriterion("drivernumber not between", value1, value2, "drivernumber");
            return (Criteria) this;
        }

        public Criteria andDriverphoneIsNull() {
            addCriterion("driverphone is null");
            return (Criteria) this;
        }

        public Criteria andDriverphoneIsNotNull() {
            addCriterion("driverphone is not null");
            return (Criteria) this;
        }

        public Criteria andDriverphoneEqualTo(String value) {
            addCriterion("driverphone =", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotEqualTo(String value) {
            addCriterion("driverphone <>", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneGreaterThan(String value) {
            addCriterion("driverphone >", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("driverphone >=", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLessThan(String value) {
            addCriterion("driverphone <", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLessThanOrEqualTo(String value) {
            addCriterion("driverphone <=", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneLike(String value) {
            addCriterion("driverphone like", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotLike(String value) {
            addCriterion("driverphone not like", value, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneIn(List<String> values) {
            addCriterion("driverphone in", values, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotIn(List<String> values) {
            addCriterion("driverphone not in", values, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneBetween(String value1, String value2) {
            addCriterion("driverphone between", value1, value2, "driverphone");
            return (Criteria) this;
        }

        public Criteria andDriverphoneNotBetween(String value1, String value2) {
            addCriterion("driverphone not between", value1, value2, "driverphone");
            return (Criteria) this;
        }

        public Criteria andInsurancenameIsNull() {
            addCriterion("insurancename is null");
            return (Criteria) this;
        }

        public Criteria andInsurancenameIsNotNull() {
            addCriterion("insurancename is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancenameEqualTo(String value) {
            addCriterion("insurancename =", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameNotEqualTo(String value) {
            addCriterion("insurancename <>", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameGreaterThan(String value) {
            addCriterion("insurancename >", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameGreaterThanOrEqualTo(String value) {
            addCriterion("insurancename >=", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameLessThan(String value) {
            addCriterion("insurancename <", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameLessThanOrEqualTo(String value) {
            addCriterion("insurancename <=", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameLike(String value) {
            addCriterion("insurancename like", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameNotLike(String value) {
            addCriterion("insurancename not like", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameIn(List<String> values) {
            addCriterion("insurancename in", values, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameNotIn(List<String> values) {
            addCriterion("insurancename not in", values, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameBetween(String value1, String value2) {
            addCriterion("insurancename between", value1, value2, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameNotBetween(String value1, String value2) {
            addCriterion("insurancename not between", value1, value2, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberIsNull() {
            addCriterion("insurancenumber is null");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberIsNotNull() {
            addCriterion("insurancenumber is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberEqualTo(String value) {
            addCriterion("insurancenumber =", value, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberNotEqualTo(String value) {
            addCriterion("insurancenumber <>", value, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberGreaterThan(String value) {
            addCriterion("insurancenumber >", value, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberGreaterThanOrEqualTo(String value) {
            addCriterion("insurancenumber >=", value, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberLessThan(String value) {
            addCriterion("insurancenumber <", value, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberLessThanOrEqualTo(String value) {
            addCriterion("insurancenumber <=", value, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberLike(String value) {
            addCriterion("insurancenumber like", value, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberNotLike(String value) {
            addCriterion("insurancenumber not like", value, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberIn(List<String> values) {
            addCriterion("insurancenumber in", values, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberNotIn(List<String> values) {
            addCriterion("insurancenumber not in", values, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberBetween(String value1, String value2) {
            addCriterion("insurancenumber between", value1, value2, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancenumberNotBetween(String value1, String value2) {
            addCriterion("insurancenumber not between", value1, value2, "insurancenumber");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneIsNull() {
            addCriterion("insurancephone is null");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneIsNotNull() {
            addCriterion("insurancephone is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneEqualTo(String value) {
            addCriterion("insurancephone =", value, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneNotEqualTo(String value) {
            addCriterion("insurancephone <>", value, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneGreaterThan(String value) {
            addCriterion("insurancephone >", value, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneGreaterThanOrEqualTo(String value) {
            addCriterion("insurancephone >=", value, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneLessThan(String value) {
            addCriterion("insurancephone <", value, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneLessThanOrEqualTo(String value) {
            addCriterion("insurancephone <=", value, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneLike(String value) {
            addCriterion("insurancephone like", value, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneNotLike(String value) {
            addCriterion("insurancephone not like", value, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneIn(List<String> values) {
            addCriterion("insurancephone in", values, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneNotIn(List<String> values) {
            addCriterion("insurancephone not in", values, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneBetween(String value1, String value2) {
            addCriterion("insurancephone between", value1, value2, "insurancephone");
            return (Criteria) this;
        }

        public Criteria andInsurancephoneNotBetween(String value1, String value2) {
            addCriterion("insurancephone not between", value1, value2, "insurancephone");
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