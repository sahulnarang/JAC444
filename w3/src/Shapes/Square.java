package Shapes;

public class Square extends Rectangle {
	double width;
	static int count;
	
	public Square(double width) {
		this.width = width;

	}
	
	public Square() {
		super();

	}
	
	public double getWidth() {
		return width;
	}
	
	
	public void setWidth(double width) {
		this.width = width;
		count++;
	}
	
	@Override
	public double perimeter() {
		return getWidth() * 4;
	}

	@Override
	public double getLength() {
		// TODO Auto-generated method stub
		return 0;
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
	
	ShapeInterface AREA = () -> getWidth() * getWidth();
	
	public double sq_area(double len, ShapeInterface shape) {
		return shape.getArea();
	}
	
	@Override
	public double getArea() {
		return sq_area(getWidth(),  AREA);
	}

	
	public String toString() {
		return ("Square {w=" + width + "} perimeter = " + perimeter() + "    Area->  " + getArea() +"\n\n");
	}
	
	
}
