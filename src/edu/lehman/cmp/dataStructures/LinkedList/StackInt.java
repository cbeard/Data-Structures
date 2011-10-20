package edu.lehman.cmp.dataStructures.LinkedList;
//091709 cbeard / bmurphy
public class StackInt
{
   private Node top = null;

   public boolean isEmpty()
   {
      return top == null;
   }

   public void push(int x)
   {
      top = new Node(x, top);
   }

   public int pop()
   {
      int temp = top.x;

      top = top.next;

      return temp;
   }

   public int top()
   {
      return top.x;
   }

}