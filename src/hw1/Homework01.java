package hw1;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01();
		System.out.println("--------------------");
		test02();
		System.out.println("--------------------");
		test03();
		System.out.println("--------------------");
		test04();
		System.out.println("--------------------");
		test05();
		System.out.println("--------------------");
		test06();
	}
	public static void test01() {
		int a = 12;
		int b = 6;
		System.out.println("12+6="+a+b);
	}
	
	public static void test02() {
		int eggs = 200;
		
		System.out.printf("200顆雞蛋共%d打%d顆%n",eggs/12,eggs%12);
	}
	
	public static void test03() {
		int time =256559;
		int as = time%60;
		int ah = time%(60*60*24)/3600;
		int am = time%3600/60;
		int ad = time/(60*60*24);
		
	
		System.out.printf("%d天%d小時%d分%d秒%n",ad,ah,am,as);
	}
	public static void test04() {
		final double PI = 3.1415;
		int a = 5;
		double length = a*2*PI;
		double area = Math.pow(a, 2);
		
		System.out.printf("圓周長:%.4f,園面積:%.4f%n",length,area);
		
	}
	
	public static void test05() {
		int p = 1500000;
		int n = 10*12;
		double i =0.02;
		double s = p* (Math.pow(1+i,n));
		System.out.printf("本金加利息共%.4f元%n",s);
	}
	
	public static void test06() {
		System.out.println(5+5); //5+5為整數相加
		System.out.println(5+'5');//第一個5為整數,第二個5為字元,該字元為10進位Unicode編碼=53,故5+53=58
		System.out.println(5+"5");//第二個5為字串非整數值,輸出後整數5會直接串連字串5
	}

}
