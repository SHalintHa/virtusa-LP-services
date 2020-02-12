package com.shalintha.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shalintha.studentservice.service.StudentServiceImpl;

@RequestMapping("/service")
public class AllocationController {
	
	@Autowired
	StudentServiceImpl allocationServiceImpl;
	
}
