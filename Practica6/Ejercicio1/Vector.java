
class Vector {
    private double x, y, z;
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector suma(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    public Vector resta(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
    }
    public Vector multiplicacion(double escalar) {
        return new Vector(this.x * escalar, this.y * escalar, this.z * escalar);
    }
    public double productoes(Vector v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public Vector productovec(Vector v) {
        return new Vector(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }
    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public Vector projectorto(Vector v) {
        double escalar = this.productoes(v) / v.productoes(v);
        return v.multiplicacion(escalar);
    }
    public double componentIn(Vector v) {
        return this.productoes(v) / v.magnitude();
    }
    public boolean Ortogonal(Vector v) {
        return this.productoes(v) == 0;
    }
    public boolean Paralelos(Vector v) {
        Vector cross = this.productovec(v);
        return cross.magnitude() == 0; // Si el producto vectorial es 0, son paralelos
    }
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}