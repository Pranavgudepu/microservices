package com.embokx.reviewms.review.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long review_id;
    private String review_title;
    private String review_description;
    private double review_rating;
    private long company_id;

    public Long getReview_id() {
        return review_id;
    }

    public void setReview_id(Long review_id) {
        this.review_id = review_id;
    }

    public String getReview_title() {
        return review_title;
    }

    public void setReview_title(String title) {
        this.review_title = title;
    }

    public String getReview_description() {
        return review_description;
    }

    public void setReview_description(String description) {
        this.review_description = description;
    }

    public double getReview_rating() {
        return review_rating;
    }

    public void setReview_rating(double rating) {
        this.review_rating = rating;
    }

    public long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(long company_id) {
        this.company_id = company_id;
    }
}
