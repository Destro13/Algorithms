
public class Sort {

	public static void main(String[] args) {
		System.out.println("Integers sorting:");
		Integer [] iArr = {10,3,1,4,5,8,29,14,2,9,45} ;
		Bubble <Integer> intBubble = new Bubble(iArr);
		intBubble.printArray();
		System.out.println();
		intBubble.sort();
		intBubble.printArray();
		
		System.out.println("\nDoubles sorting:");
		Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9,3.3,77.334} ;
		Bubble <Double> doubleBubble = new Bubble(dArr);
		doubleBubble.printArray();
		System.out.println();
		doubleBubble.sort();
		doubleBubble.printArray();
		
		System.out.println("\nChars sorting:");
		Character [] cArr = {'s','a','m','c','w','b','y','k','z'};
		Bubble <Character> charBubble = new Bubble(cArr);
		charBubble.printArray();
		System.out.println();
		charBubble.sort();
		charBubble.printArray();
		
		System.out.println("\nStrings sorting:");
		String [] sArr = {"sugar","apple","milk","coffee","water","bread"};
		Bubble <String> stringBubble = new Bubble(sArr);
		stringBubble.printArray();
		System.out.println();
		stringBubble.sort();
		stringBubble.printArray();
	}

}
