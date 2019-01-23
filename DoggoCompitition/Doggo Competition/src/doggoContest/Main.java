package doggoContest;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
				
		System.out.println("Plese enter your dogs placement number (e.g. 1): ");
		
		int dogPlacement = userInput.nextInt();
		
		System.out.println("Your dog placed: " + dogPlacement);
		
		//int[] dogArray = new int[100];
		
		
		if (dogPlacement == 0) {
			System.out.println("Your dog finished in zeroth place?");
		}
		else if (dogPlacement >= 1 && dogPlacement <=100 ) {
			//System.out.println("Loop Open");
			//System.out.println("please fill in the 'st'/'nd'/'rd'/'th' yourself");
			
			System.out.println("The Other Dogs Placed: ");
			if (dogPlacement == 1) {
				for (int i = 2; i <=100; i++) {
					System.out.println(i + "st");
					
					//dogArray[i] = i;
				}
			}
			else if (dogPlacement > 1) {
				//System.out.println("SecondLoop");
				for (int i = 1; i < dogPlacement ; i++ ) {
					System.out.println(i);
				}
				for(int n = dogPlacement+1; n <= 100; n++) {
					System.out.println(n);	
				}
			}
			
		}
		else if (dogPlacement > 100) {
			System.out.println("Please enter a value between 0 and 100");
		}
		
		//for ();
		
		
		
		userInput.close();

	}

}
