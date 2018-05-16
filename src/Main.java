
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
		
		list2.printAllNodes();
		
		System.out.println();
		
		list2.removeAt(11);
		
		list2.printAllNodes();
		
		System.out.println();
		
		list2.insertAt(0, "Dings");
		list2.insertAt(5, "Antonella");
		System.out.println(list2.count);
		System.out.println(list2.insertAt(13, "John"));
		
		list2.printAllNodes();
		
		list2.removeAll("John");
		

	}

}
