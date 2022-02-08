package com.eunbee.chatapp.service;

import java.util.List;

import com.eunbee.chatapp.dto.ChatDTO;

public interface ChatService {
	public List<ChatDTO> getAllChats();
	public List<String> getChatsTest();
	public List<String> getJoinedChats(String id);
	public List<String> getNotJoinedChats(String id);
	public List<ChatDTO> getAskedChats(String id);
}
