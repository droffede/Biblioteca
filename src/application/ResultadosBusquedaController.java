package application;

import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

public class ResultadosBusquedaController implements Initializable{

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button botonIniciar;

    @FXML
    private Button botonRegistrarse;

    @FXML
    private Button botonInicio;

    @FXML
    private CheckBox checkTitulo;

    @FXML
    private CheckBox checkAutor;

    @FXML
    private CheckBox checkAño;

    @FXML
    private TableView<String> tablaBusqueda;

    @FXML
    private TableColumn<String, String> columnaPortada;

    @FXML
    private TableColumn<String, String> columnaTitulo;

    @FXML
    private TableColumn<String, String> columnaAutor;

    @FXML
    private TableColumn<String, String> columnaAño;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	  @FXML
	    void loadIniciar(ActionEvent event) {
		  AnchorPane pane;
			try {
				pane = FXMLLoader.load(getClass().getResource("loginpage.fxml"));
				rootPane.getChildren().setAll(pane);
			} catch (IOException e) {
				Alert alert=new Alert(AlertType.ERROR);
				alert.setHeaderText("ERROR FATAL");
				alert.show();
			}
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
	    	AnchorPane pane;
			try {
				pane = FXMLLoader.load(getClass().getResource("registrarsepage.fxml"));
				rootPane.getChildren().setAll(pane);
			} catch (IOException e) {
				Alert alert=new Alert(AlertType.ERROR);
				alert.setHeaderText("ERROR FATAL");
				alert.show();
			}
	    }


}
