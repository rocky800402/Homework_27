package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01();
		System.out.println("\n=================");
		System.out.println(test02("Hello World"));
		System.out.println("=================");
		test03();
		System.out.println("=================");
		test04();
		System.out.println("\n=================");
		test05();
		System.out.println("=================");
		test06();
		System.out.println("\n=================");
	}

	public static void test01() {
		int[] data = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		avg = sum / data.length;
		System.out.println(avg);
		for (int j = 0; j < data.length; j++) {
			avg = sum / data.length;
			if (data[j] > avg) {
				System.out.print(data[j] + " ");
			}
		}

	}

	public static String test02(String s) {

		if (s.equals("")) {
			return "";
		} else {
			return test02(s.substring(1)) + s.substring(0, 1);
		}
	}

	public static void test03() {
		String[] data = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			String s = data[i];
			for (int j = 0; j < s.toCharArray().length; j++) {
				char c = s.toCharArray()[j];
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
		}
		System.out.println(count);

	}

	public static void test04() {
		int[][] num = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.println("輸入借款金額: ");
		int loan = sc.nextInt();
		int count = 0;
		System.out.print("有錢借的員工編號:");
		for (int i = 0; i < num.length; i++) {
			if (loan <= num[i][1]) {
				count++;
				System.out.print(num[i][0]+" ");
			}
		}
		System.out.print("共"+count+"人!");

	}
	
	public static void test05() {
		System.out.println("請輸入(西元yyyy年，mm月，dd日)三個數字:");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		int[] nonLeapYear = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
		
	
		if (year%4==0 && year%100==0 && year%400==0 || year%4==0 && year%100!=0) {
//			閏月 366
			while (judgeDate(year, month, day, 29)) {
				System.out.println("輸入錯誤，請重新輸入:");
				year = sc.nextInt();month = sc.nextInt();day = sc.nextInt();
			}
			System.out.printf("輸入的日期為該年第%d天%n",totalDays(month, day, leapYear));
		}else {
//			平年 365
			while (judgeDate(year, month, day, 28)) {
				System.out.println("輸入錯誤，請重新輸入:");
				year = sc.nextInt();month = sc.nextInt();day = sc.nextInt();
			}
			System.out.printf("輸入的日期為該年第%d天",totalDays(month, day, nonLeapYear));
			
		}
	}
	
	public static void test06() {
		int[][] data = {{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
		int[] count = new int[8];
		int temp;
		for (int i = 0; i < data.length; i++) {
			temp =0;
			int x = 0;
			for (int j = 0; j < data[i].length; j++) {
				if(temp<data[i][j]) {
					temp = data[i][j];
					x = j;
				}
			}
			count[x]+= 1;
		}
		System.out.println("每位學生最高分次數:");
		int seatNum = 1;
		for(int x:count) {
			System.out.printf("%d號:%d次\t",seatNum++,x);	
		}
	}
	public static boolean judgeDate(int y,int m,int d,int daysInFed) {
		//月份大於12
		if(m > 12) 
			return true;
		//1、3、5、7、8、10、12月大於31天
		if (( m == 1||m == 3||m == 5||m == 7||m == 8||m == 10||m == 12 )&& d > 31)
			return true;
		//4、6、9、11月大於30天
		if((m == 4||m == 6||m == 9||m == 11)&& d >30)
			return true;
		//2月大於daysInFed(28or29)天
		if(m == 2 && d > daysInFed)
			return true;
		
		return false ;
		}
	
	public static int totalDays(int month,int day,int[] dataDays) {
		int sum=0;
		if(month == 1) {
			sum += day;
		}else {
			for (int i = 0; i < month-1; i++) {
			sum+=dataDays[i];
			}
			sum +=day;
		}
		return sum;
	}
}
