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

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class ReplyPanel extends JPanel {

	private Window            mWindow;
	private DefaultTableModel mDataModel;
	
	/**
	 * Construct reply panel
	 */
	public ReplyPanel(Window window) {
		mWindow = window;
		
        setSize(785, 569);
        setLocation(0,0);
        setLayout(null);
        
        JLabel lblReplies = new JLabel("View Replies");
        lblReplies.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblReplies.setBounds(12, 13, 242, 50);
        add(lblReplies);
        
        mDataModel = new DefaultTableModel(new Object[]{"Receipt ID", "From", "Content", "Message ID", "Date Recieved"},0);
        JTable table = new JTable(mDataModel);
        table.setFont(new Font("Tahoma", Font.PLAIN, 13));
        table.getColumnModel().getColumn(2).setPreferredWidth(350);
        table.getColumnModel().getColumn(4).setPreferredWidth(120);
        table.setEnabled(false);
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(12, 105, 761, 340);        
        add(scrollPane);
        
        JButton btnClearReplies = new JButton("Confirm Replies");
        btnClearReplies.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
    			// Confirm replies using Manager
    			String result = Manager.confirmReplies(mWindow.getReplyPanel());
    			
    			// Display confirmation/error message in dialog box
    			if(!result.isEmpty()){
        			JOptionPane.showMessageDialog(mWindow,result);
    			}
        	}
        });
        btnClearReplies.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnClearReplies.setBounds(12, 506, 164, 50);
        add(btnClearReplies);
        
        JButton btnGetReplies = new JButton("Get Replies");
        btnGetReplies.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {    			
    			// Get replies using Manager
    			String result = Manager.getReplies(mWindow.getReplyPanel());
    			
    			// Display confirmation/error message in dialog box
    			if(!result.isEmpty()){
        			JOptionPane.showMessageDialog(mWindow,result);
    			}      	
        	}
        });
        btnGetReplies.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnGetReplies.setBounds(423, 481, 350, 75);
        add(btnGetReplies);
	}
	
	public DefaultTableModel getDataModel(){
		return mDataModel;
	}
}
