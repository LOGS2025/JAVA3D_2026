package interfaz;

import geometrias.Geometria;
import geometrias.Punto;
import geometrias.Vector;
import geometrias.cuerpo.Cubo;

import java.awt.*;
import java.util.ArrayList;

public class Escena {

    private final  ArrayList<Geometria> listaGeometria=new ArrayList<>();
    private Camera camara;

    Escena() {
        this.camara = new Camera(0,0,0);

        Cubo cubo = new Cubo(new Punto(2, 0, 10), 1.0);
        Cubo cubo2 = new Cubo(new Punto(-1, 2, 10), 1.0);
        // Punto punto= new Punto(0,0,1);// 001
        //Punto punto1= new Punto(1,5,1);// 101

        listaGeometria.add(cubo);
        listaGeometria.add(cubo2);
    }

    public void pintar(Graphics2D g2d){

        // PROYECTAMOS TODOS LOS PUNTOS POR SI INTERFIEREN GEOMETRÍAS
        for (int i = 0; i < listaGeometria.size(); i++){
            listaGeometria.get(i).proyectate(camara);
        }
        for (int i = 0; i < listaGeometria.size(); i++) {
            listaGeometria.get(i).pintar(g2d);

        }

    }

    public void mueveAdelante() {
        camara.mueveAdelante();
    }
    public void mueveAtras() {
        camara.mueveAtras();
    }
    public void mueveIzq() {
        camara.mueveIzq();
    }
    public void mueveDer() {
        camara.mueveDer();
    }
    public void mueveArriba() {
        camara.mueveArriba();
    }
    public void mueveAbajo() {
        camara.mueveAbajo();
    }
    public void rotaIzq(){
        camara.rotaIzq();
    }
    public void rotaDer(){
        camara.rotaDer();
    }
    public void reinicia(){
        camara.reincia();
    }

}
