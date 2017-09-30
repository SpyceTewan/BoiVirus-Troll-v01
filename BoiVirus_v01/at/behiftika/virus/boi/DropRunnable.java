package at.behiftika.virus.boi;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

public class DropRunnable implements Runnable{
		
		private ArrayList<Popup> popups;
		private int POPUP_COUNT = 50;
		
		
		public DropRunnable() {
				popups = new ArrayList<Popup>();
				for(int i = 0; i < POPUP_COUNT; i++){
					int a = (int) Math.floor( Math.random() * 4 ) + 1;
					Popup p = new Popup("WHO DID THIS??? xD", "assets/popup_image_0"  + a +  ".jpg");
					
					popups.add(p);
				}
		}
		
		@Override
		public void run() {			
				
				for(Popup pop : popups){
						Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
						int x = (int) (Math.random() * (d.getWidth() - pop.getSize().getWidth()));
						int y = (int) (Math.random() * (d.getHeight() - pop.getSize().getHeight()));
						pop.setLocation(x, y);
						pop.setVisible(true);
				}
		}
		
}
