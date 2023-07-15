package kr.or.connect.reservation.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.reservation.config.ApplicationConfig;

public class CategoryServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CategoryService categoryService = ac.getBean(CategoryService.class);
		
		System.out.println(categoryService.getCategory());

	}

}
