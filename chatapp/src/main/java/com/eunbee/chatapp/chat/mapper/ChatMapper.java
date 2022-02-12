package com.eunbee.chatapp.chat.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.eunbee.chatapp.chat.model.Chat;

@Mapper
public interface ChatMapper {
	public List<Chat> getAllChats();
	public List<Chat> getChats(String member_id, int auth);
	public List<Chat> getAskedChats(String member_id);
	
}
