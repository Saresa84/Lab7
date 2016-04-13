import java.util.Scanner;

public class Names {
	//open scanner
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//array to hold names
		String [] names = {"","Jane Doe", "John Doe", "Frank Franklin"}; 
		//intro
		System.out.print("Welcome to out Java class. Which student would" + "\n" + "you like to learn about?(enter a number 1-3)");
		//get user input and validate
		int userInput = getValidNumberInRange(1 , names.length-1);
		System.out.println(names[userInput]);
		
	}
	public static int readValidIntegerNoExcep(){
		while(true){// or you can write it while (!s.hasNextInt())
			if (input.hasNextInt())
				break;
			System.out.print("Enter a valid number: ");//if you want a message
			input.nextLine();
		}// end while
		//read int input and return to main
		int x = input.nextInt();
		return x;
	}
	public static int getValidNumberInRange(int min,int max){
		int input = readValidIntegerNoExcep();
		while (input < min || input > max){
			System.out.println("Please enter number in range");
			
			input = readValidIntegerNoExcep();
		}
		return input;
	}
}
