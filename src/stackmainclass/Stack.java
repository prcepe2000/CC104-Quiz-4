/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackmainclass;

/**
 *
 * @author username
 * @param <E>
 */
public class Stack<String> implements StackInterface<String> {
    public static final int CAPACITY = 1000;
    private String[] data;
    private int t = 1;
    public Stack( ) { 
        this(CAPACITY); 
    }
    public Stack(int capacity) {
        data = (String[ ]) new Object[capacity];
    }

    public int size(){
        return (t + 1);
    }
    
    public boolean isEmpty(){
        return (t == -1);
    }
    
    public void push(String e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Stack is full");
        data[++t] = e;
    }

    public String top(){
        if(isEmpty()) return null;
        return data[t];
    }
    
    public String pop(){
        if(isEmpty()) return null;
        String answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
}
