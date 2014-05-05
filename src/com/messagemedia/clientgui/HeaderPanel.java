/**
* Copyright 2014 MessageMedia
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
*  
* Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and limitations under the License. 
*/

package com.messagemedia.clientgui;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class HeaderPanel extends JPanel {
	
	private Window         mWindow;
	private JTextField     mUserIdField;
	private JPasswordField mPasswordField;	
	private JPanel         mLoginPanel;
	private JPanel         mLogoutPanel;	
	private JLabel         mUserLabel;
	private JLabel         mTypeLabel;
	private JLabel         mMessagesLabel;	

	/**
	 * Construct header panel
	 */
	public HeaderPanel(Window window) {
		mWindow = window;
		
		setLayout(null);
        setSize(800, 150);
        setLocation(0,0);
        
        JLabel lblNewLabel = new JLabel("MessageMedia");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 52));
        lblNewLabel.setBounds(12, 13, 350, 70);
        add(lblNewLabel);
        
        JLabel lblSoapApiJava = new JLabel("SOAP API Java Sample Application");
        lblSoapApiJava.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblSoapApiJava.setBounds(12, 82, 316, 30);
        add(lblSoapApiJava);
        
        mLogoutPanel = new JPanel();
        mLogoutPanel.setBounds(495, 10, 293, 132);
        add(mLogoutPanel);
        mLogoutPanel.setLayout(null);
        mLogoutPanel.setVisible(false);
        
        JLabel lblWelcome = new JLabel("Welcome,");
        lblWelcome.setBounds(12, 13, 76, 22);
        mLogoutPanel.add(lblWelcome);
        lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JLabel lblAccountType = new JLabel("Account type:");
        lblAccountType.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblAccountType.setBounds(12, 43, 86, 22);
        mLogoutPanel.add(lblAccountType);
        
        JLabel lblMessages = new JLabel("Messages:");
        lblMessages.setBounds(12, 65, 86, 22);
        mLogoutPanel.add(lblMessages);
        
        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Manager.logOut(mWindow);
        	}
        });
        btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnLogout.setBounds(192, 90, 94, 38);
        mLogoutPanel.add(btnLogout);
        
        mUserLabel = new JLabel("User");
        mUserLabel.setForeground(Color.RED);
        mUserLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
        mUserLabel.setBounds(100, 13, 186, 22);
        mLogoutPanel.add(mUserLabel);
        
        mTypeLabel = new JLabel("Type");
        mTypeLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        mTypeLabel.setBounds(100, 43, 56, 22);
        mLogoutPanel.add(mTypeLabel);
        
        mMessagesLabel = new JLabel("0/0");
        mMessagesLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        mMessagesLabel.setBounds(100, 65, 56, 22);
        mLogoutPanel.add(mMessagesLabel);
        
        mLoginPanel = new JPanel();
        mLoginPanel.setBounds(495, 10, 293, 132);
        add(mLoginPanel);
        mLoginPanel.setLayout(null);
        
        JLabel lblUsername = new JLabel("User ID");
        lblUsername.setBounds(12, 13, 60, 22);
        mLoginPanel.add(lblUsername);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(12, 58, 78, 16);
        mLoginPanel.add(lblPassword);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
        
        mUserIdField = new JTextField();
        mUserIdField.setBounds(99, 4, 187, 40);
        mLoginPanel.add(mUserIdField);
        mUserIdField.setText("MessageMediaA004");
        mUserIdField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mUserIdField.setColumns(10);
        
        mPasswordField = new JPasswordField();
        mPasswordField.setBounds(99, 46, 187, 40);
        mLoginPanel.add(mPasswordField);
        mPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mPasswordField.setColumns(10);
        
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {      		
    			// Attempt to login
    			String result = Manager.logIn(mWindow);
    			
    			// Display confirmation/error message in dialog box
    			if(!result.isEmpty()){
        			JOptionPane.showMessageDialog(mWindow,result);
    			} 
        	}
        });
        btnLogin.setBounds(192, 90, 94, 38);
        mLoginPanel.add(btnLogin);
        btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
	}	

	public JPanel getLoginPanel(){
		return mLoginPanel;
	}
	
	public JPanel getLogoutPanel(){
		return mLogoutPanel;
	}
	
	public JTextField getUserIdField(){
		return mUserIdField;
	}
	
	public JPasswordField getPasswordField(){
		return mPasswordField;
	}
	
	public JLabel getUserLabel(){
		return mUserLabel;
	}
	
	public JLabel getTypeLabel(){
		return mTypeLabel;
	}
	
	public JLabel getMessagesLabel(){
		return mMessagesLabel;
	}
}
