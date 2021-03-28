package org.jhj.myweb.persistence;

import java.util.List;

import org.jhj.myweb.domain.BoardVO;
import org.jhj.myweb.domain.PageVO;

public interface BoardDAO {
	public List<BoardVO> boardList(PageVO vo) throws Exception;		// 게시글 목록 확인
	public BoardVO read(int boardnum) throws Exception;				// 게시글 확인
	public void write(BoardVO vo) throws Exception;					// 게시글 작성
	public void update(BoardVO vo) throws Exception;				// 게시글 수정
	public void delete(int boardnum) throws Exception;				// 게시글 삭제
	public int countBoard() throws Exception;						// 게시글 개수
	public void boardViewCount(int boardnum) throws Exception;		// 게시글 조회수
}
