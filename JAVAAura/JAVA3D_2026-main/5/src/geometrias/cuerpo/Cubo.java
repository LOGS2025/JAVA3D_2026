package geometrias.cuerpo;

import geometrias.Arista;
import geometrias.Punto;
import interfaz.Camera;

public class Cubo extends Cuerpo {


    Cubo(Punto[] puntos, Arista[] aristas) {
        super(puntos, aristas);
    }

    public Cubo(Punto centroide, double apotema) {
        super(8,12) ;

        this.puntos[0b000] = new Punto(
                centroide.x() - apotema,
                centroide.y() - apotema,
                centroide.z() - apotema);

        this.puntos[0b001] = new Punto(
                centroide.x() + apotema,
                centroide.y() - apotema,
                centroide.z() - apotema);

        this.puntos[0b010] = new Punto(
                centroide.x() - apotema,
                centroide.y() + apotema,
                centroide.z() - apotema);

        this.puntos[0b011] = new Punto(
                centroide.x() + apotema,
                centroide.y() + apotema,
                centroide.z() - apotema);

        this.puntos[0b100] = new Punto(
                centroide.x() - apotema,
                centroide.y() - apotema,
                centroide.z() + apotema);

        this.puntos[0b101] = new Punto(
                centroide.x() +apotema,
                centroide.y() - apotema,
                centroide.z() + apotema);

        this.puntos[0b110] = new Punto(
                centroide.x() - apotema,
                centroide.y() + apotema,
                centroide.z() + apotema);

        this.puntos[0b111] = new Punto(
                centroide.x() + apotema,
                centroide.y() + apotema,
                centroide.z() + apotema);

        this.aristas[0]=new Arista(puntos[0],puntos[1]);
        this.aristas[1]=new Arista(puntos[0],puntos[2]);
        this.aristas[2]=new Arista(puntos[0],puntos[4]);

        this.aristas[3]=new Arista(puntos[1],puntos[5]);
        this.aristas[4]=new Arista(puntos[4],puntos[5]);
        this.aristas[5]=new Arista(puntos[7],puntos[5]);

        this.aristas[6]=new Arista(puntos[6],puntos[4]);
        this.aristas[7]=new Arista(puntos[6],puntos[2]);
        this.aristas[8]=new Arista(puntos[6],puntos[7]);

        this.aristas[9]=new Arista(puntos[3],puntos[1]);
        this.aristas[10]=new Arista(puntos[3],puntos[2]);
        this.aristas[11]=new Arista(puntos[3],puntos[7]);


    }
}


