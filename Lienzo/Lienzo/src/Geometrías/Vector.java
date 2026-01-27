package Geometrías;

/* LOS `private` DE LA MISMA CLASE SI SE PUEDEN ACCEDER ENTRE ELLOS */

import javax.sound.midi.Soundbank;

public class Vector{

    double x;
    double y;
    double z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Vector(double[] coords){
        // Siempre debe ser la primera linea
        this(coords[0],coords[1],coords[2]);
    }


/********************* VECTOR A PARTIR DE DOS PUNTOS  ****************************/
    // Primero el origen y después el Destino
    Vector(Punto pOrigen, Punto pDestino){
        this(
                pDestino.x() - pOrigen.x(),
                pDestino.y() - pOrigen.y(),
                pDestino.z() - pOrigen.z()
        );
    }

    public Vector normalizado(){
        double norma = this.norma();

        return new Vector(
                this.x/norma,
                this.y/norma,
                this.z/norma);
    }

    public Vector negado(){
        return new Vector(
                -1*this.x,
                -1*this.y,
                -1*this.z);
    }

    @Override
    public String toString(){
        return "V = x: " + this.x + " y: " + this.y + " z: " + this.z;
    }

/********************* RETORNAR X Y Z  ****************************/
    public double x(){
        return this.x;
    }
    public double y(){
        return this.y;
    }
    public double z(){
        return this.z;
    }

    /********************* MAIN ****************************/
    public static void main(String[] args) {
        Punto pDest = new Punto(1,1,1);
        Punto pOrigen = new Punto(0,0,0);

        Vector v = new Vector(pOrigen, pDest);
        System.out.println(v.norma());
        v.rota(Math.toRadians(90),Math.toRadians(90),Math.toRadians(90));
        System.out.println(v);
        System.out.println(v.norma());

    }

    public double norma(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    public void rota(double angX,double angY,double angZ){
        rotaX(angX);
        rotaY(angY);
        rotaZ(angZ);
    }

    public void rota(Vector v){

    }

    public void rota(double[] angulos){
        rota(angulos[0],angulos[1],angulos[2]);
    }

    public void rotaX(double angX){
        double y = this.y*Math.cos(angX) + this.z*Math.sin(angX);
        double z = this.z*Math.cos(angX) - this.y*Math.sin(angX);
        double x = this.x;

        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void rotaY(double angY){
        double x = this.x*Math.cos(angY) - this.z*Math.sin(angY);
        double z = this.x*Math.sin(angY) + this.z*Math.cos(angY);
        double y = this.y;

        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void rotaZ(double angZ){
        double z = this.z;
        double y = this.y*Math.cos(angZ) - this.x*Math.sin(angZ);
        double x = this.y*Math.sin(angZ) + this.x*Math.cos(angZ);

        this.x = x;
        this.y = y;
        this.z = z;
    }


}

/*
Para z
    y' = yMath.cos(angX) - xMath.sen(angX)
    x' = yMath.sen(angX) + xMath.cos(angX)
    z' = z
Para y
    y' = y
    x' = xMath.cos(angX) - yMath.sen(angX)
    z' = xMath.sen(angX) + zMath.cos(angX)
Para x
    y' = yMath.cos(angX) + zMath.sen(angX)
    x' = x
    z' = zMath.cos(angX) - yMath.sen(angX)

 */
