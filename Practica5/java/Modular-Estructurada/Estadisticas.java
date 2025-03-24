import java.util.Scanner;

public class Estadisticas {
    public static float promedio(float[] numeros) {
    	float suma = 0;
        for (float num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    public static float desviacion(float[] numeros, float promedio) {
        float sumaDiferencias = 0;
        for (float num : numeros) {
            sumaDiferencias += Math.pow(num-promedio, 2);
        }
        return (float)Math.sqrt(sumaDiferencias / (numeros.length-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numeros = new float[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextFloat();
        }

        float prom = promedio(numeros);
        float desv = desviacion(numeros, prom);

        System.out.printf("El promedio es %.2f%n", prom);
        System.out.printf("La desviación estándar es %.5f%n", desv);

        scanner.close();
    }
}
