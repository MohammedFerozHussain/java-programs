import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();
		int num = number;
		int rev=0,rem;
		while(number!=0) {
			rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
		System.out.println("The reversed number is" +rev);
if(num==rev) {
	System.out.println("Yes it is a palindrome");
		}
else {
	System.out.println("No it is not a palindrome");
		}

	}

}
