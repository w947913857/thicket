package com.jungle.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClxjmainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClxjmainExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andType1IsNull() {
            addCriterion("type1 is null");
            return (Criteria) this;
        }

        public Criteria andType1IsNotNull() {
            addCriterion("type1 is not null");
            return (Criteria) this;
        }

        public Criteria andType1EqualTo(Boolean value) {
            addCriterion("type1 =", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotEqualTo(Boolean value) {
            addCriterion("type1 <>", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThan(Boolean value) {
            addCriterion("type1 >", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("type1 >=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThan(Boolean value) {
            addCriterion("type1 <", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1LessThanOrEqualTo(Boolean value) {
            addCriterion("type1 <=", value, "type1");
            return (Criteria) this;
        }

        public Criteria andType1In(List<Boolean> values) {
            addCriterion("type1 in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotIn(List<Boolean> values) {
            addCriterion("type1 not in", values, "type1");
            return (Criteria) this;
        }

        public Criteria andType1Between(Boolean value1, Boolean value2) {
            addCriterion("type1 between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("type1 not between", value1, value2, "type1");
            return (Criteria) this;
        }

        public Criteria andType2IsNull() {
            addCriterion("type2 is null");
            return (Criteria) this;
        }

        public Criteria andType2IsNotNull() {
            addCriterion("type2 is not null");
            return (Criteria) this;
        }

        public Criteria andType2EqualTo(Boolean value) {
            addCriterion("type2 =", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotEqualTo(Boolean value) {
            addCriterion("type2 <>", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThan(Boolean value) {
            addCriterion("type2 >", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("type2 >=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThan(Boolean value) {
            addCriterion("type2 <", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2LessThanOrEqualTo(Boolean value) {
            addCriterion("type2 <=", value, "type2");
            return (Criteria) this;
        }

        public Criteria andType2In(List<Boolean> values) {
            addCriterion("type2 in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotIn(List<Boolean> values) {
            addCriterion("type2 not in", values, "type2");
            return (Criteria) this;
        }

        public Criteria andType2Between(Boolean value1, Boolean value2) {
            addCriterion("type2 between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andType2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("type2 not between", value1, value2, "type2");
            return (Criteria) this;
        }

        public Criteria andBelongCityIsNull() {
            addCriterion("belong_city is null");
            return (Criteria) this;
        }

        public Criteria andBelongCityIsNotNull() {
            addCriterion("belong_city is not null");
            return (Criteria) this;
        }

        public Criteria andBelongCityEqualTo(String value) {
            addCriterion("belong_city =", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityNotEqualTo(String value) {
            addCriterion("belong_city <>", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityGreaterThan(String value) {
            addCriterion("belong_city >", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityGreaterThanOrEqualTo(String value) {
            addCriterion("belong_city >=", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityLessThan(String value) {
            addCriterion("belong_city <", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityLessThanOrEqualTo(String value) {
            addCriterion("belong_city <=", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityLike(String value) {
            addCriterion("belong_city like", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityNotLike(String value) {
            addCriterion("belong_city not like", value, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityIn(List<String> values) {
            addCriterion("belong_city in", values, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityNotIn(List<String> values) {
            addCriterion("belong_city not in", values, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityBetween(String value1, String value2) {
            addCriterion("belong_city between", value1, value2, "belongCity");
            return (Criteria) this;
        }

        public Criteria andBelongCityNotBetween(String value1, String value2) {
            addCriterion("belong_city not between", value1, value2, "belongCity");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigIsNull() {
            addCriterion("first_img_big is null");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigIsNotNull() {
            addCriterion("first_img_big is not null");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigEqualTo(String value) {
            addCriterion("first_img_big =", value, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigNotEqualTo(String value) {
            addCriterion("first_img_big <>", value, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigGreaterThan(String value) {
            addCriterion("first_img_big >", value, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigGreaterThanOrEqualTo(String value) {
            addCriterion("first_img_big >=", value, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigLessThan(String value) {
            addCriterion("first_img_big <", value, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigLessThanOrEqualTo(String value) {
            addCriterion("first_img_big <=", value, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigLike(String value) {
            addCriterion("first_img_big like", value, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigNotLike(String value) {
            addCriterion("first_img_big not like", value, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigIn(List<String> values) {
            addCriterion("first_img_big in", values, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigNotIn(List<String> values) {
            addCriterion("first_img_big not in", values, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigBetween(String value1, String value2) {
            addCriterion("first_img_big between", value1, value2, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgBigNotBetween(String value1, String value2) {
            addCriterion("first_img_big not between", value1, value2, "firstImgBig");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinIsNull() {
            addCriterion("first_img_min is null");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinIsNotNull() {
            addCriterion("first_img_min is not null");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinEqualTo(String value) {
            addCriterion("first_img_min =", value, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinNotEqualTo(String value) {
            addCriterion("first_img_min <>", value, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinGreaterThan(String value) {
            addCriterion("first_img_min >", value, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinGreaterThanOrEqualTo(String value) {
            addCriterion("first_img_min >=", value, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinLessThan(String value) {
            addCriterion("first_img_min <", value, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinLessThanOrEqualTo(String value) {
            addCriterion("first_img_min <=", value, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinLike(String value) {
            addCriterion("first_img_min like", value, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinNotLike(String value) {
            addCriterion("first_img_min not like", value, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinIn(List<String> values) {
            addCriterion("first_img_min in", values, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinNotIn(List<String> values) {
            addCriterion("first_img_min not in", values, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinBetween(String value1, String value2) {
            addCriterion("first_img_min between", value1, value2, "firstImgMin");
            return (Criteria) this;
        }

        public Criteria andFirstImgMinNotBetween(String value1, String value2) {
            addCriterion("first_img_min not between", value1, value2, "firstImgMin");
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

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andReserveNumIsNull() {
            addCriterion("reserve_num is null");
            return (Criteria) this;
        }

        public Criteria andReserveNumIsNotNull() {
            addCriterion("reserve_num is not null");
            return (Criteria) this;
        }

        public Criteria andReserveNumEqualTo(Integer value) {
            addCriterion("reserve_num =", value, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumNotEqualTo(Integer value) {
            addCriterion("reserve_num <>", value, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumGreaterThan(Integer value) {
            addCriterion("reserve_num >", value, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reserve_num >=", value, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumLessThan(Integer value) {
            addCriterion("reserve_num <", value, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumLessThanOrEqualTo(Integer value) {
            addCriterion("reserve_num <=", value, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumIn(List<Integer> values) {
            addCriterion("reserve_num in", values, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumNotIn(List<Integer> values) {
            addCriterion("reserve_num not in", values, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumBetween(Integer value1, Integer value2) {
            addCriterion("reserve_num between", value1, value2, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andReserveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reserve_num not between", value1, value2, "reserveNum");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("recommend is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("recommend is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Boolean value) {
            addCriterion("recommend =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Boolean value) {
            addCriterion("recommend <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Boolean value) {
            addCriterion("recommend >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Boolean value) {
            addCriterion("recommend >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Boolean value) {
            addCriterion("recommend <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Boolean value) {
            addCriterion("recommend <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Boolean> values) {
            addCriterion("recommend in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Boolean> values) {
            addCriterion("recommend not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Boolean value1, Boolean value2) {
            addCriterion("recommend not between", value1, value2, "recommend");
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
            addCriterion("checkStatus is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("checkStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(Integer value) {
            addCriterion("checkStatus =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(Integer value) {
            addCriterion("checkStatus <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(Integer value) {
            addCriterion("checkStatus >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkStatus >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(Integer value) {
            addCriterion("checkStatus <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(Integer value) {
            addCriterion("checkStatus <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<Integer> values) {
            addCriterion("checkStatus in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<Integer> values) {
            addCriterion("checkStatus not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(Integer value1, Integer value2) {
            addCriterion("checkStatus between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("checkStatus not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andAbbotIsNull() {
            addCriterion("abbot is null");
            return (Criteria) this;
        }

        public Criteria andAbbotIsNotNull() {
            addCriterion("abbot is not null");
            return (Criteria) this;
        }

        public Criteria andAbbotEqualTo(String value) {
            addCriterion("abbot =", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotNotEqualTo(String value) {
            addCriterion("abbot <>", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotGreaterThan(String value) {
            addCriterion("abbot >", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotGreaterThanOrEqualTo(String value) {
            addCriterion("abbot >=", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotLessThan(String value) {
            addCriterion("abbot <", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotLessThanOrEqualTo(String value) {
            addCriterion("abbot <=", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotLike(String value) {
            addCriterion("abbot like", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotNotLike(String value) {
            addCriterion("abbot not like", value, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotIn(List<String> values) {
            addCriterion("abbot in", values, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotNotIn(List<String> values) {
            addCriterion("abbot not in", values, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotBetween(String value1, String value2) {
            addCriterion("abbot between", value1, value2, "abbot");
            return (Criteria) this;
        }

        public Criteria andAbbotNotBetween(String value1, String value2) {
            addCriterion("abbot not between", value1, value2, "abbot");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNull() {
            addCriterion("opentime is null");
            return (Criteria) this;
        }

        public Criteria andOpentimeIsNotNull() {
            addCriterion("opentime is not null");
            return (Criteria) this;
        }

        public Criteria andOpentimeEqualTo(Date value) {
            addCriterion("opentime =", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotEqualTo(Date value) {
            addCriterion("opentime <>", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThan(Date value) {
            addCriterion("opentime >", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("opentime >=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThan(Date value) {
            addCriterion("opentime <", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("opentime <=", value, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeIn(List<Date> values) {
            addCriterion("opentime in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotIn(List<Date> values) {
            addCriterion("opentime not in", values, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeBetween(Date value1, Date value2) {
            addCriterion("opentime between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("opentime not between", value1, value2, "opentime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
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