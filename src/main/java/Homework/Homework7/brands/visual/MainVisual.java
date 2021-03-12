package Homework.Homework7.brands.visual;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainVisual extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    public void singing(final Pane root) {
        Button button = new Button("Play!");
        button.setTranslateX(200);
        button.setTranslateY(50);
        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String[] playlist4 = new String[]{"song1", "song2", "song3", "song4", "song5"};
                Player6v pl1 = new Player6v(playlist4);
                pl1.show(root);
            }
        });
        Button button2 = new Button("Show Playlist");
        button2.setTranslateX(200);
        button2.setTranslateY(100);
        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String[] playlist4 = new String[]{"song1", "song2", "song3", "song4", "song5"};
                Player6v pl1 = new Player6v(playlist4);
                pl1.showPlaylist(root);
            }
        });
        root.getChildren().addAll(button,button2);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane();
        singing(root);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.show();
    }
}