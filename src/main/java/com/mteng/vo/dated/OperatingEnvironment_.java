package com.mteng.vo.dated;

/**
 * This is the OperatingEnvironment in Peer element
 * @author mingogo
 *
 */
public class OperatingEnvironment_ {
    private Long id;
    private Long rating;
    private Long influence;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OperatingEnvironment_ withId(Long id) {
        this.id = id;
        return this;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public OperatingEnvironment_ withRating(Long rating) {
        this.rating = rating;
        return this;
    }

    public Long getInfluence() {
        return influence;
    }

    public void setInfluence(Long influence) {
        this.influence = influence;
    }

    public OperatingEnvironment_ withInfluence(Long influence) {
        this.influence = influence;
        return this;
    }
}
