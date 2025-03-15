package s25.cs151.application;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class AddOfficeHourController {

    @FXML
    private ComboBox<String> semesterComboBox, yearComboBox;
    @FXML
    private CheckBox mondayCheck;
    @FXML
    private ComboBox<String> mondayStartHour, mondayStartMinute, mondayStartAMPM;
    @FXML
    private ComboBox<String> mondayEndHour, mondayEndMinute, mondayEndAMPM;

    @FXML
    private void onPublishClick() {
        // Retrieve selected values
        String semester = semesterComboBox.getValue();
        String year = yearComboBox.getValue();

        if (mondayCheck.isSelected()) {
            String startHour = mondayStartHour.getValue();
            String startMinute = mondayStartMinute.getValue();
            String startAMPM = mondayStartAMPM.getValue();
            String endHour = mondayEndHour.getValue();
            String endMinute = mondayEndMinute.getValue();
            String endAMPM = mondayEndAMPM.getValue();

            System.out.println("Monday: " + startHour + ":" + startMinute + " " + startAMPM + " to " + endHour + ":" + endMinute + " " + endAMPM);
        }

        // Close the window
        Stage stage = (Stage) semesterComboBox.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void onCancelClick() {
        Stage stage = (Stage) semesterComboBox.getScene().getWindow();
        stage.close();
    }
}
