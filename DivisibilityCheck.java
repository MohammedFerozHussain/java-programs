import java.util.*;
public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num = s.nextInt();
		for(int i = num; i<=num;i++) {
			if(i%5==0 && i%11==0) {
				System.out.println("Given Number is Divisible by 5 and 11");
			}
		else {
			System.out.println("Given Number is not Divisble by 5 and 11");
		}
			
		}
	}
		
		}
