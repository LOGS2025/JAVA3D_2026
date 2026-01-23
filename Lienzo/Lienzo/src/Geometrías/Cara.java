package Geometrías;

import java.awt.*;

public class Cara extends Geometria{

    private final Punto[] puntos;
    private final Arista[] aristas;

    Cara(Punto[] puntos, Arista[] aristas){
        this.puntos = puntos; // Vamos a duplicar los puntos
        this.aristas = aristas;
    }

    @Override
    public void pintate(Graphics2D g2d) {

    }

    @Override
    public void muevete(Vector vector) {

    }

    @Override
    public void gira(double[] angulos, Punto centro_giro) {

    }
}
