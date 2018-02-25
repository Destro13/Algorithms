import java.util.Arrays;

public class Counting<T extends Comparable<T>>  {
    private T [] array;
    private T maxValue;

    public Counting(T [] array){
        this.array = array.clone();
    }

    public void sort(){
        findMaxValue();
        countingSort();
    }

    private void countingSort() {
        int numCounts[] = new int[(Integer) maxValue + 1];

        for (T num : array) {
            numCounts[(Integer) num]++;
        }

        T[] sortedArray = Arrays.copyOfRange(array, 0, array.length);
        int currentSortedIndex = 0;

        for (int num = 0; num < numCounts.length; num++) {
            int count = numCounts[num];
            for (int i = 0; i < count; i++) {
                sortedArray[(Integer)currentSortedIndex] = (T)(Integer)num;
                currentSortedIndex++;
            }
        }
        array = sortedArray.clone();
    }

    private void findMaxValue(){
        maxValue = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(maxValue) > 0)
                maxValue = array[i];
        }
    }

    public  T[] getArray(){
        return array;
    }

    public	void printArray(){
        for(T i : array){
            System.out.print( i + "\t");
        }
    }
}