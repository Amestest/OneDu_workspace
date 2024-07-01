package com.khmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.khmall.mapper")
@SpringBootApplication
public class Sut1Application {

	public static void main(String[] args) {
		SpringApplication.run(Sut1Application.class, args);
	}

}
