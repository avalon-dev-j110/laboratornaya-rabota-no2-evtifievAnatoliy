package ru.avalon.java.dev.j10.labs;

//import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.*;  

public class Main {

    public static void main(String[] args) {
    //    Shape[] shapes = null;
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle (5, new ClassPoint(0,0));
        shapes[1] = new Circle (2, new ClassPoint(0,0));
        shapes[2] = new Circle ((float)3.5, new ClassPoint(0,0));
        shapes[3] = new Rectangle (new ClassPoint(0,0), new ClassPoint(0,5));
        shapes[4] = new Rectangle (new ClassPoint(10,5), new ClassPoint(1,10));
        shapes[5] = new Rectangle (new ClassPoint(0,1), new ClassPoint(10,9));
        shapes[6] = new Triangle (new ClassPoint(0,0), new ClassPoint(0,5), new ClassPoint(5,0));
        shapes[7] = new Triangle (new ClassPoint(15,0), new ClassPoint(7,5), new ClassPoint(5,1));
        shapes[8] = new Triangle (new ClassPoint(20,-1), new ClassPoint(1,5), new ClassPoint(1,18));
        shapes[9] = new Triangle (new ClassPoint(6,-10), new ClassPoint(18,1), new ClassPoint(5,1));
        
        
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
        /*
        for (int i=1 ; i<=10; i++)
            System.out.println("Площадь фигуры " + i + " = "  + shapes[i-1].getArea());
        */
        //System.out.println("Площадь самой большой фигуры = "  + MaxAreaShape(shapes).getArea());
        System.out.println("Самая большая фигура: " + maxAreaShape(shapes));
        
    }
    public static Shape maxAreaShape (Shape[] shapes){
        
        //for (Shape item : shapes)
        if (shapes != null && shapes.length !=0)
        {
            Shape maxAreaShape = shapes[0];
            if (shapes.length > 1)
                for (int i =0; i<shapes.length-1; i++)
                    if (maxAreaShape.getArea() < shapes[i+1].getArea())
                        maxAreaShape = shapes[i+1];
            return maxAreaShape;
            
        }
        else
            return null;
        
    }
}
