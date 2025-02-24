import math
import turtle

class Punto:
    def __init__(self, x, y):
        self.__x = float(x)
        self.__y = float(y)

    def coord_cartesianas(self):
        return f"({self.__x}, {self.__y})"

    def coord_polares(self):
        r = math.sqrt(self.__x**2 + self.__y**2)
        theta = math.degrees(math.atan2(self.__y, self.__x))
        return f"(r: {r}, θ: {theta}°)"

    def __str__(self):
        return f"Punto: {self.coord_cartesianas()}"

    def _x(self):
        return self.__x

    def _y(self):
        return self.__y
class Linea:
    def __init__(self, p1, p2):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Linea: desde {self.p1.coord_cartesianas()} hasta {self.p2.coord_cartesianas()}"

    def dibuja_linea(self, turtle_obj):
        old_x, old_y = turtle_obj.position()
        old_heading = turtle_obj.heading()

        turtle_obj.penup()
        turtle_obj.goto(self.p1._x(), self.p1._y())
        turtle_obj.pendown()
        turtle_obj.goto(self.p2._x(), self.p2._y())

        turtle_obj.penup()
        turtle_obj.goto(old_x, old_y)
        turtle_obj.setheading(old_heading)

class Circulo:
    def __init__(self, centro, radio):
        self.centro = centro
        self.radio = float(radio)

    def __str__(self):
        return f"Circulo: centro={self.centro.coord_cartesianas()}, radio={self.radio}"

    def dibuja_circulo(self, turtle_obj):
        old_x, old_y = turtle_obj.position()
        old_heading = turtle_obj.heading()

        turtle_obj.penup()
        turtle_obj.goto(self.centro._x(), self.centro._y() - self.radio)
        turtle_obj.setheading(0)
        turtle_obj.pendown()
        turtle_obj.circle(self.radio)

        turtle_obj.penup()
        turtle_obj.goto(old_x, old_y)
        turtle_obj.setheading(old_heading)
def main():
    pantalla = turtle.Screen()
    pantalla.title("Ejemplo sin carpeta")
    pantalla.setup(width=800, height=600)

    t = turtle.Turtle()
    t.speed(0)
    circulo = Circulo(Punto(0, 0), 100)
    linea = Linea(Punto(-100, 0), Punto(100, 0))

    circulo.dibuja_circulo(t)
    linea.dibuja_linea(t)

    pantalla.mainloop()

if __name__ == "__main__":
    main()
