package Interfaz;

import Geometrías.Punto;
import Geometrías.Vector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Lienzo extends JPanel {

    Punto punto = new Punto(1,1,1);
    Punto punto1 = new Punto(1,1,1);


    Lienzo(){
        this.setPreferredSize(new Dimension(Ventana.ancho, Ventana.alto));

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar()=='w'){
                    // acercar z++
                    punto.muevete(new Vector(0,0,0.2));
                    punto1.muevete(new Vector(0,0,0.2));
                }
                if(e.getKeyChar()=='s'){
                    // alejarz z--
                    punto.muevete(new Vector(0,0,-0.2));
                    punto1.muevete(new Vector(0,0,-0.2));
                }

                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0,Ventana.ancho,Ventana.alto);

        punto.pintate(g2d);
        punto1.pintate(g2d);
        punto2.pintate(g2d);
    }
}
