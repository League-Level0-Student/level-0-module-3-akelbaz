package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	static Robot bob = new Robot();

	public static void main(String[] args) {

		bob.hide();
		String answer = JOptionPane.showInputDialog("What is your favorite shape, GOOD SIR!?");
		String answer2 = JOptionPane.showInputDialog("And in Green, Blue, or Red, GOOD SIR!");
		if (answer2.equalsIgnoreCase("Red")) {
			bob.setPenColor(187, 051, 051);
		} else if (answer2.equalsIgnoreCase("Blue")) {
			bob.setPenColor(0, 51, 255);
		} else if (answer2.equalsIgnoreCase("Green")) {
			bob.setPenColor(0, 255, 80);
		} else {
			JOptionPane.showMessageDialog(null, "I can't draw in that color, GOOD SIR!");
		}

		if (answer.equalsIgnoreCase("Square")) {
			drawSquare();
		} else if (answer.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		} else if (answer.equalsIgnoreCase("Circle")) {
			drawCircle();
		} else {
			JOptionPane.showMessageDialog(null, "I can't draw that, GOOD SIR!");
		}

	}

	public static void drawSquare() {

		bob.hide();
		for (int i = 0; i < 4; i++) {
			bob.setSpeed(10);
			bob.sparkle();
			bob.penDown();
			bob.move(100);
			bob.turn(90);
		}
		bob.hide();
		bob.unSparkle();
	}

	public static void drawTriangle() {

		bob.hide();
		for (int i = 0; i < 3; i++) {
			bob.setSpeed(10);
			bob.sparkle();
			bob.penDown();
			bob.move(100);
			bob.turn(120);
		}
	}

	public static void drawCircle() {

		bob.hide();
		bob.sparkle();
		bob.penDown();
		bob.setSpeed(1000000000);
		for (int i = 0; i < 360; i++) {
			bob.move(100);
			bob.turn(1);
			bob.move(-100);
		}
	}
}