package mini.com.kh.tm1.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mini.com.kh.tm1.controller.MailController;

public class MainFrame {

	//업캐스팅
	JPanel hp=new HomePanel();
	JPanel jp=new JoinPanel();
	JPanel ip=new InfoModiPanel();
	JPanel mbp=new MailBoxPanel();
	JPanel smp=new SendMailPanel();
	JPanel lp=new LoginPanel();
	JPanel curP;
	JPanel nextP;
	
	JFrame fr=new JFrame();
	MailController mc=new MailController();
	protected String id;
	protected String pw;
	
	public MainFrame() {
		
		
		fr.setTitle("같이가조의 메일프로그램");
		fr.setSize(550,650);
		fr.add(hp);
		//다운캐스팅
		HomePanel hpCopy=(HomePanel)hp;
		JoinPanel jpCopy=(JoinPanel)jp;
		InfoModiPanel ipCopy=(InfoModiPanel)ip;
		MailBoxPanel mbpCopy=(MailBoxPanel)mbp;
		SendMailPanel smpCopy=(SendMailPanel)smp;
		LoginPanel lpCopy=(LoginPanel)lp;

		
		curP=hp;
	
		hpCopy.getJoin().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP=jp;
				changePanel();
				curP=jp;
			}
			
			
		});
		
		hpCopy.getLogin().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP=lp;
				changePanel();
				curP=lp;
			}
			
			
		});
		
		
		hpCopy.getInfoModi().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP=ip;
				changePanel();
				curP=ip;
			}
			
			
		});
		
		hpCopy.getReceiveMailBox().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP=mbp;
				changePanel();
				curP=mbp;
			}
			
			
		});
		
		hpCopy.getSendMail().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP=smp;
				changePanel();
				curP=smp;
			}
			
			
		});
		
		hpCopy.getExit().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				mc.fileSave();
				System.exit(0);
			}
			
			
		});
		
		jpCopy.getHomeB().addMouseListener(new GoHomeEvent());
		ipCopy.getHomeB().addMouseListener(new GoHomeEvent());
		mbpCopy.getHomeB().addMouseListener(new GoHomeEvent());
		smpCopy.getHomeB().addMouseListener(new GoHomeEvent());
		lpCopy.getHomeB().addMouseListener(new GoHomeEvent());
	
		
		
		//-----------윤우진 코드 시작 ----------------------
		//로그인 버튼 누르면 실행되는것 
		lpCopy.getLoginB().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
			int result = mc.idpwCheck(lpCopy.getIdT().getText(), lpCopy.getPwT().getText());
			if(result == 1) {
				JOptionPane.showMessageDialog(null,  "회원가입 해주세요");
				System.out.println(result);
			} else if(result ==2) {
				JOptionPane.showMessageDialog(null, "비밀번호가 잘못 입력되었습니다, 다시 한번 확인해주세요" );
				System.out.println(result);
			} else  {
				JOptionPane.showMessageDialog(null, "로그인 성공입니다." );
				lpCopy.addMouseListener(new GoHomeEvent());
			
			}
			
			}
			
		});
		
		//아이디 찾기 버튼을 누르면 실행되는것
		lpCopy.getFindIdB().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//비밀번호 찾기 버튼을 누르면 실행되는것 
		lpCopy.getFindPwB().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//----------윤우진 코드 끝--------------------------
	
		
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	public void changePanel() {
		
		
		 fr.remove(curP);
			fr.add(nextP);
			fr.repaint();

	}
	class GoHomeEvent extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			nextP=hp;
			changePanel();
			curP=hp;
		
		}
		
		
	}

}
