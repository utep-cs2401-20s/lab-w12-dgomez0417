class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;

  myBinarySearchTreeNode(int inValue){
    myValue = inValue; // created a new node with empty child pointers
  }

  myBinarySearchTreeNode(int[] A){
    myValue = A[0];// creates a new Binary Search Tree rooted at the first value in the array

    for(int i = 1; i < A.length; i++) {// by inserting elements into the tree in the order they are given in A.
      this.insert(A[i]); // inserting the rest of the array into the tree
    }
  }

  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.

    if(inValue > myValue){ // comparing values
      if(right == null){ // checking that there is not a node
        right = new myBinarySearchTreeNode(inValue); // making a new node
      }
      else{ // if there is a node then
        right.insert(inValue); // it will traverse the right side
      }
    }
    else{ // if inValue < myValue
      if(left == null){ // checking that there is not a node
        left = new myBinarySearchTreeNode(inValue); // making a new node
      }
      else{ // if there is a node
        left.insert(inValue); // it will traverse the left side
      }
    }
    if(inValue == myValue){ // when the values are the same
      System.out.println("Sorry no duplicates"); // then it tells you it cant be done
    }
  }

  public int height(){
    // This method recursively calculates the height of the entire (sub)tree.
    // This method will take O(n) time
    int L = 0;
    int R = 0;

    if(left != null){ // checking if there is left side or not
      L = left.height() + 1; // looking on the left side
    }
    if(right != null){ // checking if there is right side or not
      R = right.height() + 1; // looking on the right side
    }
    if(L > R){
      return L;
    }
    else
      return R; // returns the greater on of the values plus 1
  }

  public int depth(int search) {
    // This method recursively calculates the depth of a given search value.
    // If the given value is not in the tree, this method returns -1.
    // Note that if the tree is a proper BST, this method should complete in O(log n) time.
    // Additionally, remember that the depth is the number of nodes on the path from a node to the root
    // (i.e. the number of the recursie calls).

    if (search < myValue && left != null) {
      int result = left.depth(search);// looking on the left side
        return result + 1;
    }
    if (search > myValue && right != null) {
      int result = right.depth(search); // looking on the right side
        return result + 1;
    }
    if (search == myValue) { // if there are both the same number then i will return 0
      return 0;
    }
    return -1;
  }

  public int size(){
    // This method recursively calculates the number of nodes in the (sub)tree.
    int sum = 1; // setting the count

    if(left != null){ // if it can go to the left then itll start counting
      sum += left.size(); // counting the left side
    }
    if(right != null){ // if it can go to the right then itll start counting
      sum += right.size(); // counting the right side
    }
    return sum; // adding all the sums plus the root base case
  }


  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }

}
