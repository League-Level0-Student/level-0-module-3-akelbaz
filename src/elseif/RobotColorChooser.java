//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		for(int i = 0; i <11; i++) {
			//1. Create a new Robot
		Robot bob = new Robot();
		//3. Ask the user what color they would like the robot to draw
String color = JOptionPane.showInputDialog("What color would you like the amazing robot to draw in?");	
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equalsIgnoreCase("Red")) {
bob.setPenColor(255, 51, 0);       
}else if(color.equalsIgnoreCase("Orange")) {
	bob.setPenColor(255, 128, 0); 
}else if(color.equalsIgnoreCase("Yellow")) {
	bob.setPenColor(255, 255, 0);
}else if(color.equalsIgnoreCase("Green")) {
	bob.setPenColor(64, 255, 0);
}else if(color.equalsIgnoreCase("Blue")) {
		bob.setPenColor(0, 191, 255);
}else if(color.equalsIgnoreCase("Purple")) {
			bob.setPenColor(128, 0, 255);
}else {
	JOptionPane.showMessageDialog(null, "Sorry, we don't have that color");	
}
Random rand = new Random();	
int randoom = rand.nextInt(256);
//6. If the user doesn’t enter anything, choose a random color
if(color.equalsIgnoreCase("")) {
	bob.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
JOptionPane.showMessageDialog(null, "RANDOOOOOOOOOOOOOM" + randoom + randoom + randoom);
		//4. Set the pen width to 10
bob.setPenWidth(10);	
	    //2. Make the robot draw a shape (this will take more than one line of code)
bob.penDown();
bob.setSpeed(50);
bob.hide();
for(int i2 = 0; i2<4; i2 ++) {
bob.move(100);
bob.turn(90);
}
	}
}
}