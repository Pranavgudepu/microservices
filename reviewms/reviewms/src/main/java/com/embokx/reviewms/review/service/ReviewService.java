package com.embokx.reviewms.review.service;

import com.embokx.reviewms.review.entity.Review;
import com.embokx.reviewms.review.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review getReview(Long reviewId) {
        return reviewRepository.findById(reviewId).orElse(null);
    }

    public Review upReviewByid(Long reviewId, Review review) {
        Review existingReview = reviewRepository.findById(reviewId).orElse(null);
        if (existingReview != null) {
            existingReview.setReview_title(review.getReview_title());
            existingReview.setReview_description(review.getReview_description());
            existingReview.setReview_rating(review.getReview_rating());
            existingReview.setCompany_id(review.getCompany_id());
            return reviewRepository.save(existingReview);
        }
        return null;
    }

    public void deleteReview(Long reviewId) {
        reviewRepository.deleteById(reviewId);
    }
}
