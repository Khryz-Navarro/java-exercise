/* 
 	Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
 	Sample Output:
 	Input a number: 20
 	1

*/
import java.util.Scanner;

public class Exercise49 {
	public static void main (String[] args) {
		
	int a;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Input a number: ");
	a = scan.nextInt();
	
	

	if(a % 2 == 0) {
		System.out.print(1);
		
	}	
	else {
		System.out.print(0);
			
	}

	scan.close();

}
}