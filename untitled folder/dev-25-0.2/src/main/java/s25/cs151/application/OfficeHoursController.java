package s25.cs151.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class OfficeHoursController {

    @FXML
    public TableView<?> officeHoursTable;

    @FXML
    private void onBackToDashboardClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 1920, 1080));
        stage.show();
    }



    @FXML
    private void onRemoveOfficeHourClick(ActionEvent event) {
        // Logic to remove selected office hour
    }

    public void onAddOfficeHourClick(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/s25/cs151/application/add_office_hour.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Add Office Hour");
            stage.initModality(Modality.APPLICATION_MODAL); // Block input to other windows until closed
            stage.setScene(new Scene(root));
            stage.showAndWait(); // Wait for popup to close before proceeding
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}

