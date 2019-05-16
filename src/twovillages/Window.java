/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twovillages;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class generate Window for the house.
 *  @author Jinkal Dudhat, 000762953
 */
public class Window {
    /** x, y and diameter for oval**/
      private double x, y, diameter;
    
     /** Create constructor Door with parameters 
     @param x is x-coordinate of rectangle
     * @param y is y-coordinate of rectangle
     * @param diameter is height of the rectangle.
     **/
    public Window(double x, double y, double diameter){
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }
    
     /** Draws door with graphic context 
     @param gc as graphicsContext object.
     **/
    public void draw(GraphicsContext gc){
        gc.setFill(Color.BROWN);
        gc.fillOval(x, y, diameter, diameter);
    }
}
