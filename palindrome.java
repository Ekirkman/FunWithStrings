import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.print("Please print a word: ");
		Scanner input = new Scanner(System.in);
		String w = input.nextLine();
		char[] s = w.toCharArray();
		int count = 0;
		boolean flag = false;
		for (int i = 0; i < w.length() / 2; i++) {
			if (w.charAt(i) == w.charAt(w.length() - (i + 1))) {
				count=count+1;}
		}
		 if(count==w.length()/2) {
				System.out.println("This word is a palindrome");
				
		}else
			System.out.println("This word is not a palindrome");
	}

}
