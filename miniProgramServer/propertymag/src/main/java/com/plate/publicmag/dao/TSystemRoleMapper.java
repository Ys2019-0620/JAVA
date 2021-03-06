package com.plate.publicmag.dao;

import com.plate.publicmag.model.TSystemRole;
import com.plate.publicmag.model.TSystemRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSystemRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int countByExample(TSystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int deleteByExample(TSystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int insert(TSystemRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int insertSelective(TSystemRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    List<TSystemRole> selectByExample(TSystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    TSystemRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TSystemRole record, @Param("example") TSystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TSystemRole record, @Param("example") TSystemRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TSystemRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_system_role
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TSystemRole record);
}