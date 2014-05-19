package com.care.mybatis.dao;

import com.care.mybatis.bean.AutoVendor;
import com.care.mybatis.bean.AutoVendorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AutoVendorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int countByExample(AutoVendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByExample(AutoVendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insert(AutoVendor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insertSelective(AutoVendor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    List<AutoVendor> selectByExample(AutoVendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    AutoVendor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExampleSelective(@Param("record") AutoVendor record, @Param("example") AutoVendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExample(@Param("record") AutoVendor record, @Param("example") AutoVendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKeySelective(AutoVendor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auto_vendor
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKey(AutoVendor record);
}