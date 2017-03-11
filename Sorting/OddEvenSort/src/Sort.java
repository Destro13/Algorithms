
public class Sort {

	public static void main(String[] args) {
		System.out.println("Integers sorting:");
		Integer [] iArr = {10,3,1,4,5,8} ;
		OddEven <Integer> intOddEven = new OddEven(iArr);
		intOddEven.sort();
		intOddEven.printArray();
		
		System.out.println("\nDoubles sorting:");
		Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9} ;
		OddEven <Double> doubleOddEven = new OddEven(dArr);
		doubleOddEven.sort();
		doubleOddEven.printArray();
		
		System.out.println("\nStrings sorting:");
		String [] sArr = {"sugar","apple","milk","coffe","water","bread"};
		OddEven <String> stringOddEven = new OddEven(sArr);
		stringOddEven.sort();
		stringOddEven.printArray();

	}

}
