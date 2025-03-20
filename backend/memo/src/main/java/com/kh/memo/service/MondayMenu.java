package com.kh.memo.service;

import org.springframework.stereotype.Service;

@Service("mondayService")
public class MondayMenu implements TodayMenuService{

	@Override
	public String toDayMenu() {
		// TODO Auto-generated method stub
		return "월요일: 짜장면";
	}

	
}
