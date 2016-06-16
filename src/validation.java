	import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;

	import javax.swing.JOptionPane;

	public class validation {
		public static void main(String[] args) {

			// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018

			// 2. On paper, write all the numbers that get printed when you run this class

			// 3. Use the randomNumber to give the user a random compliment.
			
			// 4. Repeat all the code above 10 times
			
			for(int i=10;i>0;i--){
				int randomNumber = new Random().nextInt(5);	
			System.out.println(randomNumber);
			
			if(randomNumber==0){
			JOptionPane.showMessageDialog(null, "Nice hair");	
			}
			if(randomNumber==1){
			JOptionPane.showMessageDialog(null,"I love your personality" );	
			}
			if(randomNumber==2){
			JOptionPane.showMessageDialog(null, "You are just amazing");
			}
			if(randomNumber==3){
				JOptionPane.showMessageDialog(null, "Is your name sunshine becuase you make me smile");
			}
			if(randomNumber==4){
				JOptionPane.showMessageDialog(null, "");
			}
			if(randomNumber==5){
				JOptionPane.showMessageDialog(null, "");
			}	
			}
			// 5. Find someone to test out your program. They will like it :)
		}
	}



