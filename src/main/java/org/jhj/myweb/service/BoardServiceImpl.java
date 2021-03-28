package org.jhj.myweb.service;

import java.util.List;

import org.jhj.myweb.domain.BoardVO;
import org.jhj.myweb.domain.PageVO;
import org.jhj.myweb.persistence.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public void write(BoardVO vo) throws Exception {
		// 게시글 작성
		boardDAO.write(vo);
		
	}

	@Override
	public BoardVO read(int boardnum) throws Exception {
		// 게시글 조회수 
		boardDAO.boardViewCount(boardnum); 
		
		// 게시글 확인
		return boardDAO.read(boardnum);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		// 게시글 수정
		boardDAO.update(vo);
	}

	@Override
	public void delete(int boardnum) throws Exception {
		// 게시글 삭제
		boardDAO.delete(boardnum);
	}

	@Override
	public List<BoardVO> boardList(PageVO vo) throws Exception {
		// 게시글 목록
		return boardDAO.boardList(vo);
	}

	@Override
	public int countBoard() throws Exception {
		// 게시글 개수
		return boardDAO.countBoard();
	}

	@Override
	public BoardVO selectBoard(int boardnum) throws Exception {
		return boardDAO.read(boardnum);
	}

}
