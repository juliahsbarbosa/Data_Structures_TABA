/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tag;

/**
 *
 * @author julia
 * x21177244
 * @param <T>
 */

/*
If the last digit of your student ID is EVEN (0, 2, 4, 6, 8), provide an implementation using a Stack data
structure.
1. An interface that defines the following methods:
• push
• pop
• peek
• toString
 */
public interface StackInterface<T> {
    public void push(T e);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public String toString();

}
