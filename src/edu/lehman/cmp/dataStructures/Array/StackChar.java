package edu.lehman.cmp.dataStructures.Array;

//091009 cbeard
public class StackChar
{
   private int top = -1;

   private char[] A = new char[8];


   public void push(char v)
   {
      top++;

      A[top] = v;
   }

   public char pop()
   {
      char temp = A[top];

      top--;

      return temp;
   }

   public char top()
   {
      return A[top];
   }

   public boolean isEmpty()
   {
      return top == -1;
   }

}
