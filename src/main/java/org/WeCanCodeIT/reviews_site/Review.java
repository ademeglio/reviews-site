package org.WeCanCodeIT.reviews_site;

public class Review {

	// Instance Variables
	private Long id; // Review ID as Long
	private String title; // Review Title
	private String url; // Review URL Link to static image of object being reviewed
	private String category; // Review category
	private String content; // Review content

	//Constructor
	public Review(Long courseID, String reviewTitle, String ReviewImageUrl, String ReviewCategory, String ReviewContent) {
		this.id = courseID;
		this.title = reviewTitle;
		this.url = ReviewImageUrl;
		this.category = ReviewCategory;
		this.content = ReviewContent;
	}

	// Getters
	public Long getReviewId() {
		return id;
	}

	

	
	
}  // End Review()
