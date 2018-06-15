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
		Review review1 = new Review(1L, "review title1",
										"FFR-818C.jpg", 
										"category1", 
										"content1");
		
		Review review2 = new Review(2L, "review title2",
										"url2", 
										"category2", 
										"content2");
		
		Review review3 = new Review(3L, "review title3",
										"url3", 
										"category3", 
										"content3");
		
		// add reviews to repository
		reviewList.put(review1.getId(), review1);
		reviewList.put(review2.getId(), review2);
		reviewList.put(review3.getId(), review3);
	}
	
	
	// Constructor for testing
	public ReviewRepository(Review...reviews ) {
		for (Review review : reviews) {
			reviewList.put(review.getId(), review);
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
