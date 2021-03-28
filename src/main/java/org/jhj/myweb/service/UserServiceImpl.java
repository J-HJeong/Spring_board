package org.jhj.myweb.service;

import org.jhj.myweb.domain.UserVO;
import org.jhj.myweb.persistence.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void registerUser(UserVO user) throws Exception {
		// 회원가입
		userDAO.register(user);
	}

	@Override
	public int idChk(UserVO vo) throws Exception {
		// 아이디 중복 체크
		return userDAO.idCheck(vo);
	}

	@Override
	public UserVO login(UserVO vo) throws Exception {
		// 로그인
		return userDAO.login(vo);
	}

}
