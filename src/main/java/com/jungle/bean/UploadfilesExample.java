package com.jungle.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UploadfilesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadfilesExample() {
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

        public Criteria andFileidIsNull() {
            addCriterion("FileId is null");
            return (Criteria) this;
        }

        public Criteria andFileidIsNotNull() {
            addCriterion("FileId is not null");
            return (Criteria) this;
        }

        public Criteria andFileidEqualTo(Integer value) {
            addCriterion("FileId =", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotEqualTo(Integer value) {
            addCriterion("FileId <>", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThan(Integer value) {
            addCriterion("FileId >", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileId >=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThan(Integer value) {
            addCriterion("FileId <", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidLessThanOrEqualTo(Integer value) {
            addCriterion("FileId <=", value, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidIn(List<Integer> values) {
            addCriterion("FileId in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotIn(List<Integer> values) {
            addCriterion("FileId not in", values, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidBetween(Integer value1, Integer value2) {
            addCriterion("FileId between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFileidNotBetween(Integer value1, Integer value2) {
            addCriterion("FileId not between", value1, value2, "fileid");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionIsNull() {
            addCriterion("FileDescription is null");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionIsNotNull() {
            addCriterion("FileDescription is not null");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionEqualTo(String value) {
            addCriterion("FileDescription =", value, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionNotEqualTo(String value) {
            addCriterion("FileDescription <>", value, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionGreaterThan(String value) {
            addCriterion("FileDescription >", value, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("FileDescription >=", value, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionLessThan(String value) {
            addCriterion("FileDescription <", value, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionLessThanOrEqualTo(String value) {
            addCriterion("FileDescription <=", value, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionLike(String value) {
            addCriterion("FileDescription like", value, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionNotLike(String value) {
            addCriterion("FileDescription not like", value, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionIn(List<String> values) {
            addCriterion("FileDescription in", values, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionNotIn(List<String> values) {
            addCriterion("FileDescription not in", values, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionBetween(String value1, String value2) {
            addCriterion("FileDescription between", value1, value2, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFiledescriptionNotBetween(String value1, String value2) {
            addCriterion("FileDescription not between", value1, value2, "filedescription");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateIsNull() {
            addCriterion("FileCreateDate is null");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateIsNotNull() {
            addCriterion("FileCreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("FileCreateDate =", value, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("FileCreateDate <>", value, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("FileCreateDate >", value, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FileCreateDate >=", value, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateLessThan(Date value) {
            addCriterionForJDBCDate("FileCreateDate <", value, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FileCreateDate <=", value, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("FileCreateDate in", values, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("FileCreateDate not in", values, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FileCreateDate between", value1, value2, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilecreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FileCreateDate not between", value1, value2, "filecreatedate");
            return (Criteria) this;
        }

        public Criteria andFilekindIsNull() {
            addCriterion("FileKind is null");
            return (Criteria) this;
        }

        public Criteria andFilekindIsNotNull() {
            addCriterion("FileKind is not null");
            return (Criteria) this;
        }

        public Criteria andFilekindEqualTo(String value) {
            addCriterion("FileKind =", value, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindNotEqualTo(String value) {
            addCriterion("FileKind <>", value, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindGreaterThan(String value) {
            addCriterion("FileKind >", value, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindGreaterThanOrEqualTo(String value) {
            addCriterion("FileKind >=", value, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindLessThan(String value) {
            addCriterion("FileKind <", value, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindLessThanOrEqualTo(String value) {
            addCriterion("FileKind <=", value, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindLike(String value) {
            addCriterion("FileKind like", value, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindNotLike(String value) {
            addCriterion("FileKind not like", value, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindIn(List<String> values) {
            addCriterion("FileKind in", values, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindNotIn(List<String> values) {
            addCriterion("FileKind not in", values, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindBetween(String value1, String value2) {
            addCriterion("FileKind between", value1, value2, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilekindNotBetween(String value1, String value2) {
            addCriterion("FileKind not between", value1, value2, "filekind");
            return (Criteria) this;
        }

        public Criteria andFilemoduleIsNull() {
            addCriterion("FileModule is null");
            return (Criteria) this;
        }

        public Criteria andFilemoduleIsNotNull() {
            addCriterion("FileModule is not null");
            return (Criteria) this;
        }

        public Criteria andFilemoduleEqualTo(String value) {
            addCriterion("FileModule =", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleNotEqualTo(String value) {
            addCriterion("FileModule <>", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleGreaterThan(String value) {
            addCriterion("FileModule >", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleGreaterThanOrEqualTo(String value) {
            addCriterion("FileModule >=", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleLessThan(String value) {
            addCriterion("FileModule <", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleLessThanOrEqualTo(String value) {
            addCriterion("FileModule <=", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleLike(String value) {
            addCriterion("FileModule like", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleNotLike(String value) {
            addCriterion("FileModule not like", value, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleIn(List<String> values) {
            addCriterion("FileModule in", values, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleNotIn(List<String> values) {
            addCriterion("FileModule not in", values, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleBetween(String value1, String value2) {
            addCriterion("FileModule between", value1, value2, "filemodule");
            return (Criteria) this;
        }

        public Criteria andFilemoduleNotBetween(String value1, String value2) {
            addCriterion("FileModule not between", value1, value2, "filemodule");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameIsNull() {
            addCriterion("targetFileName is null");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameIsNotNull() {
            addCriterion("targetFileName is not null");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameEqualTo(String value) {
            addCriterion("targetFileName =", value, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameNotEqualTo(String value) {
            addCriterion("targetFileName <>", value, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameGreaterThan(String value) {
            addCriterion("targetFileName >", value, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("targetFileName >=", value, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameLessThan(String value) {
            addCriterion("targetFileName <", value, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameLessThanOrEqualTo(String value) {
            addCriterion("targetFileName <=", value, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameLike(String value) {
            addCriterion("targetFileName like", value, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameNotLike(String value) {
            addCriterion("targetFileName not like", value, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameIn(List<String> values) {
            addCriterion("targetFileName in", values, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameNotIn(List<String> values) {
            addCriterion("targetFileName not in", values, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameBetween(String value1, String value2) {
            addCriterion("targetFileName between", value1, value2, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andTargetfilenameNotBetween(String value1, String value2) {
            addCriterion("targetFileName not between", value1, value2, "targetfilename");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNull() {
            addCriterion("FileType is null");
            return (Criteria) this;
        }

        public Criteria andFiletypeIsNotNull() {
            addCriterion("FileType is not null");
            return (Criteria) this;
        }

        public Criteria andFiletypeEqualTo(String value) {
            addCriterion("FileType =", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotEqualTo(String value) {
            addCriterion("FileType <>", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThan(String value) {
            addCriterion("FileType >", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeGreaterThanOrEqualTo(String value) {
            addCriterion("FileType >=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThan(String value) {
            addCriterion("FileType <", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLessThanOrEqualTo(String value) {
            addCriterion("FileType <=", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeLike(String value) {
            addCriterion("FileType like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotLike(String value) {
            addCriterion("FileType not like", value, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeIn(List<String> values) {
            addCriterion("FileType in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotIn(List<String> values) {
            addCriterion("FileType not in", values, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeBetween(String value1, String value2) {
            addCriterion("FileType between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFiletypeNotBetween(String value1, String value2) {
            addCriterion("FileType not between", value1, value2, "filetype");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("FileSize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("FileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Integer value) {
            addCriterion("FileSize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Integer value) {
            addCriterion("FileSize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Integer value) {
            addCriterion("FileSize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FileSize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Integer value) {
            addCriterion("FileSize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Integer value) {
            addCriterion("FileSize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Integer> values) {
            addCriterion("FileSize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Integer> values) {
            addCriterion("FileSize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Integer value1, Integer value2) {
            addCriterion("FileSize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Integer value1, Integer value2) {
            addCriterion("FileSize not between", value1, value2, "filesize");
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