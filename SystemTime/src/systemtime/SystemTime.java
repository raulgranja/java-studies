/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemtime;

import java.util.Date;

/**
 *
 * @author Raul
 */
public class SystemTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date clock = new Date();
        System.out.println("The System's time is");
        System.out.println(clock.toString());    
    }
    
}
