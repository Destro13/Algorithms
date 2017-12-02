
public class TreeSort<T extends Comparable<T>> {
    private T[] array;
    private Tree tree;

    public TreeSort(T[] array) {
        this.array = array.clone();
    }

    public void sort(){
        tree = new Tree(array[0]);
        for (int i = 1; i < array.length; i++){
            tree.insert(new Tree(array[i]));
        }
    }

    public Tree getTree() {
        return tree;
    }

    public	void printArray(){
        tree.traverse(new KeyPrinter());
    }
}
