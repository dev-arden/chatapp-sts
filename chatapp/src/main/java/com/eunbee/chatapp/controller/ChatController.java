package com.eunbee.chatapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eunbee.chatapp.dto.ChatDTO;
import com.eunbee.chatapp.service.ChatService;

@RestController
public class ChatController {
	@Autowired
	private ChatService chatservice;
	
	@GetMapping("/chats")
	public List<ChatDTO> getAllChats(){
		return chatservice.getAllChats();
	}
	
	@GetMapping("/chatstest")
	public List<String> getChatsTest(){
		return chatservice.getChatsTest();
	}
	
	@GetMapping("/chats/{id}")
	public List<String> getJoinedChats(@PathVariable("id") String id){
		return chatservice.getJoinedChats(id);
	}
	
	@GetMapping("/notjoinedchats/{id}")
	public List<String> getNotJoinedChats(@PathVariable("id") String id){
		return chatservice.getNotJoinedChats(id);
	}
	
	
	@GetMapping("/askedchats/{id}")
	public List<ChatDTO> getAskedChats(@PathVariable("id") String id){
		return chatservice.getAskedChats(id);
	}
}
