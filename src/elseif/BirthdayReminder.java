
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 15th";
		String dadsBirthday = "August 23rd";
		String myBirthday = "November 17th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bDay = JOptionPane.showInputDialog("Ask any birthday");
		// 3. Print out what the user typed
	System.out.println(bDay);	
	if(bDay.equalsIgnoreCase("mom")) {
JOptionPane.showMessageDialog(null, momsBirthday);		
	}
	else if(bDay.equalsIgnoreCase("dad")) {
JOptionPane.showMessageDialog(null, dadsBirthday);		
	}
	else if(bDay.equalsIgnoreCase("you")) {
		JOptionPane.showMessageDialog(null, myBirthday);		
			}else {
					JOptionPane.showMessageDialog(null, "i don't remeber that birthday");		
						}
			}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 

