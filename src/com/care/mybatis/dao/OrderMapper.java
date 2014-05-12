package com.care.mybatis.dao;

import com.care.mybatis.bean.Order;
import com.care.mybatis.bean.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int countByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int deleteByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int insert(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int insertSelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	List<Order> selectByExample(OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	Order selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int updateByExampleSelective(@Param("record") Order record,
			@Param("example") OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int updateByExample(@Param("record") Order record,
			@Param("example") OrderExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int updateByPrimaryKeySelective(Order record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table order
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int updateByPrimaryKey(Order record);
}