/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screenresolution;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Raul
 */
public class ScreenResolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) res.getWidth();
        int height = (int) res.getHeight();
        System.out.print("Your screen has resolution ");
        System.out.print(width);
        System.out.print(" x ");
        System.out.println(height);
    }
}
