import java.util.Arrays;

public class MergeSort<T extends Comparable<T>>  {
	private T [] array;

	public MergeSort(T [] array){
		this.array = array.clone();	
	}
	
	public void sort(){
		mergeSort(array);
	}
	
	 private void merge(T[] S1, T[] S2, T[] S) {
	     int i = 0, j = 0;
	     while (i + j < S.length) {
	         if (j == S2.length || (i < S1.length && (S1[i]).compareTo(S2[j]) < 0))
	            S[i + j] = S1[i++]; 
	         else
	            S[i + j] = S2[j++]; 
	     }
  }
	 
  private void mergeSort(T[] S) {
	     int size = S.length;
	     if (size < 2)
	        return; 
	     int mid = size / 2;
	     T[] S1 = Arrays.copyOfRange(S, 0, mid); 
	     T[] S2 = Arrays.copyOfRange(S, mid, size);
	     mergeSort(S1); 
	     mergeSort(S2);
	     merge(S1, S2, S);
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
