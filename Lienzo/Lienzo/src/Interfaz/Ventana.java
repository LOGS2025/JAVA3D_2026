package Interfaz;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public static final int ancho = 600;
    public static final int alto = 600;

    Ventana(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Lienzo lienzo = new Lienzo();
        this.add(lienzo);
        this.pack();
        this.setResizable(false);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        Ventana window = new Ventana();
    }

}
