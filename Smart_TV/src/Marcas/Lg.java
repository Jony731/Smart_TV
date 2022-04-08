package Marcas;

import SO_TV.WebOs;

public class Lg extends WebOs {
    String menu;

    public Lg(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion, String menu) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion);
        this.menu = menu;
    }

    public void MostrarEspecificaciones(){
        System.out.println("Marca: "+ getMarca() + "pualgadas: "+ 45 );

    }
}
