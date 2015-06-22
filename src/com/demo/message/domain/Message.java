package com.demo.message.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long msgId;
	private String message;
	
	public Message(){
		
	}
	
	public Message(long msgId, String message) {
		super();
		this.msgId = msgId;
		this.message = message;
	}
	
	public long getMsgId() {
		return msgId;
	}
	public void setMsgId(long msgId) {
		this.msgId = msgId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}	
}
