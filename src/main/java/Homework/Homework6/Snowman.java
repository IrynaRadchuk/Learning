package Homework.Homework6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

import java.util.Scanner;

public class Snowman extends Application {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        launch(args);
    }
    public Color random () {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        float y = rand.nextFloat();
        Color randomColor = new Color(r,g,b,y);
        return randomColor;
    }

    public void circles(final Pane root) {
        int a = 200;
        int b = 20;
        int temp = 0;
        System.out.println("Enter min Radius");
        int min = scanner.nextInt();
        System.out.println("Enter max Radius");
        int max = scanner.nextInt();
        System.out.println("Enter quantity");
        int quant = scanner.nextInt();
        for (int q = quant; q > 0; q--) {
            int r = (int) ((Math.random() * (max - min)) + min);
            b += r + temp;
            Circle circle = new Circle(a, b, r);
            circle.setFill(random());
            circle.setStroke(random());
            circle.setStrokeWidth(2.0);
            root.getChildren().addAll(circle);
            temp = r;
            if (q == quant) {
                eyesAndNose(root, a, b, r);

            }
            }
        }

    private void eyesAndNose(Pane root, int a, int b, int r) {
        int r1 = (int) ((Math.random() * (r/4 - 1)) + 1);
        int r2 = (int) ((Math.random() * (r/4 - 1)) + 1);
        int r3 = (int) ((Math.random() * (r/4 - 1)) + 1);
        int a2 = a + (r/2);
        int a1 = a - (r/2);
        int b1 = b - (r/2);
        Circle circle2 = new Circle(a, b, r1);
        circle2.setFill(random());
        circle2.setStroke(random());
        Circle circle3 = new Circle(a1, b1, r2);
        circle3.setFill(random());
        circle3.setStroke(random());
        Circle circle4 = new Circle(a2, b1, r3);
        circle4.setFill(random());
        circle4.setStroke(random());
        root.getChildren().addAll(circle2,circle3,circle4);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        circles(root);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }
}
