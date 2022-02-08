package com.eunbee.chatapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.eunbee.chatapp.dto.ChatDTO;

@Mapper
public interface ChatDAO {
	public List<ChatDTO> getAllChats();
	public List<String> getChatsTest();
	public List<String> getJoinedChats(String id);
	public List<String> getNotJoinedChats(String id);
	public List<ChatDTO> getAskedChats(String id);
}


