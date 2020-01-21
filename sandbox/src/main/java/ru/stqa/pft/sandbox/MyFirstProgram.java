package ru.stqa.pft.sandbox;

import static ru.stqa.pft.sandbox.Point.distance;

public class MyFirstProgram {
    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 5);
        System.out.println("Площадь прямоугольника " + r.a + " на " + r.b + " = " + r.area());

        Point p1 = new Point(2, 4);
        Point p2 = new Point(-1, 10);
        System.out.println("Расстояние между точками р1 (" + p1.x + "; " + p1.y + ") и p2 (" + p2.x + "; " + p2.y + ") = " + distance(p1, p2));
    }

}
