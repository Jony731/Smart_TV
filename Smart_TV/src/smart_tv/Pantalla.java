/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smart_tv;

/**
 *
 * @author Home
 */
public class Pantalla {
    int pulgadas;
    String Marca;
    String SO;
    Boolean HDMI;
    Boolean HDR;
    String Definicion;

    public Pantalla(int pulgadas, String Marca, String SO, Boolean HDMI, Boolean HDR, String Definicion) {
        this.pulgadas = pulgadas;
        this.Marca = Marca;
        this.SO = SO;
        this.HDMI = HDMI;
        this.HDR = HDR;
        this.Definicion = Definicion;
    }
    
    

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public Boolean getHDMI() {
        return HDMI;
    }

    public void setHDMI(Boolean HDMI) {
        this.HDMI = HDMI;
    }

    public Boolean getHDR() {
        return HDR;
    }

    public void setHDR(Boolean HDR) {
        this.HDR = HDR;
    }

    public String getDefinicion() {
        return Definicion;
    }

    public void setDefinicion(String Definicion) {
        this.Definicion = Definicion;
    }
    
    public void Encender(){
        System.out.println("Encendiendo Pantalla");
    }
    
    public void Apagar(){
        System.out.println("Apagando pantalla");
    }
    
    public void Netflix(){
        System.out.println("Abiendo Netflix");
    }
    
    
    
}
