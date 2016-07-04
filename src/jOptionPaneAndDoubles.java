import javax.swing.JOptionPane;


// JOptionPane is how to retrieve user input in applets, since they don't have access to the console's Scanners
public class jOptionPaneAndDoubles {

	public static void main(String[] args) {
		
		// Capture string input from JOptionPane
		 String fingers = JOptionPane.showInputDialog("How many fingers do you have?");
		 JOptionPane.showMessageDialog(null, "You have " + fingers + " fingers.");
		
		 
		// Create new Double based on user input in JOptionPane
		Double number = Double.parseDouble(JOptionPane.showInputDialog("What is 3 divided by 2?"));
		
		// Provide feedback on user's input
		if (number - 1.5 < 0.00001) {	
			// If user enters 1.5
			JOptionPane.showMessageDialog(null, "You are correct!");
		} else {
			// If user enters anything other then 1.5
			JOptionPane.showMessageDialog(null, "Wrong, dummy.");
		}
		
	}
	
}
