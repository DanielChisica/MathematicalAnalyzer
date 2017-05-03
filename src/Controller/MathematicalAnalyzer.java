/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Stack;

/**
 * Contains the working logic of the Mathematical Analyzer
 *
 * @author Daniel Jiménez Chísica
 * @since 19 March 2017
 */
public class MathematicalAnalyzer {

    /**
     * Returns the stack that compose the character parser
     *
     * @return The stack
     */
    public Stack getStack1() {
        return stack1;
    }

    /**
     * Sets the stack that compose the character parser
     *
     * @param stack1 The stack
     */
    public void setStack1(Stack stack1) {
        this.stack1 = stack1;
    }
    private Stack stack1;

    /**
     * This method contains the logic procedure that determines if an expression
     * is correctly balanced or not
     *
     * @param inputMessage The message input by the user
     * @return True if the expression is balanced
     */
    public boolean isBalanced(String inputMessage) {
        stack1 = new Stack();
        for (int i = 0; i < inputMessage.length(); i++) {
            if (inputMessage.charAt(i) == '(' || inputMessage.charAt(i) == '[' || inputMessage.charAt(i) == '{') {
                stack1.push(inputMessage.charAt(i));
            } else {
                if (inputMessage.charAt(i) == ')') {
                    if (!stack1.pop().equals('(')) {
                        stack1.push(inputMessage.charAt(i));
                    }
                } else {
                    if (inputMessage.charAt(i) == ']') {
                        if (!stack1.pop().equals('[')) {
                            stack1.push(inputMessage.charAt(i));
                        }
                    } else {
                        if (inputMessage.charAt(i) == '}') {
                            if (!stack1.pop().equals('{')) {
                                stack1.push(inputMessage.charAt(i));
                            }
                        }
                    }
                }
            }
        }
        //if (nuevaPila.empty()) {
        //JOptionPane.showMessageDialog(null, "Expresión  balanceada","",JOptionPane.INFORMATION_MESSAGE,n);
        //} else {

        //JOptionPane.showMessageDialog(null, "Expresión  desbalanceada","",JOptionPane.INFORMATION_MESSAGE,m);
        // nuevaPila.vaciar();
        //}
        /*
        String message = "";
        int exceptionCounter1 = 0;
        int exceptionCounter2 = 0;
        stack1 = new Stack();

        for (int i = 0; i < inputMessage.length(); i++) {

            if (inputMessage.charAt(i) == '(' || inputMessage.charAt(i) == '{' || inputMessage.charAt(i) == '[' || inputMessage.charAt(i) == '<') {
                stack1.push(inputMessage.charAt(i));
            } else if (inputMessage.charAt(i) == ')' && stack1.pop().equals('(')) {
                stack1.pop();
            } else if (inputMessage.charAt(i) == '}' && stack1.pop().equals('{')) {
                stack1.pop();
            } else if (inputMessage.charAt(i) == ']' && stack1.pop().equals('[')) {
                stack1.pop();
            } else if (inputMessage.charAt(i) == '>' && stack1.pop().equals('<')) {
                stack1.pop();
            } else if (inputMessage.charAt(i) != '(' && inputMessage.charAt(i) != '{' && inputMessage.charAt(i) != '[' && inputMessage.charAt(i) != '<'
                    && inputMessage.charAt(i) != ')' && inputMessage.charAt(i) != '}' && inputMessage.charAt(i) != ']' && inputMessage.charAt(i) != '>') {
                exceptionCounter1++;
            } else {
                exceptionCounter2++;
            }
        }

        if (stack1.isEmpty() && exceptionCounter1 == 0 && exceptionCounter2 == 0) {
            message = "Balanced expression";
        } else if (exceptionCounter1 > 0) {
            message = "Please inspect your characters, you have " + "\n"
                    + "introduced at least a non valid character, or in a wrong order";
        } else {
            message = "Non balanced expression";

        }

        return message;
         */
        return stack1.isEmpty();
    }

    public String solveOperation(String operation) {
        return "";
    }
}
