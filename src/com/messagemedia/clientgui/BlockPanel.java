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

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class BlockPanel extends JPanel {

	private Window                   mWindow;
	private JTextField               mBlockedNumberField;
	private DefaultListModel<String> mDataModel;
	private JList<String>            mList;
	
	/**
	 * Construct blocked numbers panel
	 */
	public BlockPanel(Window window) {
		mWindow = window;
		
        setSize(785, 569);
        setLocation(0,0);
        setLayout(null);        
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(12, 76, 310, 302);
        add(scrollPane);
        
        mDataModel = new DefaultListModel<String>();
        mList = new JList<String>(mDataModel);
        scrollPane.setViewportView(mList);
        
        JButton btnGetBlockedNumbers = new JButton("Get Blocked Numbers");
        btnGetBlockedNumbers.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {      		
    			// Get blocked numbers using Manager
    			String result = Manager.getBlockedNumbers(mWindow.getBlockPanel());
    			
    			// Display confirmation/error message in dialog box
    			if(!result.isEmpty()){
        			JOptionPane.showMessageDialog(mWindow,result);
    			} 
        	}
        });
        btnGetBlockedNumbers.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnGetBlockedNumbers.setBounds(423, 481, 350, 75);
        add(btnGetBlockedNumbers);
        
        JButton btnRemoveSelectedButton = new JButton("Unblock Selected");
        btnRemoveSelectedButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			// Unblock numbers using Manager
    			String result = Manager.unblockNumbers(mWindow.getBlockPanel(),true);
    			
    			// Display confirmation/error message in dialog box
    			if(!result.isEmpty()){
        			JOptionPane.showMessageDialog(mWindow,result);
    			} 
        	}
        });
        btnRemoveSelectedButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnRemoveSelectedButton.setBounds(12, 393, 150, 50);
        add(btnRemoveSelectedButton);
        
        JButton btnRemoveAll = new JButton("Unblock All");
        btnRemoveAll.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			
    			// Unblock numbers using Manager
    			String result = Manager.unblockNumbers(mWindow.getBlockPanel(),false);
    			
    			// Display confirmation/error message in dialog box
    			if(!result.isEmpty()){
        			JOptionPane.showMessageDialog(mWindow,result);
    			} 
        	}
        });
        btnRemoveAll.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnRemoveAll.setBounds(172, 393, 150, 50);
        add(btnRemoveAll);
        
        JLabel lblAddNumber = new JLabel("Add number:");
        lblAddNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblAddNumber.setBounds(12, 467, 108, 25);
        add(lblAddNumber);
        
        mBlockedNumberField = new JTextField();
        mBlockedNumberField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mBlockedNumberField.setBounds(12, 505, 150, 50);
        add(mBlockedNumberField);
        mBlockedNumberField.setColumns(10);
        
        JButton btnAdd = new JButton("Block");
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {    			 
    			// Add blocked number using Manager
    			String result = Manager.blockNumber(mWindow.getBlockPanel());
    			    			
    			// Display result in dialog box		
        		JOptionPane.showMessageDialog(mWindow,result);
        	}
        });
        btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnAdd.setBounds(172, 506, 150, 50);
        add(btnAdd);        
    	
        JLabel lblUserInformation = new JLabel("Edit Blocked Numbers");
        lblUserInformation.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblUserInformation.setBounds(12, 13, 505, 50);
        add(lblUserInformation);
	}
	
	public DefaultListModel<String> getDataModel(){
		return mDataModel;
	}
	
	public JList<String> getlist(){
		return mList;
	}
	
	public JTextField getBlockedNumberField(){
		return mBlockedNumberField;
	}	
}
