package com.dev9.common;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Common {
	public static void main(String[] args) {
		log.info("모듈 common 프로젝트 : 공통 소스");
	}

	public String commonTest() {
		log.info("모듈 common 프로젝트 : 공통호출 :: commonTest ");
		return "[공통333]";
	}
}
