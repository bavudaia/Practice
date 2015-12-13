/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

/**
 *
 * @author bavudaia
 */
public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "a*(b*d+c)";
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
            if(isOperand(ch) )
            {
                postfix += ch;
            }
            else if(isOperator(ch))
            {
                if(stack.isEmpty())
                    stack.push(ch);
                else
                {
                    char last = stack.peek();
                    while(!isOpenBracket(last) && priority(last) > priority(ch) )
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
            else if(isOpenBracket(ch))
            {
                stack.push(ch);
            }
            else if(isCloseBracket(ch))
            {
                char open = getOpenBracket(ch);
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
        
        return postfix;
    }
    public int priority(char ch)
    {
        if(ch == '+' || ch == '-')
            return 1;
        else if(ch == '*' || ch == '/')
            return 2;
        else
            return 0;
    }
    public boolean isOperand(char ch)
    {
        
       return !isOperator(ch) && !isOpenBracket(ch) && !isCloseBracket(ch);
    }
    public boolean isOperator(char ch)
    {
        return ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/'));
        
    }
    
    public boolean isOpenBracket(char ch)
    {
        return ((ch == '(') ||  (ch == '{')|| (ch == '['));
    }
    public boolean isCloseBracket(char ch)
    {
        return ( (ch == ')') || (ch == '}') || (ch == ']'));
    }
    public char getOpenBracket(char ch)
    {
        switch(ch)
        {
            case '}': return '{'; 
            case  ')' : return '('; 
            case ']' : return '[';
            default : return '\t';
        }
       
    }
}
