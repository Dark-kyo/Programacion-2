
public class Circulo {
	public Punto centro;
	public float radio;
	public Circulo(Punto centro, float radio) {
		this.centro = centro;
		this.radio = radio;
	}
    public void dibujaCirculo(java.awt.Graphics g) {     
        int xCentro = (int) centro.getXInterno();
        int yCentro = (int) centro.getYInterno();
        int diametro = (int) (2 * radio);
        int x = xCentro - (int) radio;
        int y = yCentro - (int) radio;

        g.drawOval(x, y, diametro, diametro);
    }
	@Override
	public String toString() {
		return "Circulo [centro= " + centro.coord_cartesianas() + ", radio= " + radio + "]";
	}
}
