package edu.lehman.cmp.dataStructures.BST;
public class BSTNode
{
   //-------------------------------------------------------------------------//

   int x;

   BSTNode left  = null;
   BSTNode right = null;

   //-------------------------------------------------------------------------//

   public BSTNode(int x)
   {
      this.x = x;
   }

   //-------------------------------------------------------------------------//

   public void insert(int x)
   {
      if(x < this.x)
      {
         if(left != null)   left.insert(x);
         else               left = new BSTNode(x);
      }

      if(x > this.x)
      {
         if(right != null)  right.insert(x);
         else               right = new BSTNode(x);
      }

   }

  //-------------------------------------------------------------------------//

  public void remove(int x)
  {
     BSTNode parent = parentOf(x);


     if(x < parent.x)
     {
        if(childCount(parent.left) < 2)
        {
           if(parent.left.left != null)
              parent.left = parent.left.left;
           else
              parent.left = parent.left.right;
        }
     }

     if(x > parent.x)
     {
        if(childCount(parent.right) < 2)
        {
           if(parent.right.left != null)
              parent.right = parent.right.left;
           else
              parent.right = parent.right.right;
        }
     }







/*

     if(x > parent.x)
     {
        parent.right = null;
     }
     else
     {
         parent.left  = null;
     }

*/
  }

  //-------------------------------------------------------------------------//

  public int childCount(BSTNode node)
  {
     int count = 0;

     if(node.left != null) count++;
     if(node.right != null) count++;

     return count;
  }

  //-------------------------------------------------------------------------//

   public BSTNode parentOf(int x)
   {
      if((x < this.x) && (left  != null))
      {
         if(x == left.x) return this;// if there is a node to the left is it holding x
         else            return left.parentOf(x);
      }

      if((x > this.x) && (right != null))
      {
         if(x == right.x) return this;// if there is a node to the right is it holding x
         else             return right.parentOf(x);
      }

      return null;
   }

   //-------------------------------------------------------------------------//

   public int search(int x)
   {
      if(x == this.x)  return this.x;

      if((x < this.x) && (left != null))
         return left.search(x);

      if((x > this.x) && (right != null))
         return right.search(x);

      return -1;
   }

   //-------------------------------------------------------------------------//

   public int minium()
   {
      if (left != null)   return left.minium();
      else                return x;
   }


   //-------------------------------------------------------------------------//

   public int maxium()
   {
      if (right != null)  return right.maxium();
      else                return x;
   }

   //-------------------------------------------------------------------------//

   public int nodeCount()
   {
      int count = 0;

      if (left  != null) count += left.nodeCount();

      count++;

      if (right != null) count += right.nodeCount();

      return count;
   }

   //-------------------------------------------------------------------------//

   public void sort()
   {
      if (left != null)   left.sort();

      System.out.println(x);

      if (right != null) right.sort();
   }

   //-------------------------------------------------------------------------//
}









