package com.fintech.org.service;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fintech.org.dao.AppDao;
import com.fintech.org.model.AppUsers;


@Service
public class AppService {
	
	@Autowired
	private AppDao appDao;
	

	public String add(AppUsers appusers) {
		
		String message =" ";
		
		if(appusers.getPassword().equals(appusers.getConfirmPassword()))
		{
			message="password matched with confirmpassword";		
			 String email="^[a-zA-Z0-9]+@gmail.com";
			 Pattern pattern = Pattern.compile(email);
			 Matcher matcher = pattern.matcher(appusers.getEmail());
			 if(matcher.matches())
			 {
				 System.out.println("validated with domain name");
				 appusers=appDao.save(appusers);
				 message="registration succesfull";
				 activationLink(appusers);
				 
			 }
			 else
			 {
				 message="please provide valid domain";
			 }
		}
		else
		{
		 message="passwords not maatched";	
		}
		return message;
		
		
	}
	
	
	public void activationLink(AppUsers appusers)
	{
		final String username = "jdvikramreddy20@gmail.com";
        final String password = "9885565531";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        javax.mail.Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("jdvikramreddy20@gmail.com"));
            message.setRecipients(RecipientType.TO,
                InternetAddress.parse(appusers.getEmail()));
            message.setSubject("Testing Subject");
            message.setText("congrats your account is activated, you can use now"
                );
            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
		
      }
	

	public String login(AppUsers appUsers)
	{
		
	
		String message="";
		appUsers =appDao.findByEmailAndPassword(appUsers.getEmail(), appUsers.getPassword());
	if(appUsers!=null)
	{
		message="login sucesss ";
	}
	else 
	{
		message="give valid credentials";
	}
	
		
		return  message;
		
	}
	
	
	
	}


