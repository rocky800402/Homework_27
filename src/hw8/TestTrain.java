package hw8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain {

	public static void main(String[] args) {
		Train[] tr = new Train[7];
		tr[0] = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		tr[1] = new Train(1254, "區間", "屏東", "基隆", 700);
		tr[2] = new Train(118, "自強", "高雄", "台北", 500);
		tr[3] = new Train(1288, "區間","新竹", "基隆", 400);
		tr[4] = new Train(122, "自強","台中", "花蓮", 600);
		tr[5] = new Train(1222, "區間","樹林", "七堵", 300);
		tr[6] = new Train(1254, "區間","屏東", "基隆", 700);
//		hashSetTrain(tr[0],tr[1]);
//		treeMapTrain(tr);
		treeSetTrain(tr);
	}
	public static void hashSetTrain(Train ...trains) {
		Set<Train> set = new HashSet<Train>();
		for(Train a:trains) {
			set.add(a);
		}
		System.out.println("迭代器==========");
		Iterator obj = set.iterator();
		while(obj.hasNext()) {
			Train temp = (Train)obj.next();
			temp.display();
		}
		
		
		System.out.println("for迴圈==========");
		for(Train temp:set) {
			temp.display();
		}
	}
	
	public static void treeMapTrain(Train ...trains) {
		List<Train> list = new ArrayList<Train>();
		
		for(Train a:trains) {
			list.add(a);
		}
		
		Collections.sort(list);
		System.out.println("迭代器==========");
		Iterator obj2 = list.iterator();
		
		Iterator obj = list.iterator();
		while(obj.hasNext()){
			Train temp = (Train)obj.next();
			temp.display();
		}
		
		System.out.println("for迴圈==========");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).display();
		}
		
		System.out.println("foreach==========");
		for(Train a:list) {
			a.display();
		}
		
	}
	public static void treeSetTrain(Train...trains) {
		
		Set<Train> set = new TreeSet<Train>();
		for(Train a : trains) {
			set.add(a);
		}
		System.out.println("迭代器==========");
		Iterator obj = set.iterator();
		while(obj.hasNext()) {
			Train tmep = (Train)obj.next();
			tmep.display();
		}
		
		System.out.println("foreach==========");
		for(Train a:set) {
			a.display();
		}
		
		
	}
}
