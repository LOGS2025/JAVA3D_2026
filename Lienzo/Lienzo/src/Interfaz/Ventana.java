package Interfaz;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    Ventana(){
        this.setSize(600,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Lienzo lienzo = new Lienzo();
        this.add(lienzo);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        Ventana window = new Ventana();
    }

}
