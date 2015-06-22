package com.demo.get.message.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long msgId;
	private String message;
	private Date date;
	
	public Message(){
		
	}
	
	public Message(long msgId, String message) {
		super();
		this.msgId = msgId;
		this.message = message;
		this.date = new Date();
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
		
}
