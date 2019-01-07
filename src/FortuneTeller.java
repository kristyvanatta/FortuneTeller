import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
				
		System.out.println("Welcome, So you want to know your future, do you?!\nCome and let Odessa see into your future!");
		System.out.println("Now tell me your first name.");
		String first = input.nextLine();
		
		System.out.println("What an interesting name! \nNow your last.");
		String last = input.nextLine();
		System.out.println("I'm starting to see someting!");
		
		System.out.println("What is your age");
		int age = input.nextInt();
		int retirementYears;
		boolean isEven = (age % 2) == 0; 
		if (isEven) {
			retirementYears = 23;
					}
		else { 
			retirementYears = 46;
		}
		
		
		System.out.println("Enter your birth month as a number");
		int birthMonth = input.nextInt();
		int bankBalance;
		
				
		//Bank balance is determined by birth month, if user enters anything other than
		// 1-12 their balance is $0.00
		System.out.println("Tell Odessa your favorite color");
		String color = input.nextLine();
		
		//don't forget to enter the help loop for the color scheme
		// set a condition for mode of transportation based on favorite color
		System.out.println("How many siblings do you have?");
		int responseSiblings = input.nextInt();
		String vacationHome; 
		if (responseSiblings == 1) {
		vacationHome = "Honolulu, HI";
		}
		else if (responseSiblings == 2) {
		vacationHome = "Miami, FL";
		} 
		else if (responseSiblings == 3) {
		vacationHome = "Las Vegas, NV";
		}
		else {
		vacationHome = "Juneau, AK";
		}
				
		//offer a quit option at input lines that will print out "Nobody likes a quitter..."
		//before ending the program
		
		 
		//System.out.println("first " + " last " + will retire in +" retirementYears " +  with +" $bank balance " + in the bank, a vacation home in + " vacationHome" + , and travel by + " transportation! ");
		

	}

}
