/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Airport;

/**
 *
 * @author julia
 * x21177244
 */
public class WaitingIndexApp extends ABTImplementation<Airport> {

    public static void main(String[] args) {

        //d) Create and add ten Airport objects to clearly demonstrate the functionality of the Binary Tree.
        WaitingIndexApp airports = new WaitingIndexApp();
        airports.add(new Airport("GRU", "Sao Paulo", 7));
        airports.add(new Airport("DUB", "Dublin", 10));
        airports.add(new Airport("JFK", "New York", 6));
        airports.add(new Airport("ATL", "Atlanta", 2));
        airports.add(new Airport("SEA", "Seattle", 3));
        airports.add(new Airport("SFO", "San Francisco", 5));
        airports.add(new Airport("VCP", "Campinas", 7));
        airports.add(new Airport("LCY", "London", 8));
        airports.add(new Airport("BCN", "Barcelona", 9));
        airports.add(new Airport("DCA", "D.C.", 6));
        airports.display();
        System.out.println("\n The best airport (shortest waiting time) is:" + airports.lowest());
        System.out.println("\n The worst airport (longest waiting time) is:" + airports.highest());
        System.out.println("\n The number of nodes in the binary tree is : \n" + airports.count());

    }

}
