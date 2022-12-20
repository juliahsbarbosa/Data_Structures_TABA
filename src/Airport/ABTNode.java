/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Airport;

/**
 *
 * @author julia
 * x21177244
 * @param <T>
 */
//b) Define a suitable Node for a Binary Tree using Java Generics.
public class ABTNode<T> {

    protected T element;
    protected ABTNode<T> left;
    protected ABTNode<T> right;

    public ABTNode(T element) {
        this.element = element;
    }

    //toString method to print the details
    @Override
    public String toString() {
        String leftRef = (left == null ? "\n NULL" : left.element.toString());
        String rightRef = (right == null ? "\n NULL" : right.element.toString());
        return "\n Airport Binary Tree Node (ABTN): " + 
                "\n\n --------------Data Element--------------" + element
                + "\n --------------Left reference--------------" + leftRef
                + "\n --------------Right reference--------------" + rightRef
                + "\n //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////";
    }
}
