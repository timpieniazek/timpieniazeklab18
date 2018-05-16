
public class Main {

	public static void main(String[] args) {
		LinkedList list2 = new LinkedList();
		System.out.println(list2.getHead().value);
		list2.addAtStart("John");
		list2.addAtStart("Vicki");
		list2.addAtStart("Tim");
		list2.addAtStart("Jonah");
		list2.addAtStart("Jonah");
		list2.addAtStart("Tim");
		list2.addAtStart("Jonah");
		list2.addAtStart("Jonah");
		list2.addAtStart("Tim");
		list2.addAtStart("Jonah");
		list2.addAtStart("Jonah");
		list2.addAtStart("Vicki");
		
		//list2.printAllNodes();
		
		System.out.println();
		
		list2.removeAt(11);
		
		//list2.printAllNodes();
		
		System.out.println();
		
		list2.insertAt(0, "Dings");
		list2.insertAt(5, "Antonella");
		System.out.println(list2.count);
		System.out.println(list2.insertAt(13, "John"));
		
		list2.printAllNodes();
		
		list2.removeAll("Jonah");
		
		System.out.println();
		list2.printAllNodes();
		
		System.out.println("REVERSE PRINT");
		list2.printReverse();
		
		int[] numbers = {1,2,3,2,2,4,5,5,7,8,4,4,1,0,10};
		
		ArrayAlgorithm array = new ArrayAlgorithm(numbers);
		System.out.println(array.toString22());
		
		System.out.println();
		
		HashMapAlgorithm hashMap = new HashMapAlgorithm(numbers);
		System.out.println(hashMap);
	}
	
	
	

}
