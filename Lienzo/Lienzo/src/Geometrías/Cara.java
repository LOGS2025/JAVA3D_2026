package Geometrías;

public class Cara extends Geometria{

    private final Punto[] puntos;
    private final Arista[] aristas;

    Cara(Punto[] puntos, Arista[] aristas){
        this.puntos = puntos; // Vamos a duplicar los puntos
        this.aristas = aristas;
    }

    @Override
    public void pintate() {
        for (int i = 0; i<this.puntos.length; i++){
            this.puntos[i].pintate();
        }

        for (int i = 0; i<this.aristas.length; i++){
            this.aristas[i].pintate();
        }
    }

    @Override
    public void muevete(Vector vector) {

    }

    @Override
    public void gira(double[] angulos, Punto centro_giro) {

    }
}
