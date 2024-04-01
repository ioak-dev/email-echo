package com.kafka.emailecho;

import com.kafka.emailecho.mail.integration.util.EmailEventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailEchoApplication implements CommandLineRunner {

	@Autowired
	private EmailEventListener emailEventListener;

	public static void main(String[] args) {
		SpringApplication.run(EmailEchoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		emailEventListener.listenForIncomingEmails();
	}


}
