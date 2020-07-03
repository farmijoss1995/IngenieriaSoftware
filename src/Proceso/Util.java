/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class Util {
    public static boolean tieneNumeros(String txt){
        char[] car= txt.toCharArray();
        for(int i=0;i<txt.length();i++){
            if(Character.isDigit(car[i])){
                return true;
            }
        }return false;
    }
    public static boolean tieneLetras(String txt){
        char[] car= txt.toCharArray();
        for(int i=0;i<txt.length();i++){
            if(Character.isLetter(car[i])){
                return true;
            }
        }return false;
    
}
    public static void mensaje(Component ventana, String texto, String titulo, String urlIcon){
     JOptionPane.showMessageDialog(ventana, texto, titulo, JOptionPane.INFORMATION_MESSAGE, new ImageIcon(urlIcon));
    
    }
  
}
