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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class ReportPanel extends JPanel {

	private Window    mWindow;
	DefaultTableModel mDataModel;
	
	/**
	 * Construct report panel
	 */
	public ReportPanel(Window window) {
		mWindow = window;
		
        setSize(785, 569);
        setLocation(0,0);
        setLayout(null);
        
        JLabel lblReports = new JLabel("View Reports");
        lblReports.setFont(new Font("Tahoma", Font.PLAIN, 40));
        lblReports.setBounds(12, 13, 295, 50);
        add(lblReports);
        
        mDataModel = new DefaultTableModel(new Object[]{"Receipt ID", "Recipient", "Status", "Message ID", "Date"},0);
        JTable table = new JTable(mDataModel);
        table.setEnabled(false);
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(12, 105, 761, 340);        
        add(scrollPane);
        
        JButton btnConfirmReports = new JButton("Confirm Reports");
        btnConfirmReports.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnConfirmReports.setBounds(12, 506, 164, 50);
        btnConfirmReports.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {   			
    			// Confirm reports using Manager
    			String result = Manager.confirmReports(mWindow.getReportPanel());
    			
    			// Display confirmation/error message in dialog box
    			if(!result.isEmpty()){
        			JOptionPane.showMessageDialog(mWindow,result);
    			}
        	}
        });
        add(btnConfirmReports);
        
        JButton btnGetReports = new JButton("Get Reports");
        btnGetReports.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnGetReports.setBounds(423, 481, 350, 75);
        btnGetReports.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {   			
    			// Get reports using Manager
    			String result = Manager.getReports(mWindow.getReportPanel());
    			
    			// Display confirmation/error message in dialog box
    			if(!result.isEmpty()){
        			JOptionPane.showMessageDialog(mWindow,result);
    			}      	
        	}
        });
        add(btnGetReports);
	}
	
	public DefaultTableModel getDataModel(){
		return mDataModel;
	}
}
