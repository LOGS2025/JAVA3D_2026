package Geometrías;

import Interfaz.Ventana;

import java.awt.*;

public class Punto extends Geometria {
    private double x,y,z;

    public Punto(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /********************* RETORNAR X Y Z  ****************************/
        public double x(){
        return this.x;
    }
    public double y(){
        return this.y;
    }
    public double z(){
        return this.z;
    }

    /********************* FUNCIONES GRÁFICAS ****************************/
        @Override
    public void pintate(Graphics2D g2d) {
        g2d.setColor(Color.white);

        double xPantalla, yPantalla;

        xPantalla = this.x / (this.z);
        yPantalla = this.y / (this.z);

        xPantalla = (Ventana.ancho/10.0 * xPantalla + Ventana.ancho / 2.0);
        yPantalla = (-Ventana.alto/10.0 * yPantalla + Ventana.alto / 2.0);


        g2d.fillOval((int) xPantalla, (int) yPantalla,20, 20);
    }

    @Override
    public void muevete(Vector vector) {

    }

    @Override
    public void gira(double[] angulos, Punto centro_giro) {

    }
}
