package com.eunbee.chatapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eunbee.chatapp.dao.MemberDAO;
import com.eunbee.chatapp.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberdao;
	
	@Override
	public void signUp(MemberDTO memberdto) {
		memberdao.signUp(memberdto);
	}
	
	@Override
	public int logIn(MemberDTO memberdto) {
		return memberdao.logIn(memberdto);
	}
	
}
