package Geometrías.cuerpos;

import Geometrías.Punto;

public class Cubo extends Cuerpo {

    Cubo(Punto[] puntos){
        super(puntos);
    }

    public Cubo(Punto centroide, double apotema){
        super(8);

        this.puntos[0b000] = new Punto(
                centroide.x()-apotema,
                centroide.y()-apotema,
                centroide.z()-apotema
        );
        this.puntos[0b001] = new Punto(
                centroide.x()+apotema,
                centroide.y()-apotema,
                centroide.z()-apotema
        );
        this.puntos[0b010] = new Punto(
                centroide.x()-apotema,
                centroide.y()+apotema,
                centroide.z()-apotema
        );
        this.puntos[0b011] = new Punto(
                centroide.x()+apotema,
                centroide.y()+apotema,
                centroide.z()-apotema
        );



        this.puntos[0b100] = new Punto(
                centroide.x()-apotema,
                centroide.y()-apotema,
                centroide.z()+apotema
        );
        this.puntos[0b101] = new Punto(
                centroide.x()+apotema,
                centroide.y()-apotema,
                centroide.z()+apotema
        );
        this.puntos[0b110] = new Punto(
                centroide.x()-apotema,
                centroide.y()+apotema,
                centroide.z()+apotema
        );
        this.puntos[0b111] = new Punto(
                centroide.x()+apotema,
                centroide.y()+apotema,
                centroide.z()+apotema
        );

    }

}
