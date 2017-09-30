package at.behiftika.virus.boi;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.spycesoftware.util.loop.LogMethod;
import com.spycesoftware.util.loop.Loop;

public class MainWindow {
	
		JFrame frame;
		JPanel panel;
		JLabel text;
		JLabel picture;
		Loop countdownLoop;
		int count;
		public MainWindow(){
				frame = new JFrame("boi ");
				panel = new JPanel();
				picture = new JLabel(new ImageIcon(this.getClass().getResource("assets/boi.jpg")));
				picture.setSize(1000, 300);
				text = new JLabel("YOU HAVE 12 SECONDS TO CLOSE THIS WINDOW!!! xDD");
				text.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
				text.setSize(500, 200);
				count = 12;
				
				countdownLoop = new Loop("Countdown", 1000, new Runnable() {
					
						@Override
						public void run() {
								if(count == -1){
									text.setText("LET'S BEGIN !! xDD");
								}else{
									count--;
									text.setText("YOU HAVE " + count + " SECONDS TO CLOSE THIS WINDOW!!! xDD");
								}
						}
				}, LogMethod.COUNTER, 13);
				countdownLoop.start();
				
				panel.add(text);
				panel.add(picture);
				panel.setBackground(Color.red);
				frame.setSize(1000, 600);
				frame.add(panel);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
		}
		
		public void playMusic(){
				
			try {
				 	URL url = this.getClass().getResource("assets/spongebob.wav");
	               AudioInputStream input = AudioSystem.getAudioInputStream(url);
	               
	               
	               Clip clip = AudioSystem.getClip();
	               clip.open(input);
	               clip.start();
	               
	            } catch (UnsupportedAudioFileException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            } catch (LineUnavailableException e) {
	                e.printStackTrace();
	            }
				
		}
}
