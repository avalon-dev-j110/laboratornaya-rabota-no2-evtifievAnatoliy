package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private float sideA;
    private float sideB;
    private float sideC;
    private float halfPerimetr;
    private ClassPoint pointA;
    private ClassPoint pointB;
    private ClassPoint pointC;
    

    public Triangle(ClassPoint pointA, ClassPoint pointB, ClassPoint pointC) {
        this.sideA = (float)Math.sqrt(Math.pow((pointC.getX()-pointA.getX()), 2)+Math.pow((pointC.getY()-pointA.getY()),2));
        this.sideB = (float)Math.sqrt(Math.pow((pointB.getX()-pointA.getX()), 2)+Math.pow((pointB.getY()-pointA.getY()),2));
        this.sideC = (float)Math.sqrt(Math.pow((pointC.getX()-pointB.getX()), 2)+Math.pow((pointC.getY()-pointB.getY()),2));
        halfPerimetr = getPerimeter()/2;
    }
     
    
    public float getPerimeter(){
        return (float)Math.abs(sideA + sideB + sideC);
    }
    
    public float getArea(){
        return (float)Math.sqrt(halfPerimetr*(halfPerimetr - sideA)*(halfPerimetr - sideB)*(halfPerimetr - sideC));
        
    }

    @Override
    public String toString() {
        return "Triangle{" + "sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + '}' + " Площадь треугольника = " + getArea();
    }
    
}
