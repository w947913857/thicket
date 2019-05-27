package com.jungle.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ClxjorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClxjorderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCheckstartdateIsNull() {
            addCriterion("checkstartdate is null");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateIsNotNull() {
            addCriterion("checkstartdate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateEqualTo(Date value) {
            addCriterionForJDBCDate("checkstartdate =", value, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkstartdate <>", value, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkstartdate >", value, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkstartdate >=", value, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateLessThan(Date value) {
            addCriterionForJDBCDate("checkstartdate <", value, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkstartdate <=", value, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateIn(List<Date> values) {
            addCriterionForJDBCDate("checkstartdate in", values, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkstartdate not in", values, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkstartdate between", value1, value2, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckstartdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkstartdate not between", value1, value2, "checkstartdate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateIsNull() {
            addCriterion("checkenddate is null");
            return (Criteria) this;
        }

        public Criteria andCheckenddateIsNotNull() {
            addCriterion("checkenddate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckenddateEqualTo(Date value) {
            addCriterionForJDBCDate("checkenddate =", value, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("checkenddate <>", value, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateGreaterThan(Date value) {
            addCriterionForJDBCDate("checkenddate >", value, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkenddate >=", value, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateLessThan(Date value) {
            addCriterionForJDBCDate("checkenddate <", value, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("checkenddate <=", value, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateIn(List<Date> values) {
            addCriterionForJDBCDate("checkenddate in", values, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("checkenddate not in", values, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkenddate between", value1, value2, "checkenddate");
            return (Criteria) this;
        }

        public Criteria andCheckenddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("checkenddate not between", value1, value2, "checkenddate");
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

        public Criteria andRelpersonIsNull() {
            addCriterion("relperson is null");
            return (Criteria) this;
        }

        public Criteria andRelpersonIsNotNull() {
            addCriterion("relperson is not null");
            return (Criteria) this;
        }

        public Criteria andRelpersonEqualTo(String value) {
            addCriterion("relperson =", value, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonNotEqualTo(String value) {
            addCriterion("relperson <>", value, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonGreaterThan(String value) {
            addCriterion("relperson >", value, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonGreaterThanOrEqualTo(String value) {
            addCriterion("relperson >=", value, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonLessThan(String value) {
            addCriterion("relperson <", value, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonLessThanOrEqualTo(String value) {
            addCriterion("relperson <=", value, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonLike(String value) {
            addCriterion("relperson like", value, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonNotLike(String value) {
            addCriterion("relperson not like", value, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonIn(List<String> values) {
            addCriterion("relperson in", values, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonNotIn(List<String> values) {
            addCriterion("relperson not in", values, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonBetween(String value1, String value2) {
            addCriterion("relperson between", value1, value2, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelpersonNotBetween(String value1, String value2) {
            addCriterion("relperson not between", value1, value2, "relperson");
            return (Criteria) this;
        }

        public Criteria andRelphoneIsNull() {
            addCriterion("relphone is null");
            return (Criteria) this;
        }

        public Criteria andRelphoneIsNotNull() {
            addCriterion("relphone is not null");
            return (Criteria) this;
        }

        public Criteria andRelphoneEqualTo(String value) {
            addCriterion("relphone =", value, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneNotEqualTo(String value) {
            addCriterion("relphone <>", value, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneGreaterThan(String value) {
            addCriterion("relphone >", value, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("relphone >=", value, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneLessThan(String value) {
            addCriterion("relphone <", value, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneLessThanOrEqualTo(String value) {
            addCriterion("relphone <=", value, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneLike(String value) {
            addCriterion("relphone like", value, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneNotLike(String value) {
            addCriterion("relphone not like", value, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneIn(List<String> values) {
            addCriterion("relphone in", values, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneNotIn(List<String> values) {
            addCriterion("relphone not in", values, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneBetween(String value1, String value2) {
            addCriterion("relphone between", value1, value2, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelphoneNotBetween(String value1, String value2) {
            addCriterion("relphone not between", value1, value2, "relphone");
            return (Criteria) this;
        }

        public Criteria andRelemailIsNull() {
            addCriterion("relemail is null");
            return (Criteria) this;
        }

        public Criteria andRelemailIsNotNull() {
            addCriterion("relemail is not null");
            return (Criteria) this;
        }

        public Criteria andRelemailEqualTo(String value) {
            addCriterion("relemail =", value, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailNotEqualTo(String value) {
            addCriterion("relemail <>", value, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailGreaterThan(String value) {
            addCriterion("relemail >", value, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailGreaterThanOrEqualTo(String value) {
            addCriterion("relemail >=", value, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailLessThan(String value) {
            addCriterion("relemail <", value, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailLessThanOrEqualTo(String value) {
            addCriterion("relemail <=", value, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailLike(String value) {
            addCriterion("relemail like", value, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailNotLike(String value) {
            addCriterion("relemail not like", value, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailIn(List<String> values) {
            addCriterion("relemail in", values, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailNotIn(List<String> values) {
            addCriterion("relemail not in", values, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailBetween(String value1, String value2) {
            addCriterion("relemail between", value1, value2, "relemail");
            return (Criteria) this;
        }

        public Criteria andRelemailNotBetween(String value1, String value2) {
            addCriterion("relemail not between", value1, value2, "relemail");
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