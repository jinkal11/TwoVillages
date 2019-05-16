/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twovillages;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Jinkal Dudhat, 000762953
 */
public class TwoVillages extends Application{

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        final int CANVAS_WIDTH = 1000;
        final int CANVAS_HEIGHT = 700;
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT); // Set canvas Size in Pixels
        stage.setTitle("FXGraphicsTemplate"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE 
        gc.setFill(Color.BLACK);  //set canvas color
        gc.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
        gc.setFill(Color.GOLD); //King's house color
        gc.fillRect(780, 300, 200, 200); 
        Door d1= new Door(880, 400, 100); //create door of the king's house
        Window w1= new Window(805, 325, 50); //create window of the king's house
        d1.draw(gc);
        w1.draw(gc);
        Random rand= new Random();
        int x= rand.nextInt();
        int y= rand.nextInt();
        
        Village v1 = new Village("Village 1", 100, 400, Color.YELLOW); //create v1 object of village
        v1.draw(gc); //Draw village
        Village v2 = new Village("Village 2", 100, 120, Color.BLUE); //create v2 object of village 
        v2.draw(gc); //Draw village
        
        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
