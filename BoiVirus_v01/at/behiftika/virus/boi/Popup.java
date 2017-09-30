package at.behiftika.virus.boi;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Popup extends JFrame implements KeyListener, WindowListener{
			private static final long serialVersionUID = 6244228487373762551L;
			protected JPanel panel;
			protected JLabel image;
			public Popup(String name, String pic){
					setLocation(0, 0);
					setEnabled(true);
					setTitle(name);
					setSize(300, 300);
					
					URL url = this.getClass().getResource(pic);
					ImageIcon icon = new ImageIcon(url);
					panel = new JPanel();
					image = new JLabel(icon);
					image.setSize(200, 200);
					panel.setSize(200, 200);
					
					panel.add(image);
					panel.setBackground(Color.white);
					add(panel);
					
					
			}

			@Override
			public void windowActivated(WindowEvent e) {
				
			}

			@Override
			public void windowClosed(WindowEvent e) {
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				
			}

			@Override
			public void windowOpened(WindowEvent e) {
					
			}

			@Override
			public void keyPressed(KeyEvent e) {
					
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				
			}
}
