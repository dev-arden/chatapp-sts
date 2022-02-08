package com.eunbee.chatapp.dto;

public class ChatDTO {
	private int id;
	private String name;
	private String member_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	@Override
	public String toString() {
		return "Chat [id=" + id + ", name=" + name + ", member_id = " + member_id + "]";
	}
}
