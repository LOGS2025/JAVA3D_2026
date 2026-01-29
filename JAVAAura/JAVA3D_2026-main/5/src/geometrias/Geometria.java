package geometrias;

import interfaz.Camera;

import java.awt.*;
import java.sql.SQLOutput;

public abstract class Geometria {
    public abstract void pintar(Graphics2D g2d);

    public abstract void muevete(Vector vector);

    public abstract void gira(double[] angulos, Punto centroGiro);

    public final void gira(Vector vector, Punto centroGiro){
        double[] angulos=new double[3];
        angulos[0]=vector.x();
        angulos[1]=vector.y();
        angulos[2]=vector.z();

        gira(angulos,centroGiro);
    }

    public abstract void proyectate(Camera camara);

    public static void main(String[] args) {
    }

}
