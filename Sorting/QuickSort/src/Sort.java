public class Sort {

    public static void main(String[] args){
        System.out.println("Integers sorting:");
        Integer [] iArr = {10,3,1,4,5,8,29,14,2,9,45} ;
        QuickSort <Integer> intQuickSort = new QuickSort(iArr);
        intQuickSort.printArray();
        System.out.println();
        intQuickSort.sort();
        intQuickSort.printArray();

        System.out.println("\nDoubles sorting:");
        Double [] dArr = {10.22,3.1,1.7,4.2,4.4,5.9,3.3,77.334} ;
        QuickSort <Double> doubleQuickSort = new QuickSort(dArr);
        doubleQuickSort.printArray();
        System.out.println();
        doubleQuickSort.sort();
        doubleQuickSort.printArray();

        System.out.println("\nChars sorting:");
        Character [] cArr = {'s','a','m','c','w','b','y','k','z'};
        QuickSort <Character> charQuickSort = new QuickSort(cArr);
        charQuickSort.printArray();
        System.out.println();
        charQuickSort.sort();
        charQuickSort.printArray();

        System.out.println("\nStrings sorting:");
        String [] sArr = {"sugar","apple","milk","coffee","water","bread"};
        QuickSort <String> stringQuickSort = new QuickSort(sArr);
        stringQuickSort.printArray();
        System.out.println();
        stringQuickSort.sort();
        stringQuickSort.printArray();
    }
}
