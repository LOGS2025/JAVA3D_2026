package Lienzo;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    Ventana() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.RED);
                g2d.drawLine(0,0,600,600);
            }
        };

        panel.setBackground(Color.BLACK);


        this.add(panel);
        this.setVisible(true);




    }

    public static void main(String[] args) {
        new Ventana();
    }

}
