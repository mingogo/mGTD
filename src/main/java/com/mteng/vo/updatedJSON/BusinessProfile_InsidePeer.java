
package com.mteng.vo.updatedJSON;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "rating",
    "influence"
})
public class BusinessProfile_InsidePeer {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("rating")
    private Long rating;
    @JsonProperty("influence")
    private Long influence;

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public BusinessProfile_InsidePeer withId(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("rating")
    public Long getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Long rating) {
        this.rating = rating;
    }

    public BusinessProfile_InsidePeer withRating(Long rating) {
        this.rating = rating;
        return this;
    }

    @JsonProperty("influence")
    public Long getInfluence() {
        return influence;
    }

    @JsonProperty("influence")
    public void setInfluence(Long influence) {
        this.influence = influence;
    }

    public BusinessProfile_InsidePeer withInfluence(Long influence) {
        this.influence = influence;
        return this;
    }

}
