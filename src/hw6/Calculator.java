package hw6;

public class Calculator {
	private int x ;
	private int y ;
	
	public Calculator() {
	}
	
	public Calculator(int x,int y) throws CalException{
		if(x>=0) {
			this.x = x;
			this.y = y;
			
		}else {
		throw new CalException("輸入格式部正確");
		}
	}
	
	public int getX() {
		return this.x;
	}
	public void setX(int x){
		this.x = x;
		
	}

	public int getY() {
		return this.y;
	}
	public void setY(int y) throws CalException{
		if(y>=0) {
			this.y = y;
		}else {
			throw new CalException("次方為負數，結果回傳不為整數");
		}
	}
	public int powerXY() throws CalException{
		if(y==0 && x==0) {
			throw new CalException("0的0次方沒有意義!");
		}else {
			return (int)Math.pow(x, y);
		}
	}
	
	public int powerXY(int x,int y) throws CalException {
		return this.powerXY();
	}
}
