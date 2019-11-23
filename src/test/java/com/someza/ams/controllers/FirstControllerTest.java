package com.someza.ams.controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

@WebMvcTest
public class FirstControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test 
	public void Test1_home() throws Exception
	{
		this.mockMvc.perform(get("/home")).andExpect(status().isOk())
		.andExpect((ResultMatcher) containsString("favorite"));
	}
	
	
	
}
