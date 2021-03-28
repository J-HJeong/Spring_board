package org.jhj.paging;
import org.jhj.myweb.domain.PageVO;

public class PageMaker {
	private PageVO page;				// 현재 페이지 번호
	private int totalCount;				// 총 게시글 수
    private int startPage;				// 시작 페이지 번호
    private int endPage;				// 마지막 페이지 번호
    private boolean prev;				// 이전 버튼 생성 여부
    private boolean next;				// 다음 버튼 생성 여부
    private int displayPageNum = 5;		// 페이지 버튼 수

    public PageVO getPage() {		
    	return page;
    }
    
    public void setPage(PageVO page) {
    	this.page = page;
    }
    
    public int getTotalCount() {
    	return totalCount;
    }
    
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        pageData();
    }

    private void pageData() {
 
    	//끝 페이지 번호 = (현재 페이지 번호 / 화면에 보여질 페이지 번호의 갯수) * 화면에 보여질 페이지 번호의 갯수
        endPage = (int) (Math.ceil(page.getPage() / (double) displayPageNum) * displayPageNum);
 
     	//시작 페이지 번호 = (끝 페이지 번호 - 화면에 보여질 페이지 번호의 갯수) + 1
        startPage = (endPage - displayPageNum) + 1;
        if(startPage <= 0) startPage = 1;
        
        //마지막 페이지 번호 = 총 게시글 수 / 한 페이지당 보여줄 게시글의 갯수
        int tempEndPage = (int) (Math.ceil(totalCount / (double) page.getPerPageNum()));
        if (endPage > tempEndPage) {
            endPage = tempEndPage;
        }
 
        //이전 버튼은 시작 페이지 번호가 1이 아니면 생김
        prev = startPage == 1 ? false : true;
        next = endPage * page.getPerPageNum() < totalCount ? true : false;
    }

   public int getStartPage() {
       return startPage;
   }
   public void setStartPage(int startPage) {
       this.startPage = startPage;
   }
   public int getEndPage() {
       return endPage;
   }
   public void setEndPage(int endPage) {
       this.endPage = endPage;
   }
   public boolean isPrev() {
       return prev;
   }
   public void setPrev(boolean prev) {
       this.prev = prev;
   }
   public boolean isNext() {
       return next;
   }
   public void setNext(boolean next) {
       this.next = next;
   }
   public int getDisplayPageNum() {
       return displayPageNum;
   }
   public void setDisplayPageNum(int displayPageNum) {
       this.displayPageNum = displayPageNum;
   }

}
