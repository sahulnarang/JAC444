package shapes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		//final String file = "C:\\Users\\shapes.txt";
		BufferedReader br = null;
		FileReader fr = null;
		//int n = Integer.parseInt(args[1]); 
		//String s;
		try  {
			fr = new FileReader("C:\\Users\\Sahul Narang\\eclipse-workspace\\workshop\\src\\shapes\\shapes.txt");
			
			br = new BufferedReader(fr);
			String s;
			
			while (( s= br.readLine()) != null) {
			String[] tokens = s.split(",");
			//////////////////////
			int x=0;
			String a = tokens[x];
			
			//System.out.println(a);
			
			String b = tokens[1];
			if(a.contentEquals("Square")) {
				//System.out.println(a.length());
				//System.out.println("here we go");
				
				double side = Double.parseDouble(tokens[x+1]);
				//System.out.println("parse");
				//Double.parseDouble(tokens[1]);
				if(side>0) {
					//System.out.println("hope parse is done");
					square sq = new square();
					sq.setside(side);
					sq.toString();
					sq.perimeter();
				}
				
			}
			
			if(a.contentEquals("Circle")) {
				//System.out.println(a.length());
				//System.out.println("");
				
				double rad = Double.parseDouble(tokens[x+1]);
				System.out.println("parse");
				//Double.parseDouble(tokens[1]);
				if(rad>0) {
					//System.out.println("hope parse is done");
					circle sq = new circle();
					sq.setRadius(rad);
					sq.toString();
					sq.perimeter();
				}
				
			}
			
			if(a.contentEquals("Rectangle")) {
				//System.out.println(a.length());
				System.out.println("ok");
				
				double len = Double.parseDouble(tokens[x+1]);
				double wid = Double.parseDouble(tokens[x+2]);
				
				System.out.println("parse");
				//Double.parseDouble(tokens[1]);
				if(len > 0 && wid > 0) {
					System.out.println("hope parse is done");
					rectangle sq = new rectangle();
					//sq(len,wid);
					sq.setHeight(len);
					sq.setWidth(wid);
					sq.toString();
					sq.perimeter();
				}
				
			}
			
			if(a.contentEquals("Parallelogram")) {
				//System.out.println(a.length());
				System.out.println("ok");
				
				double len = Double.parseDouble(tokens[x+1]);
				double wid = Double.parseDouble(tokens[x+2]);
				
				System.out.println("parse");
				//Double.parseDouble(tokens[1]);
				if(len > 0 && wid > 0) {
					System.out.println("hope parse is done");
					parallelogram sq = new parallelogram();
					//sq(len,wid);
					sq.setLength(len);
					sq.setHeight(wid);
					sq.toString();
					sq.perimeter();
				}
				
			}

			
			if(a.contentEquals("Triangle")) {
				//System.out.println(a.length());
				System.out.println("ok");
				
				double len = Double.parseDouble(tokens[x+1]);
				double wid = Double.parseDouble(tokens[x+2]);
				double hight = Double.parseDouble(tokens[x+3]);
				System.out.println("parse");
				//Double.parseDouble(tokens[1]);
				if(len > 0 && wid > 0 && hight > 0) {
					System.out.println("hope parse is done");
					triangle sq = new triangle();
					//sq(len,wid);
					sq.setSide1(len);
					sq.setSide2(wid);
					sq.setSide3(hight);
					
					sq.toString();
					sq.perimeter();
				}
				
			}
			
			
			
				
			/*Shape[] shapes = new Shape[5];
			
				if (tokens[i].equals("Circle")) {
				
					double rad = Double.parseDouble(tokens[i]);
					
					if(rad > 0)
						{
						shapes[0] = new circle(rad);
						
					}
					else
						System.out.println("incorrect lengths");
				}
				
				
				else if (tokens[i].equals("Square")) {
				
						double side = Double.parseDouble(tokens[i+1]);
				
						if(side > 0)
						{
						shapes[0] = new square(side);
					
						}
						else
							System.out.println("incorrect lengths");
					}				
				else if (tokens[i].equals("Rectangle")) {
					double len = Double.parseDouble(tokens[i+1]);
					double wid = Double.parseDouble(tokens[i+2]);
					
					if(len > 0 && wid > 0) 
						shapes[2] = new rectangle(len,wid);
					else
						System.out.println("incorrect lengths");
				}
				
				else if (tokens[i].equals("Parallelogram")) {
					double len = Double.parseDouble(tokens[i+1]);
					double wid = Double.parseDouble(tokens[i+2]);
					
					if(len > 0 && wid > 0) 
						shapes[3] = new parallelogram(len,wid);
					else
						System.out.println("incorrect lengths");
				}
				
				else if (tokens[i].equals("Trianlge")) {
					double side = Double.parseDouble(tokens[i+1]);
					double side2 = Double.parseDouble(tokens[i+2]);
					double side3 = Double.parseDouble(tokens[i+3]);
					
					if(side > 0 && side2 > 0 && side3 > 0) 
						{
						shapes[4] = new triangle(side,side2,side3);
						shapes[4].perimeter();
						}
					else
						System.out.println("incorrect lengths");
				}
				
				else {
					System.out.println("Incorrect ");
				}
				*/
				
			
			
			fr.close();
			}
			} catch (IOException e) {
			System.out.println(e.getMessage());
			}
		
		}

	private static void sq(double len, double wid) {
		// TODO Auto-generated method stub
		
	}

	
}



//System.out.println(tokens.length);


/*
Shape[] shapes = new Shape[3];
shapes[0] = new rectangle(2.4, 1.5);
shapes[1] = new square(3.7);
shapes[2] = new circle(4.8);
//While checking the output, pay attention to constructor chaining too!

for (Shape shape : shapes) {
	System.out.println(shape);
	System.out.printf("The perimeter of %s is: %.2f\n", 
			shape.getClass().getName(), shape.perimeter());
	
}*/
