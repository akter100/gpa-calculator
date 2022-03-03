package edu.citytech.gui.gpacalculator;

import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.gui.gpacalculator.model.GradeStatus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GPACalculatorController {

    @FXML
    private Label lblHeading;

    @FXML
    private TextField txtScore;

    @FXML
    private Label lblMessage;

    int counter = 0;

    @FXML
    void onClick(ActionEvent event) {

        String url = "http://localhost:8080/grade/gpa?grade=" + txtScore.getText();
        var gradeStatus = JSONGet.submitGet(url, GradeStatus.class);


        lblMessage.setText( "The letter grade is :" + gradeStatus.getLetterGrade() + " " +
                "gpa is: " + gradeStatus.getGpa());

    }

}
