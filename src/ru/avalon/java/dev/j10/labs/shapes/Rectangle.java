package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon{

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    private float sideA;
    private float sideB;
    private ClassPoint pointA;
    private ClassPoint pointC;

    public Rectangle(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(ClassPoint pointA, ClassPoint pointC) {
        this.sideA = pointC.getX() - pointA.getX();
        this.sideB = pointC.getY() - pointA.getY();
        if (this.sideA <0 )
            this.sideA = -this.sideA;
        if (this.sideB <0 )
            this.sideB = -this.sideB;
    }
    
    
    
    public float getPerimeter(){
        return (float)Math.abs(sideA + sideB)*2;
    }
    
    public float getArea(){
        return (float)Math.abs(sideA*sideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "sideA=" + sideA + ", sideB=" + sideB + '}' + " Площадь прямоугольника = " + getArea();
    }
    
}
