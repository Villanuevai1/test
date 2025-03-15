package s25.cs151.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to ClockInEdu!");
    }

    @FXML
    public void onManageOfficeHoursClick(ActionEvent event) throws IOException {
        // Switch to Office Hours scene
        Parent root = FXMLLoader.load(getClass().getResource("office_hours.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080); // Match dashboard size
        stage.setScene(scene);
        stage.show();
    }
}
