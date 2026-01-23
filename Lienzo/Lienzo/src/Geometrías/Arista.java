package Geometrías;

public class Arista extends Geometria{

    private final Punto punto1;
    private final Punto punto2;

    Arista(Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    @Override
    public void pintate() {

    }

    @Override
    public void muevete(Vector vector) {

    }

    @Override
    public void gira(double[] angulos, Punto centro_giro) {

    }
}
