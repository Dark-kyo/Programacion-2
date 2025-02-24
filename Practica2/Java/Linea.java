
public class Linea {
	public Punto p1;
	public Punto p2;
	public Linea(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
    public void dibujaLinea(java.awt.Graphics g) {
        int x1 = (int) p1.getXInterno();
        int y1 = (int) p1.getYInterno();
        int x2 = (int) p2.getXInterno();
        int y2 = (int) p2.getYInterno();
        g.drawLine(x1, y1, x2, y2);
    }
	@Override
	public String toString() {
		return "Linea [desde " + p1.coord_cartesianas() + ", hasta " + p2.coord_cartesianas() + "]";
	}
}
