
public class Sort {

	public static void main(String[] args) {
		System.out.println("Integers sorting:");
		Integer [] iArr = {10,3,1,4,5,8} ;
		MergeSort <Integer> intMergeSort = new MergeSort(iArr);
		intMergeSort.printArray();
		System.out.println();
		intMergeSort.sort();
		intMergeSort.printArray();
		
		System.out.println("\nDoubles sorting:");
		Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9} ;
		MergeSort <Double> doubleMergeSort = new MergeSort(dArr);
		doubleMergeSort.printArray();
		System.out.println();
		doubleMergeSort.sort();
		doubleMergeSort.printArray();
		
		System.out.println("\nChars sorting:");
		Character [] cArr = {'s','a','m','c','w','b','y','k','z'};
		MergeSort <Character> charMergeSort = new MergeSort(cArr);
		charMergeSort.printArray();
		System.out.println();
		charMergeSort.sort();
		charMergeSort.printArray();
		
		System.out.println("\nStrings sorting:");
		String [] sArr = {"sugar","apple","milk","coffee","water","bread"};
		MergeSort <String> stringMergeSort = new MergeSort(sArr);
		stringMergeSort.printArray();
		System.out.println();
		stringMergeSort.sort();
		stringMergeSort.printArray();
	}

}
