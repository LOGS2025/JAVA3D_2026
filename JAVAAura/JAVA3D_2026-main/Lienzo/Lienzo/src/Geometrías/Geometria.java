package Geometrías;

import java.awt.*;

public abstract class Geometria {

    public abstract void pintate(Graphics2D g2d);
    public abstract void muevete(Vector vector); // Clase vector
    public abstract void gira(double[] angulos, Punto centro_giro);




    /********************* MAIN ****************************/
    public static void main(String[] args) {

    }
}
