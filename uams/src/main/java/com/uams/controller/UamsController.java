package com.uams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uams.bean.About;

import lombok.extern.log4j.Log4j;

@RestController
@Log4j
@RequestMapping(value = "/uams")
public class UamsController {

	@GetMapping("/")
	public About about() {
		log.info("University Assignment Management System");
		return About.instance();
	}

}
