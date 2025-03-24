import java.util.Scanner;

class Estadistica {
    private float[] numeros;
    public Estadistica(float[] numeros) {
        this.numeros = numeros;
    }
    public float getPromedio() {
        double suma = 0;
        for (double num : numeros) suma += num;
        return (float)suma/numeros.length;
    }
    public float getDesviacion() {
    	float promedio = getPromedio();
        float sumaDiferencias = 0;
        for (float num : numeros) sumaDiferencias += Math.pow(num-promedio,2);
        return (float)Math.sqrt(sumaDiferencias/(numeros.length-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] datos = new float[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) datos[i] = scanner.nextFloat();

        Estadistica estadistica = new Estadistica(datos);
        System.out.printf("El promedio es %.2f%n", estadistica.getPromedio());
        System.out.printf("La desviación estándar es %.5f%n", estadistica.getDesviacion());

        scanner.close();
    }
}
