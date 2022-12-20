/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tag;

/**
 *
 * @author julia x21177244
 */

/*
2. A node class that can be used as the basis of your data structure.
 */
public class Node<T> {
    T elem;//data
    Node<T> next;// next node

    //Constructor
    public Node(T elem, Node<T> next) {
        this.next = next;
        this.elem = elem;
    }

}
