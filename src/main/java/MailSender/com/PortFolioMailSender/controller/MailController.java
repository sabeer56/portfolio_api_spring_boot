package MailSender.com.PortFolioMailSender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MailSender.com.PortFolioMailSender.service.MailService;
import MailSender.com.PortFolioMailSenderDto.MailStructure;

@RestController
@RequestMapping("/mail")
@CrossOrigin(origins = "https://sabeer56.github.io/") 
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMainMail(@RequestBody MailStructure mailStructure) {
        mailService.sendMail(mailStructure);
        return new ResponseEntity<>("Sent Successfully", HttpStatus.OK);
    }
}
