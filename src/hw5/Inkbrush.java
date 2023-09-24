package hw5;

public class Inkbrush extends Pen {

	public Inkbrush() {

	}

	public Inkbrush(String brand, int price) {
		super(brand,price);
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("沾墨汁再寫");
	}

	public int getPrice() {
		return (int)(super.getPrice()*0.9);
	}

}
