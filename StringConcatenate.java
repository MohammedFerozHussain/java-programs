import java.util.Scanner;
public class StringConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first word");
		String word1 = sc.nextLine();
		Scanner i = new Scanner(System.in);
		System.out.println("Enter a second word");
        String word2 = i.nextLine();
        System.out.println("The Concatenated String is " +word1+word2);

	}

}
