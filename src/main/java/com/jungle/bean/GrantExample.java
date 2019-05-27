package com.jungle.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GrantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrantExample() {
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

        public Criteria andDonationnameIsNull() {
            addCriterion("donationname is null");
            return (Criteria) this;
        }

        public Criteria andDonationnameIsNotNull() {
            addCriterion("donationname is not null");
            return (Criteria) this;
        }

        public Criteria andDonationnameEqualTo(String value) {
            addCriterion("donationname =", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameNotEqualTo(String value) {
            addCriterion("donationname <>", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameGreaterThan(String value) {
            addCriterion("donationname >", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameGreaterThanOrEqualTo(String value) {
            addCriterion("donationname >=", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameLessThan(String value) {
            addCriterion("donationname <", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameLessThanOrEqualTo(String value) {
            addCriterion("donationname <=", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameLike(String value) {
            addCriterion("donationname like", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameNotLike(String value) {
            addCriterion("donationname not like", value, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameIn(List<String> values) {
            addCriterion("donationname in", values, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameNotIn(List<String> values) {
            addCriterion("donationname not in", values, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameBetween(String value1, String value2) {
            addCriterion("donationname between", value1, value2, "donationname");
            return (Criteria) this;
        }

        public Criteria andDonationnameNotBetween(String value1, String value2) {
            addCriterion("donationname not between", value1, value2, "donationname");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(String value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(String value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(String value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(String value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(String value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLike(String value) {
            addCriterion("goods like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotLike(String value) {
            addCriterion("goods not like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<String> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<String> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(String value1, String value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(String value1, String value2) {
            addCriterion("goods not between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Long value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Long value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Long value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Long value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Long value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Long value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Long> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Long> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Long value1, Long value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Long value1, Long value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andWorthlessIsNull() {
            addCriterion("worthless is null");
            return (Criteria) this;
        }

        public Criteria andWorthlessIsNotNull() {
            addCriterion("worthless is not null");
            return (Criteria) this;
        }

        public Criteria andWorthlessEqualTo(BigDecimal value) {
            addCriterion("worthless =", value, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessNotEqualTo(BigDecimal value) {
            addCriterion("worthless <>", value, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessGreaterThan(BigDecimal value) {
            addCriterion("worthless >", value, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("worthless >=", value, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessLessThan(BigDecimal value) {
            addCriterion("worthless <", value, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessLessThanOrEqualTo(BigDecimal value) {
            addCriterion("worthless <=", value, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessIn(List<BigDecimal> values) {
            addCriterion("worthless in", values, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessNotIn(List<BigDecimal> values) {
            addCriterion("worthless not in", values, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("worthless between", value1, value2, "worthless");
            return (Criteria) this;
        }

        public Criteria andWorthlessNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("worthless not between", value1, value2, "worthless");
            return (Criteria) this;
        }

        public Criteria andUsetoIsNull() {
            addCriterion("useto is null");
            return (Criteria) this;
        }

        public Criteria andUsetoIsNotNull() {
            addCriterion("useto is not null");
            return (Criteria) this;
        }

        public Criteria andUsetoEqualTo(String value) {
            addCriterion("useto =", value, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoNotEqualTo(String value) {
            addCriterion("useto <>", value, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoGreaterThan(String value) {
            addCriterion("useto >", value, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoGreaterThanOrEqualTo(String value) {
            addCriterion("useto >=", value, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoLessThan(String value) {
            addCriterion("useto <", value, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoLessThanOrEqualTo(String value) {
            addCriterion("useto <=", value, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoLike(String value) {
            addCriterion("useto like", value, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoNotLike(String value) {
            addCriterion("useto not like", value, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoIn(List<String> values) {
            addCriterion("useto in", values, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoNotIn(List<String> values) {
            addCriterion("useto not in", values, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoBetween(String value1, String value2) {
            addCriterion("useto between", value1, value2, "useto");
            return (Criteria) this;
        }

        public Criteria andUsetoNotBetween(String value1, String value2) {
            addCriterion("useto not between", value1, value2, "useto");
            return (Criteria) this;
        }

        public Criteria andRecipientsIsNull() {
            addCriterion("recipients is null");
            return (Criteria) this;
        }

        public Criteria andRecipientsIsNotNull() {
            addCriterion("recipients is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientsEqualTo(String value) {
            addCriterion("recipients =", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotEqualTo(String value) {
            addCriterion("recipients <>", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThan(String value) {
            addCriterion("recipients >", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsGreaterThanOrEqualTo(String value) {
            addCriterion("recipients >=", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThan(String value) {
            addCriterion("recipients <", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLessThanOrEqualTo(String value) {
            addCriterion("recipients <=", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsLike(String value) {
            addCriterion("recipients like", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotLike(String value) {
            addCriterion("recipients not like", value, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsIn(List<String> values) {
            addCriterion("recipients in", values, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotIn(List<String> values) {
            addCriterion("recipients not in", values, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsBetween(String value1, String value2) {
            addCriterion("recipients between", value1, value2, "recipients");
            return (Criteria) this;
        }

        public Criteria andRecipientsNotBetween(String value1, String value2) {
            addCriterion("recipients not between", value1, value2, "recipients");
            return (Criteria) this;
        }

        public Criteria andDonationtimeIsNull() {
            addCriterion("donationTime is null");
            return (Criteria) this;
        }

        public Criteria andDonationtimeIsNotNull() {
            addCriterion("donationTime is not null");
            return (Criteria) this;
        }

        public Criteria andDonationtimeEqualTo(Date value) {
            addCriterionForJDBCDate("donationTime =", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("donationTime <>", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("donationTime >", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("donationTime >=", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeLessThan(Date value) {
            addCriterionForJDBCDate("donationTime <", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("donationTime <=", value, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeIn(List<Date> values) {
            addCriterionForJDBCDate("donationTime in", values, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("donationTime not in", values, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("donationTime between", value1, value2, "donationtime");
            return (Criteria) this;
        }

        public Criteria andDonationtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("donationTime not between", value1, value2, "donationtime");
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