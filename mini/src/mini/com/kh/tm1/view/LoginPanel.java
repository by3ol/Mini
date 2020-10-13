package mini.com.kh.tm1.view;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
	
	
	JLabel title,idL,pwL;
	JTextField idT,pwT;
	JButton loginB,findIdB,findPwB,homeB;
	
	public LoginPanel() {		
		
		this.setSize(550,560);
		this.setLayout(null);
		
		
		title = new JLabel("로그인");
		title.setLocation(220, 20);
		title.setSize(400,40);
		title.setFont(new Font("맑은 고딕", Font.BOLD, 30));

		
		 idL = new JLabel("ID  ");
		 idL.setLocation(50,150);
		 idL.setSize(400,40);
		 idL.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		
		 idT = new JTextField(" ");
		 idT.setLocation(170, 150);
		 idT.setSize(330,40);
		 idT.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		 pwL = new JLabel("Password  ");
		 pwL.setLocation(50,200);
		 pwL.setSize(400,40);
		 pwL.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		 pwT = new JTextField("");
		 pwT.setLocation(170, 200);
		 pwT.setSize(330,40);
		 pwT.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		 loginB = new JButton("로그인 ");
		 loginB.setLocation(50, 300);
		 loginB.setSize(430, 40);
		 loginB.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		 loginB.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		
		 findIdB = new JButton("아이디 찾기 ");
		 findIdB.setLocation(50, 350);
		 findIdB.setSize(200, 40);
		//폰트 : 맑은고딕, 볼드체, 크기는 30
		 findIdB.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		//버튼1 위에 마우스를 올리면 대기중인 커서 모양으로 되도록 설정한다
		 findIdB.setCursor(new Cursor(Cursor.WAIT_CURSOR)); 
		
		findPwB = new JButton("비밀번호 찾기 ");
		findPwB.setLocation(280, 350);
		findPwB.setSize(200, 40);
		findPwB.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		findPwB.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		
		 homeB=new JButton("홈으로");
		homeB.setBounds(400, 520, 100, 50);

		
		//컨테이너에 생성한 컴포넌트 붙이기 
		this.add(idL);
		this.add(pwL);
		this.add(title);
		this.add(idT);
		this.add(pwT);
		this.add(loginB);
		this.add(findIdB);
		this.add(findPwB);
		this.add(homeB);
		
		

	}

	public JLabel getTitle() {
		return title;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JLabel getIdL() {
		return idL;
	}

	public void setIdL(JLabel idL) {
		this.idL = idL;
	}

	public JLabel getPwL() {
		return pwL;
	}

	public void setPwL(JLabel pwL) {
		this.pwL = pwL;
	}

	public JTextField getIdT() {
		return idT;
	}

	public void setIdT(JTextField idT) {
		this.idT = idT;
	}

	public JTextField getPwT() {
		return pwT;
	}

	public void setPwT(JTextField pwT) {
		this.pwT = pwT;
	}

	public JButton getLoginB() {
		return loginB;
	}

	public void setLoginB(JButton loginB) {
		this.loginB = loginB;
	}

	public JButton getFindIdB() {
		return findIdB;
	}

	public void setFindIdB(JButton findIdB) {
		this.findIdB = findIdB;
	}

	public JButton getFindPwB() {
		return findPwB;
	}

	public void setFindPwB(JButton findPwB) {
		this.findPwB = findPwB;
	}

	public JButton getHomeB() {
		return homeB;
	}

	public void setHomeB(JButton homeB) {
		this.homeB = homeB;
	}


}
