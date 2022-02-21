package exSecao14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle_;
import entities.Rectangle_;
import entities.Shape;
import entities.enums.Color;

public class MetodosAbstratos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();
		
		
		System.out.println("Enter the number of shapes: ");
		int nShapes = sc.nextInt();
		
		for(int i = 1; i <= nShapes; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.println("Rectangle or Circle (r/c)? ");
			String shape = sc.next();
			System.out.println("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			
			if(shape.equals("r")) {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				//shapes.add(new Rectangle_(Color.valueOf(color), width, height));
				shapes.add(new Rectangle_(width, height));
			}else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				//shapes.add(new Circle_(Color.valueOf(color), radius));
				shapes.add(new Circle_(radius));
			}	
		}
		
		for(Shape shap : shapes) {
			System.out.println(shap.area());
		}
		
	}

}
