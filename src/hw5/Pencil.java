package hw5;

public class Pencil extends Pen{
	
	public Pencil() {
		
	}
	public Pencil(String brand, int price) {
	super(brand,price);	
	}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("削鉛筆再寫");
	}
	public int getPrice() {
		
		return (int)(super.getPrice()*0.8);
	}
	
	
	
	
	

	
}
