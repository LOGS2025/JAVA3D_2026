package geometrias;

import interfaz.Camera;

import java.awt.*;

public class Cara extends Geometria {


    private final Punto[] puntos;
    private final Arista[] aristas;

    Cara(Punto[] puntos, Arista[] aristas){
        this.puntos=puntos;
        this.aristas=aristas;

    }

    @Override
    public void pintar(Graphics2D g2d) {
        for (int i = 0; i < this.puntos.length; i++) {
            this.puntos[i].pintar(g2d);
        }
        for (int i = 0; i < this.aristas.length; i++) {
            this.aristas[i].pintar(g2d);
        }
    }

    @Override
    public void muevete(Vector vector) {

    }

    @Override
    public void gira(double[] angulos, Punto centroGiro) {

    }

    @Override
    public void proyectate(Camera camara) {

    }
}
