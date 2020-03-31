package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.*;  //незабудь убрать

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = null;

        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
        
        Circle circle = new Circle (3);
        System.out.println("Периметр: " + circle.getLength());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Поворот: " + circle.getRotation());
        Rectangle rectangle = new Rectangle (2, 4);
        System.out.println("Периметр: " + rectangle.getPerimeter());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Поворот: " + rectangle.getRotation());
        Triangle triangle = new Triangle (2, 3, 2);
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Поворот: " + triangle.getRotation());
        
    }
}
