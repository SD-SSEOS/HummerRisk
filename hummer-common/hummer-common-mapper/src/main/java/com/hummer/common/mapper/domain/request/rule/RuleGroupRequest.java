package com.hummer.common.mapper.domain.request.rule;


import com.hummer.common.mapper.domain.RuleGroup;

import java.util.Map;

/**
 * @author harris
 */
public class RuleGroupRequest extends RuleGroup {

    private String accountId;

    private Map<String, Object> combine;

    public Map<String, Object> getCombine() {
        return combine;
    }

    public void setCombine(Map<String, Object> combine) {
        this.combine = combine;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}