package geometrias;

import interfaz.Camera;
import interfaz.Ventana;

import java.awt.*;

public class Punto extends Geometria {

    protected double  x,y,z;
    private double  xScreen,yScreen;
    private double zPantalla;

    public Punto(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;

    }

    public double x(){
        return this.x;
    }
    public double y(){
        return this.y;
    }
    public double z(){
        return this.z;
    }
    public double xScreen(){
        return this.xScreen;
    }public double yScreen(){
        return this.yScreen;
    }


    @Override
    public void pintar(Graphics2D g2d) {
        // SE TIENE QUE HABER PROYECTADO CON ANTERIORIDAD
        if (zPantalla > 2){
            g2d.setColor(Color.BLACK);
            g2d.fillOval((int) xScreen-10, (int) yScreen-10,10,10 );
        }
    }

    @Override
    public void muevete(Vector vector) {
        this.x += vector.x();
        this.y += vector.y();
        this.z += vector.z();

    }

    @Override
    public void gira(double[] angulos, Punto centroGiro) {
    giraX(angulos[0],centroGiro);
    giraY(angulos[1],centroGiro);
    giraZ(angulos[2],centroGiro);
    }


    @Override
    public void proyectate(Camera camara) {
        Vector vProyeccion = new Vector(camara, this);
        double[] componentes = camara.proyecta(vProyeccion);

        /*
        componentes[0] -> componentes hor
        componentes[1] -> componente ver
        componentes[2] -> componente depth
         */

        zPantalla=componentes[2];

        if(componentes[2]<0){
            zPantalla=-componentes[2];
        }

        xScreen=componentes[0]/componentes[2];
        yScreen=componentes[1]/componentes[2];

        xScreen = (Ventana.ancho/10.0)*xScreen+((double) Ventana.ancho /2.0);
        yScreen = -(Ventana.alto/10.0)*yScreen+((double) Ventana.alto /2.0);

        yScreen=Ventana.alto-yScreen;
        System.out.println(zPantalla);
    }

    public void giraX(double angX, Punto centroGiro) {
        /******GiraX***********/
        double x=this.x- centroGiro.x;
        double y=this.y- centroGiro.y;
        double z=this.z- centroGiro.z;


        double xr=x;
        double yr=y*Math.cos(angX)+z*Math.sin(angX);
        double zr=-y*Math.sin(angX)+z*Math.cos(angX);

        this.x = xr + centroGiro.x;
        this.y= yr + centroGiro.y;
        this.z = zr + centroGiro.z;
    }

    public void giraY(double angY, Punto centroGiro) {
        double x=this.x- centroGiro.x;
        double y=this.y- centroGiro.y;
        double z=this.z- centroGiro.z;

        /******Gira Y***********/
        double xr=x*Math.cos(angY)-z*Math.sin(angY);
        double yr=y;
        double zr=x*Math.sin(angY)+z*Math.cos(angY);

        this.x = xr + centroGiro.x;
        this.y= yr + centroGiro.y;
        this.z =zr + centroGiro.z;

    }


    public void giraZ(double angZ, Punto centroGiro) {
        double x=this.x- centroGiro.x;
        double y=this.y- centroGiro.y;
        double z=this.z- centroGiro.z;

        /******Gira Z***********/
        double xr=y*Math.sin(angZ)+x*Math.cos(angZ);
        double yr=y*Math.cos(angZ)-x*Math.sin(angZ);
        double zr=z;

        this.x = xr + centroGiro.x;
        this.y= yr + centroGiro.y;
        this.z = zr + centroGiro.z;
    }

}
