package Shapes;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;;

public class main {
	public static void main(String[] args) {

		String s;
		Shape[] shapes = new Shape[52];
		// Shape[] shapes = new Shape[40];

		System.out.println("------->JAC 444 Assignment 1<-------");
//		System.out.println("------->Task 2 ... <-------\n");
		int shapeSize = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("shapes.txt"))) {
			while ((s = br.readLine()) != null) {
				String[] tokens = s.split(",");
				// your code

				if (tokens[0].equals("Circle") && tokens.length == 2) {
					double cirParam = Double.parseDouble(tokens[1]);

					if (cirParam > 0) {
						Circle cirObj = new Circle();
						cirObj.setRadius(cirParam);
						shapes[shapeSize++] = cirObj;
					}
				} else if (tokens[0].equals("Square") && tokens.length == 2) {
					double squParam = Double.parseDouble(tokens[1]);

					if (squParam > 0) {
						Square squObj = new Square();
						squObj.setWidth(squParam);
						shapes[shapeSize++] = squObj;
					}
				} else if (tokens[0].equals("Rectangle") && tokens.length == 3) {
					double recParam1 = Double.parseDouble(tokens[1]);
					double recParam2 = Double.parseDouble(tokens[2]);

					if (recParam1 > 0 && recParam2 > 0) {
						Rectangle recObj = new Rectangle();
						recObj.setWidth(recParam1, recParam2);
						shapes[shapeSize++] = recObj;
					}
				} else if (tokens[0].equals("Triangle") && tokens.length == 4) {
					double triParam1 = Double.parseDouble(tokens[1]);
					double triParam2 = Double.parseDouble(tokens[2]);
					double triParam3 = Double.parseDouble(tokens[3]);

					if (triParam1 > 0 && triParam2 > 0 && triParam3 > 0) {
						Triangle triObj = new Triangle();

						if (triObj.validate(triParam1, triParam2, triParam3) == true) {
							triObj.setWidth(triParam1, triParam2, triParam3);
							double width = triObj.getWidth();
							double length = triObj.getLength();
							double side = triObj.getSide();
							double perimeter = triObj.perimeter();
							shapes[shapeSize++] = triObj;
						}
					}
		    	} else if (tokens[0].equals("Parallelogram") && tokens.length == 3) {
					double parParam1 = Double.parseDouble(tokens[1]);
					double parParam2 = Double.parseDouble(tokens[2]);

					if (parParam1 > 0 && parParam2 > 0) {
						Parallelogram parObj = new Parallelogram();
						parObj.setWidth(parParam1, parParam2);
						shapes[shapeSize++] = parObj;
					}
				}
				
			}
			
			System.out.println(shapeSize + " shapes were created");
			for (int count =0; count < shapeSize; count++) {
				System.out.println(shapes[count].toString());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void print() {

	}

	public static void removeShape(Shape[] shapes, int index, int maxSize) {
		for (int i = index; i < maxSize - 1; i++)
			shapes[i] = shapes[i + 1];
	}
}
