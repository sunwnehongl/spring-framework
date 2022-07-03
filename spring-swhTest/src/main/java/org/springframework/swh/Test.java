package org.springframework.swh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("swhTest.xml");
		Student student = context.getBean(Student.class);
		System.out.println("姓名："+student.getName());
		System.out.println("年龄："+student.getAge());
	}
}
