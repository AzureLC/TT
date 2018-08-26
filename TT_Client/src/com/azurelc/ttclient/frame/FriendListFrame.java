package com.azurelc.ttclient.frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.azurelc.ttclient.util.ScreenSize;

public class FriendListFrame extends JFrame {

	private Integer screenWidth, screenHeight, framrWidth = 300, framrHeight = 650;

	public FriendListFrame() {
		screenWidth = ScreenSize.getScreenSize().width;
		screenHeight = ScreenSize.getScreenSize().height;

		this.setTitle("TT");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setIconImage(new ImageIcon("resource/image/Narrator.png").getImage());
		this.setSize(framrWidth, framrHeight);
		this.setLocation(screenWidth - framrWidth - 3, 5);
		this.setResizable(false);
		this.setVisible(true);
	}
}
