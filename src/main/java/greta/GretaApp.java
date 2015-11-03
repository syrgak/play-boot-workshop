package greta;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GretaApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(GretaApp.class, args);
		MessageRepository messageRepository = (MessageRepository)applicationContext.getBean("messageRepository");
		
		messageRepository.save(new Message("Growl messasge 1", LocalDateTime.now(), 801));
		messageRepository.save(new Message("Growl messasge 2", LocalDateTime.now(), 1209));
	}
}
