package org.jhj.myweb.service;

import org.jhj.myweb.domain.UserVO;

public interface UserService {
	public void registerUser(UserVO user) throws Exception;	// 회원가입
	public int idChk(UserVO vo) throws Exception;			// 아이디 중복 체크
	public UserVO login(UserVO vo) throws Exception;		// 로그인
}
