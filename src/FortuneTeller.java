import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
				
		System.out.println("Welcome, So you want to know your future, do you?!\nCome and let Odessa see your future!");
		System.out.println("Now tell me your first name.");
		String responseFirst = input.nextLine();
		
		System.out.println("That is an interesting name! \nNow your last.");
		String responseLast = input.nextLine();
		System.out.println("I'm starting to see someting!");
		
		System.out.println("Enter your age");
		int responseAge = input.nextInt();
		int retirementYears;
		boolean isEven = (responseAge % 2) == 0; 
		
		if (isEven) {
			retirementYears = 23;
					}
		else { 
			retirementYears = 46;
		}
		
		//like "such wisdom at your age" or "oh you have a lot to learn yet"
		System.out.println("Enter your birth month as a number");
		int responseBirth = input.nextInt();
		//Bank balance is determined by birth month, if user enters anything other than
		// 1-12 their balance is $0.00
		
		System.out.println("Enter your favorite color using ROYGBIV? \nType \"help\" for color options");
		String responseColor = input.nextLine();
		
		

		
					
		
		//don't forget to enter the help loop for the color scheme
		// set a condition for mode of transportation based on favorite color
		System.out.println("How many siblings do you have?");
		int responseSiblings = input.nextInt();
		String vacationHome; 
		if (responseSiblings == 1) {
		vacationHome = "city1";
		}
		else if (responseSiblings == 2) {
		vacationHome = "city2";
		} 
		else if (responseSiblings == 3) {
		vacationHome = "city3";
		}
		else {
		vacationHome = "city4";
		}
		
		//offer a quit option at input lines that will print out "Nobody likes a quitter..."
		//before ending the program
		
		 
		//System.out.println( *[First Name]* *[Last Name]* will retire in *[retirementYears]* with 
		//*[bank balance]* in the bank, a vacation home in *[location]*,
		//and travel by *[mode of transportation]*);
		

	}

}
