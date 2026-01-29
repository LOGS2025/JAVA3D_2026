package geometrias;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import interfaz.Camera;

import java.awt.*;

public class Arista extends Geometria {

    private final Punto punto1;
    private final Punto punto2;

    public Arista(Punto punto1, Punto punto2){
        this.punto1=punto1;
        this.punto2=punto2;
    }

    @Override
    public void pintar(Graphics2D g2d) {
        int x1= (int) punto1.xScreen();
        int y1= (int) punto1.yScreen();

        int x2= (int) punto2.xScreen();
        int y2= (int) punto2.yScreen();

        if (punto1.z()<0 && punto2.z()<0) {
            return;
        }

        g2d.setColor(Color.MAGENTA);
        g2d.drawLine(x1,y1,x2,y2);
    }

    @Override
    public void muevete(Vector vector) {
        punto1.muevete(vector);
        punto2.muevete(vector);
    }

    @Override
    public void gira(double[] angulos, Punto centroGiro) {

    }

    @Override
    public void proyectate(Camera camara) {

    }
}
