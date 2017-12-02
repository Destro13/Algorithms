class KeyPrinter  implements TreeVisitor {
    public void visit(Tree node) {
        System.out.print( " " + node.key );
    }
};
