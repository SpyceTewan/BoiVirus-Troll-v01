package at.behiftika.virus.boi;

import com.spycesoftware.util.loop.LogMethod;
import com.spycesoftware.util.loop.Loop;

public class DropManager {
		public static void initDrop(){
				DropThread dropThreat = new DropThread();
				dropThreat.start();
				dropRunnable = new DropRunnable();
		}
		
		
		private static Loop dropLoop;
		private static Runnable dropRunnable;
		public static void drop(){
				
				dropLoop = new Loop("Drop", 100, dropRunnable, LogMethod.START_STOP);
				dropLoop.start();
		}

}
