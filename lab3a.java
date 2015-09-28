public class lab3a {

    public static void main(String[] args) {

	//double is the most precise for distance, steps can be an integer
    	double distance = 10;
	int steps = 0;
	  
	//Run until distance is 0, halve distance each time, increment steps by 1
	while (distance != 0) {
	    distance = distance / 2;
	    steps++;
	}	  

	//Print steps once out of the loop
	System.out.println("Number of steps: "+steps);
    }

}
