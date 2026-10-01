
package nezet;
import modell.Film;
import modell.Filmek;

public class Tablazatnezet {
    private Filmek modell;
    public  Tablazatnezet(Filmek model){
        this.modell=model;
    }
    public void Megjelenit(){
        System.out.println("a model filmjei: ");
        fej2();
        tartalom();
    } 
    public void fej(){
        String text = "cím";
        String text2="rendezo";
        String text3="kiadavev";
        String text4="pont";
        String text5="korhataros";
        int width = 10;
        int spaces = (width - text.length()) / 2;
        int spaces2= (width - text2.length()) / 2;
        System.out.println(" ".repeat(spaces) + text +" ".repeat(spaces));
        System.out.println(" ".repeat(spaces2) + text2 +" ".repeat(spaces2));
    }
    /*-Dstdout.encoding=UTF-8 */
    public void fej2(){
        String s = "%10s%10s%6s%5s%10s";
        System.out.printf(s+"\n","rendezo","cím","ev","pont","korhatar");
        
    }
    public void tartalom(){
        for(Film film : modell.getFilmek()){
            String text = "%-20s%-20s%5d%5.1f%8s";
            System.out.printf(text,film.getRendezo(),film.getCim(),film.getKiadasEve(),film.getPont(),film.isKorhataros());
            System.out.println("");
        }
    }
}
