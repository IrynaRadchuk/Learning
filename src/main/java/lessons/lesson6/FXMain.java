package lessons.lesson6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class FXMain extends Application {
    public static void main(String[] args) {
launch (args); //код пишем не сюда, а в старт
    }

    @Override
    public void start(Stage stage) throws Exception {
        Pane root = new Pane(); //создать пустую панель
        Line line1 = new Line(50,60,200,400); //создать линию
        root.getChildren().addAll(line1); //кладем линию в пустую панель
        Scene scene = new Scene(root); //создаем сцену и кладём внутрь панель
        stage.setScene(scene); //привязываем окно программы к сцене
        stage.show(); //отобразить окно программы
    }
}
