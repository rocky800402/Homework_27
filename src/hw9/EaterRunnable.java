package hw9;

public class EaterRunnable implements Runnable{
	private String name;
	private int count=1;
	private int bowls;
	
	
	public EaterRunnable(String name, int bowls) {
		this.name = name;
		this.bowls = bowls;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBowls() {
		return bowls;
	}


	public void setBowls(int bowls) {
		this.bowls = bowls;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(bowls>0){
			System.out.println(name+"吃第"+count+"碗");
			count++;
			bowls--;
			try {
				Thread.sleep((long)(Math.random()*2500+500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name+"吃完了");
	}

}
