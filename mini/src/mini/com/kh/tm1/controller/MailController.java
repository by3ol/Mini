package mini.com.kh.tm1.controller;

import java.util.HashMap;

import mini.com.kh.tm1.model.vo.Person;

import javax.swing.JTextField;
import mini.com.kh.tm1.persistance.MailPersis;

public class MailController {


	MailPersis mp = new MailPersis();


	
	
	
	
	public void fileSave() {

		mp.fileSave();
	}

	// ------------- 한희원 코드 시작 ------------

	public boolean idCheck(String id) {

		return mp.idCheck(id);
	}

	// ------------ 한희원 코드 끝 ---------------

	// -----------윤우진 코드 시작 ------------

	public int idpwCheck(String id, String pw) {
		System.out.println(id+pw);
		return mp.idpwCheck(id,pw);
		
	}
	
	// =----------윤우진 코드 끝--------------



	
}
