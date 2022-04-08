/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smart_tv;

/**
 *
 * @author Home
 */
public class Smart_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pantalla P1 = new Pantalla(45, "LG", "Andorid TV", true, true, "4K");
        P1.Encender();
        P1.Netflix();
        P1.Apagar();
        
    }}


