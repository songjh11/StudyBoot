package com.iu.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableAspectJAutoProxy 없어도 되는데 만약에 안되면 활성화하기
@EnableTransactionManagement
public class StudyBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyBootApplication.class, args);
	}

}
