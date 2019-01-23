import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calc = new Calculator();
		int[] numbers = new int[0];
		while(numbers.length <3) {
			System.out.println("Please input 3 or more numbers seperated by a ',':");
			String input = scanner.nextLine();
			numbers = Output.splitInput(input);
			
		}
		String toPrint = calc.calculateCombinations(numbers);
		System.out.println(toPrint);
	}
	
}
