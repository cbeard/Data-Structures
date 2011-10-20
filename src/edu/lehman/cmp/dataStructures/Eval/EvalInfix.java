package edu.lehman.cmp.dataStructures.Eval;

import edu.lehman.cmp.dataStructures.Array.StackChar;
import edu.lehman.cmp.dataStructures.Array.StackFloat;

/**
 * cbeard
 * CMP 338  
 * Starting Date:10*13*09
 * Modified Date(s):
 * Due Date:???
 * 
 * 
 *Assignment(S):To create a EavalInfix that use's float numbers 
 *           
 *         
 *                      
 * ***Note(S):
 *      (10*13*09)
 *         Give that a main class or another class/code ask's the user for the 
 *         expression and put's the  given expression in quotes and add's token 
 *         using the string class, etc, this code should work.
 *         
 *         Also the StackFloat class use's an array which I haven't set up to 
 *         be endless so if the expression is too big this program will crash.
 *                
 *                     
 */

public class EvalInfix
{
   public static void main(String[] args)
   {
      System.out.println(evalPostfix(infix2Postfix("3.001#*3#+4#*4.1#^6#")));
      
   }

   public static String infix2Postfix(String infix)
   {
      StackChar stack = new StackChar();

      String postfix = "";

      for(int i = 0; i < infix.length(); i++)
      {  
         char c = infix.charAt(i);

         if(isOperator(c))
         {
            while((!stack.isEmpty()) && (prec(stack.top()) >= prec(c)))
               postfix += stack.pop();

            stack.push(c);
         }
         else 
         {
            postfix += c;
         }
      }

      while(!stack.isEmpty())
         postfix += stack.pop();
      // System.out.println(postfix);//tester
      return postfix;
   }


   public static float evalPostfix(String postfix)
   {
      StackFloat stack = new StackFloat();
      String number ="";

      for(int i = 0; i < postfix.length(); i++)
      {
         char c = postfix.charAt(i);
         
         if(isToken(c)){
        	// System.out.println(number);//tester
        	 stack.push(Float.valueOf(number));
        	 number="";
        	  
         }
         else if(isOperator(c))
         {
            float b = (float) stack.pop();
            float a = (float) stack.pop();

            if (c == '^')  stack.push(power(a, b));
            if (c == '*')  stack.push(a * b);
            if (c == '/')  stack.push(a / b);
            if (c == '+')  stack.push(a + b);
            if (c == '-')  stack.push(a - b);
         }        
         else
         {
            number+=c;
         }
      }

      return (float) stack.top();

   }


   public static int prec(char op)
   {
      if (op == '^') return 3;
      if (op == '*') return 2;
      if (op == '/') return 2;
      if (op == '+') return 1;
      if (op == '-') return 1;

      return 0;
   }

   public static boolean isOperator(char c)
   {
      return((c == '^') || (c == '*') || (c == '/') || (c == '+') || (c == '-'));
   }
   public static boolean isToken(char c)
   {
	   return c == '#'; 
   }
   public static float power(float base, float exp)
   {
      float result = base;

      for(int i = 1; i < exp; i++)
         result *= base;

      return result;
   }


}

