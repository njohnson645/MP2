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
public class Van extends Vehicle{
    protected float clearanceHeight;
    protected int numWindows;
    
    public Van(){
        clearanceHeight = 0;
        numWindows = 0;
        
    }
    public Van(float clearanceHeight, int numWindow){
        
    }

    /**
     * @return the clearanceHeight
     */
    public float getClearanceHeight() {
        return clearanceHeight;
    }

    /**
     * @param clearanceHeight the clearanceHeight to set
     */
    public void setClearanceHeight(float clearanceHeight) {
        this.clearanceHeight = clearanceHeight;
    }

    /**
     * @return the numWindows
     */
    public int getNumWindows() {
        return numWindows;
    }

    /**
     * @param numWindows the numWindows to set
     */
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }
    
    @Override
    public String toString(){
        String ls = System.lineSeparator();
        return "V " + clearanceHeight + ls + numWindows;
    }
}

    
    
    

