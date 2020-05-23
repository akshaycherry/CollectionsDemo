package com.akshay.practice.maildemo;


	import java.util.*;  
	import javax.mail.*;  
	import javax.mail.internet.*;  
	import javax.activation.*;  
	  
	public class MailDemo {
	 public static void main(String [] args){  
	      String to = "tummalasrivinaya@gmail.com";//change accordingly  
	      String from = "n.akshay6666@gmail.com";//change accordingly  
	      String host = "localhost";//or IP address  
	  
	     //Get the session object  
	      Properties properties = new Properties();  
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.smtp.starttls.enable","true");
	      properties.put("mail.smtp.host","smtp.gmail.com");
	      properties.put("mail.smtp.port",587);
	      //properties.setProperty("mail.smtp.host", host);  
	      Session session = Session.getDefaultInstance(properties,new javax.mail.Authenticator() {
	    	  		protected PasswordAuthentication getPasswordAuthentication() {
	    	  			return new PasswordAuthentication("n.akshay6666@gmail.com","nakshay3451");
	    		  }
	    		  });  
	    
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	         message.setSubject("Ping");  
	         message.setText("Hello, this is example of sending email  ");  
	  
	       
	         Transport.send(message);  
	         System.out.println("message sent successfully....");  
	  
	      }catch (MessagingException mex) {mex.printStackTrace();}  
	   }  
	} 

