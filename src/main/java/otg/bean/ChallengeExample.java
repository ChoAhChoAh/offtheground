package otg.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChallengeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public ChallengeExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
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
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andChallengeIdIsNull() {
            addCriterion("challenge_id is null");
            return (Criteria) this;
        }

        public Criteria andChallengeIdIsNotNull() {
            addCriterion("challenge_id is not null");
            return (Criteria) this;
        }

        public Criteria andChallengeIdEqualTo(Integer value) {
            addCriterion("challenge_id =", value, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdNotEqualTo(Integer value) {
            addCriterion("challenge_id <>", value, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdGreaterThan(Integer value) {
            addCriterion("challenge_id >", value, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("challenge_id >=", value, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdLessThan(Integer value) {
            addCriterion("challenge_id <", value, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdLessThanOrEqualTo(Integer value) {
            addCriterion("challenge_id <=", value, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdIn(List<Integer> values) {
            addCriterion("challenge_id in", values, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdNotIn(List<Integer> values) {
            addCriterion("challenge_id not in", values, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdBetween(Integer value1, Integer value2) {
            addCriterion("challenge_id between", value1, value2, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("challenge_id not between", value1, value2, "challengeId");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeIsNull() {
            addCriterion("challenge_code is null");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeIsNotNull() {
            addCriterion("challenge_code is not null");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeEqualTo(String value) {
            addCriterion("challenge_code =", value, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeNotEqualTo(String value) {
            addCriterion("challenge_code <>", value, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeGreaterThan(String value) {
            addCriterion("challenge_code >", value, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("challenge_code >=", value, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeLessThan(String value) {
            addCriterion("challenge_code <", value, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeLessThanOrEqualTo(String value) {
            addCriterion("challenge_code <=", value, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeLike(String value) {
            addCriterion("challenge_code like", value, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeNotLike(String value) {
            addCriterion("challenge_code not like", value, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeIn(List<String> values) {
            addCriterion("challenge_code in", values, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeNotIn(List<String> values) {
            addCriterion("challenge_code not in", values, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeBetween(String value1, String value2) {
            addCriterion("challenge_code between", value1, value2, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeCodeNotBetween(String value1, String value2) {
            addCriterion("challenge_code not between", value1, value2, "challengeCode");
            return (Criteria) this;
        }

        public Criteria andChallengeNameIsNull() {
            addCriterion("challenge_name is null");
            return (Criteria) this;
        }

        public Criteria andChallengeNameIsNotNull() {
            addCriterion("challenge_name is not null");
            return (Criteria) this;
        }

        public Criteria andChallengeNameEqualTo(String value) {
            addCriterion("challenge_name =", value, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameNotEqualTo(String value) {
            addCriterion("challenge_name <>", value, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameGreaterThan(String value) {
            addCriterion("challenge_name >", value, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameGreaterThanOrEqualTo(String value) {
            addCriterion("challenge_name >=", value, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameLessThan(String value) {
            addCriterion("challenge_name <", value, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameLessThanOrEqualTo(String value) {
            addCriterion("challenge_name <=", value, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameLike(String value) {
            addCriterion("challenge_name like", value, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameNotLike(String value) {
            addCriterion("challenge_name not like", value, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameIn(List<String> values) {
            addCriterion("challenge_name in", values, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameNotIn(List<String> values) {
            addCriterion("challenge_name not in", values, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameBetween(String value1, String value2) {
            addCriterion("challenge_name between", value1, value2, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeNameNotBetween(String value1, String value2) {
            addCriterion("challenge_name not between", value1, value2, "challengeName");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionIsNull() {
            addCriterion("challenge_descritpion is null");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionIsNotNull() {
            addCriterion("challenge_descritpion is not null");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionEqualTo(String value) {
            addCriterion("challenge_descritpion =", value, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionNotEqualTo(String value) {
            addCriterion("challenge_descritpion <>", value, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionGreaterThan(String value) {
            addCriterion("challenge_descritpion >", value, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionGreaterThanOrEqualTo(String value) {
            addCriterion("challenge_descritpion >=", value, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionLessThan(String value) {
            addCriterion("challenge_descritpion <", value, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionLessThanOrEqualTo(String value) {
            addCriterion("challenge_descritpion <=", value, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionLike(String value) {
            addCriterion("challenge_descritpion like", value, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionNotLike(String value) {
            addCriterion("challenge_descritpion not like", value, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionIn(List<String> values) {
            addCriterion("challenge_descritpion in", values, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionNotIn(List<String> values) {
            addCriterion("challenge_descritpion not in", values, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionBetween(String value1, String value2) {
            addCriterion("challenge_descritpion between", value1, value2, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andChallengeDescritpionNotBetween(String value1, String value2) {
            addCriterion("challenge_descritpion not between", value1, value2, "challengeDescritpion");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNull() {
            addCriterion("location_id is null");
            return (Criteria) this;
        }

        public Criteria andLocationIdIsNotNull() {
            addCriterion("location_id is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIdEqualTo(Integer value) {
            addCriterion("location_id =", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotEqualTo(Integer value) {
            addCriterion("location_id <>", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThan(Integer value) {
            addCriterion("location_id >", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("location_id >=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThan(Integer value) {
            addCriterion("location_id <", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("location_id <=", value, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdIn(List<Integer> values) {
            addCriterion("location_id in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotIn(List<Integer> values) {
            addCriterion("location_id not in", values, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdBetween(Integer value1, Integer value2) {
            addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andLocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("add_date is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("add_date is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterion("add_date =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterion("add_date <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterion("add_date >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("add_date >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterion("add_date <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterion("add_date <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterion("add_date in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterion("add_date not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterion("add_date between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterion("add_date not between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table challenge
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 28 22:15:09 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table challenge
     *
     * @mbg.generated Sat Dec 28 22:15:09 CST 2019
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