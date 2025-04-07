
import java.util.Scanner;
import java.util.Random;

class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11);
        Scanner scanner = new Scanner(System.in);
        boolean adivinado = false;
        while (!adivinado) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = scanner.nextInt();
            if (!validaNumero(intento)) {
                System.out.println("Número fuera de rango. Intenta de nuevo.");
                continue;
            }
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord(getNumeroDeVidas());
                adivinado = true;
            } else {
                System.out.println("¡Incorrecto!");
                if (!quitaVida()) {
                    System.out.println("Te has quedado sin vidas. El número era: " + numeroAAdivinar);
                    break;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número es mayor.");
                    } else {
                        System.out.println("El número es menor.");
                    }
                }
            }
        }
    }
}
