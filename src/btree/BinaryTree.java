/**
 * Constructs a Binary Tree
 * adds, searches, returns size, returns height
 * Returns tree in PostOrder, InOrder, and PreOrder
 */
package btree;

/**
 *
 * @author milto_000
 */
public class BinaryTree {

    public Node root; //node that starts the tree
    public int height = -1; // measure of the tree
    public int size = 0; //number of nodes
//==============================================================================
    /**
     * Class Constructor
     */
    BinaryTree() {
        root = null;
    }//end BinaryTree()
//==============================================================================
    /**
     * Checks if the tree is empty
     * 
     * @return 
     */
    public boolean isEmpty() {
        return root == null;
    }//end isEmpty()
//==============================================================================
    /**
     * Adds a parent/leaf the tree
     * Adds left if less than root
     * Right if higher
     *
     * @param input
     */
    public void add(int input) {

        Node newNode = new Node(input); //Create a newNode object

        if (isEmpty()) {    //create a root and iterate size if root is empty
            root = newNode;
            size++;
        } else {    
            //varibles for moving through the tree
            Node parent;
            Node current = root; 
            
            //loop used to reach each node
            while (true) {
                parent = current; 
                if (input < current.data) { //checks if input is less

                    current = current.left; //set on the left if true
                    if (current == null) {
                        parent.left = newNode;  //creates node on left
                        size++;

                        return;
                    }//end if()
                } else {

                    current = current.right;
                    if (current == null) {
                        parent.right = newNode; //creates node on the right
                        size++;

                        return;
                    }//end if()

                }//end else

            }//end while()
        }//end else

    }//end add()
//==============================================================================
    /**
     * List all  nodes in order according to the InOrder traversal of the tree
     * 
     * @param current 
     */
    public void inOrder(Node current) {
        if (current != null) {
            inOrder(current.left);
            System.out.print(current.data + "-");
            inOrder(current.right);
        }//end if()
    }//end inOrder()
//==============================================================================
    /**
     * List all  nodes in order according to the PreOrder traversal of the tree
     * 
     * @param current 
     */
    public void preOrder(Node current) {
        if (current != null) {
            System.out.print(current.data + "-");
            preOrder(current.left);
            preOrder(current.right);
        }//end if()
    }//end preOrder()
//==============================================================================
    /**
     * List all  nodes in order according to the PostOrder traversal of the tree
     * 
     * @param current 
     */
    public void postOrder(Node current) {
        if (current != null) {

            postOrder(current.left);
            postOrder(current.right);
            System.out.print(current.data + "-");
        }//end if()
    }//end postOrder()
//==============================================================================
    /**
     * Given a key value, tells whether or not the integer is in the tree
     * 
     * @param key
     * @return 
     */
    public String search(int key) {
        Node current = root;
        
        while (current != null) {
            if (current.data == key) {
                return key + " was found.";
            } else if (current.data > key) {
                current = current.left;
            } else {
                current = current.right;
            }//end if()
        }//end while()
        return key + " wasn't found.";
    }//end search()
//==============================================================================
    /**
     *  Return the maximum value in the tree
     *  By recursively updating the result by checking each node in the tree
     * 
     * @param root
     * @return 
     */
    public int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE; //holds the value
        }//end if()

        int result = root.data;
        int max_left = max(root.left);
        int max_right = max(root.right);

        if (max_left > result) {
            result = max_left;
        }//end if()

        if (max_right > result) {
            result = max_right;
        }//end if()
        return result;
    }//end max()
//==============================================================================
    /**
     * Return the maximum value in the tree
     * By recursively updating the result by checking each node in the tree
     * 
     * @param root
     * @return 
     */
    public int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE; //holds the value
        }//end if()

        int result = root.data;
        int min_left = min(root.left);
        int min_right = min(root.right);

        if (min_left < result) {
            result = min_left;

        }//end if()

        if (min_right < result) {
            result = min_right;

        }//end if()
        return result;
    }//end min()
//==============================================================================
    /**
     * Return height of the tree
     * 
     * @param node
     * @return 
     */
    public int height(Node node) {
        if (node == null) {
            return 0;  //The children of leaf nodes are null. 
                        //Therefore this is saying that once we've gone past the 
                        //leaves, there are no further nodes.
        } else {
            int hl = height(node.left);
            int hr = height(node.right);
            int h = 1 + Math.max(hl, hr); //current node adds a height of 1 to the height
            return h;
        }//end nested if()
    }//end height()
//==============================================================================
    /**
     * String representation of tree
     * 
     * @return 
     */
    public String toString() {
        if (!isEmpty()) {
            return root.toString();
        }//end if()
        return "";
    }//end toString()
}//end class BinaryTree
