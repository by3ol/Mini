package mini.com.kh.tm1.model.vo;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1093950499545389213L;
	private String id;
	private String pw;
	private String email;
	private String emailPw;
	
	public Person() {
		
		
	}
	

	public Person(String id, String pw, String email, String emailPw) {
		this.id = id;
		this.pw = pw;
		this.email = email;
		this.emailPw = emailPw;
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
	
	
}
