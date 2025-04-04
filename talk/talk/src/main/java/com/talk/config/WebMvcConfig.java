package com.talk.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	// WebMvcConfigurer 인터페이스는 
	// Spring Mvc 설정을 사용자(개발자) 정의하기위해 사용한다.
	// - 리소스 핸들러 설정 : 정적 리소스(css, javascript, 이미지, 파일 등)
	// 		에 대한 경로를 설정하고 캐싱정책을 적용한다.
	// - CORS : cross-origin resource sharing
	// 			 다른 도메인(주소-url)에서 현재 도메인(주소-url)으로 API 요청 허용하도록 설정
	// 뷰 컨트롤러 등록 : URL요청에 대해 뷰이름을 직접 매핑,
	// 				  컨트롤러 없이 뷰를 반환할 수 있음
	// 경로 패턴 설정 : URL 경로 패턴을 설정
}
