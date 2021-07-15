import java.util.*;
public class AreaFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner d = new Scanner(System.in);
		System.out.println("Enter the values for Rectangle");
		int length = d.nextInt();
		Scanner d1 = new Scanner(System.in);
		int breadth = d1.nextInt();
		int area = length * breadth;
		System.out.println("Area of the Rectangle is :" +area);
		Scanner e = new Scanner(System.in);
		System.out.println("Enter the values for Parellogram");
		int base = e.nextInt();
		Scanner e1 = new Scanner(System.in);
		int height = e1.nextInt();
		int area1 = base * height;
		System.out.println("Area of the Parellogram is :" +area1);
		Scanner f = new Scanner(System.in);
		System.out.println("Enter the values for Triangle");
		int base1 = f.nextInt();
		Scanner f1 = new Scanner(System.in);
		int height1 = f1.nextInt();
		int area2 = base1 * height1;
		double area3 = 0.5 * area2;
		System.out.println("Area of the Triangle is :" +area3);
		Scanner g = new Scanner(System.in);
		System.out.println("Enter the values for Trapezium");
		int a = g.nextInt();
		Scanner g1 = new Scanner(System.in);
		int b = g1.nextInt();
		Scanner g2 = new Scanner(System.in);
		int h = g2.nextInt();
		int area4 = a + b;
		int area5 = h * area4;
		double area6 = 0.5 * area5;
		System.out.println("Area of the Trapezium is :" +area6);
		Scanner h1 = new Scanner(System.in);
		System.out.println("Enter the values for circle");
		int radius = h1.nextInt();
		double pi = 3.14;
		double area7 = pi * radius * radius;
		System.out.println("Area of the circle is :" +area7);
		
		
		
		
		

	}

}
