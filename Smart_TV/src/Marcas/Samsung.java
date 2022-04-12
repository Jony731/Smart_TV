 String menu;

    public Samsung(int pulgadas, String marca, String SO, Boleean HDMI, Boleean HDR, String definicion, int USB, String audio, String menu){
        super(pulgadas, marca, SO, HDML, HDR, definicion, LUSB, audio); 
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
                        " USB: " + getUSB()+
                        " Audio: " + getaudio()+
                        " Menu WebOS: "+ getMenu());

    }
}

