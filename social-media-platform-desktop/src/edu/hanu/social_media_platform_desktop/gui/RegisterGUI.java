package edu.hanu.social_media_platform_desktop.gui;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import edu.hanu.social_media_platform_desktop.utils.PlaceHolderPasswordField;
import edu.hanu.social_media_platform_desktop.utils.PlaceHolderTextField;

public class RegisterGUI extends JFrame {
	private JLabel lbCreateAccount;
	private PlaceHolderTextField textFirstName;
	private PlaceHolderTextField textLastName;
	private PlaceHolderTextField textUserName;
	private PlaceHolderTextField textAddress;
	private PlaceHolderTextField textEmail;
	private PlaceHolderTextField textPhoneNumber;
	private PlaceHolderPasswordField textPassword;
	private PlaceHolderPasswordField textConfirmPassword;
//	private final DefaultListModel questions = new DefaultListModel();
	private PlaceHolderTextField textAnswer;
	private JLabel lbLogin;
	private JButton btnRegister;

	private JList listQuestions;

	public RegisterGUI() {
		// TODO Auto-generated constructor stub
		super("Register");
		setSize(400, 600);
		setLocation(500, 100);
		setLayout(null);
		initPanels();
	}

	private void initPanels() {
		// TODO Auto-generated method stub
		lbCreateAccount = new JLabel("Create Account");
		lbCreateAccount.setSize(100, 30);
		lbCreateAccount.setLocation(155, 30);
		add(lbCreateAccount);

		textFirstName = new PlaceHolderTextField(30);
		textFirstName.setPlaceholder("First Name");
		textFirstName.setSize(150, 30);
		textFirstName.setLocation(20, 100);
		add(textFirstName);

		textLastName = new PlaceHolderTextField(30);
		textLastName.setPlaceholder("Last Name");
		textLastName.setSize(150, 30);
		textLastName.setLocation(20, 150);
		add(textLastName);

		textUserName = new PlaceHolderTextField(30);
		textUserName.setPlaceholder("UserName");
		textUserName.setSize(150, 30);
		textUserName.setLocation(20, 200);
		add(textUserName);

		textAddress = new PlaceHolderTextField(30);
		textAddress.setPlaceholder("Address");
		textAddress.setSize(150, 30);
		textAddress.setLocation(20, 250);
		add(textAddress);

		textEmail = new PlaceHolderTextField(30);
		textEmail.setPlaceholder("Email");
		textEmail.setSize(150, 30);
		textEmail.setLocation(20, 300);
		add(textEmail);

		textPhoneNumber = new PlaceHolderTextField(30);
		textPhoneNumber.setPlaceholder("Phone Number");
		textPhoneNumber.setSize(150, 30);
		textPhoneNumber.setLocation(215, 100);
		add(textPhoneNumber);

		textPassword = new PlaceHolderPasswordField(30);
		textPassword.setPlaceholder("Password");
		textPassword.setSize(150, 30);
		textPassword.setLocation(215, 150);
		add(textPassword);

		textConfirmPassword = new PlaceHolderPasswordField(30);
		textConfirmPassword.setPlaceholder("Password");
		textConfirmPassword.setSize(150, 30);
		textConfirmPassword.setLocation(215, 200);
		add(textConfirmPassword);

		String questions[] = { "What is your favorite book?", "What is your nickname?", "What is your favorite food?",
				"What is your pet's name?", "What kinds of instrument do you know how to play?" };
		listQuestions = new JList(questions);
		listQuestions.setSize(150, 50);
		listQuestions.setLocation(215, 250);
		add(listQuestions);

//		questions.addElement("What is your favorite book?");
//		questions.addElement("What is your nickname?");
//		questions.addElement("What is your favorite food?");
//		questions.addElement("What is your pet's name?");
//		questions.addElement("What kinds of instrument do you know how to play?");
//		final JList listQuestions = new JList(questions);
//		listQuestions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		listQuestions.setSelectedIndex(0);
//		listQuestions.setVisibleRowCount(3);
//		JScrollPane listQuestionsScrollPane = new JScrollPane(listQuestions);
//		listQuestionsScrollPane.setSize(150, 50);
//		listQuestionsScrollPane.setLocation(215, 250);
//		add(listQuestionsScrollPane);
	}

	public static void main(String[] args) {
		RegisterGUI registerGUI = new RegisterGUI();
		registerGUI.setVisible(true);
	}
}
