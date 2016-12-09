/**
 * Creates Nodes for the tree
 * 
 */
package btree;

/**
 *
 * @author milto_000
 */
public class Node {

    public int data;    

    public Node left;
    public Node right;
//==============================================================================
    /**
     * Class Constructors
     */
    Node() {

    }//end Node()
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
        
    }//end Node()
//==============================================================================
    /**
     * accessors and mutators
     *
     * @param data
     */
    public void setData(int data) {
        this.data = data;
    } //end setData()

    public void setLeft(Node left) {
        this.left = left;
    } //end setLeft()

    public void setRight(Node right) {
        this.right = right;
    } //end setRight()

    public int getData() {
        return data;
    }//end getData()

    public Node getLeft() {
        return left;
    }//end getLeft()

    public Node getRight() {
        return right;
    }//end getRight()
//==============================================================================
    /**
     * String representation of tree
     * 
     * @return 
     */
    public String toString() {
        String result = data+ "";
        if (left != null) {
            result = left.toString()+ "-"+result ;
        }
        if (right != null) {
            result = result +"-"+ right.toString();
        }
        return result;
    }//end of toString()
}//end class Node
