package com.hummerrisk.base.mapper.ext;

import com.hummerrisk.base.domain.*;
import com.hummerrisk.controller.request.task.*;
import com.hummerrisk.dto.*;

import java.util.List;

public interface ExtTaskMapper {

    List<AccountVo> selectAccountByExample(AccountExample example);

    List<AccountVo> selectVulnByExample(AccountExample example);

    List<ServerVo> selectServerByExample(ServerExample example);

    List<ImageVo> selectImageByExample(ImageExample example);

    List<PackageVo> selectPackageByExample(PackageExample example);

    List<CodeVo> selectCodeByExample(CodeExample example);

    List<RuleVo> ruleList(RuleVo ruleVo);

    List<RuleVo> cloudRuleList(RuleVo ruleVo);

    List<RuleVo> vulnRuleList(RuleVo ruleVo);

    List<RuleVo> serverRuleList(RuleVo ruleVo);

    List<RuleVo> imageRuleList(RuleVo ruleVo);

    List<RuleVo> packageRuleList(RuleVo ruleVo);

    List<RuleVo> codeRuleList(RuleVo ruleVo);

    List<RuleVo> ruleTagList(RuleVo ruleVo);

    List<RuleVo> ruleGroupList(RuleVo ruleVo);

    RuleDTO cloudDetailRule(RuleVo ruleVo);

    RuleDTO vulnDetailRule(RuleVo ruleVo);

    ServerRuleDTO serverDetailRule(RuleVo ruleVo);

    ImageRuleDTO imageDetailRule(RuleVo ruleVo);

    PackageRuleDTO packageDetailRule(RuleVo ruleVo);

    CodeRuleDTO codeDetailRule(RuleVo ruleVo);

    List<TaskTagGroupDTO> detailTag(RuleVo ruleVo);

    List<TaskTagGroupDTO> detailGroup(RuleVo ruleVo);

    List<TaskVo> taskList(TaskRequest request);

    List<TaskLogVo> taskLogList(TaskRequest request);

    TaskReportDTO report(String id);
}
