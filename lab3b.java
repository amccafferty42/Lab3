import java.util.Scanner;

public class lab3b {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
	int bottles = 0;
	boolean continueAsking = true;
	while (continueAsking == true){
	    System.out.println("Enter number bottles of root beer on wall");
	    if(reader.hasNextInt()) {
		bottles = reader.nextInt();
		if(bottles > 0 && bottles < 100) {
		    continueAsking = false;
		}
		else {
		    System.out.println("Num must be > 0 and < 100 !");
		}
	    }
	    else {
		System.out.println("Enter an integer!");
		reader.next();
	    }
	}
	for (int i = bottles; i > 0; i--) {

	    for (int j = i; j > 0; j--) {
		 System.out.print("R");
	    }
	    System.out.print("\n");
	}
        System.out.print("NO MORE BOTTLES OF ROOT BEER ON THE WALL!\n");
    }
}
