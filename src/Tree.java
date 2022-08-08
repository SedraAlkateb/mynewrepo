public class Tree {

    public TreeNode root;

    public Tree(){

        root = null;

    }

    public TreeNode returnRoot(){
        return root;
    }

    public boolean isEmpty(){

        return root == null;

    }

    public void insert(String value){

        if(isEmpty()){

            root = new TreeNode(value);

        }else{

            root.add(value);

        }
    }

    public boolean search (String value) {
        root = root.search_Recursive(root, value);
        if (root!= null)
            return true;
        else
            return false;
    }

    public TreeNode getRoot(){
        return root;
    }

    public void preOrder() {
        preOrder(root);
    }

    // using the function ...
    public void preOrder(TreeNode root) {
        if (root != null) {

            System.out.print(root.getWord());   // root
            preOrder(root.getLeft());
           // left
            preOrder(root.getRight());
            ;// right
        }

    }

}
