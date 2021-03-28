package org.jhj.myweb.domain;

public class UserVO {

	private String userId;	// 아이디
	private String passwd; 	// 비밀번호
	private String mobile; 	// 핸드폰 번호 
	private String email;	// 이메일 주소
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "UserVO [ID=" + userId + ", Passwd=" + passwd + ", Mobile" + mobile + ", Email" + email + "]";
	}
}
