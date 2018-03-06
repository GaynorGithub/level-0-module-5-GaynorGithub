import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean prime = true;
		String number = JOptionPane.showInputDialog("What number would you like to prime test?");
		int num = Integer.parseInt(number);
		for (int i = 2; i < num ; i++) {
			if (num%i==0) {
				prime = false;
				JOptionPane.showMessageDialog(null, number + " is not a Prime Number.");
				break;
				
			}
		}
		if (prime==true) {
			JOptionPane.showMessageDialog(null, number + " is a Prime Number.");
		}
	}
}