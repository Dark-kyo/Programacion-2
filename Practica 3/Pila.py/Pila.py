class Pila:
    def __init__(self, n):
        self.n = n
        self.arreglo = [0] * n
        self.top = -1

    def push(self, e):
        if not self.isFull():
            self.top += 1
            self.arreglo[self.top] = e
        else:
            print("La pila está llena.")

    def pop(self):
        if not self.isEmpty():
            elemento = self.arreglo[self.top]
            self.top -= 1
            return elemento
        else:
            print("La pila está vacía.")
            return None

    def peek(self):
        if not self.isEmpty():
            return self.arreglo[self.top]
        else:
            print("La pila está vacía.")
            return None

    def isEmpty(self):
        return self.top == -1

    def isFull(self):
        return self.top == self.n - 1

if __name__ == "__main__":
    pila = Pila(5)
    pila.push(10)
    pila.push(20)
    pila.push(30)

    print("Elemento superior:", pila.peek()) 
    print("Elemento eliminado:", pila.pop())  
    print("Elemento superior:", pila.peek())  
