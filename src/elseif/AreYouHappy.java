package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("Are you happy?");
		if (ans.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		} else {
			String answ = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answ.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
			}
		}
	}
}
