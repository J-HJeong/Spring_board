package org.jhj.myweb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.jhj.myweb.domain.BoardVO;
import org.jhj.myweb.domain.PageVO;
import org.jhj.myweb.service.BoardService;
import org.jhj.paging.PageMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	@Autowired
    private BoardService boardService;
	
	// 게시글 목록
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model, PageVO vo) throws Exception{
		PageMaker pageMaker = new PageMaker();
		pageMaker.setPage(vo);
		pageMaker.setTotalCount(boardService.countBoard()); 	
		
		List<BoardVO> boardList = boardService.boardList(vo);
		model.addAttribute("boardList", boardList);
		model.addAttribute("pageMaker", pageMaker);
		model.addAttribute("page", vo);
		
		return "board/board_list";
	}
	
	// 게시글 확인
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String readGet(int boardnum, Model model) throws Exception{
    	model.addAttribute("read", boardService.read(boardnum));
    	return "board/read";
	}

	// 게시글 작성
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String writeGet() throws Exception{
		return "board/write";
	}
	
    @RequestMapping(value = "/write", method = RequestMethod.POST)
	public String writePost(BoardVO vo, HttpSession session) throws Exception{
    	vo.setBoardWriter((String)session.getAttribute("sessionID"));
    	boardService.write(vo);
    	return "redirect:/board/list";
	}
    
    // 게시글 수정
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String updateGet(int boardnum, Model model) throws Exception{
		model.addAttribute("board", boardService.selectBoard(boardnum));
		return "board/update";
	}
	
	 @RequestMapping(value = "/update", method = RequestMethod.POST)
	 public String updatePost(BoardVO vo, Model model) throws Exception{
	    boardService.update(vo);
	    return "redirect:/board/list";
	}
	 
	 // 게시글 삭제
	 @RequestMapping(value = "/delete", method = RequestMethod.GET)
	 public String deletePost(int boardnum) throws Exception{
	    boardService.delete(boardnum);
	    return "redirect:/board/list";
	}
}
