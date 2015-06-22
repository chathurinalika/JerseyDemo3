package com.demo.get.message.resource;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.get.message.domain.Message;
import com.demo.get.message.service.MessageService;

@Path("/message")
public class MessageResource {

	/**
	 * This method used to demo @POST and response as JSON format
	 * URI is - http://localhost:8080/JerseyDemo3/demo/message
	 * 
	 * @return  XML formatted message list
	 */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		
		MessageService msgService = new MessageService();
		List<Message> msgList = msgService.getMessage();
		
		return msgList;		
	}
}
