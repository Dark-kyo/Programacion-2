import java.util.Scanner;

public class Ecuacioncuadratica {
    public static float getDiscriminante(float a, float b, float c) {
        return (b*b) - (4*a*c);
    }
    public static Float getRaiz1(float a, float b, float discriminante) {
        if (discriminante<0) {
        	return null;
        }
        return (-b +(float) Math.sqrt(discriminante))/(2*a);
    }
    public static Float getRaiz2(float a, float b, float discriminante) {
        if (discriminante<0) {
        	return null;       
        }
        return (-b-(float) Math.sqrt(discriminante))/(2*a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los valores de a, b y c: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float discriminante = getDiscriminante(a, b, c);
        Float raiz1 = getRaiz1(a, b, discriminante);
        Float raiz2 = getRaiz2(a, b, discriminante);
        if (raiz1 == null) {
            System.out.println("La ecuación no tiene raíces reales.");
        } else if (raiz1.equals(raiz2)) {
            System.out.printf("La ecuación tiene una raíz: %.5f%n", raiz1);
        } else {
            System.out.printf("La ecuación tiene dos raíces: %.5f y %.5f%n", raiz1, raiz2);
        }
        scanner.close();
    }
}