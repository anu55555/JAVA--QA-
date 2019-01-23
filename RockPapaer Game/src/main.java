import java.util.Scanner;
import java.util.Random;
public class main 
{
	public static void main(String[] args) 
   {
		   String userChoice;
		   int i;
		   int userscore =0;
		   int computerscore=0;
		   int tiescore=0;
		   float userpercentage=0;
		   float computerpercentage=0;
		   float tiepercentage=0;
		    do 
		    {
		    	 System.out.println("Plese enter your your choice from Rock, Paper,Scissors or Exit ");
				 Scanner userInput = new Scanner(System.in);
			     userChoice = userInput.nextLine();
			     i=10;
		      if(userChoice!="Exit")
			  {
				String[] availableChoices = {"Rock", "Paper", "Scissors"};
				java.util.Random choice = new java.util.Random();
				int computerChoice = choice.nextInt(availableChoices.length);
				String computerPlay = availableChoices[computerChoice];
				System.out.println("Computer choice is  " +  computerPlay);
				System.out.println("User choice is  " + userChoice);
				// computerPlay = "Paper";
				//userChoice ="Rock";
			  if(userChoice.equals(computerPlay))
			  {
			  System.out.println("Tie Game");
			  tiescore=tiescore+1;
			  System.out.println("Tie Score is  " + tiescore);
			  System.out.println("Computer Score is  " + computerscore);
			  System.out.println("User Score is  " + userscore);
			  System.out.println();
			  //System.out.println("Plese enter your your choice from Rock, Paper,Scissors or Exit ");
			  i=i-1;
			  
			  }
			 else if(userChoice.equals("Rock") & computerPlay.equals("Paper") || ( userChoice.equals("Paper") & computerPlay.equals("Scissors")) || (userChoice.equals("Scissors") & computerPlay.equals("Rock")))
			 {
				 System.out.println("Computer Wins");
				// System.out.println("Plese enter your your choice from Rock, Paper,Scissors or Exit ");
				 i=i-1;
				 computerscore=computerscore+1;
				 System.out.println("Tie Score is  " + tiescore);
				 System.out.println("Computer Score is  " + computerscore);
				 System.out.println("User Score is  " + userscore);
				 System.out.println();
			 }
			
			 else if((userChoice.equals("Paper") & computerPlay.equals("Rock")) || (userChoice.equals("Scissors")  & computerPlay.equals("Paper")) || (userChoice.equals("Rock") & computerPlay.equals("Scissors")))
			 {
				 System.out.println("User Wins");
				 //System.out.println("Please enter your your choice from Rock, Paper,Scissors or Exit ");
				 i=i-1;
				 userscore=userscore+1;
				 System.out.println("Tie Score is  " + tiescore);
				 System.out.println("Computer Score is  " + computerscore);
				 System.out.println("User Score is  " + userscore);
				 System.out.println();
			 }
			 else if(userChoice.equals("Exit"))
			 {
				 System.out.println("Hello" + i);
				 System.out.println("thank you for playing");
				 System.out.println("Tie Score is  " + tiescore);
				 System.out.println("Computer Score is  " + computerscore);
				 System.out.println("User Score is  " + userscore);
				 tiepercentage=((tiescore/i)*100);
				 computerpercentage=((computerscore/i)*100);
				 userpercentage=((userscore/i)*100);
				 System.out.println("Tie Percentage is  " + tiepercentage +"%");
				 System.out.println("Computer Percentage is  " + computerpercentage +"%");
				 System.out.println("User Percentage is  " + userpercentage +"%");
				 
				 break;
			 }
			 else
			 {
				 System.out.println("Please Enter valid Choice");
				 System.out.println();
				 //System.out.println("Plese enter your your choice from Rock, Paper,Scissors or Exit ");
				 i=i-1;
				 
			 }
			
			  }
		         else {
		    	     System.out.println("thank you for playing");
		    	     break;
		               } 
	      }while (i<=10);   
		     System.out.println("thank you for playing 10 games & Your Scores are as below");
		     
		     tiepercentage=((tiescore/10)*100);
			 computerpercentage=((computerscore/10)*100);
			 userpercentage=((userscore/10)*100);
			 System.out.println();
			 System.out.println("Tie Score is  " + tiescore);
			 System.out.println("Computer Score is  " + computerscore);
			 System.out.println("User Score is  " + userscore);
			 System.out.println("Tie Percentage is  " + tiepercentage +"%");
			 System.out.println("Computer Percentage is  " + computerpercentage +"%");
			 System.out.println("User Percentage is  " + userpercentage +"%");
		  
	}
}