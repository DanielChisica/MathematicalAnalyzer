/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author EAN
 */
public class Stack {

    public Node getThetop() {
        return thetop;
    }

    public void setThetop(Node thetop) {
        this.thetop = thetop;
    }
    private Node thetop;

    public Stack(Node thetop) {
        this.thetop = thetop;
    }
    
    public Stack() {
        this.thetop = null;
    }
    
    public void push(Object element){
        this.thetop=new Node(element, thetop);
    }
    
    public Object pop(){
        return thetop.getElement();
    }
    
    public boolean isEmpty(){
        return thetop!=null;
    }
    
    public boolean hasNext(){
        return thetop.getNext()!=null;
    }
    
    
}
