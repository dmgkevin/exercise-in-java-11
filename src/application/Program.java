package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Circle;
import entitites.Rectangle;
import entitites.Shape;
import entitites.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + "data: ");
			System.out.print("Rectangle or Circle (r/c)?: ");
			char ch = sc.next().charAt(0);
			System.out.print("What's color (BLACK/BLUE/RED) ?: ");
			Color color = Color.valueOf(sc.next()); //Valor será convertido para o objeto do tipo color
			if(ch ==  'r') {
				System.out.println("Witdh: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("Shape areas");
		
		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
