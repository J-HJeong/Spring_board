package org.jhj.myweb.persistence;

import org.jhj.myweb.domain.UserVO;

public interface UserDAO {
	public void register(UserVO vo) throws Exception;	// 회원가입
	public int idCheck(UserVO vo) throws Exception;		// 아이디 중복 체크
	public UserVO login(UserVO vo) throws Exception;	// 로그인
}
