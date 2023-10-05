package hw8;

import java.util.Objects;

public class Train implements Comparable<Train> {
	
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train() {}
	public Train(int number, String type,String start , String dest,double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
		
	}

	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void display() {
		System.out.println(number+","+type+","+start+","+dest+","+price);
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	public int compareTo(Train trains) {
		if(this.number > trains.number) {
			return -1;
		}else if (this.number < trains.number){
			return 1;
		}else {
			return 0;
		}
	}
	

}
