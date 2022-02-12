package com.eunbee.chatapp.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eunbee.chatapp.chat.mapper.ChatMapper;
import com.eunbee.chatapp.chat.model.Chat;

@Service
public class ChatService{
	@Autowired
	private ChatMapper chat;

	public List<Chat> getAllChats(){
		return chat.getAllChats();
	}
	
	public List<Chat> getChats(String member_id, int auth){
		return chat.getChats(member_id, auth);
	}

	public List<Chat> getAskedChats(String member_id){
		return chat.getAskedChats(member_id);
	}
}
