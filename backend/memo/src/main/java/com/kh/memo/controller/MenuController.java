package com.kh.memo.controller;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.memo.service.TodayMenuService;

@RestController
//@RequiredArgsConstructor    //생성자대체용
public class MenuController {
	
	private final TodayMenuService service;

	
	@GetMapping("/today-menu")
	public String order() {
		return service.toDayMenu(); 
	}
	
	
	
	public MenuController(
			@Qualifier("menuServices") Map<String, TodayMenuService> menuService)
	{
		String dow = LocalDate.now().getDayOfWeek().name().toLowerCase();
	//service = menuService.get(dow)!=null?menuService.get("default"):menuService.get(dow);	
		TodayMenuService temp = menuService.get(dow);
		if(temp != null) {
			service=temp;
			return;
		}
		service=menuService.get("default");
	}
}
