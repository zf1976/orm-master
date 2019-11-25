package mvcpro.view.main;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UiMainLayoutController {

    private Stage mainStage;

    @FXML
    private Button add;

    @FXML
    private Button mainMinimize;

    @FXML
    private Button brower;

    @FXML
    private Button update;

    @FXML
    private Button delete;

    @FXML
    private Button mainExit;
    @FXML
    void CheckAdd(ActionEvent event) {
        System.out.println("add");
    }

    @FXML
    void CheckUadate(ActionEvent event) {
        System.out.println("update!");
    }

    @FXML
    void CheckDelete(ActionEvent event) {
        System.out.println("delete!");
    }

    @FXML
    void CheckBrower(ActionEvent event) {
        System.out.println("brower!");
    }

    @FXML
    void CheckMainExit(ActionEvent event){
        Platform.exit();
    }

    @FXML
    void CheckMainMinimize(ActionEvent event){
        mainStage.setIconified(true);
    }


    @FXML
    void initialize() {

    }

    public void setMainStage(Stage mainStage) {
        this.mainStage = mainStage;
    }
}



