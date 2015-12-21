/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

import utils.OperationUtils;

/**
 *
 * @author bavudaia
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "a*(b*d+c)+((x+y)*z)";
        InfixToPostfix obj = new InfixToPostfix();
        String result = obj.convert(infix);
        System.out.println(result);
    }
    
    public String convert(String infix)
    {
        String postfix= "";
        Stack<Character> stack = new Stack(100);
        int len = infix.length();
        for(int i=0;i<len;i++)
        {
            char ch = infix.charAt(i);
            if(OperationUtils.isOperand(ch) )
            {
                postfix += ch;
            }
            else if(OperationUtils.isOperator(ch))
            {
                if(stack.isEmpty())
                    stack.push(ch);
                else
                {
                    char last = stack.peek();
                    while(!OperationUtils.isOpenBracket(last) && OperationUtils.priority(last) > OperationUtils.priority(ch) )
                    {
                        char operator = stack.pop();
                        postfix+=operator;
                        if(stack.isEmpty())
                            break;
                        last = stack.peek();
                    }
                    stack.push(ch);
                }
            }
            else if(OperationUtils.isOpenBracket(ch))
            {
                stack.push(ch);
            }
            else if(OperationUtils.isCloseBracket(ch))
            {
                char open = OperationUtils.getOpenBracket(ch);
                while(!stack.isEmpty() && stack.peek() != open)
                {
                    postfix += stack.pop();
                }
                 stack.pop();
            }
        }
        while(!stack.isEmpty())
        {
            postfix += stack.pop();
        }
        // test
        return postfix;
    }
}
