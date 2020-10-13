package mini.com.kh.tm1.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JoinPanel extends JPanel {

	private JLabel joinL,idL,pwL,pwCheckL,nameL,emailL,mailPwL;
	private JButton  joinB,idCheckB,homeB;
	private JTextField idT, pwT ,pwCheckT, nameT, emailT, mailPwT;

	public JoinPanel() {

		this.setSize(550, 650);
		this.setLayout(null);

		 joinL = new JLabel("회원가입");
		Font fi = new Font("맑은 고딕", Font.BOLD, 25);
		joinL.setFont(fi);
		joinL.setBounds(220, 40, 120, 35);
		this.add(joinL);

		idL = new JLabel("아이디");
		idL.setBounds(43, 146, 105, 36);
		this.add(idL);

		idT = new JTextField();
		idT.setColumns(10);
		idT.setBounds(148, 145, 257, 40);
		this.add(idT);

		 idCheckB = new JButton("중복확인");
		 idCheckB.setBounds(405, 145, 86, 39);
		this.add(idCheckB);

		 pwL = new JLabel("비밀번호");
		 pwL.setBounds(43, 186, 105, 36);
		this.add(pwL);

		pwT = new JTextField();
		pwT.setColumns(10);
		pwT.setBounds(148, 185, 344, 40);
		this.add(pwT);

		 pwCheckL = new JLabel("비밀번호 확인");
		 pwCheckL.setBounds(43, 226, 105, 36);
		this.add(pwCheckL);

		pwCheckT = new JTextField();
		pwCheckT.setColumns(10);
		pwCheckT.setBounds(148, 225, 344, 40);
		this.add(pwCheckT);

		 nameL = new JLabel("닉네임");
		 nameL.setBounds(43, 291, 105, 36);
		this.add(nameL);

		nameT = new JTextField();
		nameT.setColumns(10);
		nameT.setBounds(148, 290, 344, 40);
		this.add(nameT);

		 emailL = new JLabel("이메일");
		 emailL.setBounds(43, 356, 105, 36);
		this.add(emailL);

		emailT = new JTextField();
		emailT.setColumns(10);
		emailT.setBounds(148, 355, 344, 40);
		this.add(emailT);

		 mailPwL = new JLabel("이메일 비밀번호");
		 mailPwL.setBounds(43, 396, 105, 36);
		this.add(mailPwL);

		mailPwT = new JTextField();
		mailPwT.setColumns(10);
		mailPwT.setBounds(148, 395, 344, 40);
		this.add(mailPwT);

		joinB = new JButton("회원가입");
		joinB.setBounds(40, 480, 450, 40);
		
		homeB=new JButton("홈으로");
		homeB.setBounds(400, 550, 100, 50);
		
		this.add(homeB);
		this.add(joinB);

	}

	public JLabel getJoinL() {
		return joinL;
	}

	public void setJoinL(JLabel joinL) {
		this.joinL = joinL;
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

	public JLabel getPwCheckL() {
		return pwCheckL;
	}

	public void setPwCheckL(JLabel pwCheckL) {
		this.pwCheckL = pwCheckL;
	}

	public JLabel getNameL() {
		return nameL;
	}

	public void setNameL(JLabel nameL) {
		this.nameL = nameL;
	}

	public JLabel getEmailL() {
		return emailL;
	}

	public void setEmailL(JLabel emailL) {
		this.emailL = emailL;
	}

	public JLabel getMailPwL() {
		return mailPwL;
	}

	public void setMailPwL(JLabel mailPwL) {
		this.mailPwL = mailPwL;
	}

	public JButton getJoinB() {
		return joinB;
	}

	public void setJoinB(JButton joinB) {
		this.joinB = joinB;
	}

	public JButton getIdCheckB() {
		return idCheckB;
	}

	public void setIdCheckB(JButton idCheckB) {
		this.idCheckB = idCheckB;
	}

	public JButton getHomeB() {
		return homeB;
	}

	public void setHomeB(JButton homeB) {
		this.homeB = homeB;
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

	public JTextField getPwCheckT() {
		return pwCheckT;
	}

	public void setPwCheckT(JTextField pwCheckT) {
		this.pwCheckT = pwCheckT;
	}

	public JTextField getNameT() {
		return nameT;
	}

	public void setNameT(JTextField nameT) {
		this.nameT = nameT;
	}

	public JTextField getEmailT() {
		return emailT;
	}

	public void setEmailT(JTextField emailT) {
		this.emailT = emailT;
	}

	public JTextField getMailPwT() {
		return mailPwT;
	}

	public void setMailPwT(JTextField mailPwT) {
		this.mailPwT = mailPwT;
	}

}
