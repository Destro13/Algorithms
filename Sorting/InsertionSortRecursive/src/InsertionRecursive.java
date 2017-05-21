import java.util.Arrays;

/**
 * Created by Павлик Назарій on 19.05.2017.
 */
public class InsertionRecursive <T extends Comparable<T>>  {
    private T [] array;

    public InsertionRecursive(T [] array){
        this.array = array.clone();
    }

    public void sort(){
        recursiveSort(array, array.length);
    }

    private void recursiveSort(T[] arr , int size) {
        if (size <= 1)
            return;

        recursiveSort(arr, size - 1);

        T last = arr[size - 1];
        int j = size - 2;

        while (j >= 0 && arr[j].compareTo(last) > 0)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = last;
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
