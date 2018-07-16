package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tictactoe implements ActionListener  {

		// Program Title
		private JFrame frame = new JFrame("Tic Tac Toe Game");	
			
		// Player Points
		// private int count1 = 0;
		// private int count2 = 0;
		
		JLabel Player1, Player2;
		Container con;
		JButton btnRestart;

		private JButton button1 = new JButton();
		private JButton button2 = new JButton();
		private JButton button3 = new JButton();
		private JButton button4 = new JButton();
		private JButton button5 = new JButton();
		private JButton button6 = new JButton();
		private JButton button7 = new JButton();
		private JButton button8 = new JButton();
		private JButton button9 = new JButton();
		
		private String letter;
		
		private int count = 0;
		
		private boolean result = false;
	   
public TheFunction(){
	
	/* Size */
	frame.setSize(400,400);
	
	/* Exit */
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	/* Grid Layout */
	frame.setLayout(new GridLayout(0,3));
	 
	/* Buttons */
	frame.add(button1);
	frame.add(button2);
	frame.add(button3);
	frame.add(button4);
	frame.add(button5);
	frame.add(button6);
	frame.add(button7);
	frame.add(button8);
	frame.add(button9);
	
	/* Action Listeners For Buttons*/
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	
	/* Menu */
	JMenuBar MenuBar = new JMenuBar(); 
	frame.setJMenuBar(MenuBar);

	JMenu FileMenu = new JMenu("File"); 
	JMenuItem RestartMenu = new JMenuItem("Restart"); 
	JMenuItem ExitMenu = new JMenuItem("Exit"); 

	FileMenu.add(RestartMenu);  
	FileMenu.add(ExitMenu); 

	JMenu HelpMenu = new JMenu("Help"); 
	JMenuItem AboutMenu = new JMenuItem("About"); 

	HelpMenu.add(AboutMenu);

	MenuBar.add(FileMenu); 
	MenuBar.add(HelpMenu); 


	RestartMenu.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent rm){ 
			RestartMenu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent rm){ 
				frame.setVisible(false);
				new TheFunction();
				}
		});
		}
	});

	ExitMenu.addActionListener(new ActionListener(){
	    public void actionPerformed(ActionEvent em){
	        System.exit(0); // Exit program.
	    }
	});

	AboutMenu.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent rm){ 
			JOptionPane.showMessageDialog(null, "Tic Tac Toe Game [version 1.0]");
		}
	});
	
	/* GUI Visible - Set to true */
	frame.setVisible(true);
	
	
	/* Player Stats */

	Player1 = new JLabel ("Player 1 = X  \t" );
	frame.add(Player1);
	Player2 = new JLabel ("Player 2 = O   \t" );
	frame.add(Player2);

	
	// Restart Button
	/* btnRestart = new JButton("Continue");
	frame.add(btnRestart); */
	
    JButton btnContinue= new JButton("Restart");
    btnContinue.setText("Restart");
    btnContinue.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent rm){ 
    		frame.setVisible(false);
    		new TheFunction();
    		}
    });
    btnContinue.setPreferredSize(new Dimension(0,0));
    frame.add(btnContinue,BorderLayout.WEST);
	
    /* JButton btnRestart = new JButton("Restart");
    btnRestart.setText("Restart");
    btnRestart.setPreferredSize(new Dimension(2,2));
    frame.add(btnRestart,BorderLayout.WEST); */
	
	}
	
	/* Turns */
public void actionPerformed(ActionEvent a) {
		
		count++;
	
	if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){
	 
		letter = "X";
	 
	} else if(count == 2 || count == 4 || count == 6 || count == 8 || count 

== 10){
		
		letter = "O";
		
	}
	 
	/* Display X's and O's on the buttons */
	if(a.getSource() == button1){
	button1.setText(letter);
	button1.setEnabled(false);
	
	} else if(a.getSource() == button2){
	button2.setText(letter);
	button2.setEnabled(false);
	
	} else if(a.getSource() == button3){
	button3.setText(letter);
	button3.setEnabled(false);
	
	} else if(a.getSource() == button4){
	button4.setText(letter);
	button4.setEnabled(false);
	
	} else if(a.getSource() == button5){
	button5.setText(letter);
	button5.setEnabled(false);
	
	} else if(a.getSource() == button6){
	button6.setText(letter);
	button6.setEnabled(false);
	
	} else if(a.getSource() == button7){
	button7.setText(letter);
	button7.setEnabled(false);
	
	} else if(a.getSource() == button8){
	button8.setText(letter);
	button8.setEnabled(false);
	
	} else if(a.getSource() == button9){
	button9.setText(letter);
	button9.setEnabled(false);
	}
	 
	/* Horizontal */
	if( button1.getText() == button2.getText() && button2.getText() == 

button3.getText() && button1.getText() != ""){
		result = true;
	}
	
	else if(button4.getText() == button5.getText() && button5.getText() == 

button6.getText() && button4.getText() != ""){
		result = true;
	}
	
	else if(button7.getText() == button8.getText() && button8.getText() == 

button9.getText() && button7.getText() != ""){
		result = true;
	}
	 
	/* Vertical */
	else if(button1.getText() == button4.getText() && button4.getText() == 

button7.getText() && button1.getText() != ""){
		result = true;
	}
	
	else if(button2.getText() == button5.getText() && button5.getText() == 

button8.getText() && button2.getText() != ""){
		result = true;
	}
	
	else if(button3.getText() == button6.getText() && button6.getText() == 

button9.getText() && button3.getText() != ""){
		result = true;
	}
	 
	/* Diagonal */
	else if(button1.getText() == button5.getText() && button5.getText() == 

button9.getText() && button1.getText() != ""){
		result = true;
	}
	
	else if(button3.getText() == button5.getText() && button5.getText() == 

button7.getText() && button3.getText() != ""){
		result = true;
	}
	
	else {
		result = false;
	}
	 
	/* Win or Tie */
	if(result == true){
		if(letter == "X") 
		{

	 
		} else if(letter == "O")

		{ 
	  }
		JOptionPane.showMessageDialog(null, letter + " wins!");
				

	} else if(count == 9 && result == false) {
		JOptionPane.showMessageDialog(null, "Tie!");
		}
	}

	/* Calls the program */
	public static void main(String[] args){
     
	new TheFunction();
 
	}
}