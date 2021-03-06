package edu.hanu.social_media_platform_desktop.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import edu.hanu.social_media_platform_desktop.utils.PlaceHolderPasswordField;
import edu.hanu.social_media_platform_desktop.utils.PlaceHolderTextField;

public class LoginGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbLogin;
	private JLabel lbForgotPassword;
	private JLabel lbRegister;

	private PlaceHolderTextField textUserName;
	private PlaceHolderPasswordField textPassword;

	private JButton btnLogin;

	public LoginGUI() {
		// TODO Auto-generated constructor stub
		super("Login Social Media Web");
		setSize(400, 600);
		setLocation(500, 100);
		setLayout(null);
		initPanels();
	}

	private void initPanels() {
		// TODO Auto-generated method stub

		lbLogin = new JLabel("LOGIN");
		lbLogin.setSize(100, 30);
		lbLogin.setLocation(170, 30);
		add(lbLogin);

		textUserName = new PlaceHolderTextField(30);
		textUserName.setPlaceholder("Username");
		textUserName.setSize(200, 30);
		textUserName.setLocation(100, 80);
		add(textUserName);

		textPassword = new PlaceHolderPasswordField(30);
		textPassword.setPlaceholder("Password");
		textPassword.setSize(200, 30);
		textPassword.setLocation(100, 130);
		add(textPassword);

		lbForgotPassword = new JLabel("Forgot Password?");
		lbForgotPassword.setSize(150, 30);
		lbForgotPassword.setLocation(150, 165);
		lbForgotPassword.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
//		       frame = new JFrame("new frame");
//		       frame.setVisible(true);
			}
		});
		add(lbForgotPassword);

		lbRegister = new JLabel("Register");
		lbRegister.setSize(150, 30);
		lbRegister.setLocation(180, 195);
		lbRegister.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				RegisterGUI registerGUI = new RegisterGUI();
				registerGUI.setVisible(true);
			}
		});
		add(lbRegister);

		btnLogin = new JButton("Login");
		btnLogin.setSize(100, 30);
		btnLogin.setLocation(150, 235);
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				if (textUserName.getText().isEmpty() || textUserName.getText() == null) {
					JOptionPane.showMessageDialog(null, "Please input username");
				} else if (textPassword.getText().isEmpty() || textPassword.getText() == null) {
					JOptionPane.showMessageDialog(null, "Please input password");
				} else {
					JOptionPane.showMessageDialog(null, "OKE");
				}
			}

		});
		add(btnLogin);
	}

	public static void main(String[] args) {
		LoginGUI gui = new LoginGUI();
		gui.setVisible(true);
	}
}
