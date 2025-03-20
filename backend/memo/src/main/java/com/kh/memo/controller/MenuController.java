package com.kh.memo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.memo.service.Dishservice;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor    //생성자대체용
public class MenuController {
	
	private final Dishservice service;
	
	@GetMapping("/today-menu")
	public String order() {
		return service.getTodayMenuService().toDayMenu(); 
	}
}
