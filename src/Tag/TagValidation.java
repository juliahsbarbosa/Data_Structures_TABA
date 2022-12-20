/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tag;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author julia x21177244
 */

/*
3. Implement a data structure that will hold the occurrences of opening and closing tags, <> and
</> and provides an implementation for the actions defined in the above interface.
 */
public class TagValidation {

    private static final String openingTag = "<>";

    private static final String closingTag = "</>";

    public static boolean validTags(String input) {
        StackInterface<String> tagStack = new TagStack<String>();
        for (int i = 0; i < input.length(); i++) {

            //Check if element contains '<>' 
            if (input.contains(openingTag)) {
                //push element to the stack
                tagStack.push(input);
            //Check if element contains '</>'
            }if (input.contains(closingTag)) {
                //If the stack is empty or the stack doesn't contain '<>', return false
                if (tagStack.isEmpty() || !tagStack.peek().contains(openingTag)) {
                    return false;
                }
                //Else, pop element from stack 
                else{
                    tagStack.pop();
                }
            }
        }
        return tagStack.isEmpty();

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a piece of text to validate the XML opening and closing tags: ");
        String input = sc.nextLine();
        boolean check = validTags(input);
        if (check) {
            System.out.println("The input text contains an opening and closing XML tag.");
        } else {
            System.out.println("The input text does NOT contain an opening and closing XML tag");
        }
    }
}
