package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse, Point{

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
    
    private float radius;
    private float pointX;
    private float pointY;

    public Circle(float radius, float pointX, float pointY) {
        this.radius = radius;
        this.pointX = pointX;
        this.pointY = pointY;
    }
    
    
    
    public float getLength(){
            return (float)Math.PI*radius*2;
    }
    
    public float getArea(){
            return (float)Math.PI*(float)Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}' + " Площадь круга = " + getArea();
    }

    @Override
    public float getX() {
        return this.pointX;
    }

    @Override
    public float getY() {
        return this.pointX;    
    }
    
    

}
