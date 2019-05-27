package com.jungle.bean;

import java.util.ArrayList;
import java.util.List;

public class CarinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarinfoExample() {
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

        public Criteria andCartitleIsNull() {
            addCriterion("cartitle is null");
            return (Criteria) this;
        }

        public Criteria andCartitleIsNotNull() {
            addCriterion("cartitle is not null");
            return (Criteria) this;
        }

        public Criteria andCartitleEqualTo(String value) {
            addCriterion("cartitle =", value, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleNotEqualTo(String value) {
            addCriterion("cartitle <>", value, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleGreaterThan(String value) {
            addCriterion("cartitle >", value, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleGreaterThanOrEqualTo(String value) {
            addCriterion("cartitle >=", value, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleLessThan(String value) {
            addCriterion("cartitle <", value, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleLessThanOrEqualTo(String value) {
            addCriterion("cartitle <=", value, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleLike(String value) {
            addCriterion("cartitle like", value, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleNotLike(String value) {
            addCriterion("cartitle not like", value, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleIn(List<String> values) {
            addCriterion("cartitle in", values, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleNotIn(List<String> values) {
            addCriterion("cartitle not in", values, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleBetween(String value1, String value2) {
            addCriterion("cartitle between", value1, value2, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCartitleNotBetween(String value1, String value2) {
            addCriterion("cartitle not between", value1, value2, "cartitle");
            return (Criteria) this;
        }

        public Criteria andCarouselImgIsNull() {
            addCriterion("carousel_img is null");
            return (Criteria) this;
        }

        public Criteria andCarouselImgIsNotNull() {
            addCriterion("carousel_img is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselImgEqualTo(String value) {
            addCriterion("carousel_img =", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgNotEqualTo(String value) {
            addCriterion("carousel_img <>", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgGreaterThan(String value) {
            addCriterion("carousel_img >", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgGreaterThanOrEqualTo(String value) {
            addCriterion("carousel_img >=", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgLessThan(String value) {
            addCriterion("carousel_img <", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgLessThanOrEqualTo(String value) {
            addCriterion("carousel_img <=", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgLike(String value) {
            addCriterion("carousel_img like", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgNotLike(String value) {
            addCriterion("carousel_img not like", value, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgIn(List<String> values) {
            addCriterion("carousel_img in", values, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgNotIn(List<String> values) {
            addCriterion("carousel_img not in", values, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgBetween(String value1, String value2) {
            addCriterion("carousel_img between", value1, value2, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andCarouselImgNotBetween(String value1, String value2) {
            addCriterion("carousel_img not between", value1, value2, "carouselImg");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andLicenceIsNull() {
            addCriterion("licence is null");
            return (Criteria) this;
        }

        public Criteria andLicenceIsNotNull() {
            addCriterion("licence is not null");
            return (Criteria) this;
        }

        public Criteria andLicenceEqualTo(String value) {
            addCriterion("licence =", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceNotEqualTo(String value) {
            addCriterion("licence <>", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceGreaterThan(String value) {
            addCriterion("licence >", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("licence >=", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceLessThan(String value) {
            addCriterion("licence <", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceLessThanOrEqualTo(String value) {
            addCriterion("licence <=", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceLike(String value) {
            addCriterion("licence like", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceNotLike(String value) {
            addCriterion("licence not like", value, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceIn(List<String> values) {
            addCriterion("licence in", values, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceNotIn(List<String> values) {
            addCriterion("licence not in", values, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceBetween(String value1, String value2) {
            addCriterion("licence between", value1, value2, "licence");
            return (Criteria) this;
        }

        public Criteria andLicenceNotBetween(String value1, String value2) {
            addCriterion("licence not between", value1, value2, "licence");
            return (Criteria) this;
        }

        public Criteria andJoinidIsNull() {
            addCriterion("joinid is null");
            return (Criteria) this;
        }

        public Criteria andJoinidIsNotNull() {
            addCriterion("joinid is not null");
            return (Criteria) this;
        }

        public Criteria andJoinidEqualTo(Integer value) {
            addCriterion("joinid =", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotEqualTo(Integer value) {
            addCriterion("joinid <>", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidGreaterThan(Integer value) {
            addCriterion("joinid >", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinid >=", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidLessThan(Integer value) {
            addCriterion("joinid <", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidLessThanOrEqualTo(Integer value) {
            addCriterion("joinid <=", value, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidIn(List<Integer> values) {
            addCriterion("joinid in", values, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotIn(List<Integer> values) {
            addCriterion("joinid not in", values, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidBetween(Integer value1, Integer value2) {
            addCriterion("joinid between", value1, value2, "joinid");
            return (Criteria) this;
        }

        public Criteria andJoinidNotBetween(Integer value1, Integer value2) {
            addCriterion("joinid not between", value1, value2, "joinid");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("checkstatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(Integer value) {
            addCriterion("checkstatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(Integer value) {
            addCriterion("checkstatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(Integer value) {
            addCriterion("checkstatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkstatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(Integer value) {
            addCriterion("checkstatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(Integer value) {
            addCriterion("checkstatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<Integer> values) {
            addCriterion("checkstatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<Integer> values) {
            addCriterion("checkstatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(Integer value1, Integer value2) {
            addCriterion("checkstatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("checkstatus not between", value1, value2, "checkstatus");
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