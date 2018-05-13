package shapes;

public class square extends Shape {
	private double side=0.0;
	
	square(){
	}
	
	square(double side){
		setside(side);
	}
	
	public void setside(double length){
		this.side = length;
		System.out.println(this.side);
	}
	
	public double getSide() {
		return side;
	}
	
	 
	public String toString() {
	    return "Square [Side = " + side + "]";
	}
	
	@Override
	public double perimeter()
	{
		double pmeter =   this.side * 4;
		System.out.println("Perimeter is " + pmeter );
		return pmeter;
	}
	
}
