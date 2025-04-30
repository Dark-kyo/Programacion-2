public class Palco extends Boleto {

    public Palco(int numero) {
        super(numero);
    }

    @Override
    public void calcularPrecio(int diasAnticipacion) {
        this.precio = 100.0;
    }
}
