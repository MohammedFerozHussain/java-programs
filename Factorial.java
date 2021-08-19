import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = n.nextInt();
		int fact = 1;
		for(int i = 2;i <=number;i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of a given number:" +fact);

	}

}
