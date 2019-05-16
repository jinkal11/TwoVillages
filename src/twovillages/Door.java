/*
 
 */
package twovillages;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class draws the Door of the house.
 * @author Jinkal Dudhat, student no: 000762953
 */
public class Door {
    /** x, y and height for rectangle**/
    private double x, y, height;
    
    /** Create constructor Door with parameters 
     @param x is x-coordinate of rectangle
     * @param y is y-coordinate of rectangle
     * @param height is height of the rectangle.
     **/
    public Door(double x, double y, double height){
        this.x = x;
        this.y = y;
        this.height = height;
    }
    
    /** Draws door with graphic context 
     @param gc as graphicsContext object.
     **/
    public void draw(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.fillRect(x, y, height/2, height);
    }
}
