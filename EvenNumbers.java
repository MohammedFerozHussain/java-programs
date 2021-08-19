import java.util.*;
public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = s.nextInt();
		System.out.println("The Even Numbers are:");
		for(int i = 2; i <= num;i = i + 2) {
			System.out.println(i);
		}
		

	}

}
