package com.lucasdavi.emailservice.application;

import com.lucasdavi.emailservice.adapters.EmailSenderGateway;
import com.lucasdavi.emailservice.core.EmailSenderUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUserCase {
    @Autowired
    private EmailSenderGateway emailSenderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.senEmail(to, subject, body);
    }
}
