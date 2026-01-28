package interfaz;

import geometrias.Punto;
import geometrias.Vector;
import geometrias.cuerpo.Cubo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Lienzo extends JPanel {

    private final Escena escena;


    Lienzo(){
    this.escena= new Escena();

    this.setPreferredSize(new Dimension(Ventana.ancho,Ventana.alto));

    this.requestFocus();
    }

    public void mueveAdelante() {
      //  punto.muevete(new Vector(0,0,0.2));
        //punto1.muevete(new Vector(0,0,0.2));
        escena.muevete(new Vector(0,0,0.2));

    }

    public void mueveAtras() {
        //punto.muevete(new Vector(0,0,-0.2));
       // punto1.muevete(new Vector(0,0,-0.2));
        escena.muevete(new Vector(0,0,-0.2));
    }

    public void mueveIzq() {
        //  punto.muevete(new Vector(0,0,0.2));
        //punto1.muevete(new Vector(0,0,0.2));
        escena.muevete(new Vector(-0.2,0,0));

    }

    public void mueveDer() {
        //punto.muevete(new Vector(0,0,-0.2));
        // punto1.muevete(new Vector(0,0,-0.2));
        escena.muevete(new Vector(0.2,0,0));
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2d= (Graphics2D) g;
        g2d.setColor(Color.PINK);
        g2d.fillRect(0,0,Ventana.ancho,Ventana.alto);


        //punto.pintar(g2d);
        //punto1.pintar(g2d);
        escena.pintar(g2d);



    }

    public void mueveArriba() {
        escena.muevete(new Vector(0,-0.2,0));
    }

    public void mueveAbajo() {
        escena.muevete(new Vector(0,+0.2,0));
    }

    public void rotaIzq() {
        escena.rota(new Vector(0,0.2,0));
    }

    public void rotaDer() {
        escena.rota(new Vector(0,-0.2,0));
    }


}
