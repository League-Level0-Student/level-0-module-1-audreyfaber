package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Isabel= ("Isabel is very good at coding!") ;
String Sophia= ("Sophia is very kind!") ;
String Hannah= ("Hannah is amazing at soccer!") ;
		// 2. Ask the user to enter a name. Store their answer in a variable.
String enter = JOptionPane.showInputDialog("Enter a name") ;

if (enter.equals("Isabel")) {
	JOptionPane.showMessageDialog(null, Isabel) ;
}
else if (enter.equals("Sophia")) {
	JOptionPane.showMessageDialog(null,Sophia);
}
if (enter.equals("Hannah")) {
	JOptionPane.showMessageDialog(null,Hannah) ;
}

		// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

