package es.cide.programacio;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MainPanel extends JPanel {
    private File fitxerActual; // Nuestro bloque de TextArea debe de ser un objeto de tipo File, para que toda
                               // la logica funcione
    private JTextArea texto;

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
        texto = new JTextArea();
        texto.setLineWrap(true);
        texto.setWrapStyleWord(true);

        // El Text Area siempre debe de ir dentro de un JScrollPane, para que se pueda
        // scrollear.
        JScrollPane scroll = new JScrollPane(texto);
        scroll.setBorder(BorderFactory.createTitledBorder("Editor"));

        add(scroll, BorderLayout.CENTER);

    }


    // Metodos de los Botones 
    private void obrir() {

    }

    private void desar() {

    }

    private void desarCom() {

    }

    private void nou() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BlocDeNotas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setFocusable(false);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(new MainPanel());

        frame.setVisible(true);
    }
}
