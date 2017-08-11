/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.makesystem.commons.util;

/**
 *
 * @author Richeli Vargas
 */
public class CalcPosition {

    public static Point[] getPoints(final Point center, final int radius, final int numOfPoints, final double degrees) {
        
        final Point[] ponts = new Point[numOfPoints];
        
        for (int i = 0; i < numOfPoints; i++) {
            
            final double angle = i * (degrees / (numOfPoints - 1));

            final Point point = new Point();
            point.setX(center.getX() + radius * Math.cos(Math.toRadians(angle)));
            point.setY(center.getY() + radius * Math.sin(Math.toRadians(angle)));
            
            ponts[i] = point;
        }
        
        return ponts;

    }
}
