package shapes;

public class parallelogram extends Shape {
	private double p_length=0;
	private double p_width=0;
	parallelogram(){
		
	}
	
	parallelogram(double len, double wid){
		setLength(len);
		setHeight(wid);
		System.out.println("into the parallelogram");
	}
	
	public void setLength(double len) {
		this.p_length=len;
		System.out.println(this.p_length);
	}
	public void setHeight(double wid) {
		this.p_width=wid;
		System.out.println(this.p_width);
	}
	public double getWidth() {
		return this.p_width;
	}
	public double getLength() {
		return this.p_length;
	}
	
	 @Override
	   public String toString() {
	      return "Parallelogram [ length= " + p_length + " , width= " + p_width + "]";
	   }
	
	@Override
	public double perimeter() {
		double pmeter = 2 * (getLength() + getWidth()) ;
		System.out.println("Perimter of Parallelogram is = "+ pmeter);
		return pmeter;
	}
	
	
	
}
