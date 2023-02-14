package com.hummer.common.mapper.mapper;

import com.hummer.common.core.domain.CloudTask;
import com.hummer.common.core.domain.CloudTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CloudTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    long countByExample(CloudTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    int deleteByExample(CloudTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    int insert(CloudTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    int insertSelective(CloudTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    List<CloudTask> selectByExample(CloudTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    CloudTask selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    int updateByExampleSelective(@Param("record") CloudTask record, @Param("example") CloudTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    int updateByExample(@Param("record") CloudTask record, @Param("example") CloudTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    int updateByPrimaryKeySelective(CloudTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_task
     *
     * @mbg.generated Tue Sep 20 12:33:42 CST 2022
     */
    int updateByPrimaryKey(CloudTask record);
}