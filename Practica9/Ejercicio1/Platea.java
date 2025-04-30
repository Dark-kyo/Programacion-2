public class Platea extends Boleto {

    public Platea(int numero) {
        super(numero);
    }

    @Override
    public void calcularPrecio(int diasAnticipacion) {
        if (diasAnticipacion >= 10) {
            this.precio = 50.0;
        } else {
            this.precio = 60.0;
        }
    }
}
