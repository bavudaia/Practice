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
public class BalancedParanthesis {
    public static void main(String[] args) {
        //test case 1
       String t1 = "[()]{}{[()()]()}";
        System.out.println(check(t1));
        //test case 2
        String t2 = "[()]}{}{][()()]()}}";
        System.out.println(check(t2));
        String t3 = "[()]{}{][()()]()}}";
        System.out.println(check(t3));
        String t4 ="";
        System.out.println(check(t4));
    }
    public static boolean check(String S)
    {
        Stack<Character> stack = new Stack<>();
        int len = S.length();
        for(int i=0;i<len;i++)
        {
            char ch = S.charAt(i);
            if(OperationUtils.isOpenBracket(ch))
            {
                stack.push(ch);
            }
            else if(OperationUtils.isCloseBracket(ch))
            {              
                if(stack.isEmpty())
                    return false;
                else
                {
                    char openExpected = OperationUtils.getOpenBracket(ch);
                    char openActual = stack.pop();
                    if(openActual != openExpected)
                    {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }
    

}
