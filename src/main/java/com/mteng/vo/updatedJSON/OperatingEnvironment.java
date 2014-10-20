package com.mteng.vo.updatedJSON;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "factors",
    "subFactors"
})
public class OperatingEnvironment {

    @JsonProperty("factors")
    private List<Object> factors = new ArrayList<Object>();

    @JsonProperty("subFactors")
    private List<SubFactor> subFactors = new ArrayList<SubFactor>();

    @JsonProperty("factors")
    public List<Object> getFactors() {
        return factors;
    }

    @JsonProperty("factors")
    public void setFactors(List<Object> factors) {
        this.factors = factors;
    }

    @JsonProperty("subFactors")
    public List<SubFactor> getSubFactors() {
        return subFactors;
    }

    @JsonProperty("subFactors")
    public void setSubFactors(List<SubFactor> subFactors) {
        this.subFactors = subFactors;
    }
}