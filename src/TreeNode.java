public class TreeNode {

    private String word;    // The data in this node.
    private TreeNode left;   // Pointer to the left subtree.
    private TreeNode right;  // Pointer to the right subtree.

    public TreeNode(String s){
        word = s;
        left = null;
        right = null;
    }
TreeNode root;

    public void add(String value) {

        if (left == null) {
            left = new TreeNode(value);
        } else if( right == null){
            right = new TreeNode(value);
        } else {
            if(countNodes(left) <= countNodes(right)){
                left.add(value);
            } else {
                right.add(value);

            }
        }
    }

//    public boolean search (String value) {
//        root = search_Recursive(root, value);
//        if (root!= null)
//            return true;
//        else
//            return false;
//    }


    //recursive insert function
    TreeNode search_Recursive(TreeNode root, String key)  {
        // Base Cases: root is null or key is present at root
        if (root==null || root.word==key)
            return root;
        // val is greater than root's key
        if (root.word.compareTo(key) >0)
            return search_Recursive(root.left, key);
        // val is less than root's key
        return search_Recursive(root.right, key);
    }

    //Count the nodes in the binary tree to which root points, and
    public static int countNodes( TreeNode root ) {
        if ( root == null ){

            // The tree is empty.  It contains no nodes.
            return 0;

        }else {

            // Start by counting the root.
            int count = 1;


            // Add the number of nodes in the left subtree.
            count += countNodes(root.left);

            // Add the number of nodes in the right subtree.
            count += countNodes(root.right);

            return count;  // Return the total.
        }
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    public String getWord(){
        return word;
    }
}
