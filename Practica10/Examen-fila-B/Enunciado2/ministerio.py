class Ministerio:
    def __init__(self, nombre, direccion):
        self.nombre = nombre
        self.direccion = direccion
        self.nroEmpleados = 0
        self.empleados = [['' for _ in range(100)] for _ in range(3)]  # nombre, paterno, materno
        self.edades = [0] * 100
        self.sueldos = [0] * 100
    def agregarEmpleado(self, nombre, paterno, materno, edad, sueldo):
        if self.nroEmpleados >= 100:
            print("No se pueden agregar más empleados.")
            return
        i = self.nroEmpleados
        self.empleados[0][i] = nombre
        self.empleados[1][i] = paterno
        self.empleados[2][i] = materno
        self.edades[i] = edad
        self.sueldos[i] = sueldo
        self.nroEmpleados += 1
    def eliminarEmpleadosEdad(self, edadX):
        nuevos_indices = [i for i in range(self.nroEmpleados) if self.edades[i] != edadX]
        nuevos_empleados = [['' for _ in range(100)] for _ in range(3)]
        nuevas_edades = [0] * 100
        nuevos_sueldos = [0] * 100
        for idx, i in enumerate(nuevos_indices):
            for j in range(3):
                nuevos_empleados[j][idx] = self.empleados[j][i]
            nuevas_edades[idx] = self.edades[i]
            nuevos_sueldos[idx] = self.sueldos[i]

        self.nroEmpleados = len(nuevos_indices)
        self.empleados = nuevos_empleados
        self.edades = nuevas_edades
        self.sueldos = nuevos_sueldos
    def __add__(self, otro):
        # Transfiere el primer empleado del otro ministerio
        nuevo = Ministerio(self.nombre, self.direccion)
        for i in range(self.nroEmpleados):
            nuevo.agregarEmpleado(
                self.empleados[0][i], self.empleados[1][i], self.empleados[2][i],
                self.edades[i], self.sueldos[i]
            )
        if otro.nroEmpleados > 0:
            x = 0
            nuevo.agregarEmpleado(
                otro.empleados[0][x], otro.empleados[1][x], otro.empleados[2][x],
                otro.edades[x], otro.sueldos[x]
            )
        return nuevo
    def mostrar(self, tipo='todos'):
        if self.nroEmpleados == 0:
            print(f"No hay empleados en {self.nombre}")
            return
        if tipo == 'edad':
            menorEdad = min(self.edades[:self.nroEmpleados])
            print(f"\nEmpleados con menor edad en {self.nombre}:")
            for i in range(self.nroEmpleados):
                if self.edades[i] == menorEdad:
                    print(f"{self.empleados[0][i]} {self.empleados[1][i]} {self.empleados[2][i]} - Edad: {self.edades[i]}")
        elif tipo == 'sueldo':
            menorSueldo = min(self.sueldos[:self.nroEmpleados])
            print(f"\nEmpleados con menor sueldo en {self.nombre}:")
            for i in range(self.nroEmpleados):
                if self.sueldos[i] == menorSueldo:
                    print(f"{self.empleados[0][i]} {self.empleados[1][i]} {self.empleados[2][i]} - Sueldo: {self.sueldos[i]}")
        else:
            print(f"\nLista de empleados en {self.nombre}:")
            for i in range(self.nroEmpleados):
                print(f"{self.empleados[0][i]} {self.empleados[1][i]} {self.empleados[2][i]} - Edad: {self.edades[i]}, Sueldo: {self.sueldos[i]}")

def main():
    # a) Instanciar 2 objetos Ministerio de diferente forma
    m1 = Ministerio("Ministerio de Salud", "Av. Saavedra")
    m2 = Ministerio(nombre="Ministerio de Educación", direccion="Av. Arce")
    # Agregamos empleados a ambos ministerios
    m1.agregarEmpleado("Luis", "Perez", "Lopez", 35, 4000)
    m1.agregarEmpleado("Ana", "Gomez", "Quispe", 28, 3000)
    m1.agregarEmpleado("Carlos", "Mamani", "Choque", 28, 5000)
    m2.agregarEmpleado("Maria", "Lopez", "Vargas", 30, 2500)
    m2.agregarEmpleado("Juan", "Perez", "Huanca", 28, 2000)
    # Mostrar ambos ministerios antes de hacer operaciones
    print("--- a) Mostrar empleados de ambos ministerios ---")
    m1.mostrar()
    m2.mostrar()
    # b) Eliminar empleados con edad 28 en m1
    print("\n--- b) Eliminando empleados con edad 28 del Ministerio 1 ---")
    m1.eliminarEmpleadosEdad(28)
    m1.mostrar()
    # c) Transferir un empleado de m2 a m1 usando sobrecarga de operador +
    print("\n--- c) Fusionando ministerios (transfiriendo 1er empleado de m2 a m1) ---")
    m3 = m1 + m2
    m3.mostrar()
    # d.1) Mostrar empleados con menor edad
    print("\n--- d.1) Empleado(s) con menor edad en m3 ---")
    m3.mostrar(tipo="edad")
    # d.2) Mostrar empleados con menor sueldo
    print("\n--- d.2) Empleado(s) con menor sueldo en m3 ---")
    m3.mostrar(tipo="sueldo")
main()
