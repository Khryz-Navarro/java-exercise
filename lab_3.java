import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class lab_3 {
	public static void main (String[] args) 
	throws FileNotFoundException{
		
		Scanner scanner = new Scanner(System.in);
		PrintStream diskWriter = new PrintStream("product.txt"); 
		String itemName;
		double price;
		int quantity;
		double totalAmount;
		
		System.out.print("Enter Item Name: ");
		itemName = scanner.next();
		System.out.print("Enter Price: ");
		price = scanner.nextDouble();
		System.out.print("Enter Quantity: ");
		quantity = scanner.nextInt();
		totalAmount = price*quantity;
		
		System.out.println("Sira-Sira Store");
		System.out.println("Kabacan, Cotabato");
		System.out.println("1234567\n");
		System.out.println("----------------------------");
		System.out.println("Item Name | Price | Quantity");
		System.out.println("          |(pesos)| (pieces)");
		System.out.println("----------------------------");
		System.out.println(itemName + "         "+ price+ "         "+ quantity);
		System.out.println("\n      Total Amount: \n      " + totalAmount +" pesos");
		System.out.println("----------------------------");
		System.out.println("This serves as your official receipt.\nThank You."); 
		diskWriter.println("Item Name: "+itemName);
		diskWriter.println("Price: "+ price);
		diskWriter.println("Quantity: "+ quantity);
		diskWriter.println("Total: "+ totalAmount);
	




	



}
}