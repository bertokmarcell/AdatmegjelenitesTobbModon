package app;

import nezet.KonzolNezet;
import modell.Filmek;
import nezet.Tablazatnezet;


public class MVC_Program {

    public static void main(String[] args) {
        Filmek model = new Filmek();
       new KonzolNezet(model).megjelenit();
       new Tablazatnezet(model).Megjelenit();
       
    }
    
}
