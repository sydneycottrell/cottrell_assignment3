package cottrell_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

/*Modify the program from Part 2 to use your question generation method to ask the student 10 different questions. 
 * Give students only one chance at answering each question. Count the number of correct and incorrect responses typed by the student. 
 * After the program has asked 10 questions (and the student types 10 answers), your program should calculate the percentage that are correct. 
 * If the percentage is lower than 75%, display "Please ask your teacher for extra help.", then reset the program so another student can try it. 
 * If the percentage is 75% or higher, display "Congratulations, you are ready to go to the next level!", 
 * then reset the program so another student can try it.
*/
public class CAI3 {

		static int guess;
		static int randInt1;
		static int randInt2;
	    static int answer = randInt1 * randInt2;
		static int input; 
		static int score = 0; 
		
		
		public static void main(String[] args) {
			/*runs program by calling quiz method*/
			
			quiz();
			displayCompletionMessage();
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
			//int randInt1 = rand.nextInt(10);
			//int randInt2 = rand.nextInt(10);
			
			
			int i;
			
			for(i = 1; i < 11; i++) {
				
				int randInt1 = rand.nextInt(10);
				int randInt2 = rand.nextInt(10);
				int answer = randInt1 * randInt2;
			System.out.println("How much is " + randInt1 + " times " + randInt2 +"?");
			readResponse();
			
			}
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
			
			 if (input == answer) {
				 score = score++;
		         displayCorrectResponse();
			  
			 } else {
				 displayIncorrectResponse();
		     }
		}

	
		  public static void displayCorrectResponse() {
		 
			/* will display correct number and say very good
			 * additions: add the new possible responses: Very good! Excellent! Nice work! Keep up the good work!
			 * use random number to pick random response 
			 * //use random number generator to choose what response
			//use switch statement to issue responses */
			
			SecureRandom rand = new SecureRandom();
			
			//generating random ints from 1-4 for responses
			int randResponse = rand.nextInt(4);
			 
			
			switch(randResponse) {
			
			case 0:
				System.out.println("Very good!");
				score++;
				break;
				
			case 1:
				System.out.println("Excellent!");
				score++;
				break;
			
			case 2:	
				System.out.println("Nice work!");
				score++;
				break;
			
			case 3:
				System.out.println("Keep up the good work!");
				score++;
				break;
			}
			
			System.out.println(+guess+ " is the correct number!\n");
			
			//askQuestion();
			
			
		}
		
		public static void displayIncorrectResponse() {
			/* will display incorrect answer and say no try again
			 * will ask question again
			 * addition: add new phrases:No. Please try again., Wrong. Try once more., Don’t give up!, No. Keep trying. 
			//use random number generator to choose what response
			//use switch statement to issue responses*/
			
			SecureRandom rand = new SecureRandom();
			
			//generating random ints from 1-4 for responses
			int randResponse = rand.nextInt(4);
			
			switch(randResponse) {
			case 0:
				System.out.println("No. Please try again.");
				break;
				
			case 1:
				System.out.println("Wrong. Try once more.");
				break;
			
			case 2:	
				System.out.println("Don't give up!");
				break;
			
			case 3:
				System.out.println("No. Keep trying.");
				break;
			}

			
			System.out.print(guess);
			System.out.println(" is not correct.");
			
		}
		
		public static void displayCompletionMessage() {
			/*prints out student's score and appropriate responses
			 * 
			 *shall display the student's score after the student has attempted to solve 10 problems
				student's score shall be the percentage of problems correctly solved
				display the message "Please ask your teacher for extra help." if the student's score is less than 75%
				display the message "Congratulations, you are ready to go to the next level!" if the student's score is greater than or equal to 75%
				ask the student if they want to solve a new problem set after the score message has been displayed
				restart when the student agrees to solve a new problem set
				terminate when the student declines to solve another problem set
			 */
			
			switch(score) {
			case 1: 
				System.out.println("SCORE: 10%. Please ask your teacher for extra help.");
				break;
				
			case 2: 
				System.out.println("SCORE: 20%. Please ask your teacher for extra help.");
				break;
				
			case 3: 
				System.out.println("SCORE: 30%. Please ask your teacher for extra help.");
				break;
				
			case 4:
				System.out.println("SCORE: 40%. Please ask your teacher for extra help.");
				break;
				
			case 5:
				System.out.println("SCORE: 50%. Please ask your teacher for extra help.");
				break;
				
			case 6:
				System.out.println("SCORE: 60%. Please ask your teacher for extra help.");
				break;
				
			case 7: 
				System.out.println("SCORE: 70%. Please ask your teacher for extra help.");
				break;
				
			case 8:
				System.out.println("SCORE: 80%. Congratulations, you are ready to go to the next level!");
				break;
				
			case 9:
				System.out.println("SCORE: 90%. Congratulations, you are ready to go to the next level!");
				break;
				
			case 10:
				System.out.println("SCORE: 100%. Congratulations, you are ready to go to the next level!");
				break;
		}
			Scanner responseYN = new Scanner(System.in);
			//char newQuestions = (char) responseYN.nextInt();
			
			System.out.println("Do you want to solve a new problem set? Please enter y or n.");
			char newQuestions = (char) responseYN.nextInt();
			
			do {
				quiz();
			} while(newQuestions == 'y');
	}

}