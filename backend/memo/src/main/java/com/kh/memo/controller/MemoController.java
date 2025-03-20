package com.kh.memo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kh.memo.domain.dto.MemoSaveDTO;
import com.kh.memo.service.MemoService;

import lombok.extern.slf4j.Slf4j;





//2가지버전 controller rest controller(대충api서버 만들때 쓰임 data전달해주는기능이 주임 페이지 보여주는게 주가아니라)
@RestController
@Slf4j
public class MemoController {
	private MemoService service;
	//js:객체(Json) get(쿼리스트파라미터), post(from-data), 파일
	//requestbody body에서넘어온다는뜻
	//get,post(put,delete)
	//메모라는 내용 DB등저장 저장을 위한 통신
	//@RequestParam 개별적으로 받는 방법,어떤걸로 데이터 주고받냐에따라 앞에쓰는게 달라집니다 객체바인딩 지원(@RequestBody Json->class, @RequestAttribute form-data->class)
	//spring boot 3.0기준 , spring 5.0, java17, Record(불변객체)
	//spring boot 2.7기준, 객체 바인딩 기준 기본생성자+setter가 잇어야 받을수있습니다
	//바인딩기준: 생성자바인딩(@RequestBody->Jackson 처리), ObjectMapper mapper; 리플렉션기능->
	//valueObject=수정불가 =setter못만듬 그럼? @RequiredArgsConstructor말그대로 생성자를 통해서만 수정가능 즉 읽기전용임 그래서나온게? 레코드 레코드에는 setter가필요없어서 setter바인딩안먹어서 생성자 바인딩으로바뀜
	@PostMapping("/memo") //저장하기 위한 목적->저장할 데이터는 클라이언트가 보내줘야함
	public void create(@RequestBody MemoSaveDTO dto) {//저장할데이터를 받을수 있는 클래스
		//DTO==VO view->server(controller-> service)->DB
		//DTO 캡슐화하는게 보통임 탈취위험때문에
		//Record 통해서도 가능 자바14버전
		System.out.println(dto); //dto.writer() getter기능지원
//		Log.debug(">>>>>메세지 출력",dto);
		service.create(dto);
	}
	//uri동일하지만 request-method로 다르면 서로 식별됨
	@GetMapping("/memo")
	public List<?> listAll() {//?와Object의차이 Object는 class만가능 interface안됨
		return new ArrayList<String>();
	}
}
