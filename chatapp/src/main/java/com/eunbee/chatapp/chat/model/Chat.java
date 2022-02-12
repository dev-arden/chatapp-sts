package com.eunbee.chatapp.chat.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chat {
	private int id; //chat_id
	private int auth; //authority
	private String name; //chat room name
	private String member_id; //member_id
	private String owner_id; //room owner member_id 
}
 