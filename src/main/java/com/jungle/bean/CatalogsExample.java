package com.jungle.bean;

import java.util.ArrayList;
import java.util.List;

public class CatalogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CatalogsExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCatalogidIsNull() {
            addCriterion("catalogid is null");
            return (Criteria) this;
        }

        public Criteria andCatalogidIsNotNull() {
            addCriterion("catalogid is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogidEqualTo(String value) {
            addCriterion("catalogid =", value, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidNotEqualTo(String value) {
            addCriterion("catalogid <>", value, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidGreaterThan(String value) {
            addCriterion("catalogid >", value, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidGreaterThanOrEqualTo(String value) {
            addCriterion("catalogid >=", value, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidLessThan(String value) {
            addCriterion("catalogid <", value, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidLessThanOrEqualTo(String value) {
            addCriterion("catalogid <=", value, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidLike(String value) {
            addCriterion("catalogid like", value, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidNotLike(String value) {
            addCriterion("catalogid not like", value, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidIn(List<String> values) {
            addCriterion("catalogid in", values, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidNotIn(List<String> values) {
            addCriterion("catalogid not in", values, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidBetween(String value1, String value2) {
            addCriterion("catalogid between", value1, value2, "catalogid");
            return (Criteria) this;
        }

        public Criteria andCatalogidNotBetween(String value1, String value2) {
            addCriterion("catalogid not between", value1, value2, "catalogid");
            return (Criteria) this;
        }

        public Criteria andFileidIsNull() {
            addCriterion("fileId is null");
            return (Criteria) this;
        }

        public Criteria andFileidIsNotNull() {
            addCriterion("fileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileidEqualTo(Integer value) {
            addCriterion("fileId =", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotEqualTo(Integer value) {
            addCriterion("fileId <>", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThan(Integer value) {
            addCriterion("fileId >", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fileId >=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThan(Integer value) {
            addCriterion("fileId <", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThanOrEqualTo(Integer value) {
            addCriterion("fileId <=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidIn(List<Integer> values) {
            addCriterion("fileId in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotIn(List<Integer> values) {
            addCriterion("fileId not in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidBetween(Integer value1, Integer value2) {
            addCriterion("fileId between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("fileId not between", value1, value2, "fileid");
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