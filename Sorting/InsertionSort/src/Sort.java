/**
 * Created by Павлик Назарій on 19.05.2017.
 */
public class Sort {
    public static void main(String[] args) {
        System.out.println("Integers sorting:");
        Integer [] iArr = {10,3,1,4,5,8} ;
        Insertion <Integer> intInsertion = new Insertion(iArr);
        intInsertion.printArray();
        System.out.println();
        intInsertion.sort();
        intInsertion.printArray();

        System.out.println("\nDoubles sorting:");
        Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9} ;
        Insertion <Double> doubleInsertion = new Insertion(dArr);
        doubleInsertion.printArray();
        System.out.println();
        doubleInsertion.sort();
        doubleInsertion.printArray();

        System.out.println("\nChars sorting:");
        Character [] cArr = {'s','a','m','c','w','b','y','k','z'};
        Insertion <Character> charInsertion = new Insertion(cArr);
        charInsertion.printArray();
        System.out.println();
        charInsertion.sort();
        charInsertion.printArray();

        System.out.println("\nStrings sorting:");
        String [] sArr = {"sugar","apple","milk","coffee","water","bread"};
        Insertion <String> stringInsertion = new Insertion(sArr);
        stringInsertion.printArray();
        System.out.println();
        stringInsertion.sort();
        stringInsertion.printArray();
    }
}
