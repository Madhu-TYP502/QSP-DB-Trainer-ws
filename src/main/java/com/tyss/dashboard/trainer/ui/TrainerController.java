package com.tyss.dashboard.trainer.ui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trainer/")
public class TrainerController {
	
	@GetMapping
	public String status() 
	{
		return "working";
	}

}
