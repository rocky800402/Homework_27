package hw5;

public class PloyPen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen[] p1 = new Pen[2];
		p1[0] = new Pencil("uni",100);
		p1[1] = new Inkbrush("sks",1000);
		for (int i = 0; i < p1.length; i++) {
			System.out.println(p1[i].getPrice());
			p1[i].write();
		}

	}

}
