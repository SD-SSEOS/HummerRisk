package com.hummer.common.core.domain;

import java.io.Serializable;

public class ServerLynisResultDetail implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_lynis_result_detail.id
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_lynis_result_detail.lynis_id
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private String lynisId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_lynis_result_detail.create_time
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private Long createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_lynis_result_detail.operator
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_lynis_result_detail.type
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_lynis_result_detail.status
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_lynis_result_detail.order_index
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private Long orderIndex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column server_lynis_result_detail.output
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private String output;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table server_lynis_result_detail
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_lynis_result_detail.id
     *
     * @return the value of server_lynis_result_detail.id
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_lynis_result_detail.id
     *
     * @param id the value for server_lynis_result_detail.id
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_lynis_result_detail.lynis_id
     *
     * @return the value of server_lynis_result_detail.lynis_id
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public String getLynisId() {
        return lynisId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_lynis_result_detail.lynis_id
     *
     * @param lynisId the value for server_lynis_result_detail.lynis_id
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public void setLynisId(String lynisId) {
        this.lynisId = lynisId == null ? null : lynisId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_lynis_result_detail.create_time
     *
     * @return the value of server_lynis_result_detail.create_time
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_lynis_result_detail.create_time
     *
     * @param createTime the value for server_lynis_result_detail.create_time
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_lynis_result_detail.operator
     *
     * @return the value of server_lynis_result_detail.operator
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_lynis_result_detail.operator
     *
     * @param operator the value for server_lynis_result_detail.operator
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_lynis_result_detail.type
     *
     * @return the value of server_lynis_result_detail.type
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_lynis_result_detail.type
     *
     * @param type the value for server_lynis_result_detail.type
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_lynis_result_detail.status
     *
     * @return the value of server_lynis_result_detail.status
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_lynis_result_detail.status
     *
     * @param status the value for server_lynis_result_detail.status
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_lynis_result_detail.order_index
     *
     * @return the value of server_lynis_result_detail.order_index
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public Long getOrderIndex() {
        return orderIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_lynis_result_detail.order_index
     *
     * @param orderIndex the value for server_lynis_result_detail.order_index
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public void setOrderIndex(Long orderIndex) {
        this.orderIndex = orderIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column server_lynis_result_detail.output
     *
     * @return the value of server_lynis_result_detail.output
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public String getOutput() {
        return output;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column server_lynis_result_detail.output
     *
     * @param output the value for server_lynis_result_detail.output
     *
     * @mbg.generated Thu May 11 23:14:22 CST 2023
     */
    public void setOutput(String output) {
        this.output = output == null ? null : output.trim();
    }
}
