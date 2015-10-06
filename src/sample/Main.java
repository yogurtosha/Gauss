package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       /* primaryStage.setTitle("Hi");

        primaryStage.show();*/

        double[][] a = {
                {4,-3, 2, -1, 8},
                {3, -2, 1, -3, 7},
                {5, -3, 1, -8, 1},
                {0, 0, 2, 5, 1}
        };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][0] + "x+" + a[i][1] + "y+" + a[i][2] + "b+" + a[i][3] + "z = " + a[i][4]);
        }
        System.out.println();

        Gauss gauss = new Gauss(a);
       // gauss.calculateMatrix();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
