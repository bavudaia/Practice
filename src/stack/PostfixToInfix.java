/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

import exceptions.InvalidInputException;
import utils.OperationUtils;

/**
 *
 * @author bavudaia
 */
public class PostfixToInfix {
    public static void main(String[] args) {
        PostfixToInfix obj = new PostfixToInfix();
        //String infix = "2*3+4*5*8/(2+2)";
        String postfix = "23*45822+/**+";
        
        int result = obj.evaluvate(postfix);
        System.out.println(result);
    }
    
    public int evaluvate(String postfix)
    {
        int len = postfix.length();
        Stack<Integer> stack = new Stack<>(len);
        for(int i=0;i<len;i++)
        {
            char ch = postfix.charAt(i);
            int ele = ch - 48;
            if(OperationUtils.isOperand(ch))
            {
                stack.push(ele);
            }
            else if(OperationUtils.isOperator(ch))
            {
                int top = stack.pop();
                int penulti = stack.pop();
                int res = OperationUtils.operate(penulti,top,ch);
                stack.push(res);
            }
            else
            {
                throw new RuntimeException();
            }
        }
        
        if(stack.length() != 1)
           throw new InvalidInputException();
        return stack.pop();
    }
    
}
