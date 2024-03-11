//create a java program that ask you for password and loops if the password is incorrect

import javax.swing.JOptionPane;

public class Cat {
    public static void main(String[] args) {
        

        String myName, myPass;
        boolean loggedIn = false;

        while (!loggedIn) {
            myName = JOptionPane.showInputDialog("Enter Username");
            myPass = JOptionPane.showInputDialog("Enter Password");

            if (myName.equals(myName) && myPass.equals("kid")) {
                JOptionPane.showMessageDialog(null, "Welcome User " + myName);
            }
            else {
                JOptionPane.showMessageDialog(null, "Wrong Password Try again!");
            }
        }
    }
}