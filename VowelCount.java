import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		System.out.println("Please enter a word : ");
		Scanner input = new Scanner(System.in);
		String xx = input.next();
		char[] myArray = xx.toCharArray();

		int count = 0;
		char a = 'a';
		char A = 'A';
		char e = 'e';
		char E = 'E';
		char i = 'i';
		char I = 'I';
		char O = 'O';
		char o = 'o';
		char U = 'U';
		char u = 'u';

		for (int y = 0; y < myArray.length; y++) {
			if (a == myArray[y] || A == myArray[y] || e == myArray[y] || E == myArray[y] || i == myArray[y]
					|| I == myArray[y] || O == myArray[y] || o == myArray[y] || U == myArray[y] || u == myArray[y]) {
				count = count + 1;
			}
		}
		System.out.println("Number of vowles in this word : " + count);

	}
}
