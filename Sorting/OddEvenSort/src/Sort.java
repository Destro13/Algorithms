
public class Sort {

	public static void main(String[] args) {
		System.out.println("Integers sorting:");
		Integer [] iArr = {10,3,1,4,5,8} ;
		OddEven <Integer> intOddEven = new OddEven(iArr);
		intOddEven.printArray();
		System.out.println();
		intOddEven.sort();
		intOddEven.printArray();
		
		System.out.println("\nDoubles sorting:");
		Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9} ;
		OddEven <Double> doubleOddEven = new OddEven(dArr);
		doubleOddEven.printArray();
		System.out.println();
		doubleOddEven.sort();
		doubleOddEven.printArray();
		
		System.out.println("\nChars sorting:");
		Character [] cArr = {'s','a','m','c','w','b','y','k','z'};
		OddEven <Character> charOddEven = new OddEven(cArr);
		charOddEven.printArray();
		System.out.println();
		charOddEven.sort();
		charOddEven.printArray();
		
		System.out.println("\nStrings sorting:");
		String [] sArr = {"sugar","apple","milk","coffe","water","bread"};
		OddEven <String> stringOddEven = new OddEven(sArr);
		doubleOddEven.printArray();
		System.out.println();
		stringOddEven.sort();
		stringOddEven.printArray();

	}

}
