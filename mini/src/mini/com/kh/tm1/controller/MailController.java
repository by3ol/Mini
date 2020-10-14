package mini.com.kh.tm1.controller;

import java.util.HashMap;

import mini.com.kh.tm1.model.vo.Person;
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

}
