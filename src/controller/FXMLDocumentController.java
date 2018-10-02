package controller;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import utils.JDBCConnector;

/**
 *
 * @author ciaranroche
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField ssnTxt;

    @FXML
    private TextField dobTxt;

    @FXML
    private TextField nameTxt;

    @FXML
    private TextField addressTxt;

    @FXML
    private TextField salaryTxt;

    @FXML
    private TextField genderTxt;

    JDBCConnector conn = new JDBCConnector();

    @FXML
    private void handleAddAction(ActionEvent event) {
        try {
            conn.addRecord(ssnTxt.getText(), dobTxt.getText(), nameTxt.getText(), addressTxt.getText(), Integer.parseInt(salaryTxt.getText()), genderTxt.getText());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handlePreviousAction(ActionEvent event){
        // TODO
    }

    @FXML
    private void handleNextAction(ActionEvent event){
        // TODO
    }

    @FXML
    private void handleClearAction(ActionEvent event){
        // TODO
    }

    @FXML
    private void setText(String ssn, String dob, String name, String address, int salary, String gender){
        ssnTxt.setText(ssn);
        dobTxt.setText(dob);
        nameTxt.setText(name);
        addressTxt.setText(address);
        salaryTxt.setText(String.valueOf(salary));
        genderTxt.setText(gender);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }



}