package hw3;

import java.util.Scanner;

import javax.swing.text.DefaultCaret;

public class Homework03 {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework03 hw3 = new Homework03();
		hw3.clasTriangle();
		
		hw3.guessNum();
		hw3.lotto();
	}

	public void clasTriangle() {
		System.out.println("請輸入三個整數:");
		int num1=sc.nextInt(),
			num2=sc.nextInt(),
			num3=sc.nextInt(),
			temp;
		
		if(num1<num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1<num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num1 < num2 + num3) {
			if (num1 == num2 && num2 == num3) {
				System.out.println("正三角形");
			} else if (num2 == num3) {
				System.out.println("等腰三角形");
			} else if (num1 * num1 == num2 * num2 + num3 * num3) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
		
		System.out.println("===============");
		
	}

	public void guessNum() {
		System.out.println("終極密碼開始，請輸入0~100的數字:");
		int numX = (int) (Math.random() * 101), numA = sc.nextInt();
		while (numA != numX) {
			if (numA > numX) {
				System.out.println(numA + " ,數字太大囉!");
			} else {
				System.out.println(numA + " ,數字太小囉!");
			}
			System.out.println("答案錯誤，在猜一次。");
			numA = sc.nextInt();
		}
		System.out.println("終極密碼:" + numX + ",恭喜你答對了。");
		System.out.println("===============");
	}

	public void lotto() {
		System.out.println("請輸入你討厭的哪個數字(1~9):");
		int num = sc.nextInt(), lottoNum = 49, count = 0,count2 = 0 , x;
		int[] data =new int[49];
		for (int i = 1; i <=lottoNum; i++) {
			if (i % 10 != num) { //去除個位數是num指定值
				if (i /10!=num) { //去除十位數是num指定值
					count++; 
					System.out.print(i + " ");
					//方法1
//					data[i-1]= i ;  //把符合條件的整數放入陣列,不符合不設定值為0(defaul)
//									//陣列相對位置
					//方法2
					data[count]= i ;//把符合條件的整數放入陣列,不符合不設定值為0(defaul)
				}					  //從投放入到count值，其餘後面都補0(defaul)
			}
			
		}
		System.out.println("\n總共有"+count+"數字可以選");
		System.out.println("電腦選號隨機六碼:");
		//方法1
//		while(count2 < 6) {      				//只取6次
//			x=data[(int)(Math.random() * 49)];	//隨機取陣列值(49碼)
//			if(x!=0) {							//值不為0
//				data[x]=0;						//避免重複取相同值，把值設為0
//				System.out.print(x+" ");
//				count2++;
//			}
//		}
		//方法2
		while(count2 < 6) {						//只取6次
			int y=(int)(Math.random() * count); //隨機取陣列值(範圍count值,其於值為0無須帶入)
			x=data[y];
			if(x!=0) {							//值不為0
				data[y]=0;						//避免重複取相同值，把值設為0
				System.out.print(x+" ");
				count2++;
			}
			
		}
		System.out.println("\n===============");	
/*			while(count2 < 6) {
			count2++;
			x=data[(int)(Math.random() * 49)];
			
			while(x==0) {
				x=data[(int)(Math.random() * 49)];	
			}
			data[x]=0;
			System.out.print(x+" ");
*/			
			
	}

}
