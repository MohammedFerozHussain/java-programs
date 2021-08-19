import java.util.*;
public class PrimeComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the Given Number:");
		int num = n.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	    	if (num % i == 0) {
	    		flag = true;
			    break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			  }

	}


