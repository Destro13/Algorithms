public class  OddEven <T extends Comparable<T>> {
	private T [] array;
	
	public OddEven(T [] array){
		this.array = array.clone();	
	}
	
	public void sort(){
		boolean sorted = false;
		  while(!sorted)
		  {
		    sorted = true;
		    for(int i = 1; i < array.length-1; i += 2)
		    {
		      if(array[i].compareTo(array[i+1]) > 0)
		      {
		        swap(i, i+1);
		        sorted = false;
		      }
		    }

		    for(int i = 0; i < array.length-1; i += 2)
		    {
		      if(array[i].compareTo(array[i+1]) > 0)
		      {
		        swap(i, i+1);
		        sorted = false;
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
