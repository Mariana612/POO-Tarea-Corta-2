import java.util.ArrayList;
import java.util.List;

public class Tablero {
    List<Ficha> fichas = new ArrayList<Ficha>();
    int cantidad_casillas = 20;

    public Tablero(){
        Ficha jugador1 = new Ficha("rojo");
        Ficha jugador2 = new Ficha("azul");
        fichas.add(jugador1);
        fichas.add(jugador2);
    }

    public void moverFicha(){
        int count = 0;
        while(this.fichas.get(0).posicion < this.cantidad_casillas & this.fichas.get(1).posicion < this.cantidad_casillas){
          count++;
          System.out.println("ronda   "+ count);
          for(Ficha i: fichas){
              i.avanzar();
              if(i.posicion>= 20){
                  System.out.println("genial cano el jugador" + " " + i.color);
                  break;
              }
          }
        }
    }
}
