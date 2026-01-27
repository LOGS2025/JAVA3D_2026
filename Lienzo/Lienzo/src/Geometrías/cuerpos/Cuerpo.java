package Geometrías.cuerpos;

import Geometrías.Geometria;
import Geometrías.Punto;
import Geometrías.Vector;

import java.awt.*;
import java.util.Enumeration;

public abstract class Cuerpo extends Geometria {

    protected final Punto[] puntos;

    Cuerpo(int numPuntos){
        puntos = new Punto[numPuntos];
    }
    Cuerpo(Punto[] puntos){
        this.puntos = puntos;
    }

    @Override
    public void pintate(Graphics2D g2d) {
        for (int i = 0; i < 8; i++){
            this.puntos[i].pintate(g2d);
        }
    }

    @Override
    public void muevete(Vector vector) {
        for (int i = 0; i < 8; i++){
            this.puntos[i].muevete(vector);
        }
    }

    @Override
    public void gira(double[] angulos, Punto centro_giro) {

    }

}
