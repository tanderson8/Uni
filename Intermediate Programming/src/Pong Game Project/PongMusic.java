package pong;

import java.io.*;

import javax.swing.JOptionPane;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class PongMusic {
	 public static void main(String[] args) {
	 
	 playMusic("C:/Users/Baron/Uni/Uni/Spring 2018/Intermediate Programming/Programs/pong/BGMusic.wav");
	 
	 }

	 public static void playMusic(String filepath) {
		 InputStream backgroundMusic;
		 
		 try {
			 backgroundMusic = new FileInputStream(new File(filepath));
			 AudioStream audio = new AudioStream(backgroundMusic);
			 AudioPlayer.player.start(audio);
		 }
		 catch(Exception e){
			 
			 JOptionPane.showMessageDialog(null,"Error");	
			 }
}
}
