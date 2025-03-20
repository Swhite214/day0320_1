package com.kh.memo.service;

import org.springframework.stereotype.Service;

import com.kh.memo.domain.dto.MemoSaveDTO;

@Service
public class MemoService {

	//DAO:데이터에 접근하는 객체가필요함 mybatis(xml): mapper가 담당/ jpa(자바의 ORM)(자바코드로만들어짐)
	public void create(MemoSaveDTO dto) {
		//입력된데이터를 DB에 저장
		
	}
//페이지 경로해주는거 controller
	//비지니스 로직 처리 service
}
