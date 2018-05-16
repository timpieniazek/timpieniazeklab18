import java.util.HashMap;

public class HashMapAlgorithm {
	
	private int[] numbers;
	private HashMap occurences;
	
	public HashMapAlgorithm(int[] numbers) {
		super();
		this.numbers = numbers;
		this.occurences = occurences();
	}
	
	public HashMap occurences() {
		
		occurences = new HashMap();
		
		for (int num : numbers) {
			
			if (occurences.containsKey(num)) {
				int i = (int)occurences.get(num);
				occurences.put(num, i + 1);
			} else {
				occurences.put(num, 1);
			}
			
		}
		
		return occurences;
	}

	@Override
	public String toString() {
		return "HashMapAlgorithm [occurences=" + occurences + "]";
	}
	
	

}
