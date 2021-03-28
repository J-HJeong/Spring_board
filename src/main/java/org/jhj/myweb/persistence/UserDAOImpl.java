package org.jhj.myweb.persistence;

import org.apache.ibatis.session.SqlSession;
import org.jhj.myweb.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.jhj.myweb.mapper.UserMapper";
	
	@Override
	public void register(UserVO vo) throws Exception {
		// 회원가입
		sqlSession.insert(namespace + ".register", vo);
	}

	@Override
	public int idCheck(UserVO vo) throws Exception {
		// 아이디 중복 체크
		return sqlSession.selectOne(namespace + ".idCheck", vo);
	}

	@Override
	public UserVO login(UserVO vo) throws Exception {
		// 로그인
		return sqlSession.selectOne(namespace + ".login", vo);
	}

}
