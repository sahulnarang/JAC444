package Shapes;

public class Rectangle implements Shape {
	private double width;
	private double length;
	static int count;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.length = height;
	}
	
	public Rectangle() {
		super();

	}
	
	//Getters
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	//Setters
	public void setWidth(double width, double length) {
		this.width = width;
		this.length = length;
		count++;
	}
	
	//Perimeter
	@Override
	public double perimeter() {
		return (getWidth() * 2) + (getLength() * 2);
	}

	@Override
	public double getSide() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	ShapeInterface AREA = () -> getWidth() * getLength();
	
	public double rectangle_area(double len, double wid, ShapeInterface shape) {
		return shape.getArea();
	}
	
	@Override
	public double getArea() {
		return rectangle_area(getWidth(), getLength(),  AREA);
	}

	
	public String toString() {
		return ("Rectangle {w=" + width + ", " + "h=" + length + "} perimeter = " + Math.round(perimeter()*100.0)/100.0 + "  Area -> " + Math.round(getArea()*100.0)/100.0 + "\n\n");
	}
	
}
