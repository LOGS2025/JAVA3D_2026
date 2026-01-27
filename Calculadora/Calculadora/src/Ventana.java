import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame {

    private JTextField tfRespuesta;
    private JButton[] btnNumeros;
    private JPanel panelRes;
    private JPanel panelBTNs;

    private JButton bSumar;
    private JButton bRestar;
    private JButton bLimpiar;
    private JButton bIgual;

    private boolean primer_arg_listo_f = false;
    private double primer_arg_num = 0;
    private char operador = ' ';
    private boolean segundo_arg_listo_f = false;

    private boolean primera_operacion = true;

    public JButton[] generaBTNsNumeros(){
        JButton[] botones = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botones[i] = new JButton(""+i);
        }
        return botones;
    }

    public void setLayout(int num_BTNs){
        panelRes.setLayout(new BorderLayout());
        panelBTNs.setLayout(new GridLayout(4,4));

        panelRes.add(tfRespuesta);

        this.setLayout(new BorderLayout());

        this.add(panelRes, BorderLayout.NORTH);
        this.add(panelBTNs, BorderLayout.CENTER);
    }


    public static void main(String[] args){
        FlatLightLaf.setup();
        Ventana v = new Ventana();

    }

    public void addFunctions(JButton btn, String accion, char op){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = tfRespuesta.getText();
                primer_arg_num = Double.parseDouble(tfRespuesta.getText());
                tfRespuesta.setText(textoActual + "" + accion);
                operador = op;
                primer_arg_listo_f = true;
            }
        });
    }
    public void addFunctions(JButton btn, String accion){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(primera_operacion){
                    tfRespuesta.setText("");
                    primera_operacion = false;
                }
                String textoActual = tfRespuesta.getText();
                tfRespuesta.setText(textoActual + "" + accion);
            }
        });
    }

    public void addLimpiar(JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                primer_arg_num = 0;
                operador = 'N';
                tfRespuesta.setText("");
            }
        });
    }    public void addIgual(JButton btn){
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double resultado = 0;
                double segundo_arg_num = Double.parseDouble(tfRespuesta.getText());

                switch (operador) {
                    case '+' :
                        resultado = primer_arg_num + segundo_arg_num;
                        break;
                    case '-' :
                        resultado = primer_arg_num - segundo_arg_num;
                        break;
                    case '*' :
                        resultado = primer_arg_num * segundo_arg_num;
                        break;
                    case '/' :
                        resultado = primer_arg_num / segundo_arg_num;
                        break;
                }
                tfRespuesta.setText("" + resultado);
            }
        });
    }

    Ventana(){
        // La pantalla se genera relativa a nada
        this.setLocationRelativeTo(null);
        // Terminar programa al cerrar ventana
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Tamaño
        this.setSize(600,600);

        panelRes = new JPanel();
        panelBTNs = new JPanel();

        this.tfRespuesta = new JTextField("Calculadora");
        this.tfRespuesta.setBorder(new LineBorder(Color.RED, 5));
        this.tfRespuesta.setPreferredSize(new Dimension(300, 300));

        this.btnNumeros = generaBTNsNumeros();

        this.bLimpiar = new JButton("C");
        this.bSumar = new JButton("+");
        this.bRestar = new JButton("-");
        this.bIgual = new JButton("=");

        init_panel_with_btns();

        addLimpiar(bLimpiar);
        for ( int i = 0; i < 10; i ++){
            addFunctions(btnNumeros[i]," " + i);
        }
        addFunctions(bSumar, "+", '+');
        addFunctions(bRestar, "-", '-');
        addIgual(bIgual);

        setLayout(10);

        // Visible?
        this.setVisible(true);
    }

    public void init_panel_with_btns(){
        panelBTNs.add(btnNumeros[7]);
        panelBTNs.add(btnNumeros[8]);
        panelBTNs.add(btnNumeros[9]);
        panelBTNs.add(bLimpiar);
        panelBTNs.add(btnNumeros[4]);
        panelBTNs.add(btnNumeros[5]);
        panelBTNs.add(btnNumeros[6]);
        panelBTNs.add(btnNumeros[1]);
        panelBTNs.add(btnNumeros[2]);
        panelBTNs.add(btnNumeros[3]);
        panelBTNs.add(bRestar);
        panelBTNs.add(bSumar);
        panelBTNs.add(bIgual);
    }


}

