package Marcas;

import SO_TV.RokuTV;

public class TCL extends RokuTV {

 String menu;

    public Samsung(int pulgadas, String marca, String SO, Boleean HDMI, Boleean HDR, String definicion, Boleean Navegador, int memoriaint, String menu){
        super(pulgadas, marca, SO, HDML, HDR, definicion, Navegador, memoriaint); 
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
                        " Navegador:" + getNavegador()+
                        " Memoria int:" +getmemoriaint()+
                        " Menu WebOS: "+ getMenu());

    }
}

