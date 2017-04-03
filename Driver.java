/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import javax.swing.JOptionPane;

/**
 *
 * @author Nate
 */
public class Driver {
    
    
    
    
    public static void main(String[] args) {
        Vehicle vInfo = new Vehicle();
        Automobile aInfo = new Automobile();
        Van vanInfo = new Van();
        PassengerVan pvInfo = new PassengerVan();
        CargoVan cvInfo = new CargoVan();
        fleet fInfo = new fleet();
        
        fInfo.loadFleet(args[1]);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
         //implemetation of project classes for lvl 2
         JOptionPane.showMessageDialog(null, vInfo.toString());
         JOptionPane.showMessageDialog(null, aInfo.toString());
         JOptionPane.showMessageDialog(null, vanInfo.toString());
         JOptionPane.showMessageDialog(null, pvInfo.toString());
         JOptionPane.showMessageDialog(null, cvInfo.toString());
         
        
    }
    
}
