package homework.homework6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import java.util.Scanner;

import static javafx.application.Application.launch;

public class Star extends Application {
    Scanner scanner = new Scanner(System.in);
    double x;
    double y;
    double r;
    double p;

    public static void main(String[] args) {
        launch(args);
    }

    public void star(final Pane root) {
        System.out.println("Enter X");
        x = scanner.nextInt();
        System.out.println("Enter Y");
        y = scanner.nextInt();
        System.out.println("Enter radius");
        r = scanner.nextInt();
        p = r / 2.5;
        Polyline star = new Polyline();
        star.getPoints().addAll(new Double[]{
                x, y - r,
                x - (r / 8 * 1.8), y - (r / 8 * 2.6),
                x - r, y - (r / 8 * 2.6),
                x - (r / 8 * 3), y + (r / 8),
                x - (r / 1.6), y + (p * 2),
                x, y + p,
                x + (r / 1.6), y + (p * 2),
                x + (r / 8 * 3), y + (r / 8),
                x + r, y - (r / 8 * 2.6),
                x + (r / 8 * 1.8), y - (r / 8 * 2.6),
                x, y - r
        });
        root.getChildren().addAll(star);
    }

    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        star(root);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }
}
