
class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D suma(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    public Vector3D multiplicaciones(double e) {
        return new Vector3D(this.x * e, this.y * e, this.z * e);
    }
    public double longitud() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public Vector3D norma() {
        double lon = longitud();
        return new Vector3D(x / lon, y / lon, z / lon);
    }
    public double productoe(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public Vector3D productov(Vector3D v) {
        return new Vector3D(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }
    public Vector3D proyeccionor(Vector3D v) {
        double e = this.productoe(v) / v.productoe(v);
        return v.multiplicaciones(e);
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    public static void main(String[] args) {
        Vector3D a = new Vector3D(3, 4, 5);
        Vector3D b = new Vector3D(1, 2, 3);

        System.out.println("Suma: " + a.suma(b));
        System.out.println("Multiplicación por escalar: " + a.multiplicaciones(2));
        System.out.println("Longitud de a: " + a.longitud());
        System.out.println("Normal de a: " + a.norma());
        System.out.println("Producto escalar: " + a.productoe(b));
        System.out.println("Producto vectorial: " + a.productov(b));
        System.out.println("Proyección de a sobre b: " + a.proyeccionor(b));
    }
}
