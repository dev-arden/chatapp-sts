package com.eunbee.chatapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eunbee.chatapp.dto.MemberDTO;
import com.eunbee.chatapp.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	private MemberService memberservice;
	
	@PostMapping("/members")
	public String signUp(@RequestBody MemberDTO memberdto) throws Exception{
		memberservice.signUp(memberdto);
		return "signup success";
	}
	
	/*
	 * @PostMapping("/register")
		public String registerMember(@ModelAttribute Member member, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

    		memberValidator.validate(member, bindingResult);
                   
		    // 검증에 실패하면 다시 입력 폼으로
		    if (bindingResult.hasErrors()) {
		        return "register";
		    }
		                   
		    // 성공 로직
		    redirectAttributes.addAttribute("memberId", member.getId());
		    redirectAttributes.addAttribute("successYn", "Y");
		    
		    return "redirect:/member/{memberId}";
		}
	 * 
	 * */
	
	
	
	//login
	@PostMapping("/member")
	public String member(@RequestBody MemberDTO memberdto) {
        memberdto.setId(memberdto.getId());
        memberdto.setPw(memberdto.getPw());
		
		if(memberservice.logIn(memberdto) == 1) {
			return "login success";
		} 
		
		return "login failed";
	}
}
