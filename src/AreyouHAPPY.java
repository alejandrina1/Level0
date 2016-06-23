import javax.swing.JOptionPane;

import org.teachingextensions.setup.MacThumbDriveInstaller;

public class AreyouHAPPY {
	public static void main(String[] args) {

		String you = JOptionPane.showInputDialog(null, "are you happy");
		String yourself=JOptionPane.showInputDialog(null, "do you want to be happy");
		
		if (you.equals("yes")) {
			System.out.println("keep doing what you are doing");
		} else {
			System.out.println("do you want to be happy");
		}
		if (yourself.equals("do you want to be happy")) {
			System.out.println("change something");
		} else {
			System.out.println("keep doing whatever you are doing");
		}

	   }
        }
