package Marcas;

import SO_TV.AndoirdTV;

public class Sony extends AndoirdTV {
 String menu;

    public Samsung(int pulgadas, String marca, String SO, Boleean HDMI, Boleean HDR, String definicion, Boleean LAN, int antena , String menu){
        super(pulgadas, marca, SO, HDML, HDR, definicion, LAN, antena); 
        this.menu = menu;
    }   

    
    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void MostrarEspecificaciones(){
        System.out.println("Marca: "+ getMarca() +
                      " , pualgadas: "+ 58+
                        " SO: "+ getSO()+
                        " HDMI: "+ getHDMI()+
                        " HDR: " + getHDR()+
                        " Definición: " + getDefinicion()+
                        " LAN: " + getLAN()+
                        " Antena: " + getantena()+
                        " Menu WebOS: "+ getMenu());

    }
}

