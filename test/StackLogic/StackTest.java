/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackLogic;

import Model.Stack;
import Model.Node;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EAN
 */
public class StackTest {
    
    public StackTest() {
    }

    /**
     * Test of getThetop method, of class Stack.
     */
    @Test
    public void testGetThetop() {
        System.out.println("getThetop");
        Stack instance = new Stack();
        Node expResult = null;
        Node result = instance.getThetop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setThetop method, of class Stack.
     */
    @Test
    public void testSetThetop() {
        System.out.println("setThetop");
        Node thetop = null;
        Stack instance = new Stack();
        instance.setThetop(thetop);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String element = "Tomelo";
        Stack instance = new Stack();
        instance.push(element);
        
        assertEquals(element, instance.pop());
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack instance = new Stack();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Stack instance = new Stack();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasNext method, of class Stack.
     */
    @Test
    public void testHasNext() {
        System.out.println("hasNext");
        Stack instance = new Stack();
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
