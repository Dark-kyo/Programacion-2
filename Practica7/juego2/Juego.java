
class Juego {
    private int numeroDeVidas;
    private int record;
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        System.out.println("Nueva partida iniciada.");
    }
    public void actualizaRecord(int vidasRestantes) {
        if (vidasRestantes > record) {
            record = vidasRestantes;
            System.out.println("¡Nuevo récord: " + record + " vidas restantes!");
        }
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("¡Te queda(n) " + numeroDeVidas + " vida(s)!");
        return numeroDeVidas > 0;
    }
    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }
}
