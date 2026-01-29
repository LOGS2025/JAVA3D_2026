package interfaz;

import geometrias.Geometria;
import geometrias.Punto;
import geometrias.Vector;
import geometrias.cuerpo.Cuerpo;

public class Camera extends Punto {

    private Vector vVertical, vHorizontal, vProfundidad;

    public Camera(double x,double y,double z){
        super(x,y,z);

        this.vHorizontal = new Vector(1,0,0);
        this.vVertical = new Vector(0,1,0);
        this.vProfundidad = new Vector(0,0,1);
    }

    public void rota(Vector vector){
        gira(new double[]{vector.x(), vector.y(), vector.z()}, this);
    }

    public void gira(double[] angulos, Punto centrogiro){
        vHorizontal.rota(angulos);
        vVertical.rota(angulos);
        vProfundidad.rota(angulos);
    }

    public double[] proyecta(Vector vector){
        double compHorizontal = Vector.productoPunto(vector, this.vHorizontal);
        double compVertical = Vector.productoPunto(vector, this.vVertical);
        double compProfundidad = Vector.productoPunto(vector, this.vProfundidad);

        return new double[]{compHorizontal, compVertical, compProfundidad};
    }

    public void reincia(){
        this.x = 0;
        this.y = 0;
        this.z = 0;

        this.vHorizontal = new Vector(1,0,0);
        this.vVertical = new Vector(0,1,0);
        this.vProfundidad = new Vector(0,0,1);
    }

    public void mueveAdelante() {
        this.muevete(this.vProfundidad);
    }
    public void mueveAtras() {
        this.muevete(this.vProfundidad.negado());
    }
    public void mueveIzq() {
        this.muevete(this.vHorizontal.negado());
    }
    public void mueveDer() {
        this.muevete(this.vHorizontal);
    }
    public void mueveArriba() {
        this.muevete(this.vVertical);
    }
    public void mueveAbajo() {
        this.muevete(this.vVertical.negado());
    }
    public void rotaIzq() {
        this.rota(this.vVertical.escalado(0.2));
    }
    public void rotaDer() {
        this.rota(this.vVertical.escalado(-0.2));
    }



}
