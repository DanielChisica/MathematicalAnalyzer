/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * This class contains the configuration of a stack and its methods
 *
 * @author Daniel Jiménez Chísica
 * @since 19 March 2017
 */
public class Stack {

    /**
     * Returns the top of the stack
     *
     * @return A node with the the top of the stack
     */
    public Node getThetop() {
        return thetop;
    }

    /**
     * Sets which is the top of the stack
     *
     * @param thetop The input top
     */
    public void setThetop(Node thetop) {
        this.thetop = thetop;
    }
    private Node thetop;

    /**
     * This constructor makes a stack with a node as its top
     *
     * @param thetop
     */
    public Stack(Node thetop) {
        this.thetop = thetop;
    }

    /**
     * This constructor initializes a stack without a current top for the moment
     */
    public Stack() {
        this.thetop = null;
    }

    /**
     * Pushes an object on the stack
     *
     * @param element The element to be pushed
     */
    public void push(Object element) {
        thetop = new Node(element, thetop);
    }

    /**
     * Grabs the top element of the stack
     *
     * @return The element of the stack top
     */
    public Object pop() {
        Object data = new Object();
        if (isEmpty()) {
            return data;
        }
        data = thetop.getElement();
        this.thetop = thetop.getNext();
        return data;
    }

    /**
     * Asks to the stack if is empty
     *
     * @return True if it haven't top, false if it have a top
     */
    public boolean isEmpty() {
        return thetop == null;
    }

    /**
     * Asks to the top if it haves a next object
     *
     * @return
     */
    public boolean hasNext() {
        return thetop.getNext() != null;
    }

}
