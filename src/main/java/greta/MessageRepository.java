package greta;

import greta.Message;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {

	List<Message> findAll();

	List<Message> findByChannel(int channel);

	List<Message> findByChannelAndPublishDateLessThanEqual(int channel, LocalDateTime publishDate);
}