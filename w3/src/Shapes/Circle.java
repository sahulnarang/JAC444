package Shapes;

public class Circle implements Shape {
	private double radius;
	private final ShapeInterface AREA = () -> Math.PI * getRadius() * getRadius();
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle() {
	}
	
	//Getters
	public double getRadius() {
		return radius;
	}
	
	//Setters
	public void setRadius(double radius) {
		this.radius = radius;
	}

	
	//Perimeter
	public double perimeter() {
		return getRadius() * 2 * Math.PI;
	}
	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getSide() {
		// TODO Auto-generated method stub
		return 0;
	}	
	
	public double circleValue(double radius, ShapeInterface shape) {
		return shape.getArea();
	}
	
	@Override
	public double getArea() {
		return circleValue(getRadius(), AREA);
	}
	
	
	public String toString() {
		return ("Circle {r=" + radius + "} perimeter = " + Math.round(perimeter()*100.0)/100.0 + "   Area-> " + Math.round(getArea()*100.0)/100.0 +"\n\n");
	}
}
