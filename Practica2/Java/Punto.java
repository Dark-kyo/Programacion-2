
public class Punto {
	public float x;
	public float y;

	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public String coord_cartesianas() {
		return "("+x+","+y+")";
	}
	public String coord_polares() {
		double r= Math.sqrt(x*x+y*y);
		double theta= Math.atan2(y, x);
		return "(r: "+r+", θ: "+theta+")";
	}
	public String toString() {
		return "Punto de coordenadas cartesianas"+coord_cartesianas();
	}	
    public float getXInterno() {
        return x;
    }
    public float getYInterno() {
        return y;
    }
}
