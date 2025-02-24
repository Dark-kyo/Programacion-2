
import javax.swing.*;
import java.awt.*;

public class Principal extends JPanel {

    private Linea linea;
    private Circulo circulo;

    public Principal() {
        Punto p1 = new Punto(50, 50);
        Punto p2 = new Punto(200, 150);
        linea = new Linea(p1, p2);
        Punto centro = new Punto(300, 200);
        circulo = new Circulo(centro, 50f);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        linea.dibujaLinea(g);
        circulo.dibujaCirculo(g);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dibujo de Línea y Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Principal());
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
