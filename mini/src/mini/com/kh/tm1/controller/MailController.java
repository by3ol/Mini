package mini.com.kh.tm1.controller;

import mini.com.kh.tm1.persistance.MailPersis;

public class MailController {

	
	MailPersis mp=new MailPersis();
	

	public void fileSave() {
		
		mp.fileSave();
	}
	
}
