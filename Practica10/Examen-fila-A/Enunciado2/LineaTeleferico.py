class LineaTeleferico:
    def __init__(self, color, tramo, nroCabinas, empleados, edades, sueldos):
        self.color = color
        self.tramo = tramo
        self.nroCabinas = nroCabinas
        self.nroEmpleados = len(empleados)
        self.empleados = empleados 
        self.edades = edades        
        self.sueldos = sueldos      
    # b)Eliminar a los empleados con apellido X, paterno o materno
    def eliminar_apellido(self, apellido):
        nuevos_empleados = []
        nuevas_edades = []
        nuevos_sueldos = []
        for i in range(self.nroEmpleados):
            if self.empleados[i][1] != apellido and self.empleados[i][2] != apellido:
                nuevos_empleados.append(self.empleados[i])
                nuevas_edades.append(self.edades[i])
                nuevos_sueldos.append(self.sueldos[i])
        self.empleados = nuevos_empleados
        self.edades = nuevas_edades
        self.sueldos = nuevos_sueldos
        self.nroEmpleados = len(self.empleados)
    # c)Sobrecargar un operador para transferir empleado X al segundo objeto
    def __add__(self, otro):
        if self.nroEmpleados > 0:
            empleado = self.empleados.pop()
            edad = self.edades.pop()
            sueldo = self.sueldos.pop()
            self.nroEmpleados -= 1
            otro.empleados.append(empleado)
            otro.edades.append(edad)
            otro.sueldos.append(sueldo)
            otro.nroEmpleados += 1
        return otro
    # d1) Mostrar a los empleados con la mayor edad
    def mostrar_empleado_mayor_edad(self):
        if not self.edades:
            return
        mayor_edad = max(self.edades)
        print("Empleados con la mayor edad:")
        for i in range(self.nroEmpleados):
            if self.edades[i] == mayor_edad:
                print(self.empleados[i], "Edad:", self.edades[i])
    # d2) Mostrar a los empleados con el mayor sueldo
    def mostrar_empleado_mayor_sueldo(self):
        if not self.sueldos:
            return
        mayor_sueldo = max(self.sueldos)
        print("Empleados con el mayor sueldo:")
        for i in range(self.nroEmpleados):
            if self.sueldos[i] == mayor_sueldo:
                print(self.empleados[i], "Sueldo:", self.sueldos[i])
# a)Instanciar 2 objetos LineaTeleferico de diferente forma
# Forma 1
empleados1 = [["Pedro", "Rojas", "Luna"],
              ["Lucy", "Sosa", "Rios"],
              ["Ana", "Perez", "Rojas"],
              ["Saul", "Arce", "Calle"]]
edades1 = [35, 43, 26, 29]
sueldos1 = [2500, 3250, 2700, 2500]
linea1 = LineaTeleferico("Rojo", "Estación Central, Estación Cementerio, Estación 16 de Julio", 20, empleados1, edades1, sueldos1)
# Forma 2
linea2 = LineaTeleferico("Azul", "Estación A, Estación B", 15, [], [], [])
# Pruebas
print("Antes de eliminar:")
for e in linea1.empleados:
    print(e)
# b) Eliminar empleados con apellido "Rojas"
linea1.eliminar_apellido("Rojas")
print("\nDespués de eliminar apellido 'Rojas':")
for e in linea1.empleados:
    print(e)
# c) Transferir último empleado de linea1 a linea2
linea2 = linea1 + linea2
print("\nDespués de transferir último empleado a linea2:")
print("Linea 1 empleados:")
for e in linea1.empleados:
    print(e)
print("Linea 2 empleados:")
for e in linea2.empleados:
    print(e)
# d) Mostrar empleados con mayor edad
print()
linea1.mostrar_empleado_mayor_edad()
# d) Mostrar empleados con mayor sueldo
print()
linea1.mostrar_empleado_mayor_sueldo()