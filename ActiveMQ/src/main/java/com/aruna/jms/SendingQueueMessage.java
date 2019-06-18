package com.aruna.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;

public class SendingQueueMessage {
	public static void main(String[] args) throws JMSException
	{
		ConnectionFactory cf=new ActiveMQConnectionFactory("tcp://localhost:61616");
	
		Connection conn=null;
				Session session=null;
				try {
					conn=cf.createConnection();
					session=conn.createSession(true, session.AUTO_ACKNOWLEDGE);
			
					Destination destination=new ActiveMQQueue("FirstQueue");
					MessageProducer producer=session.createProducer(destination);
					
					TextMessage message=session.createTextMessage();
					
					message.setText("This is my First Queue Program");
					producer.send(message);
				/*	for (int i = 0; i < 10; i++)
				{
						message.setText("Aruna Message" + i);
						
					//if(i == 3)
					//{
					//int value = 10/0;
					//System.out.println("Value: " + value);
					//}
					producer.send(message);

				}*/
					session.commit();
					System.out.println("Message is sent to consumer");
					
				}catch(JMSException e)
				{
					e.printStackTrace();
					try {
						session.rollback();
					}catch(JMSException e1)
					{
						e1.printStackTrace();
					}
				}finally
				{
					try {
						 if(session!=null)
						  {
						session.close();
					      }
						 if(conn!=null)
						 {
							 conn.close();
						 }
					   }
					catch(JMSException ex)
					{
						   ex.printStackTrace();
					}
				}
				
	}

}
