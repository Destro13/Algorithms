import java.util.Arrays;

/**
 * Created by Павлик Назарій on 19.05.2017.
 */
public class Insertion <T extends Comparable<T>>  {
    private T [] array;

    public Insertion(T [] array){
        this.array = array.clone();
    }

    public void sort(){
        T value;

        for(int i = 1,j; i < array.length; i++)
        {
            value = array[i];
            for ( j = i - 1; j >= 0 && array[j].compareTo(value) > 0; j--)
            {
                array[j + 1] = array[j];
            }
            array[j + 1] = value;
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
