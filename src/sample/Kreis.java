package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Kreis extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {

            Group g= new Group();

            Circle c= new Circle(35,40,20);
            c.setFill(Color.YELLOW);
            g.getChildren().add(c);


            for(int i=0;i<20;i++) {
                Circle 	c_multi = new Circle(17*i,80,20);
                c_multi.setFill(Color.RED);
                g.getChildren().add(c_multi);
            }

            for(int i=0;i<10;i++) {
                Circle 	c_multi2 = new Circle(36*i,120,20);
                c_multi2.setFill(Color.RED);
                g.getChildren().add(c_multi2);
            }


            for(int i=0;i<7;i++) {
                Circle 	c_multi3 = new Circle(40+(i*40),160+(i*30),20);
                c_multi3.setFill(Color.BLACK);
                g.getChildren().add(c_multi3);
            }

            for(int i=0;i<6;i++) {
                Circle 	c_multi4 = new Circle(320-(i*40),160+(i*40),20);
                c_multi4.setFill(Color.BLACK);
                g.getChildren().add(c_multi4);
            }

            for(int i=0;i<5;i++) {
                Circle 	c_multi5 = new Circle(35,200+(i*40),20);
                c_multi5.setFill(Color.GREEN);
                g.getChildren().add(c_multi5);
            }

            Scene s= new Scene(g,350,400);

            primaryStage.setScene(s);
            primaryStage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);

    }
}
