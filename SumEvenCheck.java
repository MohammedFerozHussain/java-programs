import java.util.*;
public class DigitsEvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int sum=0,x;
		while(num!=0) {
			x = num%10;
			sum += x;
			num = num/10;
		}
		if(sum%2==0) {
			System.out.println("The Sum of the Numbers are Even");
		}
		else {
			System.out.println("The Sum Of the Numbers are Odd");
		}
	}

}
