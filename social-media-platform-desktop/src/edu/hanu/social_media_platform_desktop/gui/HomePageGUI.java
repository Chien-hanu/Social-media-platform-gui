package edu.hanu.social_media_platform_desktop.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import edu.hanu.social_media_platform_desktop.utils.PlaceHolderTextField;

public class HomePageGUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// nav-bar
	private JButton btnHome;
	private JButton btnProfile;
	private JButton btnMesssage;
	private PlaceHolderTextField textSearch;
	private JButton btnSearch;
	private JButton btnLogout;
	// end nav-bar
	private JLabel lbCreatePost;
	private PlaceHolderTextField textThinking;
	private JButton btnShare;

	public HomePageGUI() {
		// TODO Auto-generated constructor stub
		super("Home Page");
		setSize(400, 600);
		setLocation(500, 100);
		setLayout(null);
		initPanels();
	}

	private void initPanels() {
		// TODO Auto-generated method stub
		// nav-bar
		btnHome = new JButton("Home");
		btnHome.setSize(100, 40);
		btnHome.setLocation(0, 0);
		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				HomePageGUI homePageGUI = new HomePageGUI();
				homePageGUI.setVisible(true);
			}
		});
		add(btnHome);

		btnProfile = new JButton("Profile");
		btnProfile.setSize(100, 40);
		btnProfile.setLocation(100, 0);
		btnProfile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ProfileGUI profileGUI = new ProfileGUI();
				profileGUI.setVisible(true);
			}
		});

		add(btnProfile);

		btnMesssage = new JButton("Message");
		btnMesssage.setSize(100, 40);
		btnMesssage.setLocation(200, 0);
		btnMesssage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MessageGUI messageGUI = new MessageGUI();
				messageGUI.setVisible(true);
			}
		});
		add(btnMesssage);

		btnLogout = new JButton("Log out");
		btnLogout.setSize(100, 40);
		btnLogout.setLocation(300, 0);
		btnLogout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				LoginGUI loginGUI = new LoginGUI();
				loginGUI.setVisible(true);
			}
		});
		add(btnLogout);

		textSearch = new PlaceHolderTextField(30);
		textSearch.setPlaceholder("Search people");
		textSearch.setSize(265, 40);
		textSearch.setLocation(0, 40);
		add(textSearch);

		btnSearch = new JButton("Search");
		btnSearch.setSize(130, 40);
		btnSearch.setLocation(260, 39);
		add(btnSearch);
		// nav-bar end

		// create post
		lbCreatePost = new JLabel("Create a post");
		lbCreatePost.setSize(200, 30);
		lbCreatePost.setLocation(10, 80);
		add(lbCreatePost);

		textThinking = new PlaceHolderTextField(30);
		textThinking.setPlaceholder("What are you thinking?");
		textThinking.setSize(280, 70);
		textThinking.setLocation(10, 110);
		add(textThinking);

		btnShare = new JButton("Share");
		btnShare.setSize(80, 40);
		btnShare.setLocation(300, 125);
		add(btnShare);
		// end-create-post

		// show status
		
	}

	public static void main(String[] args) {
		HomePageGUI homePageGUI = new HomePageGUI();
		homePageGUI.setVisible(true);
	}
}
