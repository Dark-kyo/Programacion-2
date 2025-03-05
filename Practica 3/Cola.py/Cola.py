class Cola:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.inicio = 0
        self.fin = -1
        self.cantidadElementos = 0

    def insert(self, e):
        if not self.isFull():
            self.fin = (self.fin + 1) % self.n  
            self.arreglo[self.fin] = e
            self.cantidadElementos += 1
        else:
            print("La cola está llena.")

    def remove(self):
        if not self.isEmpty():
            elemento = self.arreglo[self.inicio]
            self.inicio = (self.inicio + 1) % self.n 
            self.cantidadElementos -= 1
            return elemento
        else:
            print("La cola está vacía.")
            return None

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.inicio]
        else:
            print("La cola está vacía.")
            return None

    def isEmpty(self):
        return self.cantidadElementos == 0

    def isFull(self):
        return self.cantidadElementos == self.n

    def size(self):
        return self.cantidadElementos

if __name__ == "__main__":
    cola = Cola(5)
    cola.insert(10)
    cola.insert(20)
    cola.insert(30)

    print("Primer elemento:", cola.peek())  
    print("Elemento eliminado:", cola.remove())  
    print("Primer elemento:", cola.peek())  
