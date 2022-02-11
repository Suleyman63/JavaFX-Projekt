package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Flagge extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {

            Group g= new Group();

            for(int i=0;i<3;i++) {
               Rectangle r = new Rectangle();
               r.setX(0);
               r.setY(i*100);
               r.setWidth(400);
               r.setHeight(100);

               if(i==0){
                   r.setFill(Color.BLACK);

               }else if(i==1){
                   r.setFill(Color.RED);
               }else{
                   r.setFill(Color.GOLD);
               }
                g.getChildren().add(r);
            }

            Scene s= new Scene(g,400,300);

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

