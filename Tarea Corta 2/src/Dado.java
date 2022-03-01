public class Dado {
    int caras = 0; //caras del dado

    public Dado(int numCaras){
        this.caras = numCaras;
    }
    public int lanzar(){
        return (int) (Math.random()*(7-1) + 1);
    }
}
