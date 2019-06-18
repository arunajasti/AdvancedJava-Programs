package com.aruna.jmsspring.receiver;

import java.util.Enumeration;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

public class SpringMessageReceiver implements MessageListener {

	public void onMessage(final Message message) 
	{

if(message instanceof MapMessage)
{
	final MapMessage mapMessage=(MapMessage) message;
	System.out.println("Message Received==> " + mapMessage);

	try {
		Enumeration enumer=mapMessage.getMapNames();
		while(enumer.hasMoreElements())
		{
			System.out.println(mapMessage.getString(enumer.nextElement() + ""));
		}
		System.out.println(mapMessage.getString("Name"));
	}catch(JMSException e)
	{
		e.printStackTrace();
	}
}
	}

}
