public class Sort {

    public static void main(String[] args){
        System.out.println("Integers sorting:");
        Integer [] iArr = {10,3,1,4,5,8,29,14,2,9,45} ;
        Counting<Integer> intCounting = new Counting(iArr);
        intCounting.printArray();
        System.out.println();
        intCounting.sort();
        intCounting.printArray();
    }
}
