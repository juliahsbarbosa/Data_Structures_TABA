/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Airport;

/**
 *
 * @author julia
 * x21177244
 */

//a) Interfaces allow us to make sure a number of methods need to be implemented when implementing
//the Interface. Write a suitable interface for a Binary Tree that will ensure that only trees of
//comparable objects can be constructed.
public interface AirportBinaryTree <T extends Comparable <T>> {
    //1. Check if the tree is empty
    public boolean isEmpty();
    
    //2. To add Nodes into the tree
    public void add(T element); 
    
    //3. To count all the Nodes
    public int count();
    //4. Find the best Airport object (least wait time/ lowest Airport Waiting Index)
    public T lowest(); // find the maximum healthy index element
    //5. Find the worst Airport object (worst wait time/ highest Airport Waiting Index)
    public T highest (); // find the minimum healthy index element
    
    //Print the tree
    public void display(); 
}
    

