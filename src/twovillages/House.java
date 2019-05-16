/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twovillages;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This House class associated with Door and Window.
 *  @author Jinkal Dudhat, 000762953
 */
public class House {
     /** x, y and size for rectangle**/
    private double x, y, size;
    
    /**occupants, color, door and window for house **/
    private int occupants;
    private Color color;
    private Door door;
    private Window window;
    
     /** Create constructor Door with parameters 
     @param x is x-coordinate of rectangle
     * @param y is y-coordinate of rectangle
     * @param size is size of the house.
     * @param color contains the color for the house.
     **/
    public House(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
        window = new Window(x + (size/8) , y + (size/8), size/4);
        door = new Door(x + (size / 2), y + (size/2), size/2);
    }
    
    /** 
     * 
     * @param x is x-coordinate of the house
     * @param y is y-coordinate of the house
     */
     public House(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /** 
     * @return the size of the house     
     **/
    public double getSize() {
        return size;
    }

    /** 
     * @return the occupants in the house     
     **/
    public int getOccupants() {
        return occupants;
    }

     /**
     * Create new occupants.
     *
     * @param occupants contain number of occupants in the house
      *
     */
    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }
     
     /** Draws door with graphic context 
     @param gc as graphicsContext object.
     * draw door and window in House.
     **/
     public void draw(GraphicsContext gc){
        gc.setFill( color );
        gc.fillRect(x, y, size, size);
        door.draw(gc);
        window.draw(gc);
    }
     
}
