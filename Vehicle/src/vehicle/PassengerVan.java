/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Nate
 */
public class PassengerVan extends Van{
    //numSeatRows:int, maxPassengers:int, and dvdPlayer:Boolean
    private int numSeatRows;
    private int maxPassengers;
    private boolean dvdPlayer;
    
    public PassengerVan(){
        numSeatRows = 0;
        maxPassengers = 0;
        dvdPlayer = false;
    }
    public PassengerVan(int numSeatRows,int maxPassengers, boolean dvdPlayer){
        
    }

    /**
     * @return the numSeatRows
     */
    public int getNumSeatRows() {
        return numSeatRows;
    }

    /**
     * @param numSeatRows the numSeatRows to set
     */
    public void setNumSeatRows(int numSeatRows) {
        this.numSeatRows = numSeatRows;
    }

    /**
     * @return the maxPassengers
     */
    public int getMaxPassengers() {
        return maxPassengers;
    }

    /**
     * @param maxPassengers the maxPassengers to set
     */
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    /**
     * @return the dvdPlayer
     */
    public boolean isDvdPlayer() {
        return dvdPlayer;
    }

    /**
     * @param dvdPlayer the dvdPlayer to set
     */
    public void setDvdPlayer(boolean dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }
    public String toString(){
         String ls = System.lineSeparator();
         return "P " + numSeatRows + ls + maxPassengers + dvdPlayer;
    }
    
    
}
