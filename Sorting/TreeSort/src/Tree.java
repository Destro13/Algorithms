public class Tree <T extends Comparable<T>> {
    public Tree left;
    public Tree right;
    public T key;

    public Tree(T k) {
        key = k;
    }

    public void insert( Tree aTree) {
        if (aTree.key.compareTo(key) < 0)
            if ( left != null ) left.insert( aTree );
            else left = aTree;
        else
        if ( right != null ) right.insert( aTree );
        else right = aTree;
    }

    public void traverse(TreeVisitor visitor) {
        if ( left != null)
            left.traverse( visitor );

        visitor.visit(this);

        if ( right != null )
            right.traverse( visitor );
    }
}
