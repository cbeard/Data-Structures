package edu.lehman.cmp.dataStructures.BST;




public class BST
{

   public static void main(String[] args)
   {
      BinarySearchTree BST = new BinarySearchTree();


      BST.insert(100);
      BST.insert(50);
      BST.insert(200);
      BST.insert(150);
      BST.insert(350);
      BST.insert(240);
      BST.insert(120);
      BST.insert(30);
      BST.insert(110);
      BST.insert(180);
      BST.insert(54);
      BST.insert(13);
      BST.insert(338);
      BST.insert(5);
      BST.insert(1591);
      BST.insert(57);
      BST.insert(21);
      BST.insert(678);

      System.out.println("Node Count = " + BST.nodeCount());
      System.out.println("Minimum = " + BST.minimum());
      System.out.println("Maximum = " + BST.maximum());


      //int x = 100;
      //System.out.println("ParentOf(" + x + ") = " + BST.parentOf(x));

      BST.remove(1591);
      BST.remove(678);
      BST.remove(350);

      BST.sort();
   }
}