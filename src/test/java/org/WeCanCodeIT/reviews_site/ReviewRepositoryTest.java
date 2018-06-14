package org.WeCanCodeIT.reviews_site;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewRepositoryTest {

	private Long reviewID = 1L;
	private Review review = new Review(reviewID, "review title", "url", "category", "content");
	
	@Test
	public void shouldFindAReview() {
		// Setup
		ReviewRepository underTest = new ReviewRepository(review);
		// Action
		Review result = underTest.findOne(reviewID);
		// Assert
		assertThat(result, is(review));
	}
	
} // End ReviewRepositoryTest()
