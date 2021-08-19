import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = s.nextInt();
		int count = 0;
		while(number>0) {
			number = number /10;
			count = count + 1;
			
		}
		System.out.println("The Count of the digits are:" +count);
	}

}
