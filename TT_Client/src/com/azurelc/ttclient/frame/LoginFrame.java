package com.azurelc.ttclient.frame;

import javax.swing.*;

import com.azurelc.ttclient.util.ScreenSize;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame{
    private Integer screenWidth,screenHeight,framrWidth,framrHeight;

    private JLabel log,tt,pw;
    private JTextField ttNumber;
    private JPasswordField password;
    private JPanel jpBn,jpTt,jpPw;
    private JButton login,register;

    public LoginFrame(){
    	screenWidth = ScreenSize.getScreenSize().width;
    	screenHeight = ScreenSize.getScreenSize().height;
        log = new JLabel(new ImageIcon("resource/image/log.png"));

        tt = new JLabel("T   T:");
        ttNumber = new JTextField(15);
        jpTt = new JPanel();
        jpTt.setLayout(new FlowLayout());
        jpTt.add(tt);
        jpTt.add(ttNumber);

        pw = new JLabel("密码:");
        password = new JPasswordField(15);
        jpPw = new JPanel();
        jpPw.setLayout(new FlowLayout());
        jpPw.add(pw);
        jpPw.add(password);

        login = new JButton("登录");
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(ttNumber.getText());
                System.out.println(new String(password.getPassword()));
                dispose();
                new FriendListFrame();
            }
        });
        register = new JButton("注册");
        register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new RegisterFrame();
			}
		});
        jpBn = new JPanel();
        jpBn.setLayout(new FlowLayout());
        jpBn.add(login);
        jpBn.add(register);

        this.setLayout(new GridLayout(4,1));
        this.add(log);
        this.add(jpTt);
        this.add(jpPw);
        this.add(jpBn);
        this.setTitle("登录");
        framrWidth = 300;
        framrHeight = 200;
        this.setSize(framrWidth, framrHeight);
        this.setLocation((screenWidth-framrWidth)/2,(screenHeight - framrHeight)/2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("resource/image/Narrator.png").getImage());
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
    }
}

