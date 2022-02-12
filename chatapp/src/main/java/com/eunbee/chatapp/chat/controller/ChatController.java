package com.eunbee.chatapp.chat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.eunbee.chatapp.chat.model.Chat;
import com.eunbee.chatapp.chat.service.ChatService;

@RestController
public class ChatController {
	@Autowired
	private ChatService chatservice;
	
	@GetMapping("/chats")
	public List<Chat> getAllChats(){
		return chatservice.getAllChats();
	}

	@GetMapping("/chats/{member_id}/auth/{auth}")
	public List<Chat> getChats(@PathVariable("member_id") String member_id, @PathVariable("auth") int auth){
		return chatservice.getChats(member_id, auth);
	}
	
	@GetMapping("/askedchats/{member_id}")
	public List<Chat> getAskedChats(@PathVariable("member_id") String member_id){
		return chatservice.getAskedChats(member_id);
	}
}