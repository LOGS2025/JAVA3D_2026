package Geometrías;

public class Vector{

    double x;
    double y;
    double z;

    Vector(double x,double y,double z){
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
        Punto pOrigen = new Punto(10,10,10);

        Vector v1 = new Vector(pOrigen,pDest);
        System.out.println(v1);
        System.out.println(v1.negado());
        System.out.println(v1.normalizado());

    }

    public double norma(){
        return Math.sqrt(x*x + y*y + z*z);
    }

}

/*
Para x-y
    y' = ycos(theta) - xsen(theta)
    x' = ysen(theta) + xcos(theta)
    z' = z
Para x-z
    y' = y
    x' = xcos(theta) - ysen(theta)
    z' = xsen(theta) + zcos(theta)
Para y-z
    y' = ycos(theta) - zsen(theta)
    x' = x
    z' = zcos(theta) - ysen(theta)

 */
