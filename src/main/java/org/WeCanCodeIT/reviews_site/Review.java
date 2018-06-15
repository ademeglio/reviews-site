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
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getImageURL() {
		return url;
	}
	
	public String getCategory() {
		return category;
	}
	
	public String getContent() {
		return content;
	}

	

	
	
}  // End Review()
