package com.aruna.jmsspring.sender;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMessageSenderClient {

	public static void main(String[] args) {
ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring-jms-sender.xml");

SpringMessageSender sender=(SpringMessageSender)ctx.getBean("messageSender");

Map<String, String> map=new HashMap<String, String>();
map.put("Name", "Aruna");
map.put("place", "Lincoln");

sender.send(map);
ctx.close();
System.out.println("Message has been sent");
	}

}
