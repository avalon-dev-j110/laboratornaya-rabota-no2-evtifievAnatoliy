package ru.avalon.java.dev.j10.labs;

//import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.*;  

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle (5);
        shapes[1] = new Circle (2);
        shapes[2] = new Circle ((float)3.5);
        shapes[3] = new Rectangle (10, 9);
        shapes[4] = new Rectangle (2, 5);
        shapes[5] = new Rectangle (3, 4);
        shapes[6] = new Triangle (2, 3, 2);
        shapes[7] = new Triangle (2, 3, 2);
        shapes[8] = new Triangle (1, (float) 2.5, 2);
        shapes[9] = new Triangle (14, 20, 11);
        
        
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
        
        for (int i=1 ; i<=10; i++)
            System.out.println("Площадь фигуры " + i + " = "  + shapes[i-1].getArea());
        
        //System.out.println("Площадь самой большой фигуры = "  + MaxAreaShape(shapes).getArea());
        System.out.println("Самая большая фигура: " + MaxAreaShape(shapes).toString());
        
    }
    public static Shape MaxAreaShape (Shape[] shapes){
        Shape maxAreaShape = shapes[0];
        //for (Shape item : shapes)
        for (int i =0; i<shapes.length-1; i++)
        {
            if (maxAreaShape.getArea() < shapes[i+1].getArea())
                maxAreaShape = shapes[i+1];
        }
        
        return maxAreaShape;
    }
}
