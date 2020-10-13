package mini.com.kh.tm1.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class MailBoxPanel extends JPanel{

	
	JLabel title,senderL,titleL,dateL;
	JButton homeB;
	
	public MailBoxPanel() {
		
		this.setSize(550,650);
		this.setLayout(null);
		
		 title=new JLabel("메일함");
		
		title.setBounds(220, 20, 200, 50);
		title.setFont(new Font("맑은 고딕",Font.BOLD,30));
		

		
		senderL=new JLabel("보낸사람");
		
		senderL.setBounds(50, 130, 100, 50);
		senderL.setFont(new Font("맑은 고딕",Font.PLAIN,18));	
//------------------------------------------------------------------	
		titleL=new JLabel("제목");
		
		titleL.setBounds(250, 130, 100, 50);
		titleL.setFont(new Font("맑은 고딕",Font.PLAIN,18));	
		
//------------------------------------------------------------------
		dateL=new JLabel("날짜");
		
		dateL.setBounds(450, 130, 100, 50);
		dateL.setFont(new Font("맑은 고딕",Font.PLAIN,18));
		
//------------------------------------------------------------------
		
		homeB=new JButton("홈으로");
		homeB.setBounds(350, 550, 130, 50);	
		
		
		this.add(title);
		this.add(senderL);
		this.add(titleL);
		this.add(dateL);
		this.add(homeB);

	}

	public JLabel getTitle() {
		return title;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JLabel getSenderL() {
		return senderL;
	}

	public void setSenderL(JLabel senderL) {
		this.senderL = senderL;
	}

	public JLabel getTitleL() {
		return titleL;
	}

	public void setTitleL(JLabel titleL) {
		this.titleL = titleL;
	}

	public JLabel getDateL() {
		return dateL;
	}

	public void setDateL(JLabel dateL) {
		this.dateL = dateL;
	}

	public JButton getHomeB() {
		return homeB;
	}

	public void setHomeB(JButton homeB) {
		this.homeB = homeB;
	}
	
}
