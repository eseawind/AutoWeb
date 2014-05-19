package com.care.mybatis.dao;

import com.care.mybatis.bean.UserOperateGroup;
import com.care.mybatis.bean.UserOperateGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOperateGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int countByExample(UserOperateGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByExample(UserOperateGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insert(UserOperateGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int insertSelective(UserOperateGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    List<UserOperateGroup> selectByExample(UserOperateGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    UserOperateGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExampleSelective(@Param("record") UserOperateGroup record, @Param("example") UserOperateGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByExample(@Param("record") UserOperateGroup record, @Param("example") UserOperateGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKeySelective(UserOperateGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_operate_group
     *
     * @mbggenerated Mon May 19 22:20:36 CST 2014
     */
    int updateByPrimaryKey(UserOperateGroup record);
}