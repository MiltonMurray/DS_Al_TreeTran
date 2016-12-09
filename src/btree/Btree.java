/*******************************************************************************
 * Btree
 * CSCI 211 Spring 2016 
 * Last edited March 23, 9:00 p.m.
 * @author Milton Murray
 ******************************************************************************/
package btree;

/**
 *
 * @author milto_000
 */
public class Btree {

    public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.add(20);
        x.add(5);
        x.add(25);
        x.add(3);
        x.add(7);
        x.add(27);
        x.add(24);
         
        System.out.println("Preorder Transversal: ");
        x.preOrder(x.root);
        System.out.println("\n");
        
        System.out.println("Inorder Transversal: ");
        x.inOrder(x.root);
        System.out.println("\n");
        
        System.out.println("Postorder Transversal: ");
        x.postOrder(x.root);

        System.out.println("\n\n" + "Search: " + x.search(8));
        System.out.println("\n" + "The Max value: " + x.max(x.root));
        System.out.println("\n" + "The Min value: " + x.min(x.root));
        System.out.println("\n" + "Size: " + x.size);
        System.out.println("\n" + "Height: " + x.height(x.root));
    }//end main()

}//end class Btree
