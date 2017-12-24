import java.util.Scanner;
public class Changecase {

	public static void main(String[] args) {
System.out.println("Plese Enter a word: ");
Scanner input = new Scanner(System.in);
	String x =input.nextLine();
    char[] try1 = x.toCharArray();
    for(int i = 0; i <x.length(); i++) {
    	char y = x.charAt(i);
    	if(i % 2 == 0 && y > 90) {
    		System.out.print(y -=32);}
    		
    	else if(i % 2!=0 && y < 90) {
    			System.out.print(y+=32);}
    		
    	
    	else if( i % 2 == 0 && y < 90 || i % 2!= 0 && y>90) {
    	System.out.print(y);}
    		}
	}    		
}       	
    	

	

	


