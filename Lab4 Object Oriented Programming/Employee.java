import javax.swing.*;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    public String getFName(){
        return firstName;
    }
    public void setFName(String firstName) {
    	this.firstName = firstName;
    }
    public String getLName() {
    	return lastName;
    }
    public void setLName(String lastName) {
    	this.lastName = lastName;
    }
    public double getMonthlySalary() {
    	return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary){
    	this.monthlySalary = monthlySalary;
    }
   public void raiseSalary(double percent) {
   	monthlySalary = monthlySalary + monthlySalary * percent / 100;
   }
	
	public void print() {
		JOptionPane.showMessageDialog(null, "Name: " + firstName + " " + lastName);
		JOptionPane.showMessageDialog(null, "Monthly Salary: " + monthlySalary);
	}

}

