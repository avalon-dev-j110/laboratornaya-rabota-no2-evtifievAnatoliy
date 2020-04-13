/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.dev.j10.labs.shapes;

/**
 *
 * @author user
 */
public class ClassPoint implements Point{

    private float pointX;
    private float pointY;

    public ClassPoint(float pointX, float pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    
        
    @Override
    public float getX() {
        return pointX;
    }

    @Override
    public float getY() {
        return pointY;
    }
    
}
