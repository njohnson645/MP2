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
public class CargoVan extends PassengerVan{
    private float maxLoad;
    private float cargoArea;
    
    public CargoVan(){
        maxLoad = 0;
        cargoArea = 0;
    }
    public CargoVan(float maxLoad, float cargoArea){
        
    }

    /**
     * @return the maxLoad
     */
    public float getMaxLoad() {
        return maxLoad;
    }

    /**
     * @param maxLoad the maxLoad to set
     */
    public void setMaxLoad(float maxLoad) {
        this.maxLoad = maxLoad;
    }

    /**
     * @return the cargoArea
     */
    public float getCargoArea() {
        return cargoArea;
    }

    /**
     * @param cargoArea the cargoArea to set
     */
    public void setCargoArea(float cargoArea) {
        this.cargoArea = cargoArea;
    }
    public String toString(){
        String ls = System.lineSeparator();
        return "C " + maxLoad + ls + cargoArea;
    }
}
