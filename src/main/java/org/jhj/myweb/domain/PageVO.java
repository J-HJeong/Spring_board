package org.jhj.myweb.domain;

public class PageVO {
	private int page;		// 현재 페이지 번호
	private int perPageNum;	// 한 페이지 당 보여줄 게시글 갯수
	
	// 특정 페이지의 게시글 시작 번호, 시작 행 번호
	public int getPageStart() {	
		return (this.page - 1) * perPageNum;
	}
	
	public PageVO() {
		this.page = 1;
		this.perPageNum = 10;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page <= 0)
			this.page = 1;
		else
			this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int pageCount) {
		int cnt = this.perPageNum;
		
		if(pageCount != cnt)
			this.perPageNum = cnt;
		else
			this.perPageNum = pageCount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "PageVO [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
	
}
