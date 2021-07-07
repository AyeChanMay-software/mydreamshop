package javaee.spring.mydreamshop;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import javaee.spring.mydreamshop.controller.HomeController;

@WebMvcTest(HomeController.class)
public class HomeControllerTest {

	@Autowired
	public MockMvc mockMvc;
	
	@Test
	public void testHomeView() throws Exception {
		mockMvc.perform(get("/"))
	      .andExpect(status().isOk())
	      .andExpect(view().name("homeview"))
	      .andExpect(content().string(containsString("Welcome to...")));
	}
}
