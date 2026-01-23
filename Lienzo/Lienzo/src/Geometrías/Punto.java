package Geometrías;

public class Punto extends Geometria {
    private double x,y,z;

    Punto(double x,double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
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

    /********************* FUNCIONES GRÁFICAS ****************************/
        @Override
    public void pintate() {

    }

    @Override
    public void muevete(Vector vector) {

    }

    @Override
    public void gira(double[] angulos, Punto centro_giro) {

    }
}
