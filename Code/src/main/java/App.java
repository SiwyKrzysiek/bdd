import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import lombok.var;

public class App extends Application {
    public void start(Stage primaryStage) throws Exception {
        var label = new Label("We're gona be rich!");
        var scene = new Scene(new StackPane(label), 640, 480);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
