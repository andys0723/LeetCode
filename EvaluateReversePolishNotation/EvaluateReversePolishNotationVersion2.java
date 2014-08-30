package EvaluateReversePolishNotation;

import java.util.Stack;

public class EvaluateReversePolishNotationVersion2 {
   public static void main(String[] args){
       String[] input = {"2","1","+","3","*"};
       String[] input2 = {"4","13","5","/","+"};
       String[] input3 = {"0","3","/"};
       System.out.println(EvaluateReversePolishNumber(input3));
   }
   
   
   public static int EvaluateReversePolishNumber(String[] tokens){
	   Stack<String> stack = new Stack<String>();
	   String operator = "+-*/";
	   
	   for(String element:tokens){
		   if(operator.contains(element)){
			   Integer tmp1 = Integer.valueOf(stack.pop());
			   Integer tmp2 = Integer.valueOf(stack.pop());
			   
			   if(element.equals("*")){
				   stack.push(String.valueOf(tmp1 * tmp2));
			   }else if(element.equals("/")){
				   stack.push(String.valueOf(tmp2 / tmp1));
			   }else if(element.equals("+")){
				   stack.push(String.valueOf(tmp1 + tmp2)); 
			   }else if(element.equals("-")){
				   stack.push(String.valueOf(tmp2 - tmp1));
			   } 
			   System.out.println(stack.peek());
		   }else{
			   stack.push(element);
			   System.out.println(stack.peek());
		   }
	   }
	   
	   return Integer.valueOf(stack.peek());
   }

   
}
