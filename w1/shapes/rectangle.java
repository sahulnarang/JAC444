package shapes;

public class rectangle extends Shape {
	private double width;
	private double length;
	
	public rectangle(double width, double height) {
		setWidth(width);
		setHeight(height);
		System.out.println("Rectangle constructor was called");
	}
	
	public rectangle () {
		
	}
	
	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
		System.out.println(this.width);
	}

	public double getHeight() {
		return this.length;
	}

	public void setHeight(double height) {
		this.length = height;
		System.out.println(this.length);
	}
	
	
	 @Override
	   public String toString() {
	      return "Rectangle[length=" + length + ",width=" + width + "]";
	   }
	
	@Override
	public double perimeter() {
		double pmeter= 2 * (getHeight() + getWidth()) ;
		System.out.println("Perimter of rectangle is = "+ pmeter);
		return pmeter;
	}
}

	

