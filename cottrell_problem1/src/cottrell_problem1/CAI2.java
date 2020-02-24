package cottrell_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {

		static int guess;
		static int randInt1;
		static int randInt2;
	    static int answer = randInt1 * randInt2;
		static int input; 
		
		
		public static void main(String[] args) {
			/*runs program by calling quiz method*/

			quiz();
		}
		
		public static void quiz() {
			/* quiz itself/program logic, will be called by main function */
			
	        int answer = randInt1 * randInt2;
			
	        askQuestion();
		}
		
		public static void askQuestion() {
			/* ask student to solve multiplication problem */
			
			SecureRandom rand = new SecureRandom();
			
			//generating random ints from 0 to 9
			int randInt1 = rand.nextInt(10);
			int randInt2 = rand.nextInt(10);
			
			
			System.out.println("How much is " + randInt1 + " times " + randInt2 +"?");
			
			readResponse();
		}
		
		public static void readResponse() {
			/* reads answer from student  */
			
			Scanner input = new Scanner(System.in);
			int guess = input.nextInt();
			
			isAnswerCorrect();
		}
		
		public static void isAnswerCorrect() {
			/* will determine if answer is correct 
			 * if statement*/
			
			int answer = randInt1 * randInt2;
			
			//use random number generator to choose what response
			//use switch statement to issue responses
			 if (input == answer) {
		         displayCorrectResponse();
			  
			 } else {
				 displayIncorrectResponse();
		     }
		}
		
		public static void displayCorrectResponse() {
			/* will display correct number and say very good
			 * additions: add the new possible responses: Very good! Excellent! Nice work! Keep up the good work!
			 * use random number to pick random response */ 
			
			SecureRandom rand = new SecureRandom();
			
			//generating random ints from 1-4 for responses
			int randResponse = rand.nextInt(5);
			
			
			switch(randResponse) {
			
			case 1:
				System.out.println("Very good!");
				break;
				
			case 2:
				System.out.println("Excellent!");
				break;
			
			case 3:	
				System.out.println("Nice work!");
				break;
			
			case 4:
				System.out.println("Keep up the good work!");
				break;
			}
			
			System.out.print(answer);
			System.out.print(" is the correct number!");
		}
		
		public static void displayIncorrectResponse() {
			/* will display incorrect answer and say no try again
			 * will ask question again
			 * addition: add new phrases:No. Please try again., Wrong. Try once more., Don’t give up!, No. Keep trying. */
			
			SecureRandom rand = new SecureRandom();
			
			//generating random ints from 1-4 for responses
			int randResponse = rand.nextInt(5);
			
			switch(randResponse) {
			case 1:
				System.out.println("No. Please try again.");
				break;
				
			case 2:
				System.out.println("Wrong. Try once more.");
				break;
			
			case 3:	
				System.out.println("Don't give up!");
				break;
			
			case 4:
				System.out.println("No. Keep trying.");
				break;
			}

			
			System.out.print(guess);
			System.out.println(" is not correct.");
			
			readResponse();
		}
	}
