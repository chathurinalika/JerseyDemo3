package com.demo.message.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.message.domain.Message;
import com.demo.message.service.MessageService;

@Path("/message")
public class MessageResource {
	
	MessageService msgService = new MessageService();

	/**
	 * This method used to demo @GET and response as JSON format
	 * URI is - http://localhost:8080/JerseyDemo3/demo/message
	 * 
	 * @return  XML formatted message list
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){			
		List<Message> msgList = msgService.getMessages();		
		return msgList;		
	}
	
	
	/**
	 * This method used to demo @GET with @PathParam and response as JSON format
	 * URI is - http://localhost:8080/JerseyDemo3/demo/message/1
	 * 
	 * @param id - message id 
	 * @return message of the input id
	 */
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessageById(@PathParam("id") long id){
		Message message = msgService.getMessage(id);
		return message;
	}
	
	
	/**
	 * This method used to demo @POST which consumes a simple JSON stream and response as JSON format
	 * URI is - http://localhost:8080/JerseyDemo3/demo/message
	 * Headers - Content-Type     application/json
	 * Body - {
  	 	        "message": "Test1"
	 	      }
	  
	 * @param message  - Send message including msgId
	 * @return - Added message with id	-	{
  												"message": "Test1",
  												"msgId": 4
											}
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessge(Message message){
		Message msg = msgService.addMessage(message);	
		return msg;		
	}
	
	/**
	 * This method used to demo @PUT and response as JSON format. User needs to enter specific message 
	 * id with request URI which wants to update
	 * URI is - http://localhost:8080/JerseyDemo3/demo/message/4
	 * Headers - Content-Type     application/json
	 * Body - {
  	 	        "message": "Updated Test1"
	 	      }
	 
	 * @param id -  message id 
	 * @param message - message that needs to update
	 * @return - Updated message with id -  {
  												"message": "Updated Test1",
  												"msgId": 4
											}
	 */
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("id") long id, Message message){
		message.setMsgId(id);
		Message msg = msgService.updatemMessage(message);
		 
		return msg;	
	}
	
	
}
