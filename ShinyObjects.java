//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {

		// 2. Ask the user how many shiny objects they want
String shine=JOptionPane.showInputDialog("How Many Shiny Objects Do You Want");
		// 3. Play the sound that many times
int zoom=Integer.parseInt(shine);
for (int i = 0; i < zoom; i++) {
	

		// 1. Call the method below
playMisterZee();
	}}

	public static void playMisterZee() {
    	try {
 
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(AudioSystem.getAudioInputStream(ShinyObjects.class.getResource("shiny-objects.wav")));
   		 clip.start();
   		 Thread.sleep(3600);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}


}
