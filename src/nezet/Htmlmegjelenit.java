
package nezet;

import modell.Film;
import modell.Filmek;

public class Htmlmegjelenit {
    
    private Filmek model;
    public Htmlmegjelenit(Filmek modell){
    this.model = modell;
    }
    public String megjelenithtml(){
        String text = "";
        for(Film film : model.getFilmek()){
            text +="\n"+ "<tr>"+"<td>"+film.getRendezo()+"</td>" +"<td>"+" "+  film.getCim()+"</td>" +"<td>"+film.getKiadasEve()+"</td>"+"<td>"+film.getPont()+"</td>"+"<td>"+film.isKorhataros()+"</td>"+"</tr>"+"\n";
        }
        String html = 
"<!doctype html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"<meta charset=\"UTF-8\" />\n" +
"<link rel=\"icon\" type=\"image/svg+xml\" href=\"/favicon.svg\" />\n" +
"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
"<title>hajok2</title>\n" +
"<head>filmek</head>\n" +
"<body>\n" +
"<table>"+text+"</table>"+"\n"+
"  </body>\n" +
"</html>";
        return html;
    }
}
