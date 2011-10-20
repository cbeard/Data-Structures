package edu.lehman.cmp.dataStructures.Array;

//092209 cbeard
public class StackInt
{
   private int top = -1;

   private int[] A = new int[8];


   public void push(int v)
   {
      top++;

      A[top] = v;
   }

   public int pop()
   {
      int temp = A[top];

      top--;

      return temp;
   }

   public int top()
   {
      return A[top];
   }

   public boolean isEmpty()
   {
      return top == -1;
   }

}
