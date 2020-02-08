package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String a = JOptionPane.showInputDialog("Can you write the code?");
	
		// 2. If they say "yes", tell them they will rule the world.
		if(a.equals("yes")) {
			System.out.println("your the godest");
		}
		else {
			System.out.println("good luck! just wash the dishes");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

