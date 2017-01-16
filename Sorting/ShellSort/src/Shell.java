
public class Shell <T extends Comparable <T>> {
	private T [] array;
	
	public Shell(T [] array){
		this.array = array.clone();	
	}
	
	public void Sort(){
		
		int step = array.length / 2;
		
		while (step > 0) {
			for (int i = 0; i < array.length - step; i++) { 
				int j = i + step;
				T tmp = array[j];
				while (j >= step && tmp.compareTo(array[j - step]) < 0) {
					array[j] = array[j - step];
					j -= step;
				}
				array[j] = tmp;
			}
			if (step == 2) { 
				step = 1;
			} 
			else {
				step /= 2;
			}
		}
	}
    
	public	void PrintArray(){
		for(T i : array){
			System.out.print( i + "\t");
		}
	}
		
}
