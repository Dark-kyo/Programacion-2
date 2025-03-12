class FiguraGeometrica:
    def area(self, *args):
        if len(args) == 1:  # Círculo
            radio = args[0]
            return 3.1416 * radio * radio
        elif len(args) == 2:  # Rectángulo
            base, altura = args
            return base * altura
        elif len(args) == 3 and isinstance(args[2], bool) and args[2]:  # Triángulo Rectángulo
            base, altura, _ = args
            return (base * altura) / 2
        elif len(args) == 3:  # Trapecio
            base_menor, base_mayor, altura = args
            return ((base_menor + base_mayor) * altura) / 2
        elif len(args) == 2 and isinstance(args[1], float):  # Pentágono
            perimetro, apotema = args
            return (perimetro * apotema) / 2
        else:
            return "Parámetros incorrectos"
f1 = FiguraGeometrica()
f2 = FiguraGeometrica()
f3 = FiguraGeometrica()
f4 = FiguraGeometrica()
f5 = FiguraGeometrica()
print("Yosti Alexis Alejo Condori")
print("Pracitca 4 Figuras Geometricas")
print("Círculo:", f1.area(3))
print("Rectángulo:", f2.area(3, 4))
print("Triángulo Rectángulo:", f3.area(5, 6, True))  # Se añade True para diferenciarlo
print("Trapecio:", f4.area(3, 5, 4))
print("Pentágono:", f5.area(10, 7.0))