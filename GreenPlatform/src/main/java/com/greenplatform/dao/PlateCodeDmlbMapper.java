package com.greenplatform.dao;

import com.greenplatform.model.PlateCodeDmlb;
import com.greenplatform.model.PlateCodeDmlbExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PlateCodeDmlbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int countByExample(PlateCodeDmlbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int deleteByExample(PlateCodeDmlbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String cDmlb);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int insert(PlateCodeDmlb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int insertSelective(PlateCodeDmlb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    List<PlateCodeDmlb> selectByExample(PlateCodeDmlbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    PlateCodeDmlb selectByPrimaryKey(String cDmlb);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") PlateCodeDmlb record, @Param("example") PlateCodeDmlbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") PlateCodeDmlb record, @Param("example") PlateCodeDmlbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PlateCodeDmlb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plate_code_dmlb
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PlateCodeDmlb record);
}