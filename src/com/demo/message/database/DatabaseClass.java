package com.demo.message.database;

import java.util.HashMap;
import java.util.Map;

import com.demo.message.domain.Message;
import com.demo.message.domain.Profile;

public class DatabaseClass {

	//This is demo purpose only. Not tread safe
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessage() {
		return messages;
	}
	public static Map<Long, Profile> getProfile() {
		return profiles;
	}			
}
