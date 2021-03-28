package org.jhj.myweb.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.jhj.myweb.domain.BoardVO;
import org.jhj.myweb.domain.PageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.jhj.myweb.mapper.BoardMapper";

	@Override
	public void write(BoardVO vo) throws Exception {
		// 게시글 작성
		sqlSession.insert(namespace + ".write", vo);
		
	}

	@Override
	public BoardVO read(int boardnum) throws Exception {
		// 게시글 확인
		return sqlSession.selectOne(namespace + ".read", boardnum);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		// 게시글 수정
		sqlSession.update(namespace + ".update", vo);
	}

	@Override
	public void delete(int boardnum) throws Exception {
		// 게시글 삭제
		sqlSession.delete(namespace + ".delete", boardnum);
	}

	@Override
	public List<BoardVO> boardList(PageVO vo) throws Exception {
		return sqlSession.selectList(namespace + ".boardList", vo);
	}

	@Override
	public int countBoard() throws Exception {
		// 게시글 개수
		return sqlSession.selectOne(namespace + ".countBoard");
	}

	@Override
	public void boardViewCount(int boardnum) throws Exception {
		// 게시글 조회수
		sqlSession.update(namespace + ".viewCount", boardnum);
		
		// 트랜잭션 테스트 시 
		//throw new Exception("강제 오류");
	}

}
