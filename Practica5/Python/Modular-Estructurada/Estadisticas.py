import math

def obtener_datos():
    while True:
        try:
            numeros = list(map(float, input("Ingrese 10 números: ").split()))
            if len(numeros) != 10:
                raise ValueError("Debe ingresar exactamente 10 números.")
            return numeros
        except ValueError as e:
            print(f"Error: {e}. Intente nuevamente.")
def promedio(numeros):
    return sum(numeros) / len(numeros)
def desviacion(numeros):
    prom = promedio(numeros)
    suma_cuadrados = sum((x - prom) ** 2 for x in numeros)
    return math.sqrt(suma_cuadrados / (len(numeros) - 1))
def main():
    numeros = obtener_datos()
    prom = promedio(numeros)
    desv = desviacion(numeros)
    print(f"El promedio es {prom:.2f}")
    print(f"La desviación estándar es {desv:.5f}")

if __name__ == "__main__":
    main()
