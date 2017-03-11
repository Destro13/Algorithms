
public class Selection<T extends Comparable<T>> {
	private T [] array;
	public Selection(T [] array){
		this.array = array.clone();	
	}
	
	public void sort(){
		for (int min = 0; min < array.length-1; min++) {
			 		int least = min;
			 		for (int j = min + 1; j < array.length; j++) {
			 		    if(array[j].compareTo(array[least]) < 0) {
			 				least = j;
			 			}
			 		}
			 		swap(min,least);
			 	}
		
	}
    
	private void swap(int i, int j) {
		T tmp;
		tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
		
	}

	public	void printArray(){
		for(T i : array){
			System.out.print( i + "\t");
		}
	}
}
