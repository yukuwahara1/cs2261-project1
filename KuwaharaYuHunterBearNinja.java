//============================================================================
//Name        : KuwaharaYuP1CS2261.java
//Course      : CS 2261: Objected-Oriented Programming
//Date        : 9/12/2018
//Author      : Yu Kuwahara
//============================================================================

//make a hunter-bear-ninja game like a rock-paper-scissor game

import java.util.Scanner; // need scanner to take input from player

import java.util.Random; // need to randomize what computer chooses against the player

public class KuwaharaYuHunterBearNinja // class name needs to be the same as the file name 

{
	
//first, make a menu for players by using switch
	
	public static void main(String[] args) // main function for this game

	{
	
		Random generator;
		generator = new Random(); // need this to randomize the choice of the computer
		
		Scanner in = new Scanner(System.in); // need scanner to take input as integer
		
		int readychoice; // 1 for yes, 2 for no
		int compchoice; // 1 for hunter, 2 for bear, 3 for ninja
		int playchoice; // 1 for yes, 2 for no
		int playagain;  // 1 for yes, 2 for no
		
		int playcounter = 0; // need counter to decide a winner
		int compcounter = 0;

		System.out.println("Welcome to Hunter-Bear-Ninja game!");
		System.out.println(); // insert a blank line
		
		System.out.println("In this game,"); // explain how the game works
		System.out.println(" - Hunter shoots a bear");
		System.out.println(" - Bear eats a ninja");
		System.out.println(" - Ninja kills the hunter");
		System.out.println();
		
		do { // use do while loop to repeat the game
			
		System.out.println("Are you ready to play this game?: Yes (1) or No (2)");
		readychoice = in.nextInt(); // let the user enter choice as integer
		
			if (readychoice == 1)
			{
				System.out.println("Let's start the game!");
				System.out.println();
				
				// first generate the computer's choice
				compchoice = generator.nextInt(3)+1;
				
				// let the player enter his/her choice
				System.out.println("What is your choice?: Hunter (1) or Bear (2) or Ninja (3)");
				playchoice = in.nextInt(); 
				
				// now show the result
				if (playchoice == compchoice) 
					System.out.println("Wow, it's a tie :0"); 
				    else if (playchoice == 1)
				       if (compchoice == 2)
				       {
				          System.out.println("Congratulations! YOU WIN!!!");
				          playcounter++; // need a counter to decide a winner
				       }
				    else if (compchoice == 3)
				    {
				    	System.out.println("Sorry, you lose..."); 
				    	compcounter++; 
				    }
				    else if (playchoice == 3)
				       if (compchoice == 2) 
				       {
				       System.out.println("Sorry, you lose...");
				       compcounter++;
				       }
				    else if (compchoice == 1)
				    {
				    	System.out.println("Congratulations, YOU WIN!!!"); 
				    	playcounter++;
				    }
				    else if (playchoice == 2)
				         if (compchoice == 3)
				         {
				         System.out.println("Congratulations, YOU WIN!!!"); 
				         playcounter++;
				         }
				    else if (compchoice == 1)
				    {
				    	System.out.println("Sorry, you lose..."); 
				    	compcounter++;
				    }
				    else 
				         System.out.println("Please enter a valid choice!"); 
			}
			
			// when the user was not ready to play
			else if (readychoice == 2)
			{
				System.out.println("See you later!");
				System.exit(0);
			}
		
			// when the user did not answer questions if he/she was ready or not
			else
			{
				System.out.println("Please enter a valid choice!");
			}
			
			System.out.println();
			System.out.println("Do you want to play again: Yes (1) or No (2)");
			playagain = in.nextInt(); 
			
			if (playagain == 2) // if the player wants to stop the game
			{
				// calculate the ratio of win/lose
				
				System.out.println("You win " + playcounter + " times!");
				System.out.println("Computer win " + compcounter + " times!");
				
				// show who win the game 
				
				// when the player wins
				if (playcounter > compcounter)
				{
					System.out.println();
					System.out.println("The winner is... YOU!!!");
				}
				
				else // when the player loses
				{
					System.out.println();
					System.out.println("The winner is... computer ;(");
				}
			}
			
			}
			
			while(!(playagain == 2)); 
				
			in.close(); // close the scanner
	}
}
