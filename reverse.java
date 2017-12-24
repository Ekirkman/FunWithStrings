import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		Scanner y = new Scanner(System.in);
		String x = y.nextLine();
		char [] k = x.toCharArray();
		
		
		for(int i = x.length()-1; i < x.length(); i--) {
			System.out.print(k[i]);
			if(i==0) {
				break;}
		}
	}
}
