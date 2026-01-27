package Interfaz;

import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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

        //Código para la clase Ventana, se puede agregar en cualquier línea dentro del constructor
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == 'w'){
                    lienzo.mueveAdelante();
                }
                if(e.getKeyChar() == 's'){
                    lienzo.mueveAtras();
                }

                lienzo.paintComponent(getGraphics());
            }
        });

        this.setVisible(true);
    }

    public static void main(String[] args) {
        Ventana window = new Ventana();
    }




}
