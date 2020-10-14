package mini.com.kh.tm1.model.vo;

import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1093950499545389213L;
	private String id;
	private String pw;
	private String email;
	private String emailPw;
	// ----- 한희원 코드 추가 ----
	private String answer;
	// ----------------------

	public Person() {

	}

	public Person(String id, String pw, String email, String emailPw,/*코드 추가 >>*/ String answer) {
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.emailPw = emailPw;
		// ----- 한희원 코드 추가 ----
		this.answer = answer;
		//-----------------------
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailPw() {
		return emailPw;
	}

	public void setEmailPw(String emailPw) {
		this.emailPw = emailPw;
	}
//----------- 한희원 코드 시작 ---------------------
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
//-------------- 한희원 코드 끝 --------------------
}
