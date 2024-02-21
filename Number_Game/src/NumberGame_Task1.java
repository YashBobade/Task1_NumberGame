import java.util.Random;
import java.util.Scanner;

	public class  NumberGame_Task1{

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random r1 = new Random();

	        int StartNumber = 1;
	        int EndNumber = 100;
	        int AttemptNumber = 3;
	        int winning = 0;
	        System.out.println("Welcome Guess Your Number......");
	        System.out.println("================================");

	        do {
	            int generatedNumber = r1.nextInt(EndNumber - StartNumber + 1) + StartNumber;
	            int attempts = 0;
	            boolean CorrectGuess = false;

	            System.out.println("Guess The Correct Number Between " + StartNumber + " And " + EndNumber + " And Win The Game.");
	            System.out.println("");
	            while (attempts < AttemptNumber) {
	                System.out.print("Enter Your Guessing Number: ");
	                int userGuessing = scanner.nextInt();
	                attempts++;

	                if (userGuessing == generatedNumber) {
	                	CorrectGuess = true;
	                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
	                    break;
	                } else if (userGuessing < generatedNumber) {
	                    System.out.println("Ohhhh! Try again.");
	                    System.out.println();
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }

	            if (!CorrectGuess) {
	                System.out.println("Sorry, you've run out of attempts. The correct number was: " + generatedNumber);
	                System.out.println("==============================================================================");
	            } else {
	            	winning++;
	            }

	            System.out.print("If you want to play again? type-->(y/n): ");
	        } while (scanner.next().equalsIgnoreCase("y"));

	        System.out.println("YOUR GAME IS OVER" + winning + " round.");
	        scanner.close();
	 }
}


