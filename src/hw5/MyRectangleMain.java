package hw5;

public class MyRectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRectangle m1 = new MyRectangle();
		MyRectangle m2 = new MyRectangle(10,20);
		m1.setWidth(10);
		m1.setDepth(20);
		System.out.println(m1.getArea());
		System.out.println(m2.getArea());
	}

}
