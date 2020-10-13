package mini.com.kh.tm1.view;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel extends JPanel{

	private JLabel title ,join,login,infoModi,receiveMailBox,sendMail,exit,info;
	public HomePanel() {
		
		this.setSize(550, 650);
		this.setLayout(null);
		
		
		title=new JLabel("같이가조의 메일 프로그램");
		
		title.setBounds(120, 20, 400, 50);
		title.setFont(new Font("맑은 고딕",Font.BOLD,30));
		
		
		join=new JLabel("회원가입");
		
		join.setBounds(30, 120, 200, 50);
		join.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		
		
		login=new JLabel("로그인");
			
		login.setBounds(30, 180, 200, 50);
		login.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		
		
		
		
		infoModi=new JLabel("회원정보수정");
		
		infoModi.setBounds(30, 240, 200, 50);
		infoModi.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		
		
		receiveMailBox=new JLabel("받은 메일함");
		
		receiveMailBox.setBounds(30, 300, 200, 50);
		receiveMailBox.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		

		sendMail=new JLabel("메일 쓰기");
		
		sendMail.setBounds(30, 360, 200, 50);
		sendMail.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		
		
		exit=new JLabel("종료");
		
		exit.setBounds(30, 500, 200, 50);
		exit.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		
		info=new JLabel("로그인이 필요합니다.");
		
		info.setBounds(250, 240, 200, 50);
		info.setFont(new Font("맑은 고딕",Font.PLAIN,15));
		
		this.add(sendMail);
		this.add(join);
		this.add(info);
		this.add(exit);
		this.add(receiveMailBox);
		this.add(infoModi);
		this.add(login);
		this.add(title);

	}
	public JLabel getTitle() {
		return title;
	}
	public void setTitle(JLabel title) {
		this.title = title;
	}
	public JLabel getLogin() {
		return login;
	}
	public void setLogin(JLabel login) {
		this.login = login;
	}
	public JLabel getInfoModi() {
		return infoModi;
	}
	public void setInfoModi(JLabel infoModi) {
		this.infoModi = infoModi;
	}
	public JLabel getReceiveMailBox() {
		return receiveMailBox;
	}
	public void setReceiveMailBox(JLabel receiveMailBox) {
		this.receiveMailBox = receiveMailBox;
	}

	public JLabel getSendMail() {
		return sendMail;
	}
	public void setSendMail(JLabel sendMail) {
		this.sendMail = sendMail;
	}
	public JLabel getExit() {
		return exit;
	}
	public void setExit(JLabel exit) {
		this.exit = exit;
	}
	public JLabel getInfo() {
		return info;
	}
	public void setInfo(JLabel info) {
		this.info = info;
	}
	public JLabel getJoin() {
		return join;
	}
	public void setJoin(JLabel join) {
		this.join = join;
	}


}
