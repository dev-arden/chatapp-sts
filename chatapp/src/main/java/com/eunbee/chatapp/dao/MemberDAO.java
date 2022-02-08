package com.eunbee.chatapp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.eunbee.chatapp.dto.MemberDTO;

@Mapper
public interface MemberDAO {
	public void signUp(MemberDTO memberdto);
	public int logIn(MemberDTO memberdto);
}
