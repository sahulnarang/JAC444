package shapes;

public class circle extends Shape{
	private double radius;

	
	
	public circle() {
	}
	
	
	public circle(double radius) {
		System.out.println("into the circle");
		setRadius(radius);
	}
	
	public void setRadius(double rad) {
		this.radius=rad;
	}
	
	
	public double getRadius() {
		return radius;
	}
	
	 @Override
	   public String toString() {
	      return "Circle [radius = " + radius + "]";
	   }
	
	@Override
	public double perimeter() {
		double pmeter = 2 * Math.PI * getRadius();
		System.out.println("circle perimeter is " + pmeter);
		return pmeter;
	}
}
