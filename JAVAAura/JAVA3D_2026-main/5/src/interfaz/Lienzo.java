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
        escena.mueveAdelante();
    }
    public void mueveAtras() {
        escena.mueveAtras();
    }
    public void mueveIzq() {
        escena.mueveIzq();
    }
    public void mueveDer() {
        escena.mueveDer();
    }
    public void mueveArriba() {
        escena.mueveArriba();
    }
    public void mueveAbajo() {
        escena.mueveAbajo();
    }
    public void rotaIzq() {
        escena.rotaIzq();
    }
    public void rotaDer() {
        escena.rotaDer();
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


    public void reinicia(){
        escena.reinicia();
    }
}
