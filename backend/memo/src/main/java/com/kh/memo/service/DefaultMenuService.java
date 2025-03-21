package com.kh.memo.service;

import org.springframework.stereotype.Service;

@Service("defaultService")
public class DefaultMenuService implements TodayMenuService{

	@Override
	public String toDayMenu() {
		// TODO Auto-generated method stub
		return "오늘의 메뉴는 없어요 ^^";
	}

	
}
