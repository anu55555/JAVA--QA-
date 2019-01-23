import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Output {
	
	public static int[] splitInput(String input) {
		String[] outputArray;
		List<Integer> returnArray = new ArrayList<>();
		if(Pattern.matches("[0-9,]+",input) && input.contains(",")) {
			 outputArray = input.split(",");
			 for(String o : outputArray) {
				 if(Pattern.matches("[0-9]+",o)) {
				  returnArray.add(Integer.parseInt(o));
				 }
			 }
			 
			 return returnArray.stream().mapToInt(i -> i).toArray();
		}
			return new int[0];
		
	}
	
}
