package mini.com.kh.tm1.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mini.com.kh.tm1.controller.MailController;
import mini.com.kh.tm1.model.vo.Person;

public class MainFrame {

	// 업캐스팅
	JPanel hp = new HomePanel();
	JPanel jp = new JoinPanel();
	JPanel ip = new InfoModiPanel();
	JPanel mbp = new MailBoxPanel();
	JPanel smp = new SendMailPanel();
	JPanel lp = new LoginPanel();
	JPanel curP;
	JPanel nextP;

	JFrame fr = new JFrame();
	MailController mc = new MailController();
	boolean chk = false;

	public MainFrame() {

		fr.setTitle("같이가조의 메일프로그램");
		fr.setSize(550, 650);
		fr.add(hp);
		// 다운캐스팅
		HomePanel hpCopy = (HomePanel) hp;
		JoinPanel jpCopy = (JoinPanel) jp;
		InfoModiPanel ipCopy = (InfoModiPanel) ip;
		MailBoxPanel mbpCopy = (MailBoxPanel) mbp;
		SendMailPanel smpCopy = (SendMailPanel) smp;
		LoginPanel lpCopy = (LoginPanel) lp;

		curP = hp;

		hpCopy.getJoin().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP = jp;
				changePanel();
				curP = jp;
			}

		});

		hpCopy.getLogin().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP = lp;
				changePanel();
				curP = lp;
			}

		});

		hpCopy.getInfoModi().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP = ip;
				changePanel();
				curP = ip;
			}

		});

		hpCopy.getReceiveMailBox().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP = mbp;
				changePanel();
				curP = mbp;
			}

		});

		hpCopy.getSendMail().addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				nextP = smp;
				changePanel();
				curP = smp;
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

// ----------------------------------------- 한희원 코드 시작 ------------------------------------------------------------

		jpCopy.getIdCheckB().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (jpCopy.getIdT().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요!!", "아이디 입력", JOptionPane.WARNING_MESSAGE);
				} else {
					if (mc.idCheck(jpCopy.getIdT().getText())) {
						JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다.");
						chk = true;
					} else {
						JOptionPane.showMessageDialog(null, "사용 불가능한 아이디입니다.");
					}
				}

			}
		});

		jpCopy.getJoinB().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (jpCopy.getIdT().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "아이디를 입력해주세요!!", "아이디 입력", JOptionPane.WARNING_MESSAGE);
				} else if (jpCopy.getPwT().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요!!", "비밀번호 입력", JOptionPane.WARNING_MESSAGE);
				} else if (jpCopy.getPwCheckT().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "비밀번호를 확인해주세요!!", "비밀번호 확인", JOptionPane.WARNING_MESSAGE);
				} else if (jpCopy.getNameT().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이름을 입력해주세요!!", "이름 입력", JOptionPane.WARNING_MESSAGE);
				} else if (jpCopy.getEmailT().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이메일을 입력해주세요!!", "이메일 입력", JOptionPane.WARNING_MESSAGE);
				} else if (jpCopy.getMailPwT().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "이메일 비밀번호를 입력해주세요!!", "이메일 비밀번호 입력",
							JOptionPane.WARNING_MESSAGE);
				} else if (chk == false) {
					JOptionPane.showMessageDialog(null, "중복확인을 해주세요!!", "아이디 중복확인", JOptionPane.WARNING_MESSAGE);
				} else if (!jpCopy.getPwT().getText().equals(jpCopy.getPwCheckT().getText())) {
					JOptionPane.showMessageDialog(null, "비밀번호와 비밀번호 확인이 다릅니다 !!", "비밀번호 재확인",
							JOptionPane.WARNING_MESSAGE);
				} else if (jpCopy.getAnswerT().getText().equals("")) {
					JOptionPane.showMessageDialog(null, "질문에 답을 입력해주세요!!", "질문 정답 입력", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "가입을 축하합니다 !!!");

				}
			}
		});

// --------------------------------------------------- 한희원 코드 끝 -----------------------------------------------------

		jpCopy.getHomeB().addMouseListener(new GoHomeEvent());
		ipCopy.getHomeB().addMouseListener(new GoHomeEvent());
		mbpCopy.getHomeB().addMouseListener(new GoHomeEvent());
		smpCopy.getHomeB().addMouseListener(new GoHomeEvent());
		lpCopy.getHomeB().addMouseListener(new GoHomeEvent());

		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void changePanel() {

		fr.remove(curP);
		fr.add(nextP);
		fr.repaint();

	}

	class GoHomeEvent extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			nextP = hp;
			changePanel();
			curP = hp;

		}

	}

}
