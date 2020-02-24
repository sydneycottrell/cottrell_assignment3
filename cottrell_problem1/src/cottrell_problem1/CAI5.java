package cottrell_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

/*Modify the program from Part 4 to allow the user to pick a type of arithmetic problem to study. 
 * An option of 1 means addition problems only, 
 * 2 means multiplication problems only, 
 * 3 means subtraction problems only, 
 * 4 means division problems only 
 * and 5 means a random mixture of all these types.
*/
public class CAI5 {

		static int guess;
		static int randInt1;
		static int randInt2;
	    static int answer = randInt1 * randInt2;
		static int input; 
		static int score = 0; 
		static int level;
		static int type;
		
		
		public static void main(String[] args) {
			/*runs program by calling quiz method*/
			
			quiz();
			displayCompletionMessage();
		}
		
		public static void quiz() {
			/* quiz itself/program logic, will be called by main function */
			
	        int answer = randInt1 * randInt2;
			
	        readProblemType();
		}
		
		public static void askQuestionType1() {
			/* ask student to solve multiplication problem */
			
			SecureRandom rand = new SecureRandom();
			
			
			int i;
			do {
			for(i = 1; i < 11; i++) {
				//generating random ints from 0-9
				int randLevel1Int1 = rand.nextInt(10);
				int randLevel1Int2 = rand.nextInt(10);
				int answer = randLevel1Int1 * randLevel1Int2;
			System.out.println("How much is " + randLevel1Int1 + " times " + randLevel1Int2 +"?");
			readResponse();
			} 
			}while (type == 1);
		}
		
		public static void askQuestionType2() {
			SecureRandom rand = new SecureRandom();
			
			
			int i;
			
			for(i = 1; i < 11; i++) {
				
				int randLevel2Int1 = rand.nextInt(100);
				int randLevel2Int2 = rand.nextInt(100);
				int answer = randLevel2Int1 * randLevel2Int2;
			System.out.println("How much is " + randLevel2Int1 + " times " + randLevel2Int2 +"?");
			readResponse();
			
			}
		}
			
		public static void askQuestionType3() {
			SecureRandom rand = new SecureRandom();
			
			int i;
			
			for(i = 1; i < 11; i++) {
				
				int randLevel3Int1 = rand.nextInt(1000);
				int randLevel3Int2 = rand.nextInt(1000);
				int answer = randLevel3Int1 * randLevel3Int2;
			System.out.println("How much is " + randLevel3Int1 + " times " + randLevel3Int2 +"?");
			readResponse();
			
			}
		}
			
		public static void askQuestionType4() {
			SecureRandom rand = new SecureRandom();
			
			
			int i;
			
			for(i = 1; i < 11; i++) {
				
				int randLevel4Int1 = rand.nextInt(10000);
				int randLevel4Int2 = rand.nextInt(10000);
				int answer = randLevel4Int1 * randLevel4Int2;
			System.out.println("How much is " + randLevel4Int1 + " times " + randLevel4Int2 +"?");
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

		public static void readDifficulty(){
			/*The program shall ask the student to enter a difficulty level of 1, 2, 3, or 4
			 * reads difficulty level of student 
			*/
			
			Scanner difficultyLevel = new Scanner(System.in);
			
			System.out.println("What level of difficulty would you like to practice with? Choose 1, 2, 3, or 4.");
			int level = difficultyLevel.nextInt();
			
			generateQuestionArgument();
		}
		
		
		public static void generateQuestionArgument() {
			/*A difficulty level of 1 shall limit random numbers to the range of 0-9, inclusive
			A difficulty level of 2 shall limit random numbers to the range of 0-99, inclusive
			A difficulty level of 3 shall limit random numbers to the range of 0-999, inclusive
			A difficulty level of 4 shall limit random numbers to the range of 0-9999, inclusive
			that uses the difficulty level to generate a random number
			*/
	
			Scanner difficultyLevel = new Scanner(System.in);
			int level = difficultyLevel.nextInt();
			
			switch(level) {
			
			case 1: 
				askQuestionType1();
				break;
				
			case 2:
				askQuestionType2();
				break;
			
			case 3:
				askQuestionType3();
				break;
				
			case 4: 
				askQuestionType4();
				break;
		}
}
		public static void readProblemType() {
			/*	A problem type of 1 shall limit the program to generating only addition problems
				A problem type of 2 shall limit the program to generating only multiplication problems
				A problem type of 3 shall limit the program to generating only subtraction problems
				A problem type of 4 shall limit the program to generating only division problems
				A problem type of 5 shall result questions that are a randomly mixture of addition, multiplication, subtraction, and division problems
				reads problem type chosen
			 * */
			Scanner problemType = new Scanner(System.in); 
			
			System.out.println("Choose your problem type:\n1 - addition\n2 - multiplication\n"
					+ "3 - subtraction\n4 - division\n5 - all of the above");
			int type = problemType.nextInt();
			
			readDifficulty();
		}
}