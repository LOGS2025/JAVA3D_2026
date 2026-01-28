package geometrias;

import interfaz.Ventana;

import java.awt.*;

public class Punto extends Geometria {

    private double  x,y,z;
    private double  xScreen,yScreen;

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
        g2d.setColor(Color.BLACK);
        double zScreen=z;

        if(z<0){
            zScreen=-z;
        }

        xScreen=this.x/this.z;
        yScreen=this.y/this.z;

        xScreen = (Ventana.ancho/10.0)*xScreen+((double) Ventana.ancho /2.0);
        yScreen = -(Ventana.alto/10.0)*yScreen+((double) Ventana.alto /2.0);

        yScreen=Ventana.alto-yScreen;


        if(z<0){
            return;
        }


        g2d.fillOval((int) xScreen-10, (int) yScreen-10,20,20 );
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

    public void giraX(double angX, Punto centroGiro) {
        /******GiraX***********/
        double x=this.x- centroGiro.x;
        double y=this.x- centroGiro.y;
        double z=this.x- centroGiro.z;


        double xr=x;
        double yr=y*Math.cos(angX)+z*Math.sin(angX);
        double zr=-y*Math.sin(angX)+z*Math.cos(angX);

        this.x = xr + centroGiro.x;
        this.y= yr + centroGiro.y;
        this.z = zr + centroGiro.z;
    }

    public void giraY(double angY, Punto centroGiro) {
        double x=this.x- centroGiro.x;
        double y=this.x- centroGiro.y;
        double z=this.x- centroGiro.z;

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
        double y=this.x- centroGiro.y;
        double z=this.x- centroGiro.z;

        /******Gira Z***********/
        double xr=y*Math.sin(angZ)+x*Math.cos(angZ);
        double yr=y*Math.cos(angZ)-x*Math.sin(angZ);
        double zr=z;

        this.x = xr + centroGiro.x;
        this.y= yr + centroGiro.y;
        this.z = zr + centroGiro.z;
    }


}
