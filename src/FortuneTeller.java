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
		
		String isColor;
		 do {
			   System.out.println("Tell Odessa your favorite ROYGBIV color?.");
			   System.out.println("Type \"help\" to list options.");
			   isColor = input.nextLine();
			   if(isColor.toLowerCase().equals("help")) {
			   System.out.println("Options: red, orange, yellow, green, blue, indigo, violet\n Odessa is busy, now tell me your favorite color");
			   }
			 } while(isColor.equals("help"));
			   
		 
		  String transportation = (""); {
		   } if (isColor.toLowerCase().equals("red")) {
			   transportation = "a mustang!";
		   } else if (isColor.toLowerCase().equals("orange")){
			   transportation = "a harley!";
		   } else if (isColor.toLowerCase().equals("yellow")) {
			   transportation = "a donkey!";
		   } else if (isColor.toLowerCase().equals("green")) {
			   transportation = "a jet ski!";
		    } else if (isColor.toLowerCase().equals("blue")) {
		    	transportation = "a helicopter!!";
		   } else if (isColor.toLowerCase().equals("indigo")){
			   transportation = "a hover board";
	       } else if (isColor.toLowerCase().equals("violet")){
	    	   transportation = "a sparkly unicorn";
		   }
		 
				
		System.out.println("What is your age");
		int age = input.nextInt();
		int goldenYears;
		boolean isEven = (age % 2) == 0; 
		if (isEven) {
			goldenYears = 23;
					}
		else { 
			goldenYears = 46;
		}
		
				
		System.out.println("What month were you born");
		int birthMonth = input.nextInt();
		double bankBalance;
		if (birthMonth == 1) {
			bankBalance = 382971.34;
		}
		else if (birthMonth == 2 ) {
			bankBalance = 382971.34;
		}
		else if (birthMonth == 3 ) {
			bankBalance = 382971.34;
		}
		else if (birthMonth == 4 ) {
			bankBalance = 382971.34;
		}
		else if (birthMonth ==5 ) {
			bankBalance = 4376276.18; 
		}
		else if (birthMonth ==6 ) {
			bankBalance = 4376276.18; 
		}
		else if (birthMonth ==7 ) {
			bankBalance = 4376276.18; 
		}
		else if (birthMonth ==8 ) {
			bankBalance = 4376276.18; 
		}
		else if (birthMonth == 9) {
			bankBalance = 126.75;
		}
		else if (birthMonth == 10) {
			bankBalance = 126.75;
		}
		else if (birthMonth == 11) {
			bankBalance = 126.75;
		}
		else if (birthMonth == 12) {
			bankBalance = 126.75;
		}	
		else {
			bankBalance = 0;
		}
			
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
		System.out.println("Ah yes, your future is becomming clear!");
				
		 
		System.out.println(first+ " "    +last  +" will retire in " +  goldenYears  + " years with $" +  bankBalance +  " in the bank, a vacation home in " +  vacationHome +  ", and travel by " +  transportation );
		

}
}

