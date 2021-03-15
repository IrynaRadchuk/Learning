package lessons.lesson6;

import lessons.lesson4.Recursion;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FXMainAdvanced extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private void calcFact(int n, Pane scrollRoot) {
        scrollRoot.getChildren().clear();
        for (int i = 0; i < n; i++) {
            int x = i + 1;
            int fact = Recursion.fact(x);
            Text text = new Text("Факториал от " + x + " = " + fact);
            text.setTranslateX(10);
            text.setTranslateY(100 + 30 * i);
            scrollRoot.getChildren().addAll(text);
        }
    }

    public void initViews(final Pane root) {
        Circle circle = new Circle(200, 200, 100);
        circle.setFill(Paint.valueOf("#ff0980"));
        root.getChildren().addAll(circle);
        final TextField input = new TextField("10");
        input.setTranslateX(10);
        input.setTranslateY(10);
        HBox hBox = new HBox();
        ScrollPane scrollPane = new ScrollPane(hBox);
        scrollPane.setFitToHeight(true);
        final BorderPane borderPane = new BorderPane(hBox);
        borderPane.setTranslateX(10);
        borderPane.setTranslateY(60);
        Button button = new Button("Count!");
        button.setTranslateX(200);
        button.setTranslateY(10);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                int n = Integer.parseInt(input.getText());
                calcFact(n, borderPane);
            }
        });
        root.getChildren().addAll(input, button, borderPane);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        initViews(root);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }
}

