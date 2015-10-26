package greta;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/message/current")
    public List<Message> current(@RequestParam(value="channel", required = false, defaultValue = "0") int channel) {
		return messageService.getPublishedMessagesForCurrentChannel(channel, LocalDateTime.now());
    }
}
