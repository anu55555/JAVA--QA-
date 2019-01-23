import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	Scanner Inputscanner =new Scanner(System.in);
	String InputString = Inputscanner.nextLine();
	String[] splitstring = InputString.split(" ");
	String Outputstring=condensation.stringcompressor(InputString);
	System.out.println(Outputstring);
	}

}
