package com.hummerrisk.base.domain;

import java.io.Serializable;

public class HistoryImageTaskWithBLOBs extends HistoryImageTask implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_image_task.return_log
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    private String returnLog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column history_image_task.trivy_json
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    private String trivyJson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table history_image_task
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_image_task.return_log
     *
     * @return the value of history_image_task.return_log
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    public String getReturnLog() {
        return returnLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_image_task.return_log
     *
     * @param returnLog the value for history_image_task.return_log
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    public void setReturnLog(String returnLog) {
        this.returnLog = returnLog == null ? null : returnLog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column history_image_task.trivy_json
     *
     * @return the value of history_image_task.trivy_json
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    public String getTrivyJson() {
        return trivyJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column history_image_task.trivy_json
     *
     * @param trivyJson the value for history_image_task.trivy_json
     *
     * @mbg.generated Tue Sep 20 12:35:32 CST 2022
     */
    public void setTrivyJson(String trivyJson) {
        this.trivyJson = trivyJson == null ? null : trivyJson.trim();
    }
}