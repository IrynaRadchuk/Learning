package Questions.Questions6;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

    public class FXExamples extends Application {
        public static void main(String[] args) {
            launch(args);
        }
        private int clickCounter = 0;
        private void initButtons(Pane root) {
            final Button button1 = new Button("DO IT!");
            button1.setTranslateX(50);
            button1.setTranslateY(10);
            button1.setOnMouseClicked(event -> {
                button1.setText("Click " + ++clickCounter);
            });
            button1.setOnMouseEntered(event -> button1.setText("NO"));
            button1.setOnMouseExited(event -> button1.setText("THX"));
                    root.getChildren().add(button1);
        }

            @Override
            public void start (Stage stage) throws Exception {
                Pane root = new Pane();
                initButtons(root);
                stage.setScene(new Scene(root));
                stage.setWidth(500);
                stage.setHeight(500);
                stage.show();
            }
        }
