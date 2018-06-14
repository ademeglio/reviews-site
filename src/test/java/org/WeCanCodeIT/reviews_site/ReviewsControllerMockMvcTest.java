package org.WeCanCodeIT.reviews_site;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(ReviewController.class)
public class ReviewsControllerMockMvcTest {

	@Resource
	private MockMvc mvc;
	
	@Test
	public void shouldBeOkForAllCourses() throws Exception {
		mvc.perform(get("/show-reviews")).andExpect(status().isOk());
		
	}
	
}
