import javax.swing.JOptionPane;

public class Calculator {
	
	public static int add (int a, int b) {
    return a + b;
	}
	public static int subtract (int a, int b) {
    return a - b;
	}
	public static int multiply (int a, int b) {
    return a * b;
	}
	public static int divide (int a, int b) {
    return a / b;
	}
	public static int modulus (int a, int b) {
    return a % b;
	}
    public static void main(String[] args) {
        
        int num1, num2, choice;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
        choice = Integer.parseInt(JOptionPane.showInputDialog("Select Operator \n1. Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Modulus"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
        

        switch (choice) {
            case 1:
                JOptionPane.showMessageDialog(null, "num1: "+ num1 + "\nnum2: "+ num2 + "\nOperation used: Addition" + "\nResult: " + add(num1,num2));    
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "num1: "+ num1 + "\nnum2: "+ num2 + "\nOperation used: Subtraction" + "\nResult: " + subtract(num1,num2));    
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "num1: "+ num1 + "\nnum2: "+ num2 + "\nOperation used: Multiplication" + "\nResult: " + multiply(num1,num2));    
                break;
            case 4:
                if (num2 != 0) {
                    JOptionPane.showMessageDialog(null, "num1: "+ num1 + "\nnum2: "+ num2 + "\nOperation used: Division" + "\nResult: " + divide(num1,num2));
                }
                else {
                    JOptionPane.showMessageDialog(null, "Cannot Divide By Zero");
                }
                break;
            case 5:
                    JOptionPane.showMessageDialog(null, "num1: "+ num1 + "\nnum2: "+ num2 + "\nOperation used: Modulus" + "\nResult: " + modulus(num1,num2));
                break;
        
            default:
                    JOptionPane.showMessageDialog(null, "Invalid Operation!");
                break;
        }
    }   
}


		
