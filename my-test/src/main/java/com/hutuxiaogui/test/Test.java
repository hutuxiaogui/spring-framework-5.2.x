package com.hutuxiaogui.test;

import com.hutuxiaogui.dao.UserDao;
import com.hutuxiaogui.utils.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AnnotationConfig.class);
		UserDao userDao = context.getBean(UserDao.class);
		userDao.printInfo();
	}
}
