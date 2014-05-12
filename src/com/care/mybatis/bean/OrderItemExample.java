package com.care.mybatis.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderItemExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public OrderItemExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andOIdIsNull() {
			addCriterion("o_id is null");
			return (Criteria) this;
		}

		public Criteria andOIdIsNotNull() {
			addCriterion("o_id is not null");
			return (Criteria) this;
		}

		public Criteria andOIdEqualTo(Integer value) {
			addCriterion("o_id =", value, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdNotEqualTo(Integer value) {
			addCriterion("o_id <>", value, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdGreaterThan(Integer value) {
			addCriterion("o_id >", value, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("o_id >=", value, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdLessThan(Integer value) {
			addCriterion("o_id <", value, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdLessThanOrEqualTo(Integer value) {
			addCriterion("o_id <=", value, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdIn(List<Integer> values) {
			addCriterion("o_id in", values, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdNotIn(List<Integer> values) {
			addCriterion("o_id not in", values, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdBetween(Integer value1, Integer value2) {
			addCriterion("o_id between", value1, value2, "oId");
			return (Criteria) this;
		}

		public Criteria andOIdNotBetween(Integer value1, Integer value2) {
			addCriterion("o_id not between", value1, value2, "oId");
			return (Criteria) this;
		}

		public Criteria andPIdIsNull() {
			addCriterion("p_id is null");
			return (Criteria) this;
		}

		public Criteria andPIdIsNotNull() {
			addCriterion("p_id is not null");
			return (Criteria) this;
		}

		public Criteria andPIdEqualTo(Integer value) {
			addCriterion("p_id =", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdNotEqualTo(Integer value) {
			addCriterion("p_id <>", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdGreaterThan(Integer value) {
			addCriterion("p_id >", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("p_id >=", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdLessThan(Integer value) {
			addCriterion("p_id <", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdLessThanOrEqualTo(Integer value) {
			addCriterion("p_id <=", value, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdIn(List<Integer> values) {
			addCriterion("p_id in", values, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdNotIn(List<Integer> values) {
			addCriterion("p_id not in", values, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdBetween(Integer value1, Integer value2) {
			addCriterion("p_id between", value1, value2, "pId");
			return (Criteria) this;
		}

		public Criteria andPIdNotBetween(Integer value1, Integer value2) {
			addCriterion("p_id not between", value1, value2, "pId");
			return (Criteria) this;
		}

		public Criteria andPQuantityIsNull() {
			addCriterion("p_quantity is null");
			return (Criteria) this;
		}

		public Criteria andPQuantityIsNotNull() {
			addCriterion("p_quantity is not null");
			return (Criteria) this;
		}

		public Criteria andPQuantityEqualTo(Integer value) {
			addCriterion("p_quantity =", value, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityNotEqualTo(Integer value) {
			addCriterion("p_quantity <>", value, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityGreaterThan(Integer value) {
			addCriterion("p_quantity >", value, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityGreaterThanOrEqualTo(Integer value) {
			addCriterion("p_quantity >=", value, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityLessThan(Integer value) {
			addCriterion("p_quantity <", value, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityLessThanOrEqualTo(Integer value) {
			addCriterion("p_quantity <=", value, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityIn(List<Integer> values) {
			addCriterion("p_quantity in", values, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityNotIn(List<Integer> values) {
			addCriterion("p_quantity not in", values, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityBetween(Integer value1, Integer value2) {
			addCriterion("p_quantity between", value1, value2, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPQuantityNotBetween(Integer value1, Integer value2) {
			addCriterion("p_quantity not between", value1, value2, "pQuantity");
			return (Criteria) this;
		}

		public Criteria andPPriceIsNull() {
			addCriterion("p_price is null");
			return (Criteria) this;
		}

		public Criteria andPPriceIsNotNull() {
			addCriterion("p_price is not null");
			return (Criteria) this;
		}

		public Criteria andPPriceEqualTo(Float value) {
			addCriterion("p_price =", value, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceNotEqualTo(Float value) {
			addCriterion("p_price <>", value, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceGreaterThan(Float value) {
			addCriterion("p_price >", value, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceGreaterThanOrEqualTo(Float value) {
			addCriterion("p_price >=", value, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceLessThan(Float value) {
			addCriterion("p_price <", value, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceLessThanOrEqualTo(Float value) {
			addCriterion("p_price <=", value, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceIn(List<Float> values) {
			addCriterion("p_price in", values, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceNotIn(List<Float> values) {
			addCriterion("p_price not in", values, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceBetween(Float value1, Float value2) {
			addCriterion("p_price between", value1, value2, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPPriceNotBetween(Float value1, Float value2) {
			addCriterion("p_price not between", value1, value2, "pPrice");
			return (Criteria) this;
		}

		public Criteria andPNameIsNull() {
			addCriterion("p_name is null");
			return (Criteria) this;
		}

		public Criteria andPNameIsNotNull() {
			addCriterion("p_name is not null");
			return (Criteria) this;
		}

		public Criteria andPNameEqualTo(String value) {
			addCriterion("p_name =", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameNotEqualTo(String value) {
			addCriterion("p_name <>", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameGreaterThan(String value) {
			addCriterion("p_name >", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameGreaterThanOrEqualTo(String value) {
			addCriterion("p_name >=", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameLessThan(String value) {
			addCriterion("p_name <", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameLessThanOrEqualTo(String value) {
			addCriterion("p_name <=", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameLike(String value) {
			addCriterion("p_name like", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameNotLike(String value) {
			addCriterion("p_name not like", value, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameIn(List<String> values) {
			addCriterion("p_name in", values, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameNotIn(List<String> values) {
			addCriterion("p_name not in", values, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameBetween(String value1, String value2) {
			addCriterion("p_name between", value1, value2, "pName");
			return (Criteria) this;
		}

		public Criteria andPNameNotBetween(String value1, String value2) {
			addCriterion("p_name not between", value1, value2, "pName");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table order_item
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table order_item
     *
     * @mbggenerated do_not_delete_during_merge Sat May 03 15:51:52 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}