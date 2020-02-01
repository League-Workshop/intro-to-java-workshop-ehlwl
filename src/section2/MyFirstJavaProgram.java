package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		
		Robot rob = new Robot("mini");
		Robot ro = new Robot("mini");
		rob.setSpeed(100);
		rob.penDown();
		rob.move(100);
		rob.turn(180);
		rob.move(50);
		rob.turn(270);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(180);
		rob.move(100);
		rob.hide();
	    ro.setSpeed(100);
		ro.moveTo(200, 250);
		ro.penDown();
		for(int i = 0; i < 999; i++){
			ro.setRandomPenColor();
			ro.move(100);
			ro.turn(90);
		}
	}
}
