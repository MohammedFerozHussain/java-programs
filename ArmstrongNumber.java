import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the given number:");
		int num = b.nextInt();
		int sum=0,c,rem;
		c = num;
		while(c!=0) {
			rem = c % 10;
			sum = sum + (rem * rem * rem);
			c = c / 10;
		}
		if(sum==num) {
			System.out.println("Given Number is a Armstrong Number");
		}
		else {
			System.out.println("Given Number is not a Armstrong Number");
		}

	}

}
