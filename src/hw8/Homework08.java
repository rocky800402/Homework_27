package hw8;

import java.math.BigInteger;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Homework08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		collectionTest();
	}
	public static void collectionTest() {
		ArrayList<Object> list = new ArrayList<Object>(); 
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
//		Iterator<Object> objs = list.iterator();
//		while(objs.hasNext()){
//			System.out.println(objs.next());
//		}
//		
//		for(int i = 0 ;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
//		
		for(Object a:list) {
			System.out.println(a);
		}
		System.out.println("================");
		// 移除不是java.lang.Number相關的物件
		for(int i = 0 ; i<list.size();i++) {
			if(!(list.get(i) instanceof java.lang.Number)) {
				list.remove(i);
				i--;
			}
		}
		
			
		// 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功			
		for(int i = 0 ;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
	
}
