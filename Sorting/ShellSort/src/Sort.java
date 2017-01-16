
public class Sort {

	public static void main(String[] args) {
		
		System.out.println("Integers sorting:");
		Integer [] iArr = {10,3,1,4,5} ;
		Shell <Integer> intShell = new Shell(iArr);
		intShell.Sort();
		intShell.PrintArray();
		
		System.out.println("\nDoubles sorting:");
		Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9} ;
		Shell <Double> doubleShell = new Shell(dArr);
		doubleShell.Sort();
		doubleShell.PrintArray();
		
		System.out.println("\nStrings sorting:");
		String [] sArr = {"sdfs","aaarf","efwefe","asfsdf"};
		Shell <String> stringShell = new Shell(sArr);
		stringShell.Sort();
		stringShell.PrintArray();
	}

}
