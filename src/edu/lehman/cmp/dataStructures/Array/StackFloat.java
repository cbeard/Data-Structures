package edu.lehman.cmp.dataStructures.Array;

//091009 cbeard
public class StackFloat {
	
	   private int top = -1;

	   private double[] A = new double[50];


	   public void push(double v)
	   {
	      top++;

	      A[top] = v;
	   }

	   public double pop()
	   {
	      double temp = A[top];

	      top--;

	      return temp;
	   }

	   public double top()
	   {
	      return A[top];
	   }
	   public boolean isEmpty()
	   {
	      return top == -1;
	   }

	
}
