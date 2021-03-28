package org.jhj.myweb.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jhj.myweb.domain.UserVO;
import org.jhj.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
    private UserService userService;
	
	HttpSession session = null;
	
	// 회원가입
	@RequestMapping(value = {"/register"}, method = RequestMethod.GET)
	public String createUserGet() throws Exception {
		return "user/register";
	}

    @RequestMapping(value = {"/register"}, method = RequestMethod.POST)
	public String createUserPost(UserVO vo, HttpServletResponse response) throws Exception {
    	response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
    	int result = userService.idChk(vo);
    	try {
    		if(result == 1) {
    			out.println("<script>");
    			out.println("alert('중복된 아이디 입니다.');");
    			out.println("history.go(-1);");
    			out.println("</script>");
    			out.close();
    			return "user/register";
    		}else {
    			userService.registerUser(vo);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return "user/result";
	}
    
	
	// 아이디 중복 체크
    @ResponseBody
    @RequestMapping(value= "/idChk", method = RequestMethod.POST)
    public int idChk(UserVO vo) throws Exception{
    	int result = userService.idChk(vo);
    	return result;
    }
    
    // 로그인
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginGet() throws Exception {
		return "user/login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(UserVO vo, HttpServletRequest req, RedirectAttributes rttr, HttpServletResponse response) throws Exception{
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		session = req.getSession();
		UserVO login = userService.login(vo);
		
		if(login == null) {
			out.println("<script>");
			out.println("alert('로그인 실패');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return "user/login";
		}else {
			session.setAttribute("sessionID", login.getUserId());
		}
		
		return "redirect:/";
	}
	
	// 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest req) throws Exception {
		session = req.getSession();
		session.setAttribute("sessionID", null);
		return "welcome";
	}
}
