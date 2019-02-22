package com.yk.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated
     */
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

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTNameIsNull() {
            addCriterion("t_name is null");
            return (Criteria) this;
        }

        public Criteria andTNameIsNotNull() {
            addCriterion("t_name is not null");
            return (Criteria) this;
        }

        public Criteria andTNameEqualTo(String value) {
            addCriterion("t_name =", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotEqualTo(String value) {
            addCriterion("t_name <>", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThan(String value) {
            addCriterion("t_name >", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_name >=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThan(String value) {
            addCriterion("t_name <", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLessThanOrEqualTo(String value) {
            addCriterion("t_name <=", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameLike(String value) {
            addCriterion("t_name like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotLike(String value) {
            addCriterion("t_name not like", value, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameIn(List<String> values) {
            addCriterion("t_name in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotIn(List<String> values) {
            addCriterion("t_name not in", values, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameBetween(String value1, String value2) {
            addCriterion("t_name between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTNameNotBetween(String value1, String value2) {
            addCriterion("t_name not between", value1, value2, "tName");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNull() {
            addCriterion("t_age is null");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNotNull() {
            addCriterion("t_age is not null");
            return (Criteria) this;
        }

        public Criteria andTAgeEqualTo(Integer value) {
            addCriterion("t_age =", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotEqualTo(Integer value) {
            addCriterion("t_age <>", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThan(Integer value) {
            addCriterion("t_age >", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_age >=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThan(Integer value) {
            addCriterion("t_age <", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThanOrEqualTo(Integer value) {
            addCriterion("t_age <=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeIn(List<Integer> values) {
            addCriterion("t_age in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotIn(List<Integer> values) {
            addCriterion("t_age not in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeBetween(Integer value1, Integer value2) {
            addCriterion("t_age between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_age not between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAddressIsNull() {
            addCriterion("t_address is null");
            return (Criteria) this;
        }

        public Criteria andTAddressIsNotNull() {
            addCriterion("t_address is not null");
            return (Criteria) this;
        }

        public Criteria andTAddressEqualTo(String value) {
            addCriterion("t_address =", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotEqualTo(String value) {
            addCriterion("t_address <>", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressGreaterThan(String value) {
            addCriterion("t_address >", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressGreaterThanOrEqualTo(String value) {
            addCriterion("t_address >=", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLessThan(String value) {
            addCriterion("t_address <", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLessThanOrEqualTo(String value) {
            addCriterion("t_address <=", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLike(String value) {
            addCriterion("t_address like", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotLike(String value) {
            addCriterion("t_address not like", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressIn(List<String> values) {
            addCriterion("t_address in", values, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotIn(List<String> values) {
            addCriterion("t_address not in", values, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressBetween(String value1, String value2) {
            addCriterion("t_address between", value1, value2, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotBetween(String value1, String value2) {
            addCriterion("t_address not between", value1, value2, "tAddress");
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