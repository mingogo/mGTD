
package com.mteng.vo.updatedJSON;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "operatingEnvironment",
    "businessProfile"
})
public class Entity {

    @JsonProperty("name")
    private String name;
    @JsonProperty("operatingEnvironment")
    private OperatingEnvironment operatingEnvironment;
    @JsonProperty("businessProfile")
    private BusinessProfile businessProfile;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Entity withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("operatingEnvironment")
    public OperatingEnvironment getOperatingEnvironment() {
        return operatingEnvironment;
    }

    @JsonProperty("operatingEnvironment")
    public void setOperatingEnvironment(OperatingEnvironment operatingEnvironment) {
        this.operatingEnvironment = operatingEnvironment;
    }

    public Entity withOperatingEnvironment(OperatingEnvironment operatingEnvironment) {
        this.operatingEnvironment = operatingEnvironment;
        return this;
    }

    @JsonProperty("businessProfile")
    public BusinessProfile getBusinessProfile() {
        return businessProfile;
    }

    @JsonProperty("businessProfile")
    public void setBusinessProfile(BusinessProfile businessProfile) {
        this.businessProfile = businessProfile;
    }

    public Entity withBusinessProfile(BusinessProfile businessProfile) {
        this.businessProfile = businessProfile;
        return this;
    }

}
