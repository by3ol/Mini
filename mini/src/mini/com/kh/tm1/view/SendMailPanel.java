package mini.com.kh.tm1.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SendMailPanel extends JPanel{

	JLabel title,receiveL,contentL,attachL;
	JTextField receiveT,attachT;
	JTextArea contentA;
	JButton attachB,sendB,homeB;
	public SendMailPanel() {
		
		this.setSize(550,650);
		this.setLayout(null);
		
		 title=new JLabel("메일 쓰기");
		
		title.setBounds(220, 20, 200, 50);
		title.setFont(new Font("맑은 고딕",Font.BOLD,30));
//--------------------------------------------------------------		
		
		 receiveL=new JLabel("받는 사람");
		
		receiveL.setBounds(20, 90, 100, 25);
		receiveL.setFont(new Font("맑은 고딕",Font.PLAIN,15));	
//--------------------------------------------------------------		
		
		 receiveT=new JTextField();
		
		receiveT.setBounds(100, 90,400,25);
//--------------------------------------------------------------		
		
		 contentL=new JLabel("내용");
		
		contentL.setBounds(20, 130, 100, 25);
		contentL.setFont(new Font("맑은 고딕",Font.PLAIN,15));	
//--------------------------------------------------------------		
		
		 contentA=new JTextArea();
		
		contentA.setBounds(101, 130,395,300);
//--------------------------------------------------------------		

		 attachL=new JLabel("첨부파일");
		
		attachL.setBounds(20, 450, 100, 25);
		attachL.setFont(new Font("맑은 고딕",Font.PLAIN,15));	
		
//--------------------------------------------------------------		

		 attachT=new JTextField();
		
		attachT.setBounds(100, 450,300,25);
		
//--------------------------------------------------------------		
		
		
		 attachB=new JButton("찾아보기");
		attachB.setBounds(400, 450, 100, 25);
//--------------------------------------------------------------
		
		 sendB=new JButton("보내기");
		sendB.setBounds(100, 550, 300, 50);
//-------------------------------------------------------------
		 homeB=new JButton("홈으로");
		homeB.setBounds(400, 550, 100, 50);

		
		
		
		this.add(attachT);
		this.add(homeB);
		this.add(sendB);
		this.add(attachB);
		this.add(attachL);
		this.add(contentA);
		this.add(contentL);
		this.add(receiveT);
		this.add(receiveL);
		this.add(title);
		
	}
	public JLabel getTitle() {
		return title;
	}
	public void setTitle(JLabel title) {
		this.title = title;
	}
	public JLabel getReceiveL() {
		return receiveL;
	}
	public void setReceiveL(JLabel receiveL) {
		this.receiveL = receiveL;
	}
	public JLabel getContentL() {
		return contentL;
	}
	public void setContentL(JLabel contentL) {
		this.contentL = contentL;
	}
	public JLabel getAttachL() {
		return attachL;
	}
	public void setAttachL(JLabel attachL) {
		this.attachL = attachL;
	}
	public JTextField getReceiveT() {
		return receiveT;
	}
	public void setReceiveT(JTextField receiveT) {
		this.receiveT = receiveT;
	}
	public JTextField getAttachT() {
		return attachT;
	}
	public void setAttachT(JTextField attachT) {
		this.attachT = attachT;
	}
	public JTextArea getContentA() {
		return contentA;
	}
	public void setContentA(JTextArea contentA) {
		this.contentA = contentA;
	}
	public JButton getAttachB() {
		return attachB;
	}
	public void setAttachB(JButton attachB) {
		this.attachB = attachB;
	}
	public JButton getSendB() {
		return sendB;
	}
	public void setSendB(JButton sendB) {
		this.sendB = sendB;
	}
	public JButton getHomeB() {
		return homeB;
	}
	public void setHomeB(JButton homeB) {
		this.homeB = homeB;
	}
	
	
}
