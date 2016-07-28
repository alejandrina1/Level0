import javax.swing.JOptionPane;
public class chooseYourOwnAdventure {
		public static void main(String[] args) {
		String rather=JOptionPane.showInputDialog(null, "Do you want to go to the vegas or hawaii?");
		if(rather.equals("vegas")){
		String or=JOptionPane.showInputDialog(null, "Would you rather be in a hotel or outside?");
		if(or.equals("hotel")){
			JOptionPane.showInputDialog(null,"in a hotel room or lobby");
		}else{System.out.println("outside");
		JOptionPane.showInputDialog(null,"veags strip/");
		}
		}else{System.out.println("hawaii");
		String adventures=JOptionPane.showInputDialog(null, "Where do you want to go in a cave or volcano?");
		if(adventures.equals("cave")){
			JOptionPane.showInputDialog(null,"Do u want to be alone or with  people?");
			}else{System.out.println("volcano");
			JOptionPane.showInputDialog(null,"dead or alive?");
		}
	
		}
		}
}



		
	


