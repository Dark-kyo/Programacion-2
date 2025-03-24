import java.util.Scanner;

class EcuacionCuadratica {
    private float a, b, c;
    public EcuacionCuadratica(float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public float getDiscriminante() {
        return (b*b)-(4*a*c);
    }
    public Float getRaiz1() {
        float discriminante = getDiscriminante();
        if (discriminante<0){
        	return null;
        }
        return (-b+(float)Math.sqrt(discriminante))/(2*a);
    }
    public Float getRaiz2() {
        float discriminante = getDiscriminante();
        if (discriminante<0){
        	return null; 
        }
        return (-b-(float) Math.sqrt(discriminante))/(2*a);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los valores de a, b y c: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        Float raiz1 = ecuacion.getRaiz1();
        Float raiz2 = ecuacion.getRaiz2();
        if (raiz1 == null) {
            System.out.println("La ecuación no tiene raíces reales.");
        } else if (raiz1.equals(raiz2)) {
            System.out.printf("La ecuación tiene una raíz: %.5f%n", raiz1);
        } else {
            System.out.printf("La ecuación tiene dos raíces: %.5f y %.5f%n", raiz1, raiz2);
        }
        scanner.close();
    }
}
