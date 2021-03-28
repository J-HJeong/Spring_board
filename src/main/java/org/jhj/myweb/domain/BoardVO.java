package org.jhj.myweb.domain;

public class BoardVO {
	private int boardNum;			// 게시글 번호
	private String boardTitle;		// 게시글 제목
	private String boardContent;	// 게시글 내용
	private int view_cnt;			// 게시글 조회수
	private String boardWriter;		// 게시글 작성자
	private String boardDate;		// 게시글 작성 날짜
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BoardVO [num=" + boardNum + ", title=" + boardTitle + ", content=" + boardContent + ", writer=" + boardWriter + ", date=" + boardDate + ", viewCount="
		+ view_cnt + "]";
	}
	
	
}
