package com.hummer.common.core.domain;

import java.io.Serializable;

public class AccountWithBLOBs extends Account implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.credential
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2022
     */
    private String credential;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cloud_account.regions
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2022
     */
    private String regions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_account
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.credential
     *
     * @return the value of cloud_account.credential
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2022
     */
    public String getCredential() {
        return credential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.credential
     *
     * @param credential the value for cloud_account.credential
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2022
     */
    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cloud_account.regions
     *
     * @return the value of cloud_account.regions
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2022
     */
    public String getRegions() {
        return regions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cloud_account.regions
     *
     * @param regions the value for cloud_account.regions
     *
     * @mbg.generated Wed Apr 07 14:51:06 CST 2022
     */
    public void setRegions(String regions) {
        this.regions = regions == null ? null : regions.trim();
    }
}