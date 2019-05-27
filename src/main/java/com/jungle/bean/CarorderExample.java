package com.jungle.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarorderExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andStartplaceIsNull() {
            addCriterion("startplace is null");
            return (Criteria) this;
        }

        public Criteria andStartplaceIsNotNull() {
            addCriterion("startplace is not null");
            return (Criteria) this;
        }

        public Criteria andStartplaceEqualTo(String value) {
            addCriterion("startplace =", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceNotEqualTo(String value) {
            addCriterion("startplace <>", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceGreaterThan(String value) {
            addCriterion("startplace >", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceGreaterThanOrEqualTo(String value) {
            addCriterion("startplace >=", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceLessThan(String value) {
            addCriterion("startplace <", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceLessThanOrEqualTo(String value) {
            addCriterion("startplace <=", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceLike(String value) {
            addCriterion("startplace like", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceNotLike(String value) {
            addCriterion("startplace not like", value, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceIn(List<String> values) {
            addCriterion("startplace in", values, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceNotIn(List<String> values) {
            addCriterion("startplace not in", values, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceBetween(String value1, String value2) {
            addCriterion("startplace between", value1, value2, "startplace");
            return (Criteria) this;
        }

        public Criteria andStartplaceNotBetween(String value1, String value2) {
            addCriterion("startplace not between", value1, value2, "startplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceIsNull() {
            addCriterion("endplace is null");
            return (Criteria) this;
        }

        public Criteria andEndplaceIsNotNull() {
            addCriterion("endplace is not null");
            return (Criteria) this;
        }

        public Criteria andEndplaceEqualTo(String value) {
            addCriterion("endplace =", value, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceNotEqualTo(String value) {
            addCriterion("endplace <>", value, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceGreaterThan(String value) {
            addCriterion("endplace >", value, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceGreaterThanOrEqualTo(String value) {
            addCriterion("endplace >=", value, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceLessThan(String value) {
            addCriterion("endplace <", value, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceLessThanOrEqualTo(String value) {
            addCriterion("endplace <=", value, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceLike(String value) {
            addCriterion("endplace like", value, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceNotLike(String value) {
            addCriterion("endplace not like", value, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceIn(List<String> values) {
            addCriterion("endplace in", values, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceNotIn(List<String> values) {
            addCriterion("endplace not in", values, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceBetween(String value1, String value2) {
            addCriterion("endplace between", value1, value2, "endplace");
            return (Criteria) this;
        }

        public Criteria andEndplaceNotBetween(String value1, String value2) {
            addCriterion("endplace not between", value1, value2, "endplace");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNull() {
            addCriterion("checkperson is null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIsNotNull() {
            addCriterion("checkperson is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpersonEqualTo(String value) {
            addCriterion("checkperson =", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotEqualTo(String value) {
            addCriterion("checkperson <>", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThan(String value) {
            addCriterion("checkperson >", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonGreaterThanOrEqualTo(String value) {
            addCriterion("checkperson >=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThan(String value) {
            addCriterion("checkperson <", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLessThanOrEqualTo(String value) {
            addCriterion("checkperson <=", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonLike(String value) {
            addCriterion("checkperson like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotLike(String value) {
            addCriterion("checkperson not like", value, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonIn(List<String> values) {
            addCriterion("checkperson in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotIn(List<String> values) {
            addCriterion("checkperson not in", values, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonBetween(String value1, String value2) {
            addCriterion("checkperson between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckpersonNotBetween(String value1, String value2) {
            addCriterion("checkperson not between", value1, value2, "checkperson");
            return (Criteria) this;
        }

        public Criteria andCheckphoneIsNull() {
            addCriterion("checkphone is null");
            return (Criteria) this;
        }

        public Criteria andCheckphoneIsNotNull() {
            addCriterion("checkphone is not null");
            return (Criteria) this;
        }

        public Criteria andCheckphoneEqualTo(String value) {
            addCriterion("checkphone =", value, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneNotEqualTo(String value) {
            addCriterion("checkphone <>", value, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneGreaterThan(String value) {
            addCriterion("checkphone >", value, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneGreaterThanOrEqualTo(String value) {
            addCriterion("checkphone >=", value, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneLessThan(String value) {
            addCriterion("checkphone <", value, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneLessThanOrEqualTo(String value) {
            addCriterion("checkphone <=", value, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneLike(String value) {
            addCriterion("checkphone like", value, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneNotLike(String value) {
            addCriterion("checkphone not like", value, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneIn(List<String> values) {
            addCriterion("checkphone in", values, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneNotIn(List<String> values) {
            addCriterion("checkphone not in", values, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneBetween(String value1, String value2) {
            addCriterion("checkphone between", value1, value2, "checkphone");
            return (Criteria) this;
        }

        public Criteria andCheckphoneNotBetween(String value1, String value2) {
            addCriterion("checkphone not between", value1, value2, "checkphone");
            return (Criteria) this;
        }

        public Criteria andUsetimeIsNull() {
            addCriterion("usetime is null");
            return (Criteria) this;
        }

        public Criteria andUsetimeIsNotNull() {
            addCriterion("usetime is not null");
            return (Criteria) this;
        }

        public Criteria andUsetimeEqualTo(Date value) {
            addCriterion("usetime =", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotEqualTo(Date value) {
            addCriterion("usetime <>", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeGreaterThan(Date value) {
            addCriterion("usetime >", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("usetime >=", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeLessThan(Date value) {
            addCriterion("usetime <", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeLessThanOrEqualTo(Date value) {
            addCriterion("usetime <=", value, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeIn(List<Date> values) {
            addCriterion("usetime in", values, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotIn(List<Date> values) {
            addCriterion("usetime not in", values, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeBetween(Date value1, Date value2) {
            addCriterion("usetime between", value1, value2, "usetime");
            return (Criteria) this;
        }

        public Criteria andUsetimeNotBetween(Date value1, Date value2) {
            addCriterion("usetime not between", value1, value2, "usetime");
            return (Criteria) this;
        }

        public Criteria andUseroptionIsNull() {
            addCriterion("useroption is null");
            return (Criteria) this;
        }

        public Criteria andUseroptionIsNotNull() {
            addCriterion("useroption is not null");
            return (Criteria) this;
        }

        public Criteria andUseroptionEqualTo(Boolean value) {
            addCriterion("useroption =", value, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionNotEqualTo(Boolean value) {
            addCriterion("useroption <>", value, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionGreaterThan(Boolean value) {
            addCriterion("useroption >", value, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("useroption >=", value, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionLessThan(Boolean value) {
            addCriterion("useroption <", value, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionLessThanOrEqualTo(Boolean value) {
            addCriterion("useroption <=", value, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionIn(List<Boolean> values) {
            addCriterion("useroption in", values, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionNotIn(List<Boolean> values) {
            addCriterion("useroption not in", values, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionBetween(Boolean value1, Boolean value2) {
            addCriterion("useroption between", value1, value2, "useroption");
            return (Criteria) this;
        }

        public Criteria andUseroptionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("useroption not between", value1, value2, "useroption");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andReservetimeIsNull() {
            addCriterion("reservetime is null");
            return (Criteria) this;
        }

        public Criteria andReservetimeIsNotNull() {
            addCriterion("reservetime is not null");
            return (Criteria) this;
        }

        public Criteria andReservetimeEqualTo(Date value) {
            addCriterion("reservetime =", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotEqualTo(Date value) {
            addCriterion("reservetime <>", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeGreaterThan(Date value) {
            addCriterion("reservetime >", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reservetime >=", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeLessThan(Date value) {
            addCriterion("reservetime <", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeLessThanOrEqualTo(Date value) {
            addCriterion("reservetime <=", value, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeIn(List<Date> values) {
            addCriterion("reservetime in", values, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotIn(List<Date> values) {
            addCriterion("reservetime not in", values, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeBetween(Date value1, Date value2) {
            addCriterion("reservetime between", value1, value2, "reservetime");
            return (Criteria) this;
        }

        public Criteria andReservetimeNotBetween(Date value1, Date value2) {
            addCriterion("reservetime not between", value1, value2, "reservetime");
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