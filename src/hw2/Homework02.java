package hw2;

public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01();
		test02();
		test03();
		test04();
		test05();
		test06();
		test07();
		test99();
	}

	public static void test01() {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("---------------------------------------");
	}

	public static void test02() {
		int sum = 1;
		for (int i = 1; i <= 10; i++) {
			sum *= i;
		}
		System.out.println(sum);
		System.out.println("---------------------------------------");
	}

	public static void test03() {
		int sum = 1;
		int i = 1;
		while (i <= 10) {
			sum *= i;
			i++;
		}
		System.out.println(sum);
		System.out.println("---------------------------------------");
	}

	public static void test04() {
		int j = 0;
		for (int i = 1; i <= 10; i++) {
			j = i * i;
			System.out.print(j + " ");
		}
		
		System.out.println("\n---------------------------------------");
	}

	public static void test05() {
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != 4) {
				if (i < 40) {
					count++;
					System.out.print(i + " ");
				}
			}
		}
		System.out.println("\n總共有" + count + "個");
		System.out.println("---------------------------------------");
	}

	public static void test06() {
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}
	
	public static void test07() {
		for (int i = 1; i <= 6; i++) {
			char a = (char) (65+i-1);
			for (int j = 1; j <= i ; j++) {
				
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
	}
	
	public static void test99() {
		for (int i = 1; i <= 9; i++) {
			
			int x=1;
			while (x<=9) {
				System.out.print(i+" x "+x+" = "+i*x+ "\t");
				x++;
			}
			System.out.println();
		}
		
		System.out.println("=============================================");
		
		for (int i = 1; i <= 9; i++) {
			int x=1;
			do {
				System.out.print(i+" x "+x+" = "+i*x+ "\t");
				x++;
			} while (x<=9);
			System.out.println();
			
			
		}
		
		System.out.println("=============================================");
		
		int i = 1;
		while(i<=9) {
			
			int x = 1;
			do {
				System.out.print(i+" x "+x+" = "+i*x+ "\t");
				x++;
			} while (x<=9);
			System.out.println();
			i++;
		}
	}
}
