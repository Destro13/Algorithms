
public class Sort {
    public static void main(String args[]) {
        System.out.println("Integers sorting:");
        Integer [] iArr = {5, 9, 13, 14, 2, 7, 1, 15, 18, 8, 4, 3, 50} ;
        TreeSort<Integer> integerTreeSort = new TreeSort<>(iArr);
        integerTreeSort.sort();
        integerTreeSort.printArray();

        System.out.println("\nDoubles sorting:");
        Double [] dArr = {5.5, 9.9, 13.13, 14.14, 2.2, 7.7, 1.1, 15.15, 18.18, 8.8, 4.6, 3.3, 50.50} ;
        TreeSort <Double> doubleTreeSort = new TreeSort(dArr);
        doubleTreeSort.sort();
        doubleTreeSort.printArray();

        System.out.println("\nChars sorting:");
        Character [] cArr = {'s','a','m','c','w','b','y','k','z'};
        TreeSort <Character> charTreeSort = new TreeSort(cArr);
        charTreeSort.sort();
        charTreeSort.printArray();

        System.out.println("\nStrings sorting:");
        String [] sArr = {"sugar","apple","milk","coffee","water","bread"};
        TreeSort <String> stringTreeSort = new TreeSort(sArr);
        stringTreeSort.sort();
        stringTreeSort.printArray();
    }
}
