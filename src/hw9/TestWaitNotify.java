package hw9;

public class TestWaitNotify {
		public static void main(String[] args) {
			Deposit deposit  = new Deposit();
			Mom mom = new Mom(deposit);
			Son son = new Son(deposit);
			mom.start();
			son.start();
			
		}
	}

	
class Deposit{
	private int balance = 0;
	
	synchronized public void makeDeposit(int cash) {
		while(balance>3000) {
			System.out.println("媽媽看到餘額在3000以上,暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		balance += cash;
		System.out.println("媽媽存入"+cash+"帳戶共有"+balance);
		notify();
	}
	synchronized public void withdraw(int cash) {
//		if(balance>cash) {
			while(balance<=0) {
				System.out.println("熊大看到帳戶沒錢,暫停取款");
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(balance<2000) {
				System.out.println("熊大看到餘額在2000以下,要求匯款");
				notify();
			}
			balance -= cash;
			System.out.println("熊大領了"+cash+"帳戶共有"+balance);
//		}else {
//			System.out.println("你的餘額:"+balance+",存款不足無法提款");
//		}
		
	}
		
}
	class Mom extends Thread{
		Deposit deposit;
		
		public Mom(Deposit deposit) {
			this.deposit = deposit;
		}
		public void run() {
			for(int i = 0;i<10;i++) {
				deposit.makeDeposit(2000);
			}
		}
	}
	class Son extends Thread{
		Deposit deposit;
		
		public Son(Deposit deposit) {
			this.deposit = deposit;
		}
		public void run() {
			for(int i = 0;i<10;i++) {
				deposit.withdraw(1000);
			}
		}
	}
	
	
