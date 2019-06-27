package com.greenplatform.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlateUserYwqxExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public PlateUserYwqxExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
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

        public Criteria andCUseridIsNull() {
            addCriterion("c_userid is null");
            return (Criteria) this;
        }

        public Criteria andCUseridIsNotNull() {
            addCriterion("c_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCUseridEqualTo(String value) {
            addCriterion("c_userid =", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotEqualTo(String value) {
            addCriterion("c_userid <>", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThan(String value) {
            addCriterion("c_userid >", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridGreaterThanOrEqualTo(String value) {
            addCriterion("c_userid >=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThan(String value) {
            addCriterion("c_userid <", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLessThanOrEqualTo(String value) {
            addCriterion("c_userid <=", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridLike(String value) {
            addCriterion("c_userid like", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotLike(String value) {
            addCriterion("c_userid not like", value, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridIn(List<String> values) {
            addCriterion("c_userid in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotIn(List<String> values) {
            addCriterion("c_userid not in", values, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridBetween(String value1, String value2) {
            addCriterion("c_userid between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCUseridNotBetween(String value1, String value2) {
            addCriterion("c_userid not between", value1, value2, "cUserid");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmIsNull() {
            addCriterion("c_ywlxdm is null");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmIsNotNull() {
            addCriterion("c_ywlxdm is not null");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmEqualTo(String value) {
            addCriterion("c_ywlxdm =", value, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmNotEqualTo(String value) {
            addCriterion("c_ywlxdm <>", value, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmGreaterThan(String value) {
            addCriterion("c_ywlxdm >", value, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("c_ywlxdm >=", value, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmLessThan(String value) {
            addCriterion("c_ywlxdm <", value, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmLessThanOrEqualTo(String value) {
            addCriterion("c_ywlxdm <=", value, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmLike(String value) {
            addCriterion("c_ywlxdm like", value, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmNotLike(String value) {
            addCriterion("c_ywlxdm not like", value, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmIn(List<String> values) {
            addCriterion("c_ywlxdm in", values, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmNotIn(List<String> values) {
            addCriterion("c_ywlxdm not in", values, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmBetween(String value1, String value2) {
            addCriterion("c_ywlxdm between", value1, value2, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCYwlxdmNotBetween(String value1, String value2) {
            addCriterion("c_ywlxdm not between", value1, value2, "cYwlxdm");
            return (Criteria) this;
        }

        public Criteria andCSquserIsNull() {
            addCriterion("c_squser is null");
            return (Criteria) this;
        }

        public Criteria andCSquserIsNotNull() {
            addCriterion("c_squser is not null");
            return (Criteria) this;
        }

        public Criteria andCSquserEqualTo(String value) {
            addCriterion("c_squser =", value, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserNotEqualTo(String value) {
            addCriterion("c_squser <>", value, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserGreaterThan(String value) {
            addCriterion("c_squser >", value, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserGreaterThanOrEqualTo(String value) {
            addCriterion("c_squser >=", value, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserLessThan(String value) {
            addCriterion("c_squser <", value, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserLessThanOrEqualTo(String value) {
            addCriterion("c_squser <=", value, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserLike(String value) {
            addCriterion("c_squser like", value, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserNotLike(String value) {
            addCriterion("c_squser not like", value, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserIn(List<String> values) {
            addCriterion("c_squser in", values, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserNotIn(List<String> values) {
            addCriterion("c_squser not in", values, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserBetween(String value1, String value2) {
            addCriterion("c_squser between", value1, value2, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCSquserNotBetween(String value1, String value2) {
            addCriterion("c_squser not between", value1, value2, "cSquser");
            return (Criteria) this;
        }

        public Criteria andCCjuserIsNull() {
            addCriterion("c_cjuser is null");
            return (Criteria) this;
        }

        public Criteria andCCjuserIsNotNull() {
            addCriterion("c_cjuser is not null");
            return (Criteria) this;
        }

        public Criteria andCCjuserEqualTo(String value) {
            addCriterion("c_cjuser =", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotEqualTo(String value) {
            addCriterion("c_cjuser <>", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserGreaterThan(String value) {
            addCriterion("c_cjuser >", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserGreaterThanOrEqualTo(String value) {
            addCriterion("c_cjuser >=", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLessThan(String value) {
            addCriterion("c_cjuser <", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLessThanOrEqualTo(String value) {
            addCriterion("c_cjuser <=", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLike(String value) {
            addCriterion("c_cjuser like", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotLike(String value) {
            addCriterion("c_cjuser not like", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserIn(List<String> values) {
            addCriterion("c_cjuser in", values, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotIn(List<String> values) {
            addCriterion("c_cjuser not in", values, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserBetween(String value1, String value2) {
            addCriterion("c_cjuser between", value1, value2, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotBetween(String value1, String value2) {
            addCriterion("c_cjuser not between", value1, value2, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andDCjsjIsNull() {
            addCriterion("d_cjsj is null");
            return (Criteria) this;
        }

        public Criteria andDCjsjIsNotNull() {
            addCriterion("d_cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andDCjsjEqualTo(Date value) {
            addCriterion("d_cjsj =", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotEqualTo(Date value) {
            addCriterion("d_cjsj <>", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjGreaterThan(Date value) {
            addCriterion("d_cjsj >", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("d_cjsj >=", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjLessThan(Date value) {
            addCriterion("d_cjsj <", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjLessThanOrEqualTo(Date value) {
            addCriterion("d_cjsj <=", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjIn(List<Date> values) {
            addCriterion("d_cjsj in", values, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotIn(List<Date> values) {
            addCriterion("d_cjsj not in", values, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjBetween(Date value1, Date value2) {
            addCriterion("d_cjsj between", value1, value2, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotBetween(Date value1, Date value2) {
            addCriterion("d_cjsj not between", value1, value2, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andCXguserIsNull() {
            addCriterion("c_xguser is null");
            return (Criteria) this;
        }

        public Criteria andCXguserIsNotNull() {
            addCriterion("c_xguser is not null");
            return (Criteria) this;
        }

        public Criteria andCXguserEqualTo(String value) {
            addCriterion("c_xguser =", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotEqualTo(String value) {
            addCriterion("c_xguser <>", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserGreaterThan(String value) {
            addCriterion("c_xguser >", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserGreaterThanOrEqualTo(String value) {
            addCriterion("c_xguser >=", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLessThan(String value) {
            addCriterion("c_xguser <", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLessThanOrEqualTo(String value) {
            addCriterion("c_xguser <=", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLike(String value) {
            addCriterion("c_xguser like", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotLike(String value) {
            addCriterion("c_xguser not like", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserIn(List<String> values) {
            addCriterion("c_xguser in", values, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotIn(List<String> values) {
            addCriterion("c_xguser not in", values, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserBetween(String value1, String value2) {
            addCriterion("c_xguser between", value1, value2, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotBetween(String value1, String value2) {
            addCriterion("c_xguser not between", value1, value2, "cXguser");
            return (Criteria) this;
        }

        public Criteria andDXgsjIsNull() {
            addCriterion("d_xgsj is null");
            return (Criteria) this;
        }

        public Criteria andDXgsjIsNotNull() {
            addCriterion("d_xgsj is not null");
            return (Criteria) this;
        }

        public Criteria andDXgsjEqualTo(Date value) {
            addCriterion("d_xgsj =", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotEqualTo(Date value) {
            addCriterion("d_xgsj <>", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjGreaterThan(Date value) {
            addCriterion("d_xgsj >", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("d_xgsj >=", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjLessThan(Date value) {
            addCriterion("d_xgsj <", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjLessThanOrEqualTo(Date value) {
            addCriterion("d_xgsj <=", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjIn(List<Date> values) {
            addCriterion("d_xgsj in", values, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotIn(List<Date> values) {
            addCriterion("d_xgsj not in", values, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjBetween(Date value1, Date value2) {
            addCriterion("d_xgsj between", value1, value2, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotBetween(Date value1, Date value2) {
            addCriterion("d_xgsj not between", value1, value2, "dXgsj");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plate_user_ywqx
     *
     * @mbggenerated
     */
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