package edu.lehman.cmp.dataStructures.BST;





public class BinarySearchTree
{
   BSTNode root = null;

   public int search(int x)
   {
      if(root == null)  return -1;
      else              return root.search(x);
   }

   public void insert(int x)
   {
      if(root == null)  root = new BSTNode(x);
      else              root.insert(x);
   }

   public int nodeCount()
   {
      if(root == null)  return 0;
      else              return root.nodeCount();
   }

   public void sort()
   {
      if(root != null) root.sort();
   }

   public int minimum()
   {
      if(root == null)  return -1;
      else              return root.minium();
   }

   public int maximum()
   {
      if(root == null)  return -1;
      else              return root.maxium();
   }

   public BSTNode parentOf(int x)
   {
      if(root == null) return null;
      else
      if(root.x == x)  return null;
      else
                       return root.parentOf(x);
   }

   public void remove(int x)
   {
      if(root != null)  root.remove(x);
   }

}