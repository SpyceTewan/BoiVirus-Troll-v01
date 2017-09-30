package at.behiftika.virus.boi;

public class DropThread extends Thread{
		@Override
		public void run() {
				try {
						Thread.sleep(13100);
				} catch (InterruptedException e) {
						e.printStackTrace();
				}
				DropManager.drop();
		}

}
