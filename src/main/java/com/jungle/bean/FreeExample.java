package com.jungle.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreeExample() {
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

        public Criteria andConfessionidIsNull() {
            addCriterion("confessionid is null");
            return (Criteria) this;
        }

        public Criteria andConfessionidIsNotNull() {
            addCriterion("confessionid is not null");
            return (Criteria) this;
        }

        public Criteria andConfessionidEqualTo(Integer value) {
            addCriterion("confessionid =", value, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidNotEqualTo(Integer value) {
            addCriterion("confessionid <>", value, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidGreaterThan(Integer value) {
            addCriterion("confessionid >", value, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("confessionid >=", value, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidLessThan(Integer value) {
            addCriterion("confessionid <", value, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidLessThanOrEqualTo(Integer value) {
            addCriterion("confessionid <=", value, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidIn(List<Integer> values) {
            addCriterion("confessionid in", values, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidNotIn(List<Integer> values) {
            addCriterion("confessionid not in", values, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidBetween(Integer value1, Integer value2) {
            addCriterion("confessionid between", value1, value2, "confessionid");
            return (Criteria) this;
        }

        public Criteria andConfessionidNotBetween(Integer value1, Integer value2) {
            addCriterion("confessionid not between", value1, value2, "confessionid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andFtimeIsNull() {
            addCriterion("ftime is null");
            return (Criteria) this;
        }

        public Criteria andFtimeIsNotNull() {
            addCriterion("ftime is not null");
            return (Criteria) this;
        }

        public Criteria andFtimeEqualTo(Date value) {
            addCriterion("ftime =", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotEqualTo(Date value) {
            addCriterion("ftime <>", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeGreaterThan(Date value) {
            addCriterion("ftime >", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ftime >=", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeLessThan(Date value) {
            addCriterion("ftime <", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeLessThanOrEqualTo(Date value) {
            addCriterion("ftime <=", value, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeIn(List<Date> values) {
            addCriterion("ftime in", values, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotIn(List<Date> values) {
            addCriterion("ftime not in", values, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeBetween(Date value1, Date value2) {
            addCriterion("ftime between", value1, value2, "ftime");
            return (Criteria) this;
        }

        public Criteria andFtimeNotBetween(Date value1, Date value2) {
            addCriterion("ftime not between", value1, value2, "ftime");
            return (Criteria) this;
        }

        public Criteria andReadnumIsNull() {
            addCriterion("readnum is null");
            return (Criteria) this;
        }

        public Criteria andReadnumIsNotNull() {
            addCriterion("readnum is not null");
            return (Criteria) this;
        }

        public Criteria andReadnumEqualTo(Integer value) {
            addCriterion("readnum =", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotEqualTo(Integer value) {
            addCriterion("readnum <>", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumGreaterThan(Integer value) {
            addCriterion("readnum >", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("readnum >=", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumLessThan(Integer value) {
            addCriterion("readnum <", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumLessThanOrEqualTo(Integer value) {
            addCriterion("readnum <=", value, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumIn(List<Integer> values) {
            addCriterion("readnum in", values, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotIn(List<Integer> values) {
            addCriterion("readnum not in", values, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumBetween(Integer value1, Integer value2) {
            addCriterion("readnum between", value1, value2, "readnum");
            return (Criteria) this;
        }

        public Criteria andReadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("readnum not between", value1, value2, "readnum");
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