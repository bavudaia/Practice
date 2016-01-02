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
public class StackTwo {
    private Object A[];
    private int default_size = 50;
    private int size;
    // top1 , top2 is the index location where the element has to pushed
    private int top1,top2;
    public StackTwo()
    {
        size = default_size;
        top1 = 0;
        top2 = size-1;
        A = new Object[size];
    }
    public StackTwo(int size)
    {
        this.size = size;
        top1 = 0;
        top2 = size-1;
        this.A = new Object[this.size];
    }
    public void push1(Object data)
    {
        if(top1 > top2 || top1 >= size)
        {
            System.out.println("overflow");
        }
        else
        {
            A[top1] = data;
            top1++;
        }
    }
    
    public void push2(Object data)
    {
        if(top2 < top1 || top2 < 0)
        {
            System.out.println("overflow");
        }
        else
        {
            A[top2] = data;
            top2--;
        }
    }
    public Object pop1()
    {
        if(top1 <= 0 )
        {
            System.out.println("stack 1 is already empty");
            return null;
        }
        else
        {
            top1--;
            Object res = A[top1];
            A[top1] = null;
            return res;
        }
    }
    
    public Object pop2()
    {
        if(top2 >= size-1 )
        {
            System.out.println("stack 1 is already empty");
            return null;
        }
        else
        {
            top2++;
            Object res = A[top2];
            A[top2] = null;
            return res;
        }        
    }
    
    public Object peek1()
    {
        if(top1 <= 0 )
        {
            System.out.println("stack 1 is already empty");
            return null;
        }
        else
        {
            
            return A[top1-1];
        }        
    }
    
    public Object peek2()
    {
        if(top2 >= size-1 )
        {
            System.out.println("stack 2 is already empty");
            return null;
        }
        else
        {
            return A[top2+1];
        }  
    }
    
    public Object[] getArray()
    {
        return A;
    }
}
