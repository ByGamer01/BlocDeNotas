package es.cide.programacio;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainPanel extends JPanel {

    public MainPanel() {

        setLayout(new BorderLayout());

        // Panel superior con botones
        JPanel panelBotones = new JPanel();
        JButton nou = new JButton("Nou");
        JButton obrir = new JButton("Obrir");
        JButton desar = new JButton("Desar");
        JButton desarCom = new JButton("Desar com");

        panelBotones.add(nou);
        panelBotones.add(obrir);
        panelBotones.add(desar);
        panelBotones.add(desarCom);

        add(panelBotones, BorderLayout.NORTH);

        // Panel central (zona de texto)
        JPanel seccionTexto = new JPanel();
        add(seccionTexto, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BlocDeNotas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.add(new MainPanel());
        frame.setVisible(true);
    }
}
