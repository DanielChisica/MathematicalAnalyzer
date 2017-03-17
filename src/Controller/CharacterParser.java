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
    private Stack stack1;
    
    public String close(String inputMessage){
        
        for (int i = 0; i<inputMessage.length(); i++) {
            if (inputMessage.charAt(i)=='(' || inputMessage.charAt(i)=='(' 
                    || inputMessage.charAt(i)=='(' || inputMessage.charAt(i)=='('
                    ) {
                
            }
            
            if (inputMessage.charAt(i)=='(') {
                
            }
            else if(inputMessage.charAt(i)=='{') {
                
            }
            
            else if (inputMessage.charAt(i)=='['){
                
            }
            
            else if (inputMessage.charAt(i)=='<'){
                
            }
        }
    }
}
