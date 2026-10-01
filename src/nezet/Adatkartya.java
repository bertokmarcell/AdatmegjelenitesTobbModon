
package nezet;

import modell.Film;
import modell.Filmek;

public class Adatkartya {
    private Filmek modell;
    public  Adatkartya(Filmek model){
        this.modell=model;
        Megjelenit();
    }
    public void Megjelenit(){
        for(Film film: modell.getFilmek()){
            kartyasmegjel(film);
        }
    } 
    public void fej(){
        
    }
    private void cim(Film film) {
        String text = film.getCim();
        int width = 40;
        int spaces = (width - text.length()) / 2-1;
        System.out.println("________________________________________");
        System.out.println("|"+" ".repeat(spaces)+film.getCim()+" ".repeat(spaces)+"|");
    }
    private void rendezo(Film film) {
        String text = film.getRendezo();
        int width = 40;
        int spaces = (width - text.length()) / 2;
        
        System.out.println("|"+" ".repeat(spaces)+film.getRendezo()+" ".repeat(spaces)+"|");
    }
    private void ev(Film film) {
        int text = film.getKiadasEve();
        int width = 40;
        int spaces = (width - 4) / 2;
        System.out.println("|"+" ".repeat(spaces)+film.getKiadasEve()+" ".repeat(spaces)+"|");
    }
    private void rating(Film film) {
        double text = film.getPont();
        int width = 40;
        int spaces = (width - 4) / 2;
        System.out.println("|"+" ".repeat(spaces)+film.getPont()+" ".repeat(spaces)+"|");
    }
    private void korhataros(Film film) {
        boolean text = film.isKorhataros();
        int width = 40;
        int spaces = (width - 6) / 2;
        System.out.println("L"+"_".repeat(spaces)+film.isKorhataros()+"_".repeat(spaces)+"J");
    }

    private void kartyasmegjel(Film film) {
        cim(film);
        rendezo(film);
        ev(film);
        rating(film);
        korhataros(film);
        
    }
}
