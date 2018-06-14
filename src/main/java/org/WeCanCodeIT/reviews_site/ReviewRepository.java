package org.WeCanCodeIT.reviews_site;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();

	// Constructor
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
