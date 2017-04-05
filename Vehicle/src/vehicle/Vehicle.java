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
public class Vehicle {
    private String make;
    private String model;
    private String vin;
    private int year;
    
    public Vehicle(){
        make = "";
        model = "";
        vin = "";
        year = 0;
        
    }
    
    public Vehicle(String make, String model, String vin, int year){
        
    }
    
    
    
    
    
   
    
    
    
    
    
    

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin the vin to set
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
    
    
    
    
    
    @Override
    public String toString(){
       String ls = System.getProperty(System.lineSeparator());
       return make + ls + model + ls + vin + ls + year;
    }
        
    }
    

