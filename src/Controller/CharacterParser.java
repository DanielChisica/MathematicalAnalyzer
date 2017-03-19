/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Stack;

/**
 *
 * @author Daniel Jiménez Chísica
 */
public class CharacterParser {

    public Stack getStack1() {
        return stack1;
    }

    public void setStack1(Stack stack1) {
        this.stack1 = stack1;
    }
    private Stack stack1;
    
    public String isBalanced(String inputMessage){
        String message="";
        for (int i = 0; i<inputMessage.length(); i++) {
            
            if (inputMessage.charAt(i)=='(' || inputMessage.charAt(i)=='{' || inputMessage.charAt(i)=='[' || inputMessage.charAt(i)=='<') {
               stack1.push(inputMessage);
            }
           
            else if(inputMessage.charAt(i)==')' || inputMessage.charAt(i)=='}' || inputMessage.charAt(i)==']' || inputMessage.charAt(i)=='>'){
                if (inputMessage.charAt(i)==(char)stack1.pop()) {
                    stack1.pop();
                }
            }
            
            else {
                message="Please inspect your characters, you have introduced at least a non"
                        + "valid character";
            }
        }
        
        if (stack1.isEmpty()) {
            message="Balanced expression";
        }
        
        return message;
    }
}
