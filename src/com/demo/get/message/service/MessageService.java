package com.demo.get.message.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.demo.get.message.database.DatabaseClass;
import com.demo.get.message.domain.Message;

public class MessageService {
	
	private Map<Long, Message> messagesMap = DatabaseClass.getMessage();
	
	public MessageService(){
		messagesMap.put(1L, new Message(1, "AA"));
		messagesMap.put(2L, new Message(2, "BB"));
		messagesMap.put(3L, new Message(3, "CC"));
	}

	/**
	 * This method use to add some hard coded messages to a list
	 * 
	 * 
	 * @return  List of messages
	 */
	public List<Message> getMessage(){
				
		return new ArrayList<Message>(messagesMap.values());		
	}
	
	public Message getMessage(long id){
		return messagesMap.get(id);
	}
	
	public Message addMessage(Message message){
		message.setMsgId(messagesMap.size() + 1);
		messagesMap.put(message.getMsgId(), message);
		
		return message;		
	}
	
	public Message updatemMessage(Message message){
		if(message.getMsgId() <= 0){
			return null;
		}
		messagesMap.put(message.getMsgId(), message);
		return message;		
	}
	
	public Message removeMessage(long id){
		return messagesMap.remove(id);
	}
}
