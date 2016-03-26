package madLib;

public class madLibMainClass {
	public static void main(String[] args) {
		String longText[] = new String[3];
		 longText[0] = "This is the hardwired string array to be used as an example of a string array";
		 longText[1] = "This is the second line of text that can be printed";
		 longText[2] = "The text should be eventually imported from a text file and new index for each gap in the sentence";
		 	for(int counter=0;counter<longText.length;counter++){
		 		System.out.println(longText[counter]);
		 	}	
	}	

}

