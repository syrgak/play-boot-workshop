package greta;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
    private String message;
    private LocalDateTime publishDate;
    private LocalDateTime unpublishDate;
    private Boolean dismissable;
    private int channel;

    protected Message() {
    }
    
    public Message(String message, LocalDateTime publishDate, int channel) {
    	this.message = message;
    	this.publishDate = publishDate;
    	this.channel = channel;
    }

    public long getId() {
        return id;
    }

	public String getMessage() {
		return message;
	}

	public LocalDateTime getPublishDate() {
		return publishDate;
	}

	public LocalDateTime getUnpublishDate() {
		return unpublishDate;
	}

	public Boolean getDismissable() {
		return dismissable;
	}

	public int getChannel() {
		return channel;
	}

	public void save() {
		
	}
}