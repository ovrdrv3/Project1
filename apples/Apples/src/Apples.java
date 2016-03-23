import java.util.Random;

public class Apples {
	public static void main(String[] args) {
		Random rand = new Random();
		int freq[] = new int[7];
		for(int counter=1;counter<1000;counter++){
			++freq[1+rand.nextInt(6)];
	}
	System.out.println("Dice\t Number of rolls");
	
	for(int face = 1;face <freq.length;face++){
			System.out.println(face+"\t"+freq[face]);
	}	
	}
}

