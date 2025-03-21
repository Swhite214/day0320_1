package com.kh.memo.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kh.memo.service.TodayMenuService;

@Configuration
public class MenuConfig {

	@Bean("menuService")
	Map<String, TodayMenuService> menuService(
			@Qualifier("mondayService") TodayMenuService mondayService, 
			@Qualifier("tuesdayService")TodayMenuService tuesdayService,
			@Qualifier("defaultService")TodayMenuService defaultMenuService
			){
		return Map.of("monday",mondayService,"tuesday",tuesdayService,"default",defaultMenuService);
	}
}

//@Component 클래스는 컨테이너(ApplicationContext)에 보관
//싱글톤으로 생성해서 보관->Bean
//Configuration 내부의 @Bean methods 리턴타입을 Bean으로 관리
//@Component 붙이면 Bean
//근데 이미 제공받은 코드들은 수정이불가능하기에 @bean을 붙일것