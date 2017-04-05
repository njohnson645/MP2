/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nate
 */
public class fleet {

    private String fleetName;
    private ArrayList<Vehicle> fleetList;

    public fleet() {
        fleetName = "";
        fleetList = new ArrayList<Vehicle>();

    }

    public fleet(ArrayList<Vehicle> fleetList) {

    }

    /**
     * @return the fleetName
     */
    public String getFleetName() {
        return fleetName;
    }

    /**
     * @param fleetName the fleetName to set
     */
    public void setFleetName(String fleetName) {
        this.fleetName = fleetName;
    }

    public void loadFleet(String inputFileName) {
        //try/catch, scanner etc
        try {
            Scanner input = new Scanner(new File("input.txt"));     //create new file using scanner

            String t = "";// temp string variable
            int tInt = 0;//temp int variable
            float tFloat = 0.0f;
            fleetName = input.nextLine();//read in fleet name

            while (input.hasNext()) {// all if statements should within this while loop

                //t = input.nextLine();
                if (t.equals("P")) { // if statement for reading in PassengerVan info
                    PassengerVan p = new PassengerVan();// creates a new object every time
                    t = input.nextLine();//read line into temp
                    //tInt = Integer.parseInt(input.nextLine());
                    p.setMake(t);//use temp to set data
                    t = input.nextLine();
                    p.setModel(t);
                    t = input.nextLine();
                    p.setVin(t);
                    tInt = input.nextInt();
                    p.setYear(tInt);
                    tFloat = input.nextFloat();
                    p.setClearanceHeight(tFloat);
                    tInt = input.nextInt();
                    p.setNumWindows(tInt);
                    tInt = input.nextInt();
                    p.setNumSeatRows(tInt);
                    tInt = input.nextInt();
                    p.setMaxPassengers(tInt);
                    input.nextLine();
                    tInt = input.nextInt();
                    
                    
                    // check for dvd player
                    if (tInt == 1) {
                        p.setDvdPlayer(true);
                    } else {
                        p.setDvdPlayer(false);
                    }
                    
                    addVehicle(p);//adds vehicle info to fleetList, should contain all passengerVan info read in from input
                    //end of dvd check           
                }
                //end of PassengerVan code

                if (t.equals("A")) {//code for Automobile info
                    Automobile a = new Automobile();
                    t = input.nextLine();//read line into temp
                    a.setMake(t);//use temp to set data
                    t = input.nextLine();
                    a.setModel(t);
                    t = input.nextLine();
                    a.setVin(t);
                    tInt = input.nextInt();
                    a.setYear(tInt);
                    tInt = input.nextInt();
                    //check for hybrid
                    if (tInt == 1) {
                        a.setHybrid(true);
                    } else {
                        a.setHybrid(false);
                    }
                    //end of hybrid check
                    tInt = input.nextInt();
                    a.setMaxPassengers(tInt);
                    input.nextLine();
                    tFloat = input.nextFloat();
                    a.setTrunkSpace(tFloat);
                    addVehicle(a);//adds vehicle info to fleetList should contain all automobile info read in from input
                    //end of Automobile code
                }
                if (t.equals("C")) {//code for CargoVan info
                    CargoVan c = new CargoVan();
                    t = input.nextLine();//read line into temp
                    c.setMake(t);//use temp to set data
                    t = input.nextLine();
                    c.setModel(t);
                    t = input.nextLine();
                    c.setVin(t);
                    tInt = input.nextInt();
                    c.setYear(tInt);
                    tFloat = input.nextFloat();
                    c.setClearanceHeight(tFloat);
                    tInt = input.nextInt();
                    c.setNumWindows(tInt);
                    tFloat = input.nextFloat();
                    c.setMaxLoad(tFloat);
                    input.nextLine();
                    tFloat = input.nextFloat();
                    c.setCargoArea(tFloat);
                    addVehicle(c);//should contain all cargoVan info read in from input
                    //end of CargoVan code

                }

                /*
            
            input.nextLine();
            t = input.nextLine();//read line into temp
            p.setMake(t);//use temp to set make
            t = input.nextLine();
            p.setModel(t);
            t = input.nextLine();
            p.setVin(t);
            tInt = input.nextInt();
            p.setYear(tInt);*/
         /*this code could work, but is horrendously inefficient in its current state.
            instead, create an if statement nested in a while loop for each vehicle type
            i.e. while file has input, if the letter read in is of type P, then read in 
            data specifically for PassengerVan, in specific order. This way the method can automatically,
            and accurately, create the formatted file to be saved by  saveFleet method*/
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(fleet.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File could not be read, either because it could not be found/accessed, or format is incorrect");
        }

    }

    public void saveFleet(String outputFileName) {
        //try/catch, printwriter etc
        try {
            PrintWriter output = new PrintWriter(new File(outputFileName));
            output.toString();
        } catch (FileNotFoundException e) {
            System.out.print("The File could not be written to.");
        }
    }

    public ArrayList<Vehicle> getVehicleList(Vehicle VehicleOb) {
        return fleetList;
    }

    @Override
    public String toString() {
        String ls = System.lineSeparator();
        return fleetName + ls + fleetList;
    }

    // Methods for manipulating ArrayList of Vehicles
    public int getNumVehicles() {
        //should get sized of arraylist, make alternative code in case this doesnt work
        int numVehicles = fleetList.size();
        return numVehicles;

        //Alternative code
        /*for(int i = 0; i < fleetList.size(); i ++){}
        return i;*/
    }

    public ArrayList<Vehicle> getVehicle(int index) {
        fleetList.get(index);//access the element at the index 
        return fleetList;
    }

    public void setVehicle(int index, Vehicle item) {
        fleetList.set(index, item);

    }

    public void addVehicle(Vehicle item) {
        fleetList.add(item);

    }

    public ArrayList<Vehicle> deleteVehicle(int index) {
        fleetList.remove(index);// Removes element at index        
        return fleetList;
    }
}
