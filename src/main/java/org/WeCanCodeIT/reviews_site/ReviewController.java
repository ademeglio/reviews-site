package org.WeCanCodeIT.reviews_site;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	@Resource
	ReviewRepository reviewRepo;
	
	@RequestMapping("/show-reviews")
	public String findAllCourses(Model model) { 
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}
} // End ReviewController()
