/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLogic;

/**
 *
 * @author EAN
 */
public class Node <T>{
    
    /**
     * 
     * @param element
     * @param next 
     */
    public Node(T element, T next) {
        this.element = element;
        this.next = next;
    }

    public Node(T element) {
        this.element = element;
    }
    
    
    
    /**
     * 
     * @return 
     */
    public T getElement() {
        return element;
    }
    
    /**
     * 
     * @param element 
     */
    public void setElement(T element) {
        this.element = element;
    }
    
    /**
     * 
     * @return 
     */
    public T getNext() {
        return next;
    }
    
    /**
     * 
     * @param next 
     */
    public void setNext(T next) {
        this.next = next;
    }
   private T element;
   private T next;
}
