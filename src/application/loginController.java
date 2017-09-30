package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class loginController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button botonInicio;

    @FXML
    private Button botonRegistrarse;

    @FXML
    void loadIniciar(ActionEvent event) {

    }

    @FXML
    void loadInicio(ActionEvent event) {
    	AnchorPane pane;
		try {
			pane = FXMLLoader.load(getClass().getResource("mainPage.fxml"));
			rootPane.getChildren().setAll(pane);
		} catch (IOException e) {
			Alert alert=new Alert(AlertType.ERROR);
			alert.setHeaderText("ERROR FATAL");
			alert.show();
		}
    }

    @FXML
    void loadRegistrarse(ActionEvent event) {

    }

}

