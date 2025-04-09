package com.embokx.reviewms.review.controller;

import com.embokx.reviewms.review.entity.Review;
import com.embokx.reviewms.review.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public Review addReview(@RequestParam long companyId, @RequestBody Review review) {
        review.setCompany_id(companyId);
        return reviewService.createReview(review);
    }


    @GetMapping("/{reviewId}")
    public Review getReview(@PathVariable Long reviewId) {
        return reviewService.getReview(reviewId);
    }

    @PutMapping("/{reviewId}")
    public Review updateReview(@PathVariable Long reviewId, @RequestBody Review review) {
        return reviewService.upReviewByid(reviewId, review);
    }

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        reviewService.deleteReview(reviewId);
    }
}
