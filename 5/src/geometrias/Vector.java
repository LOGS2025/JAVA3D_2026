package geometrias;

public class Vector {

    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Constructor separado");
    }

    Vector(double[] coords) {
        this(coords[0], coords[1], coords[2]);
        System.out.println("Constructor arreglo");

    }


    Vector(Punto origen, Punto destino) {
        this(destino.x() - origen.x(), destino.y() - origen.y(), destino.z() - origen.z());

    }

    public double x() {
        return this.x;
    }

    public double y() {
        return this.y;
    }

    public double z() {
        return this.z;
    }

    public void rota(double angX, double angY, double angZ) {
        rotaX(angX);
        rotaY(angY);
        rotaZ(angZ);
    }

    public void rota(double[] angulos) {
        rota(angulos[0], angulos[1], angulos[2]);
    }

    public void rota(Vector v) {
        rota(v.x,v.y,v.z);
    }


    public void rotaX(double angX) {
        /******Rota X***********/
        double x=this.x;
        double y=this.y*Math.cos(angX)+this.z*Math.sin(angX);
        double z=-this.y*Math.sin(angX)+this.z*Math.cos(angX);

        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void rotaY(double angY) {
        /******Rota Y***********/
        double x=this.x*Math.cos(angY)-this.z*Math.sin(angY);
        double y=this.y;
        double z=this.x*Math.sin(angY)+this.z*Math.cos(angY);

        this.x=x;
        this.y=y;
        this.z=z;
    }


    public void rotaZ(double angZ) {
        /******Rota Z***********/
        double x=this.y*Math.sin(angZ)+this.x*Math.cos(angZ);
        double y=this.y*Math.cos(angZ)-this.x*Math.sin(angZ);
        double z=this.z;

        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Vector normalizado(){
        double norma=this.norma();
        double x=this.x /norma;
        double y=this.y /norma;
        double z=this.z /norma;

        return new Vector(x,y,z);
    }

    public Vector negado(){
        return new Vector(-x,-y,-z);
    }

    public double norma(){
        return Math.sqrt(x*x+y*y+z*z);
    }
    @Override
    public String toString(){
        return "x: "+this.x+" y: "+this.y+" z: "+this.z;

    }

    public static void main(String[] args) {
        Punto destino=new Punto(1,1,1);
        Punto origen=new Punto(0,0,0);

        Vector v1=new Vector(origen,destino);
        System.out.println(v1);

        //Radianes
        v1.rota(Math.toRadians(90),Math.toRadians(90),Math.toRadians(90));
        System.out.println(v1);


    }}




