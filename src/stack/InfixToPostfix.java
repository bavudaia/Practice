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
        
    }
    
    public String convert(String infix)
    {
        String postfix= "";
        Stack<Character> stack = new Stack(100);
        
        
        return postfix;
    }
    
    public boolean isOperand(char ch)
    {
        return ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/'));
       
    }
    public boolean isOperator(char ch)
    {
        return !isOperand(ch) && !isOpenBracket(ch) && !isCloseBracket(ch);
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
            case '{': return '}'; 
            case  '(' : return ')'; 
            case '[' : return ']';
            default : return '\t';
        }
       
    }
}
