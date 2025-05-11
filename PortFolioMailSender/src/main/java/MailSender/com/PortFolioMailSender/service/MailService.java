package MailSender.com.PortFolioMailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import MailSender.com.PortFolioMailSenderDto.MailStructure;

@Service
public class MailService {
    @Autowired
    private JavaMailSender javamailSender;

    @Value("${spring.mail.username}")
    private String mailTo;
	public void sendMail( MailStructure mailStructure) {
		 SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
	        
	        simpleMailMessage.setFrom(mailStructure.getEmailId()); 
	        simpleMailMessage.setTo(mailTo);     
	        simpleMailMessage.setSubject(mailStructure.getSubject());
	        simpleMailMessage.setText(mailStructure.getMessage()+"\n contact \n"+mailStructure.getMobileNumber());
	        
	        javamailSender.send(simpleMailMessage);
	}
}
