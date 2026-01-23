package Interfaz;

import Geometrías.Punto;

import javax.swing.*;
import java.awt.*;

public class Lienzo extends JPanel {

    Punto punto = new Punto(0,0,+3);

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0,600,600);

        punto.pintate(g2d);
    }
}
