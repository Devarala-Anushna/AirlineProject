

	import java.util.Scanner;

	public class Menu {

	    public static void main(String[] args) {
	        int choice;
	        Scanner scanChoice = new Scanner(System.in);

	        do {
	            System.out.println("Pick an option. 1 2 or 3.");
	            System.out.println("1. Apple");
	            System.out.println("2. Pear");
	            System.out.println("3. Pineapple");

	            String input = scanChoice.nextLine();
	            choice = convertToInteger(input.trim());
	        } while (choice < 1 || choice > 3);

	        System.out.println("You picked " + choice);
	        scanChoice.close();
	    
	    }

	}

