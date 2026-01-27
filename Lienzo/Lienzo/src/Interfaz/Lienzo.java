package Interfaz;

import Geometrías.Punto;
import Geometrías.Vector;
import Geometrías.cuerpos.Cubo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Lienzo extends JPanel {
    Cubo cubo = new Cubo(new Punto(0,0,0), 1.0);


    Lienzo(){
        this.setPreferredSize(new Dimension(Ventana.ancho, Ventana.alto));

    }

    //Métodos "mueveteAtras()" y "mueveteAdelante". Éstos van dentro de la clase lienzo
    //Se pueden agregar como cualquier otro metodo dentro de la clase.

    public void mueveAdelante() {
        //punto.muevete(new Vector(0,0,0.2));
        //punto2.muevete(new Vector(0,0,0.2));
        cubo.muevete(new Vector(0,0,+0.2));
    }

    public void mueveAtras() {
        //punto.muevete(new Vector(0,0,-0.2));
        //punto2.muevete(new Vector(0,0,-0.2));
        cubo.muevete(new Vector(0,0,-0.2));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0,Ventana.ancho,Ventana.alto);

        cubo.pintate(g2d);
    }
}
