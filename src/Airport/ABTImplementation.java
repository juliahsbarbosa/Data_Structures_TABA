/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Airport;

import java.util.NoSuchElementException;

/**
 *
 * @author julia
 * x21177244
 */
//c) Provide an implementation of the Interface defined in part a) (Binary Tree implementation).
public class ABTImplementation<T extends Comparable<T>> implements AirportBinaryTree<T> {

    protected ABTNode<T> root;

    //1. Check if the tree is empty
    @Override
    public boolean isEmpty() {
        return root == null;
    }

    //2. To add Nodes into the tree
    @Override
    public void add(T elem) {
        if (isEmpty()) {
            root = new ABTNode<>(elem);
        } else {
            addNode(elem, root);
        }
    }

    //Use compareTo method to figure out where to add the airport object
    //According to the waiting time
    private void addNode(T elem, ABTNode<T> current) {
        if (elem.compareTo(current.element) == -1) {
            if (current.left == null) {
                current.left = new ABTNode<>(elem);
            } else {
                addNode(elem, current.left);
            }
        } else {
            if (current.right == null) {
                current.right = new ABTNode<>(elem);
            } else {
                addNode(elem, current.right);
            }
        }
    }

    //3. To count all the Nodes
    @Override
    public int count() {
        return countNodes(root);
    }

    private int countNodes(ABTNode<T> current) {
        //Stop the counting
        if (current == null) {
            return 0;
        } else {
            //Count the nodes left and right and add 1 for the current element
            return 1 + countNodes(current.left) + countNodes(current.right);
        }
    }
    
    //4. Find the best Airport object (least wait time/ lowest Airport Waiting Index)
    @Override
    public T lowest() {
        if (isEmpty()) {
            throw new NoSuchElementException();

        } else {
            return (T) lowestIndex(root);
        }

    }

    private T lowestIndex(ABTNode<T> current) {
        if (current.left == null) {
            return current.element;
        } else {
            return lowestIndex(current.left);
        }

    }
    
   
    //5. Find the worst Airport object (worst wait time/ highest Airport Waiting Index)
    @Override
    public T highest() {
        if (isEmpty()) {
            System.out.println("The Binary tree is empty!");
            throw new NoSuchElementException();
        } else {
            return (T) highestIndex(root);
        }

    }

    private T highestIndex(ABTNode<T> current) {
        if (current.right == null) {
            return current.element;
        } else {
            return highestIndex(current.right);
        }

    }

    //Display the Binary Tree
    @Override
    public void display() {
        displayTree(root);
    }

    private void displayTree(ABTNode<T> current) {
        if (current != null) {
            displayTree(current.left);
            displayTree(current.right);
            System.out.println(current);
        }
    }

}
