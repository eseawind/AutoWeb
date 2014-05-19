package com.care.mybatis.dao;

import com.care.mybatis.bean.UILink;
import com.care.mybatis.bean.UILinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UILinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int countByExample(UILinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByExample(UILinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insert(UILink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insertSelective(UILink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    List<UILink> selectByExample(UILinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    UILink selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExampleSelective(@Param("record") UILink record, @Param("example") UILinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExample(@Param("record") UILink record, @Param("example") UILinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKeySelective(UILink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ui_link
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKey(UILink record);
}