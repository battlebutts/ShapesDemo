package app;

import java.util.Scanner;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Triangle;
import shapes.TwoDShape;

public class App {

	public static void main(String... args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in the shape you would like to make! TRIANGLE RECTANGLE CIRCLE\n");
		TwoDShape<Double> shape;
		
		while(true) {
			String choice = input.next();
			String lwrChoice = choice.toLowerCase();
			if (lwrChoice.equals("rectangle")) {
				System.out.print("Enter length (double): ");
				Double length = input.nextDouble();
				System.out.print("Enter width (double): ");
				Double width = input.nextDouble();
				shape = new Rectangle<Double>(length,width);
				break;
			}else if(lwrChoice.equals("circle")) {
				System.out.print("Enter in radius (double): ");
				Double radius = input.nextDouble();
				shape = new Circle<Double>(radius);
				break;
			}else if(lwrChoice.equals("triangle")) {
				System.out.print("Enter base (double): ");
				Double base = input.nextDouble();
				System.out.print("Enter height (double): ");
				Double height = input.nextDouble();
				shape = new Triangle<Double>(base,height);
				break;
			}else {
				System.out.println("Invalid shape entered.");
			}
		}
		System.out.println(shape);
		input.close();
	}
}
