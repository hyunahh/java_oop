package ezen.ams;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.Properties;

import javax.sound.midi.Receiver;
import javax.swing.text.AbstractDocument.Content;

/**
 * 계좌관리 애플리케이션 GUI
 * 
 * @author 김현아
 * @date 2023. 1. 17.
 */
public class AccountFrame extends Frame {
	AccountRepository repository;

	GridBagLayout gridBagLayout;
	Label accountTypeLabel, accountNum, accountOwner, pwd, deposit, rentMoney, accountList;
	Choice accountChoice;
	TextField accountTF, accountOwnerTF, pwdTF, depositTF, rentMoneyTF;
	Button searchButton, removeButtton, ownerSearch, newRegistrationButton, allSearch;
	TextArea contentArea;
	
	private static String fontName;
	private static int fontSize;

	static {
		Properties prop = new Properties();
		try {
			prop.load(AccountFrame.class.getResourceAsStream("config.properties"));
			fontName = prop.getProperty("font.family");
			fontSize = Integer.parseInt(prop.getProperty("font.size"));
			System.out.println(fontName);
			System.out.println(fontSize);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public AccountFrame() {
		this("기본 타이틀", null);
	}

	public AccountFrame(String title, AccountRepository repository) {
		this.repository = repository;

		accountTypeLabel = new Label("계좌종류");
		accountChoice = new Choice();
		this.accountChoice = new Choice();
		accountChoice.add("전체");
		accountChoice.add("입출금계좌");
		accountChoice.add("마이너스계좌");

		accountNum = new Label("계좌번호");
		accountTF = new TextField();
		searchButton = new Button("조 회");
		removeButtton = new Button("삭 제");

		accountOwner = new Label("예금주명");
		accountOwnerTF = new TextField();
		ownerSearch = new Button("검 색");

		pwd = new Label("비밀번호");
		pwdTF = new TextField();

		deposit = new Label("입금금액");
		depositTF = new TextField();

		rentMoney = new Label("대출금액");
		rentMoneyTF = new TextField();
		newRegistrationButton = new Button("신규등록");
		allSearch = new Button("전체조회");

		accountList = new Label("계좌목록");

		contentArea = new TextArea();
		
		Font font = new Font(fontName, Font.BOLD, fontSize);

	}

	public void initLayout() {
		gridBagLayout = new GridBagLayout();
		setLayout(gridBagLayout);
		add(accountTypeLabel, 0, 0, 1, 1, 0.0); 
		add(accountChoice,    1, 0, 1, 1, 1.0);
		add(accountNum,       0, 1, 1, 1, 0.0);
		add(accountTF,        1, 1, 1, 1, 1.0);
		add(searchButton,     2, 1, 1, 1, 0.1);
		add(removeButtton,    3, 1, 1, 1, 0.1);
		add(accountOwner,     0, 2, 1, 1, 1.0);
		add(accountOwnerTF,   1, 2, 1, 1, 1.0);
		add(ownerSearch,      2, 2, 1, 1, 1.0);
		add(pwd,              0, 3, 1, 1, 1.0);
		add(pwdTF,            1, 3, 1, 1, 1.0);
		add(deposit,          2, 3, 1, 1, 1.0);
		add(depositTF,        3, 3, 1, 1, 1.0);
		add(rentMoney,        0, 4, 1, 1, 1.0);
		add(rentMoneyTF,        1, 4, 1, 1, 1.0);
		add(newRegistrationButton,  2, 4, 1, 1, 1.0);
		add(allSearch,        3, 4, 1, 1, 1.0);
		add(accountList,      0, 5, 1, 2, 1.0);
		add(contentArea, 0, 7, 6, 1, 1.0);
	}

// GridBagLayout을 이용한 컴포넌트 배치
	private void add(Component component, int gridx, int gridy, int gridwidth, int gridheight, double weightx) {
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.BOTH;
		constraints.insets = new Insets(1, 1, 1, 1); // 여백주기
		constraints.weightx = weightx;
		constraints.weighty = 0.0;
		constraints.gridx = gridx;
		constraints.gridy = gridy;
		constraints.gridwidth = gridwidth;
		constraints.gridheight = gridheight;
		gridBagLayout.setConstraints(component, constraints);
		add(component);
	}

	// 이벤트 소스에 이벤트 리스너 연결(등록)
	public void addEventListener() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		searchButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				findbyAccountNumber();

			}
		});

	}

	// 계좌 조회
	public void findbyAccountNumber() {
		String accountNum = accountNum.getText();
		// 데이터 유효성 검증
		if (accountNum == null || accountNum.trim().length() == 0) {
			System.out.println("계좌번호를 생략할 수 없습니다.");
			return;
		} else {
			Account account = repository.findByNumber(accountNum);
			if (account != null) {
				contentArea.append(account.toString() + "\n");
			} else {
				contentArea.append("조회된 계좌가 존재하지 않습니다.");
			}
		}
	}

	/*
	 * public static void main(String[] args) { AccountFrame frame5 = new
	 * AccountFrame("AWT 컴포넌트틀"); frame5.initLayout(); frame5.addEventListener();
	 * frame5.setSize(500, 400); frame5.setVisible(true); }
	 */

}
