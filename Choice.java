import java.util.*;

import javax.swing.*;

public class Choice {
	
	
	
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		
		String [] choices = {" Red Lobster ", " Olive Garden " , " Taco Mac", " Five Guys ","Culver's","Which Wich","Pizza"};
		 
		Random rand= new Random();
		
		int poop =  JOptionPane.showConfirmDialog(null, "Can't decide what is for dinner? Are you having trouble with choosing?", "Food Choice", JOptionPane.YES_NO_OPTION);
		
		
		if(poop== JOptionPane.YES_OPTION){
			
		int selection = rand.nextInt(choices.length);
		JOptionPane.showMessageDialog(null, " Then The choice is to "+ choices[selection] );
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Well then Good Luck!");
			System.exit(0);
		}
		
		
	
	}

	private static Object initialValue(Object object, String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
