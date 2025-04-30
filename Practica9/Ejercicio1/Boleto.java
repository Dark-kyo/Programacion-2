
public abstract class Boleto {
    protected int numero;
    protected double precio;
    public Boleto(int numero) {
        this.numero = numero;
    }
    public abstract void calcularPrecio(int diasAnticipacion);
    @Override
    public String toString() {
        return "Número: " + numero +
               "\nPrecio: " + precio;
    }
}
