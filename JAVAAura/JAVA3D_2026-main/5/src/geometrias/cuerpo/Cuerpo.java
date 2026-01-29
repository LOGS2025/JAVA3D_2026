package geometrias.cuerpo;

import geometrias.Arista;
import geometrias.Geometria;
import geometrias.Punto;
import geometrias.Vector;
import interfaz.Camera;

import java.awt.*;

public abstract class Cuerpo extends Geometria {

    protected final Punto[] puntos;
    protected final Arista[] aristas;

    Cuerpo(int numPuntos, int numAristas){
        puntos= new Punto[numPuntos];
        aristas= new Arista[numAristas];

    }

    Cuerpo(Punto[] puntos, Arista[] aristas) {
        this.puntos = puntos;
        this.aristas = aristas;
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
        for (int i = 0; i < this.puntos.length; i++) {
            this.puntos[i].muevete(vector);
        }
    }

    @Override
    public void gira(double[] angulos, Punto centroGiro) {
        for (int i = 0; i < this.puntos.length; i++) {
            this.puntos[i].gira(angulos,centroGiro);
        }
    }

    @Override
    public void proyectate(Camera camara) {
        for (int i = 0; i < this.puntos.length ; i++){
            this.puntos[i].proyectate(camara);
        }
    }

}
