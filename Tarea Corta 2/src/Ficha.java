public class Ficha {
    String color;
    int posicion;

    Dado dado = new Dado(6);

    public Ficha(String color){
        this.color = color;
        this.posicion = posicion;
    }

    public void avanzar(){
        int pasos = this.dado.lanzar();
        this.posicion += pasos;
        System.out.println(this.posicion);
    }

}
