
public class Sort {

	public static void main(String[] args) {
		System.out.println("Integers sorting:");
		Integer [] iArr = {10,3,1,4,5,8} ;
		Selection <Integer> intSelection = new Selection(iArr);
		intSelection.sort();
		intSelection.printArray();
		
		System.out.println("\nDoubles sorting:");
		Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9} ;
		Selection <Double> doubleSelection = new Selection(dArr);
		doubleSelection.sort();
		doubleSelection.printArray();
		
		System.out.println("\nStrings sorting:");
		String [] sArr = {"sugar","apple","milk","coffe","water","bread"};
		Selection <String> stringSelection = new Selection(sArr);
		stringSelection.sort();
		stringSelection.printArray();
	}

}
