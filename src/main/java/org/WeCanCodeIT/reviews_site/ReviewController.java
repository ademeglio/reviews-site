package org.WeCanCodeIT.reviews_site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	
	@RequestMapping("/show-reviews")
	public String findAllCourses() { 
		
		return "reviews";
	}
} // End ReviewController()
