package entrega4;

import javax.swing.*;

public class VistaRestaurante {
    private JFrame frame;
    private JTextArea textArea;

    public VistaRestaurante() {
        frame = new JFrame("Sistema de Gestión de Restaurante");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        textArea = new JTextArea();
        frame.getContentPane().add(textArea);

        frame.setVisible(true);
    }

    public void mostrarRestaurante(String info) {
        textArea.setText(info);
    }
}