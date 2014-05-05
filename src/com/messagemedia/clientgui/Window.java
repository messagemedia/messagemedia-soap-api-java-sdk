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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Window extends JFrame {
	
	private HeaderPanel mHeaderPanel;
	private SendPanel   mSendPanel;
	private ReplyPanel  mReplyPanel;
	private ReportPanel mReportPanel;
	private BlockPanel  mBlockPanel;
	private JTabbedPane mTabbedPane;
	private JPanel      mOuterPanel;
	
	public static void main(String[] args){	
		new Window();
    }
	
	/**
	 * Construct window
	 */
    public Window(){
        // Create window
        super("SOAP API Java Sample Application");
        
        // Build header panel
        mHeaderPanel = new HeaderPanel(this);
        
        // Build outer panel
        mOuterPanel = new JPanel();
        mOuterPanel.setLayout(null);
        mOuterPanel.add(mHeaderPanel);

        // Add outer panel to window
        getContentPane().add(mOuterPanel);
                
        // Configure window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setSize(800,800);
        setVisible(true);
    }
    
    public void buildInterface(){     
        // Build tabbed pane
        mTabbedPane = new JTabbedPane();
        mTabbedPane.setFont( new Font( "Dialog", Font.BOLD, 20 ) );
        mTabbedPane.setSize(800, 650);
        mTabbedPane.setLocation(0,150);
        mTabbedPane.setVisible(true);
        
        // Build other panels
        mSendPanel = new SendPanel(this);
        mReplyPanel = new ReplyPanel(this);
        mReportPanel = new ReportPanel(this);
        mBlockPanel = new BlockPanel(this);
        
        // Add panels to tabbed pane
        mTabbedPane.addTab("Send Message", null, mSendPanel);
        mTabbedPane.addTab("View Replies", null, mReplyPanel);
        mTabbedPane.addTab("View Reports", null, mReportPanel);
        mTabbedPane.addTab("Edit Blocked Numbers", null, mBlockPanel);
        
        // Add other panels to outer panel
        mOuterPanel.add(mTabbedPane);
    }
    
    public void destroyInterface(){ 
    	// Hide tabbed pane
    	mTabbedPane.setVisible(false);
    	// Remove tabbed pane from outer panel. Garbage collection will do the rest.
    	mOuterPanel.remove(mTabbedPane);
    }
    
    public HeaderPanel getHeaderPanel(){
		return mHeaderPanel;
	}
	
	public SendPanel getSendPanel() {
		return mSendPanel;
	}
	
	public ReplyPanel getReplyPanel() {
		return mReplyPanel;
	}
	
	public ReportPanel getReportPanel() {
		return mReportPanel;
	}
	
	public BlockPanel getBlockPanel(){
		return mBlockPanel;
	}
	
	public JTabbedPane getTabbedPane(){
		return mTabbedPane;
	}
}
