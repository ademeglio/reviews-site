package org.WeCanCodeIT.reviews_site;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	// Constructor
	public ReviewRepository(Review review) {
		reviewList.put(review.getReviewId(), review);
	}
	
	// Methods
	public Review findOne(Long reviewID) {
		// TODO Auto-generated method stub
		return reviewList .get(reviewID);
	}

} // End ReviewRepository()
