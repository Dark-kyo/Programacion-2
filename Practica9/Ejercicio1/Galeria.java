public class Galeria extends Boleto {

    public Galeria(int numero) {
        super(numero);
    }

    @Override
    public void calcularPrecio(int diasAnticipacion) {
        if (diasAnticipacion >= 10) {
            this.precio = 50.0 / 2; // 50% del precio del palco
        } else {
            this.precio = (100.0 - 30.0) * 0.5; // 50% de (precio palco - 30)
        }
    }
}
