package com.care.mybatis.dao;

import com.care.mybatis.bean.AutoYear;
import com.care.mybatis.bean.AutoYearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoYearMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int countByExample(AutoYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByExample(AutoYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insert(AutoYear record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insertSelective(AutoYear record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    List<AutoYear> selectByExample(AutoYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    AutoYear selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExampleSelective(@Param("record") AutoYear record, @Param("example") AutoYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExample(@Param("record") AutoYear record, @Param("example") AutoYearExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKeySelective(AutoYear record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_year
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKey(AutoYear record);
}