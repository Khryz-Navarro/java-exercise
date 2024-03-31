import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Khryz", "Navarro", 50000);
		Employee employee2 = new Employee("Ramon", "Navarro", 15000);
		employee1.print();
		employee2.print();
		
		employee1.raiseSalary(10);
		employee2.raiseSalary(10);
		
		JOptionPane.showMessageDialog(null,"After 10% Salary Raise");
		employee1.print();
		employee2.print();
    }
    
}