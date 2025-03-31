
public class AlgebraVectorial {

    // Verifica la condición |a + b| = |a - b|
    public static boolean verificarPerpendicularA(Vector a, Vector b) {
        return a.suma(b).magnitude() == a.resta(b).magnitude();
    }
    // Verifica la condición |a - b| = |b - a|
    public static boolean verificarPerpendicularB(Vector a, Vector b) {
        return a.resta(b).magnitude() == b.resta(a).magnitude();
    }
    // Verifica si a y b son ortogonales usando el producto escalar
    public static boolean esPerpendicular(Vector a, Vector b) {
        return a.Ortogonal(b);
    }
    // Verifica la condición |a + b|^2 = |a|^2 + |b|^2
    public static boolean verificarPerpendicularidadD(Vector a, Vector b) {
        return Math.pow(a.suma(b).magnitude(), 2) == Math.pow(a.magnitude(), 2) + Math.pow(b.magnitude(), 2);
    }
    // Verifica si a es paralelo a b (a = rb)
    public static boolean esParalelo(Vector a, Vector b) {
        return a.Paralelos(b);
    }
    public static boolean verificarParalelismoPorCruz(Vector a, Vector b) {
        return a.productovec(b).magnitude() == 0;
    }
    public static Vector proyeccion(Vector a, Vector b) {
        return a.projectorto(b);
    }
    public static double componente(Vector a, Vector b) {
        return a.componentIn(b);
    }
    public static void main(String[] args) {
        Vector a = new Vector(3, 4, 5);
        Vector b = new Vector(6, 8, 10);
        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);
        System.out.println("---------------------------------------------");
        System.out.println("A)|a + b| = |a − b|? " + verificarPerpendicularA(a, b));
        System.out.println("B)|a − b| = |b − a|? " + verificarPerpendicularB(a, b));
        System.out.println("C)a · b = 0? " + esPerpendicular(a, b));
        System.out.println("D)|a + b|^2 = |a|^2 + |b|^2? " + verificarPerpendicularidadD(a, b));
        System.out.println("E)a = rb? " + esParalelo(a, b));
        System.out.println("F)a × b = 0? " + verificarParalelismoPorCruz(a, b));
        System.out.println("G)Proyección de a sobre b: " + proyeccion(a, b));
        System.out.println("H)Componente de a en la dirección de b: " + componente(a, b));
    }
}