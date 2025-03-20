package com.kh.memo.service;

import org.springframework.stereotype.Service;

@Service("tuesdayService")
public class TuesDayMenu implements TodayMenuService{

	@Override
	public String toDayMenu() {
		// TODO Auto-generated method stub
		return "화요일 : 짬뽕";
	}

	
}
