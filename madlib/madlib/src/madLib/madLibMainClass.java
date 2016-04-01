package madLib;
import javax.swing.JOptionPane;

public class madLibMainClass {
	
	public static void main(String[] args) {
		String combinedText = "";
	    String shortText[] = new String[9];
		String longText[] = new String[9];
		
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
		longText[1] = " anywhere! The last time I saw it was in ";
		longText[2] = "about ";
		longText[3] = " days ago. He has ";
		longText[4] = ", tiny ";
		longText[5] = " and ";
		longText[6] = ", super gross ";
		longText[7] = "If you see any sign of him/her, call me or find me at ";
		longText[8] = " from 9 AM to 5 PM. Thanks!";
		
	
		 	for(int counter=0;counter<longText.length;counter++){		 		
		 		//System.out.println(longText[counter]+shortText[counter]);
		 		combinedText = combinedText + longText[counter]+shortText[counter];
		 		}
		String[] splitText = combinedText.split(" ");
			for(int word=0;word<splitText.length;word++)
				if ( word != 0 && word % 17 == 0) {
					System.out.print(splitText[word]+"\r");
				}else{
					System.out.print(splitText[word] + " ");	
	 		}
		}
		 	
		 		
	}	



