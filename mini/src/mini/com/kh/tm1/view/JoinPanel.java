package mini.com.kh.tm1.view;

import java.awt.Choice;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JoinPanel extends JPanel {

	private JLabel joinL, idL, pwL, pwCheckL, nameL, emailL, mailPwL, quizL, answerL;
	private Choice quizT, emailListT;
	private JButton joinB, idCheckB, homeB;
	private JTextField idT, nameT, emailT, emailT_2, mailPwT, answerT;
	private JPasswordField pwT, pwCheckT;

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

		pwT = new JPasswordField();
		pwT.setColumns(10);
		pwT.setBounds(148, 185, 344, 40);
		this.add(pwT);

		pwCheckL = new JLabel("비밀번호 확인");
		pwCheckL.setBounds(43, 226, 105, 36);
		this.add(pwCheckL);

		pwCheckT = new JPasswordField();
		pwCheckT.setColumns(10);
		pwCheckT.setBounds(148, 225, 344, 40);
		this.add(pwCheckT);

		nameL = new JLabel("이 름");
		nameL.setBounds(43, 266, 105, 36);
		this.add(nameL);

		nameT = new JTextField();
		nameT.setColumns(10);
		nameT.setBounds(148, 265, 344, 40);
		this.add(nameT);

// ------------ 한희원 코드 시작 --------------------		

		quizL = new JLabel("질 문");
		quizL.setBounds(43, 305, 105, 36);
		this.add(quizL);

		Choice quizT = new Choice();
		quizT.add("본인의 보물 1호는?");
		quizT.add("본인의 아버지 성함은?");
		quizT.add("본인의 어머니 성함은?");
		quizT.add("본인이 좋아하는 과일은?");
		quizT.add("가장 인상깊게 읽은 책 제목은?");
		quizT.add("가장 인상깊게 본 영화 제목은?");
		quizT.setBounds(148, 314, 343, 40);
		this.add(quizT);

		answerL = new JLabel("정 답");
		answerL.setBounds(43, 338, 105, 36);
		this.add(answerL);

		answerT = new JTextField();
		answerT.setColumns(10);
		answerT.setBounds(148, 338, 344, 40);
		this.add(answerT);

// ---------------- 한희원 코드 끝 -------------------		

		emailL = new JLabel("이메일");
		emailL.setBounds(43, 386, 105, 36);
		this.add(emailL);

		emailT = new JTextField();
		emailT.setColumns(10);
		emailT.setBounds(148, 385, 344, 40);
		this.add(emailT);

		mailPwL = new JLabel("이메일 비밀번호");
		mailPwL.setBounds(43, 426, 105, 36);
		this.add(mailPwL);

		mailPwT = new JTextField();
		mailPwT.setColumns(10);
		mailPwT.setBounds(148, 425, 344, 40);
		this.add(mailPwT);

		joinB = new JButton("회원가입");
		joinB.setBounds(40, 500, 450, 40);

		homeB = new JButton("홈으로");
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

// --------------- 한희원 코드 시작 ------------------	

	public JLabel getAnswerL() {
		return answerL;
	}

	public void setAnswerL(JLabel answerL) {
		this.answerL = answerL;
	}

	public JLabel getQizeL() {
		return quizL;
	}

	public void setQizeL(JLabel quizL) {
		this.quizL = quizL;
	}

// -------------- 한희원 코드 끝 ---------------------	

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

	public void setPwT(JPasswordField pwT) {
		this.pwT = pwT;
	}

	public JTextField getPwCheckT() {
		return pwCheckT;
	}

	public void setPwCheckT(JPasswordField pwCheckT) {
		this.pwCheckT = pwCheckT;
	}

	public JTextField getNameT() {
		return nameT;
	}

	public void setNameT(JTextField nameT) {
		this.nameT = nameT;
	}

// ----------- 한희원 코드 시작 ------------------	

	public Choice getQuizT() {
		return quizT;
	}

	public void setQuizT(Choice quizT) {
		this.quizT = quizT;
	}

	public JTextField getAnswerT() {
		return answerT;
	}

	public void setAnswerT(JTextField answerT) {
		this.answerT = answerT;
	}

// -------------- 한희원 코드 끝 -------------------	

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
