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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;

public class SendPanel extends JPanel {

	private Window     mWindow;
	private JTextField mToField;
	private JTextField mOriginField;
	private JTextPane  mContentField;
	private JTextField mUidField;
	private JTextField mScheduledField;
	private JTextField mValidityPeriodField;
	private JCheckBox  mDeliveryReportBox;
	
	/**
	 * Construct send panel
	 */
	public SendPanel(Window window) {
		mWindow = window;
		
        setSize(785, 569);
        setLocation(0,0);
        setLayout(null);
        
        JLabel lblUserInformation = new JLabel("Send Message");
        lblUserInformation.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblUserInformation.setBounds(12, 13, 313, 50);
        add(lblUserInformation);
        
        JLabel lblTo = new JLabel("To");
        lblTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblTo.setBounds(12, 96, 56, 25);
        add(lblTo);
        
        JLabel lblFrom = new JLabel("Origin");
        lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblFrom.setBounds(13, 364, 114, 25);
        add(lblFrom);
        
        JLabel lblMessage = new JLabel("Content");
        lblMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblMessage.setBounds(12, 141, 91, 25);
        add(lblMessage);
        
        mToField = new JTextField();
        mToField.setText("+61450178542");
        mToField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mToField.setBounds(106, 88, 234, 40);
        add(mToField);
        mToField.setColumns(10);
        
        mOriginField = new JTextField();
        mOriginField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mOriginField.setBounds(139, 356, 201, 40);
        add(mOriginField);
        mOriginField.setColumns(10);
        
        mContentField = new JTextPane();
        mContentField.setText("Test");
        mContentField.setFont(new Font("Tahoma", Font.PLAIN, 22));
        mContentField.setBounds(106, 141, 667, 135);
        add(mContentField);
        
        JLabel lblNewLabel = new JLabel("Message ID");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setBounds(12, 417, 114, 25);
        add(lblNewLabel);
        
        mUidField = new JTextField();
        mUidField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mUidField.setBounds(139, 409, 201, 40);
        add(mUidField);
        mUidField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Optional:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(12, 317, 91, 25);
        add(lblNewLabel_1);
        
        mDeliveryReportBox = new JCheckBox("Delivery report");
        mDeliveryReportBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mDeliveryReportBox.setBounds(139, 317, 201, 25);
        add(mDeliveryReportBox);
        
        JLabel lblScheduled = new JLabel("Scheduled");
        lblScheduled.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblScheduled.setBounds(12, 470, 114, 25);
        add(lblScheduled);
        
        mScheduledField = new JTextField();
        mScheduledField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mScheduledField.setBounds(139, 462, 201, 40);
        add(mScheduledField);
        mScheduledField.setColumns(10);
        mScheduledField.setEditable(false);
        
        mValidityPeriodField = new JTextField();
        mValidityPeriodField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mValidityPeriodField.setBounds(139, 516, 201, 40);
        add(mValidityPeriodField);
        mValidityPeriodField.setColumns(10);
        
        JLabel lblValidityPeriod = new JLabel("Validity Period");
        lblValidityPeriod.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblValidityPeriod.setBounds(13, 524, 114, 25);
        add(lblValidityPeriod);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(12, 302, 761, 2);
        add(separator);
        
        JButton sendButton = new JButton("Send");

        sendButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {    			 
    			// Send message using Manager
    			String result = Manager.sendMessage(mWindow.getSendPanel());
    			    			
    			// Display result in dialog box		
        		JOptionPane.showMessageDialog(mWindow,result);
        	}        	
        });
        sendButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        sendButton.setBounds(474, 481, 299, 75);
        add(sendButton);
	}
	
	public JTextField getToField() {
		return mToField;
	}

	public JTextField getOriginField() {
		return mOriginField;
	}

	public JTextPane getContentField() {
		return mContentField;
	}

	public JTextField getUidField() {
		return mUidField;
	}

	public JTextField getScheduledField() {
		return mScheduledField;
	}

	public JTextField getValidityPeriodField() {
		return mValidityPeriodField;
	}

	public JCheckBox getDeliveryReportBox() {
		return mDeliveryReportBox;
	}
}
