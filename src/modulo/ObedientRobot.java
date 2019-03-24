package modulo;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
drawTriangle();
}

public static void drawSquare() {
Robot bob = new Robot();
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
	Robot bob = new Robot();
	for (int i = 0; i < 3; i++) {
	bob.setSpeed(10);
		bob.sparkle();
	bob.penDown();
	bob.move(100);
	bob.turn(120);	
}
}
}