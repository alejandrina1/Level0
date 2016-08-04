import java.net.URI;

import javax.swing.JOptionPane;

public class soundtrackforlife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in ?", "Mood", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cheerful", "Upset", "Angry" },
				null);

		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
		if (userMood == 0) {
			System.out.println("playVideo cheerful");
			playVideo("https://www.youtube.com/watch?v=3IIspaicSnY");
		}
		if (userMood == 1){
			System.out.println("playVideo upset");
			playVideo("https://www.youtube.com/watch?v=fk4BbF7B29w");
		}
		
	if (userMood == 2) {
		System.out.println("playVideo angry");
		playVideo("https://www.youtube.com/watch?v=sIjkVn_ro0g&list=PLqtXP8v3VfDAXpMFOhZ-lZqK1neQ4IC_U&index=46");
	}
		// 4. Play different songs for other moods.

		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * If you can’t think of any, here are some you can use... bit.ly/video-for-happy bit.ly/video-for-sad
 * bit.ly/video-for-angry
 **/
