/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import exceptions.InvalidInputException;

/**
 *
 * @author bavudaia
 */
public class OperationUtils {
        public static int priority(char ch)
    {
        if(ch == '+' || ch == '-')
            return 1;
        else if(ch == '*' || ch == '/')
            return 2;
        else
            return 0;
    }
    public static boolean isOperand(char ch)
    {
        
       return !isOperator(ch) && !isOpenBracket(ch) && !isCloseBracket(ch);
    }
    public static boolean isOperator(char ch)
    {
        return ((ch == '+') || (ch == '-') || (ch == '*') || (ch == '/'));
        
    }
    
    public static boolean isOpenBracket(char ch)
    {
        return ((ch == '(') ||  (ch == '{')|| (ch == '['));
    }
    public static boolean isCloseBracket(char ch)
    {
        return ( (ch == ')') || (ch == '}') || (ch == ']'));
    }
    public static char getOpenBracket(char ch)
    {
        switch(ch)
        {
            case '}': return '{';
            case  ')' : return '('; 
            case ']' : return '[';
            default : return '\t';
        }
       
    }
    public static int operate(int a, int b , char ch)
    {
        switch(ch)
        {
            case '+': return a+b; 
                case '-': return a-b; 
                    case '*': return a*b; 
                        case '/' : return a/b; 
                        default :  throw new InvalidInputException();
        }
    }
}
