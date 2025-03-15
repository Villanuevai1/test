package s25.cs151.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Load the Dashboard FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("dashboard.fxml"));
        // Create a new Scene with the loaded FXML, set its dimensions (1920x1080)
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        // Set title of the window
        stage.setTitle("ClockInEdu");
        stage.setScene(scene);
        stage.show();

//  the main method which lauches the JavaFX application
    }

    public static void main(String[] args) {
        launch();
    }
}