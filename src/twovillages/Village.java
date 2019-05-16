/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twovillages;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Village class contains multiple houses.
 *  @author Jinkal Dudhat, 000762953
 */
public class Village {
    
    /** x and y coordinates **/
    private double x, y;
    
    /** size of house **/
    private double size = 200;
    
    /** size of the village **/
    private double sum;
    
    /** Color of house **/
    private Color color;
    
    /**name of the village **/
    private String name;
    
    /** house1 of the village **/
    private House house1;
    
    /** house2 of the village **/
    private House house2;
    
    /** house3 of the village **/
    private House house3;
    
    /**
     * 
     * @param name contains name of the village
     * @param x coordinates of the village
     * @param y coordinates of the village
     * @param color of the house
     */
    public Village(String name, int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.name = name;
        
        sum = 40 + (sum*20)/100;
        System.out.printf("sum: %.2f m \n", sum);
        
        /**
         * Create House object house1
         */
        house1 = new House(x, y, size, color);
         /**
         * Create House object house2
         */
        house2  = new House((x + (size + 20)), (y + (size - (size *  0.90))), size * 0.90, color);
         /**
         * Create House object house3
         */
        house3  = new House((x + (size * 2) + 20), (y + (size - (size * 0.80))), size * 0.80, color);
    }
    
    /** Draws door with graphic context 
     @param gc as graphicsContext object.
     **/
    public void draw(GraphicsContext gc) {
        house1.draw(gc);
        house2.draw(gc);
        house3.draw(gc);
        gc.setStroke(Color.ORANGE);
        gc.strokeText(name, x+size, y+size+ 20);
    }
}
