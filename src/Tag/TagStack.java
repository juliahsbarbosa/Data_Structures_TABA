/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tag;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia x21177244
 */
public class TagStack<T> implements StackInterface<T> {

    private Node<T> first;
    private int size;

    //Constructor
    public TagStack() {
        first = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    //
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //
    @Override
    public void push(T elem) {
        Node<T> newNode = new Node(elem, null);
        if (first == null) {
            first = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }

        size++;
    }

    //
    @Override
    public T pop() {
        if (isEmpty() || first == null) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> n = first;
        first = first.next;
        size--;

        return n.elem;
    }

    //
    @Override
    public T peek() {
        if (isEmpty() || first == null) {
            throw new IndexOutOfBoundsException();
        }

        return first.elem;
    }
}
//    
//    public List<T> tagList = new ArrayList<>();
////        private ArrayList<String> tagList;
//
//    // pushes element to the stack
//    @Override
//    public void push(T e) {
//        tagList.add(e);
//    }
//
//    //pops the stack
//    @Override
//    public T pop() {
//        if (!(tagList.isEmpty())) {
//            return tagList.remove(0);
//        } else {
//            return null;
//        }
//    }
//
//    // peeks the stack
//    @Override
//    public T peek() {
//        if (tagList.isEmpty()) {
//            System.out.println("Stack is empty");
//        } else {
//            //size
//            int n = tagList.size();
//            //last element
//            //top of the stack is the end of the list
//            T value = tagList.get((int) (n - 1));
//
//            return value;
//        }
//        return null;
//    }
//
//    // checks if empty
//    @Override
//    public boolean isEmpty() {
//        if (tagList.isEmpty()) {
//            return true;
//        }
//        return false;
//    }
//
//    // print whats in the stack
//    @Override
//    public String toString() {
//        String str = "TOP";
//        for (int i = tagList.size() - 1; i >= 0; i--) {
//            str += "\n" + tagList.get(i);
//        }
////        return str + "\nBOTTOM";
////    }
//}
