package greta;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	private Logger log = Logger.getLogger(MessageService.class);
	
	@Autowired
	private MessageRepository messageRepository;
	
	public List<Message> getCurrentMessageForChannel(int channel) {
		return messageRepository.findByChannel(channel);
	}
	
	public List<Message> getPublishedMessagesForCurrentChannel(int channel, LocalDateTime publishDate) {
		return messageRepository.findByChannelAndPublishDateLessThanEqual(channel, publishDate);
	}
}
