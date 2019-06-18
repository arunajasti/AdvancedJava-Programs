package com.aruna.jmsspring.receiver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMessageReceiverClient {

	public static void main(String[] args) {
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-jms-receiver.xml");
	}

}
