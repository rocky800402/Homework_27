package hw10;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Date;
import java.util.Scanner;

public class Homework10 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("============第一題============");
		for (int i = 0; i <5; i++) {
			int num = (int)(Math.random()*100+1);
			ifPrime(num);
		}
		System.out.println("============第二題============");
		numFormat();
		
		System.out.println("============第三題============");
		try {
			dateFormat();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}

	public static void ifPrime(int num) {
		boolean isPrime = true;
		int t = (int)Math.sqrt(num);
		for (int i = 2; i <= t; i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+"是質數");
		}else {
			System.out.println(num+"是不質數");
		}
	}
	
	public static void numFormat() {
		String regex = "[0-9]{0,}.[0-9]{1,}";
		System.out.print("請輸入數字 : ");
		Double num = sc.nextDouble();
		String numString = new BigDecimal(num).toPlainString() ; 
//		String numString = String.valueOf(num); 
		
		if(numString.matches(regex)) {
			System.out.print("欲格式化成，(1)千分位(2)百分比(3)科學記號 : ");
			int format = sc.nextInt();
			if(format == 1) {
			Format dfm1 = new DecimalFormat("#,###.00");
			System.out.println(dfm1.format(num));
			}
			
			if(format == 2) {
				Format dfm1 = new DecimalFormat("0.00%");
				System.out.println(dfm1.format(num));
			}
			
			if(format == 3) {
				Format dfm1 = new DecimalFormat("0.##E0");
				System.out.println(dfm1.format(num));
			}
			
		}else {
			System.out.println("數字格式不正確，請重新輸入");
		}
	}
	
	public static void dateFormat() throws ParseException {
		System.out.print("請輸入日期 : ");;
		String date = sc.next();
		String regexDate1;
		Date sdf = new SimpleDateFormat("yyyyMMdd").parse(date);

		//轉換判斷閏年
		Format sdf1 = new SimpleDateFormat("yyyy-MM");
		if(YearMonth.parse(sdf1.format(sdf)).isLeapYear()) {
			
			regexDate1 = "(\\d{4}(0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|(\\d{4}(0[469]|11)(0[1-9]|[12]\\d|30))|(\\d{4}02(0[1-9]\\1\\d|2[0-9]))"; 
		}else {
			regexDate1 = "(\\d{4}(0[13578]|1[02])(0[1-9]|[12]\\d|3[01]))|(\\d{4}(0[469]|11)(0[1-9]|[12]\\d|30))|(\\d{4}02(0[1-9]\\1\\d|2[0-8]))"; 
			
		}
		
		//日期格式選擇
		if(date.matches(regexDate1)) {
			System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
			int format = sc.nextInt();
			if(format==1) {
				Format sfm1 = new SimpleDateFormat("yyyy/MM/dd");
				System.out.println(sfm1.format(sdf));
			}
			if(format==2) {
				Format sfm1 = new SimpleDateFormat("MM/dd/yyyy");
				System.out.println(sfm1.format(sdf));
			}
			if(format==3) {
				Format sfm1 = new SimpleDateFormat("dd/MM/yyyy");
				System.out.println(sfm1.format(sdf));
			}
		}else {
			System.out.println("日期格式不正確，請在輸入一次");
			
		}
	}


}