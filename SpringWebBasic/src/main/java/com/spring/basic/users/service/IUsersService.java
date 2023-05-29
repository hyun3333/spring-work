package com.spring.basic.users.service;

import org.apache.ibatis.annotations.Param;

import com.spring.basic.model.UsersVO;

public interface IUsersService {
	
	// 회원가입
	void join(UsersVO vo);
	
	// 로그인
	String login(String id);
	
	// 회원 정보 얻어오기
	UsersVO getInfo(String id);

}
