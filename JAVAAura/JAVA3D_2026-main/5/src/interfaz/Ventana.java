package interfaz;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;


public class Ventana extends JFrame {
    public static final int ancho=800; // de la clase
    public static final int alto=800;

    Ventana(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Lienzo lienzo= new Lienzo();
        this.add(lienzo);
        this.pack();
        this.setResizable(false);

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyChar() == 'w'){
                    lienzo.mueveAdelante();
                }
                if(e.getKeyChar() == 's'){
                    lienzo.mueveAtras();
                }
                if(e.getKeyChar() == 'a'){
                    lienzo.mueveIzq();
                }
                if(e.getKeyChar() == 'd'){
                    lienzo.mueveDer();
                }
                if(e.getKeyChar() == 'u'){
                    lienzo.mueveArriba();
                }
                if(e.getKeyChar() == 'j'){
                    lienzo.mueveAbajo();
                }
                if(e.getKeyChar() == 'h'){
                    lienzo.rotaIzq();
                }
                if(e.getKeyChar() == 'k'){
                    lienzo.rotaDer();
                }
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                    lienzo.reinicia();
                }

                lienzo.paintComponent(getGraphics());
            }
        });
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Ventana();
    }
}
