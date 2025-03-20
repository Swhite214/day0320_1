package com.kh.memo.service;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Dishservice {
	private final TodayMenuService mondayService;
	private final TodayMenuService tuesdayService;
	
	public Dishservice(
			@Qualifier("mondayService") TodayMenuService mondayService, 
			@Qualifier("tuesdayService")TodayMenuService tuesdayService) {
		this.mondayService = mondayService;
		this.tuesdayService = tuesdayService;
	}

	public TodayMenuService getTodayMenuService() {
		DayOfWeek day = LocalDate.now().getDayOfWeek();
		switch(day) {
		case MONDAY:
			
			return mondayService;
		case TUESDAY:
			return tuesdayService;
		default:
			throw new IllegalArgumentException("집좀가자");
		}
	}
	
}
//이게되네 ㅋㅋㅋㅋㅋㅋㅋㅋ 솔직히 될줄 몰랐는데