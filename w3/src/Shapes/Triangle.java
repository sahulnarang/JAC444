package Shapes;

public class Triangle implements Shape {
	private double[] width = new double[3];
	
	public Triangle(double width1, double width2, double width3 ) {
		this.width[0] = width1;
		this.width[1] = width2;
		this.width[2] = width3;
	}
	
	public Triangle() {

	}
	
	public boolean validate(double side1, double side2, double side3) {
		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Getters
	public double getWidth() {
		return width[0];
	}
	
	public double getLength() {
		return width[1];
	}
	
	public double getSide() {
		return width[2];
	}
	
	//Setters
	public void setWidth(double width1, double width2, double width3) {
		this.width[0] = width1;
		this.width[1] = width2;
		this.width[2] = width3;
	}
	
	@Override
	public double perimeter() {
		return getWidth() + getLength() + getSide();
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

//	ShapeInterface AREA = () -> Math.PI * getRadius() * getRadius();
//	
//	public double circleValue(double radius, ShapeInterface shape) {
//		return shape.getArea();
//	}
//	
	@Override
	public double getArea() {
//		return circleValue(getRadius(), AREA);
	return 0;
	}

	public String toString() {
		return ("Triangle {s1=" + width[0] + ", s2=" + width[1] + ", s3=" + width[2] + "} perimeter = " + Math.round(perimeter()*100.0)/100.0 +   "\n\n");
	}

}
