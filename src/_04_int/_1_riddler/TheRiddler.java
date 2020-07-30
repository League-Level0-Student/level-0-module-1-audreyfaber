package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0 ;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer1= JOptionPane.showInputDialog(null,"What goes though cities and fields but never moves?") ;
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer1.equals("A road")) {
	JOptionPane.showMessageDialog(null,"Correct!") ;
	score++ ;
}
else JOptionPane.showMessageDialog(null, "Wrong. The answer is a road");
		
String answer2=JOptionPane.showInputDialog(null, "What is made of water but if you put it into water it will die?") ;
if (answer2.equals("An ice cube")) {
	JOptionPane.showMessageDialog(null,"Correct!");
	score++ ;
}
else JOptionPane.showMessageDialog(null, "Wrong. The answer is an ice cube");

String answer3=JOptionPane.showInputDialog(null, "I'm tall when I'm young and I'm short when I'm old. What am I?") ;
if (answer3.equals("A candle")) {
	JOptionPane.showMessageDialog(null,"Correct!");
	score++ ;
}
else JOptionPane.showMessageDialog(null, "Wrong. The answer is a candle");

String answer4=JOptionPane.showInputDialog(null,"Which word in the dictionary is spelled incorrectly?") ;
if (answer4.equals("Incorrectly")) {
	JOptionPane.showMessageDialog(null,"Correct!");
	score++ ;
}
else JOptionPane.showMessageDialog(null, "Wrong. The answer is Incorrectly");

String answer5=JOptionPane.showInputDialog(null,"What is at the end of a rainbow?") ;
if (answer5.equals("w")) {
	JOptionPane.showMessageDialog(null,"Correct!") ;
	score++ ;
}
else JOptionPane.showMessageDialog(null, "Wrong. The answer is w ");


JOptionPane.showMessageDialog(null, "Your score is " + score );

// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

