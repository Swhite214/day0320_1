package com.kh.memo.domain.dto;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class MemoSaveDTO {
	//@requiredAtgsConstructor 붙이고 final붙이면 불변 즉 Record랑 흡사해집니다
	private String content;
	private String writer;
	
	
	//원래라면 기본생성자+Setter가있어야 파일을 받을수있는데 Getter만있어도 됨? 왜 바인딩기준이 Jackson이라서
}
