import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int firstnumber, secondnumber;
		Boolean trueorfalse;
		System.out.println("Eneter two intergers and one boolean value");
		Scanner in = new Scanner(System.in);
		firstnumber = in.nextInt();
		secondnumber = in.nextInt();
		trueorfalse =in.nextBoolean();
		
		int total = Calculator.add(firstnumber,secondnumber);
		String outputMessage = " The sum of " + firstnumber + " & " + secondnumber + " is " + total;
		System.out.println(outputMessage);
	
	     total = Calculator.substract(firstnumber,secondnumber);
	      outputMessage = " The substraction of " + firstnumber + " & " + secondnumber + " is " + total;
		 System.out.println(outputMessage);
		 
		 total = Calculator.divideby2(firstnumber,secondnumber);
	      outputMessage = " The total answer is " + total;
		 System.out.println(outputMessage);
		 
		 total = Calculator.booleancheck(firstnumber,secondnumber,trueorfalse);
	      outputMessage = " The total answer is " + total;
		 System.out.println(outputMessage);
		 
}
}
