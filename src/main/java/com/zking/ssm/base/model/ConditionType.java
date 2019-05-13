package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ToString
public class ConditionType {
    private Integer conditionTypeId;

    private String conditionTypeName;

    List<Borrower> borrowerList;

    public ConditionType(Integer conditionTypeId, String conditionTypeName) {
        this.conditionTypeId = conditionTypeId;
        this.conditionTypeName = conditionTypeName;
    }

    public ConditionType() {
        super();
    }

    public Integer getConditionTypeId() {
        return conditionTypeId;
    }

    public void setConditionTypeId(Integer conditionTypeId) {
        this.conditionTypeId = conditionTypeId;
    }

    public String getConditionTypeName() {
        return conditionTypeName;
    }

    public void setConditionTypeName(String conditionTypeName) {
        this.conditionTypeName = conditionTypeName;
    }
}