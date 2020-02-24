package cottrell_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

/* write a program that will help an elementary school student learn multiplication
 * 
 * use a SecureRandom object to produce two positive one-digit integers 
 * 
 * the program should then prompt the user with a question like "How much is 6 times 7?" 
 * 
 * student will answer question and program will check it
 * 
 * if correct - display "Very good!"
 * if incorrect - display "No. Please try again." and let student try repeatedly until answer is correct
 * 
 * separate method should be used to generate the question
 * */

public class CAI1 {
	
	static int guess;
	static int rand_int1;
	static int rand_int2;
    static int answer = rand_int1 * rand_int2;
	static int input; 
	
	
	
	public static void main(String[] args) {
		/*runs program by calling quiz method*/

		int answer = rand_int1 * rand_int2;
		
		quiz();
	}
	
	public static void quiz() {
		/* quiz itself/program logic, will be called by main function */
		
       // int answer = rand_int1 * rand_int2;
		
        askQuestion();
        
        
        
	}
	
	public static void askQuestion() {
		/* ask student to solve multiplication problem */
		
		SecureRandom rand = new SecureRandom();
		
		//generating random ints from 0 to 9
		int rand_int1 = rand.nextInt(10);
		int rand_int2 = rand.nextInt(10);
		
		
		
		System.out.println("How much is " + rand_int1 + " times " + rand_int2 +"?");
		
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
		
		int answer = rand_int1 * rand_int2;
		
		 if (input == answer) {

			 System.out.println("Very Good!");
	         displayCorrectResponse();
		  
		 } else {
			 
			 System.out.println("Please try again.");
			 displayIncorrectResponse();
	     }
	}
	
	public static void displayCorrectResponse() {
		/* will display correct number and say very good? */ 
		
		System.out.print(answer);
		System.out.print(" is the correct number!");
	}
	
	public static void displayIncorrectResponse() {
		/* will display incorrect answer and say no try again
		 * will ask question again*/
		
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		System.out.print(guess);
		System.out.println(" is not correct.");
		
		readResponse();
	}
}

