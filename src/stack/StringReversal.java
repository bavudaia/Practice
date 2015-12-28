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
public class StringReversal {
    public static void main(String[] args) {
        String S = "english figure";
        System.out.println(reverse(S));
    }
    public static String reverse(String S)
    {
       // char ch[] = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        int len = S.length();
        for(int i=0;i<len;i++)
        {
            stack.push(S.charAt(i));
        }
        S ="";
        for(int i=0;i<len;i++)
        {
            S = S + stack.pop();
        }
        return S;
    }
  
}
