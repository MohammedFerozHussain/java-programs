import java.util.*;
public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int number1 = sc.nextInt();
		System.out.println("Enter a Second number");
		int number2 = sc.nextInt();
		int prod = number1 * number2; 
		System.out.println("Your answer is " +prod);

	}

}
