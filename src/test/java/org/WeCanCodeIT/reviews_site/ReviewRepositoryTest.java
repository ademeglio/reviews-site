package org.WeCanCodeIT.reviews_site;

import org.junit.Test;

public class ReviewRepositoryTest {

	private Review review = new Review(1L, "review title", "url", "category", "content");
	
	@Test
	public void shouldFindAReview() {
		// Setup
		ReviewRepository underTest = new ReviewRepository(review);
	}
}
