
public class Cola {
    private long[] arreglo;
    private int inicio;
    private int fin;
    private int n;
    private int cantidadElementos;
    
    public Cola(int n) {
        this.n = n;
        this.arreglo = new long[n];
        this.inicio = 0;
        this.fin = -1;
        this.cantidadElementos = 0;
    }

    public void insert(long e) {
        if (!isFull()) {
            fin = (fin + 1) % n; 
            arreglo[fin] = e;
            cantidadElementos++;
        } else {
            System.out.println("La cola está llena.");
        }
    }

    public long remove() {
        if (!isEmpty()) {
            long elemento = arreglo[inicio];
            inicio = (inicio + 1) % n; 
            cantidadElementos--;
            return elemento;
        } else {
            System.out.println("La cola está vacía.");
            return -1; 
        }
    }

    public long peek() {
        if (!isEmpty()) {
            return arreglo[inicio];
        } else {
            System.out.println("La cola está vacía.");
            return -1; 
        }
    }

    public boolean isEmpty() {
        return cantidadElementos == 0;
    }

    public boolean isFull() {
        return cantidadElementos == n;
    }

    public int size() {
        return cantidadElementos;
    }

    public static void main(String[] args) {
        Cola cola = new Cola(5);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);

        System.out.println("Primer elemento: " + cola.peek()); 
        System.out.println("Elemento eliminado: " + cola.remove()); 
        System.out.println("Primer elemento: " + cola.peek()); 
    }
}
