package com.eunbee.chatapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eunbee.chatapp.dao.ChatDAO;
import com.eunbee.chatapp.dto.ChatDTO;

@Service
public class ChatServiceImpl implements ChatService{
	@Autowired
	private ChatDAO chatdao;
	
	@Override
	public List<ChatDTO> getAllChats(){
		return chatdao.getAllChats();
	}
	
	@Override
	public List<String> getChatsTest(){
		return chatdao.getChatsTest();
	}
	
	@Override
	public List<String> getJoinedChats(String id){
		return chatdao.getJoinedChats(id);
	}
	
	@Override
	public List<String> getNotJoinedChats(String id){
		return chatdao.getNotJoinedChats(id);
	}
	
	@Override
	public List<ChatDTO> getAskedChats(String id){
		return chatdao.getAskedChats(id);
	}
}
