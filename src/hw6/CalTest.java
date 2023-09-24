package hw6;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c1 = new Calculator();

		try {
			System.out.println("請輸入x的值:");
			c1.setX(sc.nextInt());
			System.out.println("請輸入y的值:");
			try {
				c1.setY(sc.nextInt());
				try {
					System.out.println(c1.powerXY(c1.getX(),c1.getY()));
				} catch (CalException e) {
					System.out.println(e.getMessage());
				}
			} catch (CalException e) {
				System.out.println(e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("輸入格式不確定");
		}

	}
}
