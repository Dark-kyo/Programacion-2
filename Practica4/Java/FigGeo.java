package practica4;

public class FigGeo {
	
    double area(double radio) {
        return Math.PI * radio * radio;
    }
    double area(double base, double altura) {
        return base * altura;
    }
    double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    double area(double baseMenor, double baseMayor, double altura) {
        return ((baseMenor + baseMayor) * altura) / 2;
    }
    double areaPentagono(double perimetro, double apotema) {
        return (perimetro * apotema) / 2;
    }
    public static void main(String[] args) {
        FigGeo f1 = new FigGeo();
        FigGeo f2 = new FigGeo();
        FigGeo f3 = new FigGeo();
        FigGeo f4 = new FigGeo();
        FigGeo f5 = new FigGeo();
        System.out.println("YOSTI ALEXIS ALEJO CONDORI");
        System.out.println("PRACTICA 4: FIGURAS GEOMETRICAS");
        System.out.println("Círculo: " + f1.area(4));
        System.out.println("Rectángulo: " + f2.area(3, 4));
        System.out.println("Triángulo Rectángulo: " + f3.areaTriangulo(5, 6));
        System.out.println("Trapecio: " + f4.area(3, 5, 4));
        System.out.println("Pentágono: " + f5.areaPentagono(10, 7));
    }
}

