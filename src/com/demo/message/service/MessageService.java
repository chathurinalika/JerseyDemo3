package com.demo.message.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.demo.message.database.DatabaseClass;
import com.demo.message.domain.Message;

public class MessageService {
	
	private Map<Long, Message> messagesMap = DatabaseClass.getMessage();
	
	public MessageService(){
		messagesMap.put(1L, new Message(1, "AA"));
		messagesMap.put(2L, new Message(2, "BB"));
		messagesMap.put(3L, new Message(3, "CC"));
	}

	/**
	 * This method use to get all messages
	 * 
	 * @return - List of messages
	 */
	public List<Message> getMessages(){
				
		return new ArrayList<Message>(messagesMap.values());		
	}
	
	/**
	 * This method use to get message by ID
	 * 
	 * @param id - message id 
	 * @return - message of requested id
	 */
	public Message getMessage(long id){
		return messagesMap.get(id);
	}
	
	/**
	 * This method use to add new messages
	 * 
	 * @param message - new message 
	 * @return - message including id 
	 */
	public Message addMessage(Message message){
		message.setMsgId(messagesMap.size() + 1);
		messagesMap.put(message.getMsgId(), message);
		
		return message;		
	}
	
	/**
	 * This method use to update message
	 * 
	 * @param message - message that needs to update
	 * @return updated message including id
	 */
	public Message updatemMessage(Message message){
		if(message.getMsgId() <= 0){
			return null;
		}
		messagesMap.put(message.getMsgId(), message);
		return message;		
	}
}
