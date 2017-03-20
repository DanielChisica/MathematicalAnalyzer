/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Represents an instance of a node, an object with its element and the
 * reference to the next object
 *
 * @author Daniel Jiménez Chísica
 * @since 19 March 2017
 */
public class Node {

    /**
     * This constructor initializes a node with its object and reference
     *
     * @param element The element of the node
     * @param next The reference to the next object
     */
    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }

    /**
     * This constructor initializes a node only with its object
     *
     * @param element The input element
     */
    public Node(Object element) {
        this.element = element;
    }

    /**
     * Returns the element of the node
     *
     * @return The element of the node
     */
    public Object getElement() {
        return element;
    }

    /**
     * Sets the element of the node
     *
     * @param element The input element
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Returns the reference to the next object
     *
     * @return A node with reference to the next object
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the next node
     *
     * @param next The reference to other object
     */
    public void setNext(Node next) {
        this.next = next;
    }
    private Object element;
    private Node next;
}
