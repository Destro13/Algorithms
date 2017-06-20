import java.util.List;

/**
 * Created by pavlyknazariy on 17.06.17.
 */
public class QuickSort<T extends Comparable<T>>  {
    private T [] array;


    public QuickSort(T [] array){
        this.array = array.clone();
    }

    public QuickSort(List<T> list){
        this.array =  (T[]) new Comparable[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
    }

    public void sort(){
        quickSort(0, array.length - 1);
    }

    private void quickSort(int low, int high) {
        int i = low, j = high;
        T pivot = array[low + (high-low)/2];
        while (i <= j) {
            while (array[i].compareTo(pivot) < 0) {
                i++;
            }
            while (array[j].compareTo(pivot) > 0) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }


    private void swap(int i, int j) {
        T tmp;
        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
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
