package ch.uzh.ifi.hase.soprafs22.rest.dto;

import ch.uzh.ifi.hase.soprafs22.entity.User;

import java.util.Date;
import java.util.Set;

public class ImagePostDTO {

    private Long imageId;
    private User owner;
    private Set<User> ratedBy;
    private String name;
    private String location;
    private Date uploadDate;
    private double rating;
    private int ratingCounter;
    private String storageLink;
    private String classification;
    private Boolean reachedHighlights;


    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Set<User> getRatedBy() {
        return ratedBy;
    }

    public void setRatedBy(Set<User> ratedBy) {
        this.ratedBy = ratedBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getRatingCounter() {
        return ratingCounter;
    }

    public void setRatingCounter(int ratingCounter) {
        this.ratingCounter = ratingCounter;
    }

    public String getStorageLink() {
        return storageLink;
    }

    public void setStorageLink(String storageLink) {
        this.storageLink = storageLink;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public Boolean getReachedHighlights() {
        return reachedHighlights;
    }

    public void setReachedHighlights(Boolean reachedHighlights) {
        this.reachedHighlights = reachedHighlights;
    }
}
