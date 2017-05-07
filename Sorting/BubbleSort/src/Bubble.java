public class Bubble <T extends Comparable<T>>{
private T [] array;
	
	public Bubble(T [] array){
		this.array = array.clone();	
	}
	
	public void sort(){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - 1; j++){
				if(array[j].compareTo(array[j+1]) > 0){
					swap(j, j+1);
				}
			}
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
