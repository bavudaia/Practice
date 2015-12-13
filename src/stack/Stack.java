/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;

import linkedlist.Node;

/**
 *
 * @author bavudaia
 */
public class Stack<T> {
    private Node<T> stack;
    private int size;
    private int max_size;
    private int default_size;
    public Stack()
    {
        this.max_size = this.default_size;
    }
    public Stack(int size)
    {
        this.max_size = size;
    }
    public boolean isEmpty()
    {
        return (size<=0)?true:false;
    }
    public void push(T data)
    {
        if(size == 0)
        {
            stack = new Node(data);
            size++;
        }
        else if(size == max_size)
        {
            return;
        }
        else
        {
            Node<T> temp = new Node(data);
            temp.next = stack;
            stack = temp;
            size++;
        }
    }
    public  T peek()
    {
        if(size == 0)
        {
            return null;
        }
        else
        {
            return stack.data;
        }
    }
    
    public T pop()
    {
        if(size == 0)
        {
            return null;
        }
        else
        {
            T result = stack.data;
            stack = stack.next;
            size--;
            return result;
        }
    }
}
