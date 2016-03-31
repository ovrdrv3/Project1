package madLib;
import javax.swing.JOptionPane;

public class madLibMainClass {
	
	public static void main(String[] args) {
	    String shortText[] = new String[9];
		String longText[] = new String[9];
		String returnArray[] = new String[9];//when a return is needed, this can be placed after where a return is desired.

		shortText[0] = JOptionPane.showInputDialog("Enter an animal.");
		shortText[1] = JOptionPane.showInputDialog("Enter a location.");
	    shortText[2] = JOptionPane.showInputDialog("Enter a small number.");
	    shortText[3] = JOptionPane.showInputDialog("Enter a color.");
	    shortText[4] = JOptionPane.showInputDialog("Enter a body part.");
	    shortText[5] = JOptionPane.showInputDialog("Enter an adjective.");
	    shortText[6] = JOptionPane.showInputDialog("Enter another body part.");
	    shortText[6] = shortText[6] + ".";//adding a period at the end of this word..
	    shortText[7] = JOptionPane.showInputDialog("Enter a location.");
	    shortText[8] = "";

		longText[0] = "Help! I cannot find my ";
		longText[1] = " anywhere! The last time I saw him/her was in ";
		longText[2] = "about ";
		longText[3] = " days ago. He has ";
		longText[4] = ", tiny ";
		longText[5] = " and ";
		longText[6] = ", super gross ";
		longText[7] = "If you see any sign of him/her, call me or find me at ";
		longText[8] = " from 9 AM to 5 PM. Thanks!";
		
		returnArray[1] = "return";
		returnArray[6] = "return";
		
		
		 	for(int counter=0;counter<longText.length;counter++){
		 		System.out.print(longText[counter]+shortText[counter]);
		 		if (returnArray[counter] == "return") {
		 			System.out.print("\r");
		 		}
		 	}	
	}	

}

