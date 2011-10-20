package edu.lehman.cmp.dataStructures.LinkedList;

//092209 cbeard
public class QueueInt
{
   private Node front = null;
   private Node back  = null;


   public void enqueue(int x)
   {
      if(isEmpty())
      {
         front = back = new Node(x, null);
      }
      else
      {
         back.next = new Node(x, null);
         back = back.next;
      }
   }

   public int dequeue()
   {
      int temp = front.x;

      front = front.next;

      return temp;
   }

   public boolean isEmpty()
   {
      return front == null;
   }

   public int front()
   {
      return front.x;
   }

   public int back()
   {
      return back.x;
   }




}