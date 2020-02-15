package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
			int p = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
			int d = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
			int pa = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
			int da = 0; 
		    int c = 0;
		// 6.  Delete the slashes at the beginning of the next line.  
		while(p>0 && d>0) {   //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		String a;
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		a = JOptionPane.showInputDialog("Do you want to attack the dragon with a yell or a kick?");
		// 9. If they typed in "yell":
		if( a.equals("yell")) {
			 pa = new Random().nextInt(10);
			d = d - pa;
			System.out.println("you yelled and gave damage"+pa);
		}
		if( a.equals("kick")) {
			pa = new Random().nextInt(35);
			if(pa <= 10) {
				p = p - pa;
				System.out.println("you failed kick and got damage"+pa);
			}
			else {
				d = d - pa;
				System.out.println("you kicked and gave damage"+pa);
			}
		}
		da = new Random().nextInt(50);
		c = new Random().nextInt(3);
		if( c==0) {
			
			System.out.println("you avoid dragon's attack");
		}
		else {
			p = p - da;
			System.out.println("you hit by dragon and got damage"+da);
		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
		if(d<=0) {
			System.out.println("you killed dragon you win!!!");
			
		}
		if(p<=0) {
			System.out.println("you died you lost");
			//-- Subtract that number from the dragon's health variable 
		}
		else {
			System.out.println("your hp is "+p+" and dragon's hp is "+d);
		}
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
	}

