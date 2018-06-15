package org.WeCanCodeIT.reviews_site;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	// Build Database
	public ReviewRepository() {
		Review review1 = new Review(1L, "review title",
										"url", 
										"category", 
										"content");
		
		Review review2 = new Review(2L, "review title",
										"url", 
										"category", 
										"content");
		
		Review review3 = new Review(3L, "review title",
										"url", 
										"category", 
										"content");
		
		// add reviews to repository
		reviewList.put(review1.getReviewId(), review1);
		reviewList.put(review2.getReviewId(), review2);
		reviewList.put(review3.getReviewId(), review3);
	}
	
	
	// Constructor for testing
	public ReviewRepository(Review...reviews ) {
		for (Review review : reviews) {
			reviewList.put(review.getReviewId(), review);
		}
	}
	
	// Methods
	public Review findOne(Long reviewID) {
		return reviewList .get(reviewID);
	}

	public Collection<Review> findAll() {
		return reviewList.values();
	}

} // End ReviewRepository()
