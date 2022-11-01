package com.hummerrisk.base.domain;

import java.util.ArrayList;
import java.util.List;

public class CloudNativeResultItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public CloudNativeResultItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(String value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(String value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(String value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(String value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(String value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLike(String value) {
            addCriterion("result_id like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotLike(String value) {
            addCriterion("result_id not like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<String> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<String> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(String value1, String value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(String value1, String value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdIsNull() {
            addCriterion("vulnerability_id is null");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdIsNotNull() {
            addCriterion("vulnerability_id is not null");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdEqualTo(String value) {
            addCriterion("vulnerability_id =", value, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdNotEqualTo(String value) {
            addCriterion("vulnerability_id <>", value, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdGreaterThan(String value) {
            addCriterion("vulnerability_id >", value, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdGreaterThanOrEqualTo(String value) {
            addCriterion("vulnerability_id >=", value, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdLessThan(String value) {
            addCriterion("vulnerability_id <", value, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdLessThanOrEqualTo(String value) {
            addCriterion("vulnerability_id <=", value, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdLike(String value) {
            addCriterion("vulnerability_id like", value, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdNotLike(String value) {
            addCriterion("vulnerability_id not like", value, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdIn(List<String> values) {
            addCriterion("vulnerability_id in", values, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdNotIn(List<String> values) {
            addCriterion("vulnerability_id not in", values, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdBetween(String value1, String value2) {
            addCriterion("vulnerability_id between", value1, value2, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andVulnerabilityIdNotBetween(String value1, String value2) {
            addCriterion("vulnerability_id not between", value1, value2, "vulnerabilityId");
            return (Criteria) this;
        }

        public Criteria andSeverityIsNull() {
            addCriterion("severity is null");
            return (Criteria) this;
        }

        public Criteria andSeverityIsNotNull() {
            addCriterion("severity is not null");
            return (Criteria) this;
        }

        public Criteria andSeverityEqualTo(String value) {
            addCriterion("severity =", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotEqualTo(String value) {
            addCriterion("severity <>", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityGreaterThan(String value) {
            addCriterion("severity >", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityGreaterThanOrEqualTo(String value) {
            addCriterion("severity >=", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLessThan(String value) {
            addCriterion("severity <", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLessThanOrEqualTo(String value) {
            addCriterion("severity <=", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLike(String value) {
            addCriterion("severity like", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotLike(String value) {
            addCriterion("severity not like", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityIn(List<String> values) {
            addCriterion("severity in", values, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotIn(List<String> values) {
            addCriterion("severity not in", values, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityBetween(String value1, String value2) {
            addCriterion("severity between", value1, value2, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotBetween(String value1, String value2) {
            addCriterion("severity not between", value1, value2, "severity");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andTargetIsNull() {
            addCriterion("target is null");
            return (Criteria) this;
        }

        public Criteria andTargetIsNotNull() {
            addCriterion("target is not null");
            return (Criteria) this;
        }

        public Criteria andTargetEqualTo(String value) {
            addCriterion("target =", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotEqualTo(String value) {
            addCriterion("target <>", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThan(String value) {
            addCriterion("target >", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetGreaterThanOrEqualTo(String value) {
            addCriterion("target >=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThan(String value) {
            addCriterion("target <", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLessThanOrEqualTo(String value) {
            addCriterion("target <=", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetLike(String value) {
            addCriterion("target like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotLike(String value) {
            addCriterion("target not like", value, "target");
            return (Criteria) this;
        }

        public Criteria andTargetIn(List<String> values) {
            addCriterion("target in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotIn(List<String> values) {
            addCriterion("target not in", values, "target");
            return (Criteria) this;
        }

        public Criteria andTargetBetween(String value1, String value2) {
            addCriterion("target between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andTargetNotBetween(String value1, String value2) {
            addCriterion("target not between", value1, value2, "target");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkIsNull() {
            addCriterion("primary_link is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkIsNotNull() {
            addCriterion("primary_link is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkEqualTo(String value) {
            addCriterion("primary_link =", value, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkNotEqualTo(String value) {
            addCriterion("primary_link <>", value, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkGreaterThan(String value) {
            addCriterion("primary_link >", value, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkGreaterThanOrEqualTo(String value) {
            addCriterion("primary_link >=", value, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkLessThan(String value) {
            addCriterion("primary_link <", value, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkLessThanOrEqualTo(String value) {
            addCriterion("primary_link <=", value, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkLike(String value) {
            addCriterion("primary_link like", value, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkNotLike(String value) {
            addCriterion("primary_link not like", value, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkIn(List<String> values) {
            addCriterion("primary_link in", values, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkNotIn(List<String> values) {
            addCriterion("primary_link not in", values, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkBetween(String value1, String value2) {
            addCriterion("primary_link between", value1, value2, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andPrimaryLinkNotBetween(String value1, String value2) {
            addCriterion("primary_link not between", value1, value2, "primaryLink");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionIsNull() {
            addCriterion("installed_version is null");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionIsNotNull() {
            addCriterion("installed_version is not null");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionEqualTo(String value) {
            addCriterion("installed_version =", value, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionNotEqualTo(String value) {
            addCriterion("installed_version <>", value, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionGreaterThan(String value) {
            addCriterion("installed_version >", value, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionGreaterThanOrEqualTo(String value) {
            addCriterion("installed_version >=", value, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionLessThan(String value) {
            addCriterion("installed_version <", value, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionLessThanOrEqualTo(String value) {
            addCriterion("installed_version <=", value, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionLike(String value) {
            addCriterion("installed_version like", value, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionNotLike(String value) {
            addCriterion("installed_version not like", value, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionIn(List<String> values) {
            addCriterion("installed_version in", values, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionNotIn(List<String> values) {
            addCriterion("installed_version not in", values, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionBetween(String value1, String value2) {
            addCriterion("installed_version between", value1, value2, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andInstalledVersionNotBetween(String value1, String value2) {
            addCriterion("installed_version not between", value1, value2, "installedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionIsNull() {
            addCriterion("fixed_version is null");
            return (Criteria) this;
        }

        public Criteria andFixedVersionIsNotNull() {
            addCriterion("fixed_version is not null");
            return (Criteria) this;
        }

        public Criteria andFixedVersionEqualTo(String value) {
            addCriterion("fixed_version =", value, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionNotEqualTo(String value) {
            addCriterion("fixed_version <>", value, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionGreaterThan(String value) {
            addCriterion("fixed_version >", value, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionGreaterThanOrEqualTo(String value) {
            addCriterion("fixed_version >=", value, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionLessThan(String value) {
            addCriterion("fixed_version <", value, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionLessThanOrEqualTo(String value) {
            addCriterion("fixed_version <=", value, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionLike(String value) {
            addCriterion("fixed_version like", value, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionNotLike(String value) {
            addCriterion("fixed_version not like", value, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionIn(List<String> values) {
            addCriterion("fixed_version in", values, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionNotIn(List<String> values) {
            addCriterion("fixed_version not in", values, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionBetween(String value1, String value2) {
            addCriterion("fixed_version between", value1, value2, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andFixedVersionNotBetween(String value1, String value2) {
            addCriterion("fixed_version not between", value1, value2, "fixedVersion");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andResourceIsNull() {
            addCriterion("`resource` is null");
            return (Criteria) this;
        }

        public Criteria andResourceIsNotNull() {
            addCriterion("`resource` is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEqualTo(String value) {
            addCriterion("`resource` =", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotEqualTo(String value) {
            addCriterion("`resource` <>", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThan(String value) {
            addCriterion("`resource` >", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThanOrEqualTo(String value) {
            addCriterion("`resource` >=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThan(String value) {
            addCriterion("`resource` <", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThanOrEqualTo(String value) {
            addCriterion("`resource` <=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLike(String value) {
            addCriterion("`resource` like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotLike(String value) {
            addCriterion("`resource` not like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceIn(List<String> values) {
            addCriterion("`resource` in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotIn(List<String> values) {
            addCriterion("`resource` not in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceBetween(String value1, String value2) {
            addCriterion("`resource` between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotBetween(String value1, String value2) {
            addCriterion("`resource` not between", value1, value2, "resource");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated do_not_delete_during_merge Wed Nov 02 06:56:21 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cloud_native_result_item
     *
     * @mbg.generated Wed Nov 02 06:56:21 CST 2022
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}