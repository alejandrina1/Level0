import javax.swing.JOptionPane;

public class birthday {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "December 30th";
		String dadsBirthday = "September 11th";
		String myBirthday = "Febuary 6th";

		// 2. Find out which birthday the user wants and and store their response in a variable
String anyBirthday= JOptionPane.showInputDialog(null,"Who's birthday do you want to know about?");
		// 3. Print out what the user typed
System.out.println(anyBirthday);
		// 4. if user asked for "mom"
		// print mom's birthday

		// 5. if user asked for "dad"
		// print dad's birthday
		// 6. if user asked for your name
		// print myBirthday
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"

	}
}
