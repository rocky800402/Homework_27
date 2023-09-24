package hw5;

import java.util.Scanner;

public class Homework05 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starSquare(5, 4);
		System.out.println("=============");
		randAvg();
		System.out.println("=============");
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double [][] doubleArray= {{1.3,3.5,2.2},{7.4,2.1,8.2}};
		Homework05 hw5 = new Homework05();
		System.out.println(hw5.maxElement(intArray));
		System.out.println(hw5.maxElement(doubleArray));
		System.out.println("=============");
		System.out.println(genAuthCode());
	
	}

	public static void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void randAvg() {
		int x;
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			x = (int) (Math.random() * 101);
			System.out.print(x + " ");
			sum += x;
		}
		System.out.println("\n" + sum / 10);
	}

	public int maxElement(int x[][]) {
		int temp = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (temp < x[i][j]) {
					temp = x[i][j];
				}
			}
		}

		return temp;
	}

	public double maxElement(double x[][]) {
		double temp = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (temp < x[i][j]) {
					temp = x[i][j];
				}
			}
		}

		return temp;
	}
	
	public static String genAuthCode() {
		//0~9 代碼48~57,A~Z 代碼65~90,a~z 代碼97~122//48~122
		int charNum;String authCode = "";
		char[] cArray = new char[8];
		System.out.println("本次隨機產生驗證碼為:");
		for (int i = 0; i < 8; i++) {
			charNum=(int)(Math.random()*75)+48;
			while (charNum<48||charNum>57&&charNum<65||charNum>90&&charNum<97) {
				charNum=(int)(Math.random()*75)+48;
			}
			cArray[i] = (char)charNum;
		}
		
		
		return authCode.valueOf(cArray);
	}
}
