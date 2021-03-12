package Homework.Homework6;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.util.Random;

public class SuperSnowman extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private int maximumRadius;
    private int minimumRadius;
    private int quantity;
    int a = 200;
    int b = 200;
    int temp = 0;

    public Color random() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        float y = rand.nextFloat();
        Color randomColor = new Color(r, g, b, y);
        return randomColor;
    }

    public void circles(final Pane root) throws InterruptedException {

        Text text = new Text("Enter max Radius");
        text.setTranslateX(10);
        text.setTranslateY(10);
        root.getChildren().addAll(text);
        final TextField fieldMax = new TextField("1");
        fieldMax.setTranslateX(20);
        fieldMax.setTranslateY(20);
        javafx.scene.control.Button button = new Button("Enter");
        button.setTranslateX(200);
        button.setTranslateY(20);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                maximumRadius = Integer.parseInt(fieldMax.getText());
                System.out.println("maximumRadius = " + maximumRadius);

            }
        });
        root.getChildren().addAll(fieldMax, button);
        Text text2 = new Text("Enter min Radius");
        text2.setTranslateX(10);
        text2.setTranslateY(60);
        root.getChildren().addAll(text2);
        final TextField fieldMin = new TextField("1");
        fieldMin.setTranslateX(20);
        fieldMin.setTranslateY(70);
        javafx.scene.control.Button button2 = new Button("Enter");
        button2.setTranslateX(200);
        button2.setTranslateY(70);
        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                minimumRadius = Integer.parseInt(fieldMin.getText());
                System.out.println("minimumRadius = " + minimumRadius);

            }
        });
        root.getChildren().addAll(fieldMin, button2);
        Text text3 = new Text("Enter quantity");
        text3.setTranslateX(10);
        text3.setTranslateY(110);
        root.getChildren().addAll(text3);
        final TextField fieldQuantity = new TextField("1");
        fieldQuantity.setTranslateX(20);
        fieldQuantity.setTranslateY(120);
        javafx.scene.control.Button button3 = new Button("Enter");
        button3.setTranslateX(200);
        button3.setTranslateY(120);
        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                quantity = Integer.parseInt(fieldQuantity.getText());
                System.out.println("quant = " + quantity);
            }
        });
        root.getChildren().addAll(fieldQuantity, button3);
        javafx.scene.control.Button button4 = new Button("DRAW");
        button4.setTranslateX(200);
        button4.setTranslateY(150);
        button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                drawSnowman(root, a, b, temp);
            }
        });
        root.getChildren().addAll(button4);
    }

    private void drawSnowman(Pane root, int a, int b, int temp) {
        for (int q = quantity; q > 0; q--) {
            int r = (int) ((Math.random() * (maximumRadius - minimumRadius)) + minimumRadius);
            b += r + temp;
            final Circle circle = new Circle(a, b, r);
            circle.setFill(random());
            circle.setStroke(random());
            circle.setStrokeWidth(2.0);
            root.getChildren().addAll(circle);
            temp = r;
            if (q == quantity) {
                int r1 = (int) ((Math.random() * (r / 4 - 1)) + 1);
                int r2 = (int) ((Math.random() * (r / 4 - 1)) + 1);
                int r3 = (int) ((Math.random() * (r / 4 - 1)) + 1);
                int a2 = a + (r / 2);
                int a1 = a - (r / 2);
                int b1 = b - (r / 2);
                Circle circle2 = new Circle(a, b, r1);
                circle2.setFill(random());
                circle2.setStroke(random());
                Circle circle3 = new Circle(a1, b1, r2);
                circle3.setFill(random());
                circle3.setStroke(random());
                Circle circle4 = new Circle(a2, b1, r3);
                circle4.setFill(random());
                circle4.setStroke(random());
                root.getChildren().addAll(circle2, circle3, circle4);
                javafx.scene.control.Button button5 = new Button("RED");
                button5.setTranslateX(400);
                button5.setTranslateY(10);
                button5.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        for (int q = 1; q < quantity; q++) {
                            circle.setFill(Color.RED);
                            circle.setStroke(Color.RED);
                        }
                    }
                });
                root.getChildren().addAll(button5);
            }
        }
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

