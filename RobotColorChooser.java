
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			
		
Robot fire=new Robot();
		//3. ask the user what color they would like the robot to draw
String colors=JOptionPane.showInputDialog("What Color Do You Want The Robot To Draw In");
		//4. use an if/else statement to set the pen color that the user request
if(colors.equals("red")) {
fire.setPenColor(Color.red);
}
if(colors.equals("green")) {
fire.setPenColor(Color.green);
}
if(colors.equals("black")) {
fire.setPenColor(Color.black);
}
if(colors.equals("blue")) {
fire.setPenColor(Color.blue);
}
if(colors.equals("White")) {
fire.setPenColor(Color.white);
}
if(colors.equals("Gray")) {
fire.setPenColor(Color.GRAY);
}
if(colors.equals("magneta")) {
fire.setPenColor(Color.MAGENTA);
}
        //5. if the user doesn’t enter anything, choose a random color
if(colors.equals(""))
	fire.setRandomPenColor();;
        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)

fire.setSpeed(10);
fire.penDown();
fire.setPenWidth(10);
fire.move(200);
fire.turn(90);
fire.move(200);
fire.turn(90);
fire.move(200);
fire.turn(90);
fire.move(200);
fire.turn(90);
	}
}
}