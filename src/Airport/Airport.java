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
public class Airport implements Comparable <Airport> {
    //Declare variables
    private String AirportName;
    private String AirportLocation;
    private int waitingIndex;
    
    //Constructor
    public Airport(String AirportName, String AirportLocation, int waitingIndex) {
        this.AirportName = AirportName;
        this.AirportLocation = AirportLocation;
        this.waitingIndex = waitingIndex;
    }
    
    //Define a suitable comparable Airport object that contains the following information: 
    //Airport Name, Airport Location and an Airport Waiting Index (integer assigned between the range of 1 - 10, 
    //with short-wait airport/items closer to 1, (best Airport Waiting Index), 
    //and long-wait airports/items closer to 10, worst Airport Waiting Index). 
    //Comparison of Airport Objects should use the Airport Waiting Index attribute.
    @Override
    public int compareTo(Airport o) {
        if (this.waitingIndex == o.waitingIndex) {
            return 0;
        } else if (this.waitingIndex > o.waitingIndex) {
            return 1;
        } else {
            return -1;
        }

    }
    
    //toString method
    @Override
    public String toString(){
        return "\n Airport Name: " + AirportName 
                + "\n Airport Location: " + AirportLocation 
                + "\n Airport Waiting Index: " + waitingIndex;
        
    }
    
    //Getters & Setters
    public String getAirportName() {
        return AirportName;
    }

    public void setAirportName(String AirportName) {
        this.AirportName = AirportName;
    }

    public String getAirportLocation() {
        return AirportLocation;
    }

    public void setAirportLocation(String AirportLocation) {
        this.AirportLocation = AirportLocation;
    }

    public int getWaitingIndex() {
        return waitingIndex;
    }

    public void setWaitingIndex(int waitingIndex) {
        this.waitingIndex = waitingIndex;
    }
    
    
    //Test
     public static void main(String[] args) {
        Airport air = new Airport("DUB", "Dublin", 3);
        System.out.println(air);
    }
    
    
    
    
}
