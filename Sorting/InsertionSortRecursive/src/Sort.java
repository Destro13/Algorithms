/**
 * Created by Павлик Назарій on 19.05.2017.
 */
public class Sort {
    public static void main(String[] args) {
        System.out.println("Integers sorting:");
        Integer [] iArr = {10,3,1,4,5,8} ;
        InsertionRecursive <Integer> intInsertionRecursive = new InsertionRecursive(iArr);
        intInsertionRecursive.printArray();
        System.out.println();
        intInsertionRecursive.sort();
        intInsertionRecursive.printArray();

        System.out.println("\nDoubles sorting:");
        Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9} ;
        InsertionRecursive <Double> doubleInsertionRecursive = new InsertionRecursive(dArr);
        doubleInsertionRecursive.printArray();
        System.out.println();
        doubleInsertionRecursive.sort();
        doubleInsertionRecursive.printArray();

        System.out.println("\nChars sorting:");
        Character [] cArr = {'s','a','m','c','w','b','y','k','z'};
        InsertionRecursive <Character> charInsertionRecursive = new InsertionRecursive(cArr);
        charInsertionRecursive.printArray();
        System.out.println();
        charInsertionRecursive.sort();
        charInsertionRecursive.printArray();

        System.out.println("\nStrings sorting:");
        String [] sArr = {"sugar","apple","milk","coffee","water","bread"};
        InsertionRecursive <String> stringInsertionRecursive = new InsertionRecursive(sArr);
        stringInsertionRecursive.printArray();
        System.out.println();
        stringInsertionRecursive.sort();
        stringInsertionRecursive.printArray();
    }
}
