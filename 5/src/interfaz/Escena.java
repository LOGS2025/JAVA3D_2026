package interfaz;

import geometrias.Geometria;
import geometrias.Punto;
import geometrias.Vector;
import geometrias.cuerpo.Cubo;

import java.awt.*;
import java.util.ArrayList;

public class Escena {

    private final  ArrayList<Geometria> listaGeometria=new ArrayList<>();

    Escena() {

        Cubo cubo = new Cubo(new Punto(2, 0, 10), 1.0);
        Cubo cubo2 = new Cubo(new Punto(-1, 2, 10), 1.0);
        // Punto punto= new Punto(0,0,1);// 001
        //Punto punto1= new Punto(1,5,1);// 101

        listaGeometria.add(cubo);
        listaGeometria.add(cubo2);
    }

    public void pintar(Graphics2D g2d){
        for (int i = 0; i < listaGeometria.size(); i++) {
            listaGeometria.get(i).pintar(g2d);

        }

    }

    public void muevete(Vector v){
        for (int i = 0; i < listaGeometria.size(); i++) {
            listaGeometria.get(i).muevete(v);

        }
    }

    public void rota(Vector v){
        for (int i = 0; i < listaGeometria.size(); i++) {
            listaGeometria.get(i).gira(v,new Punto(0,0,0));
        }
    }

}
