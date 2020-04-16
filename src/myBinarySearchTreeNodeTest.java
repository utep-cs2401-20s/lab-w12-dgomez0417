import static org.junit.Assert.*;

public class myBinarySearchTreeNodeTest {

    //test passed
    // will take in an array and rearrange it to the correct tree array.
    @org.junit.Test
    public void insert() {
        int[] A = {2,3,1};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        test.insert(2);

        int[] B = {2,1,3};
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(B);

        assertEquals(exp.myValue, test.myValue);
        assertEquals(exp.left.myValue, test.left.myValue);
        assertEquals(exp.right.myValue, test.right.myValue);
    }

    // test passed
    // counted the height correctly
    @org.junit.Test
    public void height() {
        int [] A = {7,2,9};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        int exp = 1;

        assertEquals(exp, test.height());
    }

    // test passed
    // it searches for 2 and finds it on the left side and returns the correct depth;
    @org.junit.Test
    public void depth() {
        int [] A = {7,2,9};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        int exp = 1;

        assertEquals(exp, test.depth(2));
    }

    //test passed
    // correctly counted the number of node in the tree
    @org.junit.Test
    public void size() {
        int [] A = {7,2,9};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        int exp = 3;

        assertEquals(exp, test.size());
    }

    // test passed
    // correctly count the number of node in the tree and told the user that they couldnt use duplicates
    @org.junit.Test
    public void size1() {
        int [] A = {7,2,9,1,3,5,7,6};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        int exp = 8;

        assertEquals(exp, test.size());
    }
}