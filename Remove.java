import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String w = sc.nextLine();
		char[] b = w.toCharArray();
		int count = 0;
		String str = "";
		if (b.length % 2 != 0) {
			for (int v = 0; v < b.length; v++) {
				if (v != b.length / 2) {
					str = str + b[v];  }
			}
			System.out.println(str);
		} else {
			for (int v = 0; v < b.length; v++) {
				if ( v == b.length / 2 || v == ((b.length / 2)-1)) {		
				}
				else{
					str = str + b[v];
				}
			}
			System.out.println(str);
		}
	}
}
