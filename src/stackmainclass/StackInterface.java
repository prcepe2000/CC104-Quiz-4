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
public interface StackInterface<E> {
    
    int size();
    boolean isEmpty();
    void push(E e);
    E top();
    E pop();

    public String pop(String nextLine);
    
    
    
}
