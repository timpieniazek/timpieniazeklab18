import java.util.Arrays;

public class ArrayAlgorithm {

	/*
	 * This assumes only positive integers
	 * Big-O is n^2, or n^3 including display
	 */

	private int[] numbers;
	private int[] occurances;
	private String output;

	public ArrayAlgorithm(int[] numbers) {
		super();
		this.numbers = numbers;
		occurances = occurrences();
		output = "ArrayAlgorithm [occurences={";
	}

	public int max() {
		int num1 = 0;

		for (int num2 : numbers) {
			if (num1 < num2) {
				num1 = num2;
			}
		}

		return num1;
	}

	public int[] occurrences() {
		occurances = new int[max() + 1];

		for (int num : numbers) {

			occurances[num]++;
		}

		return occurances;
	}

	
	
	@Override
	public String toString() {
		return "ArrayAlgorithm [occurances=" + Arrays.toString(occurances) + "]";
	}

	
	public String toString22() {

		for (int i = 0; i < occurances.length; i++) {
			output += (" " + i + "=" + Integer.toString(occurances[i]) + " ");
		}
		output += "}]";
		return output;
	}

}
