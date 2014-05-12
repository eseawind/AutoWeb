package com.care.mybatis.dao;

import com.care.mybatis.bean.UICorpDesc;
import com.care.mybatis.bean.UICorpDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UICorpDescMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int countByExample(UICorpDescExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int deleteByExample(UICorpDescExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int insert(UICorpDesc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int insertSelective(UICorpDesc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	List<UICorpDesc> selectByExample(UICorpDescExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	UICorpDesc selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int updateByExampleSelective(@Param("record") UICorpDesc record,
			@Param("example") UICorpDescExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int updateByExample(@Param("record") UICorpDesc record,
			@Param("example") UICorpDescExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int updateByPrimaryKeySelective(UICorpDesc record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ui_corp_desc
	 * @mbggenerated  Mon May 12 22:38:15 CST 2014
	 */
	int updateByPrimaryKey(UICorpDesc record);
}