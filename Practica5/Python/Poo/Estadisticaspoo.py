import math

class Estadisticas:
    def __init__(self, datos):
        if len(datos) != 10:
            raise ValueError("Se requieren 10 números.")
        self.datos = datos
    def promedio(self):
        return sum(self.datos) / len(self.datos)
    def desviacion(self):
        prom = self.promedio()
        suma_cuadrados = sum((x - prom) ** 2 for x in self.datos)
        return math.sqrt(suma_cuadrados / (len(self.datos) - 1))
def obtener_datos():
    while True:
        try:
            numeros = list(map(float, input("Ingrese 10 números: ").split()))
            return Estadisticas(numeros)  # Retorna un objeto de la clase Estadisticas
        except ValueError as e:
            print(f"Error: {e}. Intente nuevamente.")
def main():
    estadisticas = obtener_datos()
    print(f"El promedio es {estadisticas.promedio():.2f}")
    print(f"La desviación estándar es {estadisticas.desviacion():.5f}")

if __name__ == "__main__":
    main()
