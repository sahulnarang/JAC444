package shapes;

public class triangle extends Shape {
	private double side1 , side2, side3;
	
	triangle(){

	}
	
	triangle(double side, double side2, double side3){
		setSides(side,side2,side3);
	}
	
	
	
	public void setSide1(double sde1) {
			this.side1=sde1;
			
	}
	public void setSide2(double sde2) {
			this.side2=sde2;
			
	}
	public void setSide3(double sde3) {
		
		this.side3 = sde3;	
	}
	
	
	
	
	public double getWidth1() {
		System.out.println(this.side1);
		return this.side1;
		
	}
	
	public double getWidth2() {
		System.out.println(this.side2);
		return this.side2;
		
	}
	public double getWidth3() {
		System.out.println(this.side3);
		return this.side3;
		
	}
	
	 @Override
	   public String toString() {
	      return "Triangle[side1 =" + this.side1 + ", side2=" + this.side2 + ", side3 =" + this.side3 + "]";
	   }
	
	@Override
	public double perimeter() {
		double pmeter = getWidth1() + getWidth2() + getWidth3();
		System.out.println("Perimeter of triangle is = "+ pmeter);
		return pmeter;
	}
}
