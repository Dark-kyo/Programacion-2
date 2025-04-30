
package com.mycompany.coloreados.aea;
import com.mycompany.coloreados.Circulo;
import com.mycompany.coloreados.Coloreado;
import com.mycompany.coloreados.Cuadrado;
import com.mycompany.coloreados.Figura;
import java.util.Random;
public class PruebaFiguras {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        Random rand = new Random();

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2); // 0 = Cuadrado, 1 = Círculo
            String color = "Color" + (i + 1);

            if (tipo == 0) {
                double lado = rand.nextDouble() * 20 + 1; // 1 a 21
                figuras[i] = new Cuadrado(lado, color);
            } else {
                double radio = rand.nextDouble() * 20 + 1;
                figuras[i] = new Circulo(radio, color);
            }
        }

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura " + (i + 1) + ":");
            System.out.println(figuras[i]);
            System.out.printf("Área: %.2f\n", figuras[i].area());
            System.out.printf("Perímetro: %.2f\n", figuras[i].perimetro());

            if (figuras[i] instanceof Coloreado) {
                Coloreado c = (Coloreado) figuras[i];
                System.out.println(c.comoColorear());
            }

            System.out.println("---------------------------");
        }
    }
}
