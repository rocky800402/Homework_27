package hw9;

public class homework09 {

	
	public static void main(String[] args) {
		EaterRunnable moon = new EaterRunnable("饅頭人", 10);
		Thread tm = new Thread(moon);
		EaterRunnable james = new EaterRunnable("詹姆士", 10);
		Thread tj = new Thread(james);
		System.out.println("========大胃王快食比賽開始========");
		tm.start();
		tj.start();
		try {
			tm.join();
			tj.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("========大胃王快食比賽結束========");
	}
	
}
