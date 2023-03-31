package com.example.Project_soa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApi {
	
	@GetMapping("/test")
	public String index() {
		return "Test APi";
	}
	
	@GetMapping("/test/model")
	public TestModel getModel() {
		TestModel res = new TestModel();
		
		res.setName("Thitipon");
		res.setSurname("Sawangsri");
		res.setAge(20);
		
		return res;
		
		
	}
 
}
