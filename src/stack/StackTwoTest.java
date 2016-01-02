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
public class StackTwoTest {
    public static void main(String[] args) {
        StackTwo stack = new StackTwo(8);
        
        stack.push1(1);
        printArray(stack);
        stack.push2(10);
        printArray(stack);
        stack.push1(20);
        printArray(stack);
        stack.push2(22);
        printArray(stack);
        
        stack.push1(1);
        printArray(stack);
        stack.push2(10);
        printArray(stack);
        stack.push1(20);
        printArray(stack);
        stack.push2(22);
        printArray(stack);
        stack.push1(1);
        printArray(stack);
        stack.push2(10);
        printArray(stack);
        stack.push1(20);
        printArray(stack);
        stack.push2(22);
        printArray(stack);
                stack.pop1();
                  printArray(stack);
                stack.pop1();        printArray(stack);
                stack.pop1();        printArray(stack);
                stack.pop1();        printArray(stack);
                stack.pop1();        printArray(stack);
                stack.pop1();        printArray(stack);
                stack.pop2();        printArray(stack);
                stack.push1(100); printArray(stack);
                stack.pop2(); printArray(stack);
                stack.pop2();  printArray(stack);
                stack.pop2(); printArray(stack);
                stack.pop2();  printArray(stack);
                stack.pop2(); printArray(stack);
                stack.pop2();  printArray(stack);
                stack.pop2(); printArray(stack);
                stack.pop2(); 
    }
    
    public static void printArray(StackTwo s)
    {
        Object[] obj = s.getArray();
        int len = obj.length;
        for(int i=0;i<len;i++)
        {
            System.out.print(obj[i]+" ");
        }
        System.out.println("");
    }
    
    
}
