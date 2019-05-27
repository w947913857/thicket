package com.jungle.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("org_name is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("org_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("org_name =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("org_name <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("org_name >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("org_name >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("org_name <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("org_name <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("org_name like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("org_name not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("org_name in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("org_name not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("org_name between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("org_name not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIsNull() {
            addCriterion("org_description is null");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIsNotNull() {
            addCriterion("org_description is not null");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionEqualTo(String value) {
            addCriterion("org_description =", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotEqualTo(String value) {
            addCriterion("org_description <>", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionGreaterThan(String value) {
            addCriterion("org_description >", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("org_description >=", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLessThan(String value) {
            addCriterion("org_description <", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLessThanOrEqualTo(String value) {
            addCriterion("org_description <=", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionLike(String value) {
            addCriterion("org_description like", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotLike(String value) {
            addCriterion("org_description not like", value, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionIn(List<String> values) {
            addCriterion("org_description in", values, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotIn(List<String> values) {
            addCriterion("org_description not in", values, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionBetween(String value1, String value2) {
            addCriterion("org_description between", value1, value2, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgDescriptionNotBetween(String value1, String value2) {
            addCriterion("org_description not between", value1, value2, "orgDescription");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIsNull() {
            addCriterion("org_manager is null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIsNotNull() {
            addCriterion("org_manager is not null");
            return (Criteria) this;
        }

        public Criteria andOrgManagerEqualTo(String value) {
            addCriterion("org_manager =", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotEqualTo(String value) {
            addCriterion("org_manager <>", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerGreaterThan(String value) {
            addCriterion("org_manager >", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerGreaterThanOrEqualTo(String value) {
            addCriterion("org_manager >=", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLessThan(String value) {
            addCriterion("org_manager <", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLessThanOrEqualTo(String value) {
            addCriterion("org_manager <=", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerLike(String value) {
            addCriterion("org_manager like", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotLike(String value) {
            addCriterion("org_manager not like", value, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerIn(List<String> values) {
            addCriterion("org_manager in", values, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotIn(List<String> values) {
            addCriterion("org_manager not in", values, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerBetween(String value1, String value2) {
            addCriterion("org_manager between", value1, value2, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgManagerNotBetween(String value1, String value2) {
            addCriterion("org_manager not between", value1, value2, "orgManager");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneIsNull() {
            addCriterion("org_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneIsNotNull() {
            addCriterion("org_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneEqualTo(String value) {
            addCriterion("org_phone =", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneNotEqualTo(String value) {
            addCriterion("org_phone <>", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneGreaterThan(String value) {
            addCriterion("org_phone >", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("org_phone >=", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneLessThan(String value) {
            addCriterion("org_phone <", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneLessThanOrEqualTo(String value) {
            addCriterion("org_phone <=", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneLike(String value) {
            addCriterion("org_phone like", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneNotLike(String value) {
            addCriterion("org_phone not like", value, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneIn(List<String> values) {
            addCriterion("org_phone in", values, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneNotIn(List<String> values) {
            addCriterion("org_phone not in", values, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneBetween(String value1, String value2) {
            addCriterion("org_phone between", value1, value2, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgPhoneNotBetween(String value1, String value2) {
            addCriterion("org_phone not between", value1, value2, "orgPhone");
            return (Criteria) this;
        }

        public Criteria andOrgParentidIsNull() {
            addCriterion("org_parentid is null");
            return (Criteria) this;
        }

        public Criteria andOrgParentidIsNotNull() {
            addCriterion("org_parentid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgParentidEqualTo(Integer value) {
            addCriterion("org_parentid =", value, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidNotEqualTo(Integer value) {
            addCriterion("org_parentid <>", value, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidGreaterThan(Integer value) {
            addCriterion("org_parentid >", value, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_parentid >=", value, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidLessThan(Integer value) {
            addCriterion("org_parentid <", value, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidLessThanOrEqualTo(Integer value) {
            addCriterion("org_parentid <=", value, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidIn(List<Integer> values) {
            addCriterion("org_parentid in", values, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidNotIn(List<Integer> values) {
            addCriterion("org_parentid not in", values, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidBetween(Integer value1, Integer value2) {
            addCriterion("org_parentid between", value1, value2, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgParentidNotBetween(Integer value1, Integer value2) {
            addCriterion("org_parentid not between", value1, value2, "orgParentid");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeIsNull() {
            addCriterion("org_establishTime is null");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeIsNotNull() {
            addCriterion("org_establishTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeEqualTo(Date value) {
            addCriterion("org_establishTime =", value, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeNotEqualTo(Date value) {
            addCriterion("org_establishTime <>", value, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeGreaterThan(Date value) {
            addCriterion("org_establishTime >", value, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("org_establishTime >=", value, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeLessThan(Date value) {
            addCriterion("org_establishTime <", value, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeLessThanOrEqualTo(Date value) {
            addCriterion("org_establishTime <=", value, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeIn(List<Date> values) {
            addCriterion("org_establishTime in", values, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeNotIn(List<Date> values) {
            addCriterion("org_establishTime not in", values, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeBetween(Date value1, Date value2) {
            addCriterion("org_establishTime between", value1, value2, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgEstablishtimeNotBetween(Date value1, Date value2) {
            addCriterion("org_establishTime not between", value1, value2, "orgEstablishtime");
            return (Criteria) this;
        }

        public Criteria andOrgPathIsNull() {
            addCriterion("org_path is null");
            return (Criteria) this;
        }

        public Criteria andOrgPathIsNotNull() {
            addCriterion("org_path is not null");
            return (Criteria) this;
        }

        public Criteria andOrgPathEqualTo(String value) {
            addCriterion("org_path =", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotEqualTo(String value) {
            addCriterion("org_path <>", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathGreaterThan(String value) {
            addCriterion("org_path >", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathGreaterThanOrEqualTo(String value) {
            addCriterion("org_path >=", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLessThan(String value) {
            addCriterion("org_path <", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLessThanOrEqualTo(String value) {
            addCriterion("org_path <=", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathLike(String value) {
            addCriterion("org_path like", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotLike(String value) {
            addCriterion("org_path not like", value, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathIn(List<String> values) {
            addCriterion("org_path in", values, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotIn(List<String> values) {
            addCriterion("org_path not in", values, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathBetween(String value1, String value2) {
            addCriterion("org_path between", value1, value2, "orgPath");
            return (Criteria) this;
        }

        public Criteria andOrgPathNotBetween(String value1, String value2) {
            addCriterion("org_path not between", value1, value2, "orgPath");
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