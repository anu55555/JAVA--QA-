import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class Calculator {

	public String calculateCombinations(int[] nums) {
		List<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toList());
		StringBuilder sb = new StringBuilder();
		permutations(numSet, new Stack<Integer>(), 3,sb);
		return sb.toString();
	}

	public static void permutations(List<Integer> items, Stack<Integer> permutation, int size,StringBuilder sb) {

		if (permutation.size() == size) {
			Integer[] array = permutation.toArray(new Integer[0]);
			for (String output : checkCalculatons(array[0], array[1], array[2])) {
				sb.append(output + "\n");
			}

		}

		Integer[] availableItems = items.toArray(new Integer[0]);
		for (Integer i : availableItems) {
			permutation.push(i);

			items.remove(i);

			permutations(items, permutation, size,sb);

			items.add(permutation.pop());
		}
	}

	public static Set<String> checkCalculatons(int numOne, int numTwo, int expectedResult) {
		List<String> results = new ArrayList<>();
		if ((numOne + numTwo) == expectedResult)
			results.add(numOne + " + " + numTwo + " = " + expectedResult);
		if ((numOne - numTwo) == expectedResult)
			results.add(numOne + " - " + numTwo + " = " + expectedResult);
		if ((numOne * numTwo) == expectedResult)
			results.add(numOne + " X " + numTwo + " = " + expectedResult);
		if (numOne != 0 && numTwo != 0) {
			if ((numOne / numTwo) == expectedResult)
				results.add(numOne + " / " + numTwo + " = " + expectedResult);
		}
		Set<String> outputSet =  new HashSet<String>(results.stream().collect(Collectors.toSet())) ;
		return outputSet;

	}

	public boolean stringArrayIsEmtpy(String[] array) {
		if (array.length > 0)
			return true;
		return false;
	}

}
